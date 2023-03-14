package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.tech.blog.entities.Category;
import com.tech.blog.entities.Post;

public class PostDao {
private Connection con ;

/**
 * @param con
 */
public PostDao(Connection con) {
	super();
	this.con = con;
}
public ArrayList<Category> getAllCategories(){
	ArrayList<Category> list = new ArrayList<>();
	try {
		String q = "SELECT * FROM techblog.categories";
		java.sql.Statement st = this.con.createStatement();
		ResultSet set = st.executeQuery(q);
		while(set.next()) {
			int cId = set.getInt("cId");
			String name = set.getString("name");
			String description = set.getString("description");
			Category c = new Category(cId, name, description);
			list.add(c);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return list;
}
public boolean savePost(Post p) {
	boolean f = false;
	try {
		String q= "insert into post(pTitle,pContent,pCode,pPic,cId,userId) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1, p.getpTitle());
		pstmt.setString(2, p.getpContent());
		pstmt.setString(3, p.getpCode());
		pstmt.setString(4, p.getpPic());
		pstmt.setInt(5, p.getCatId());
		pstmt.setInt(6, p.getUserId());
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}
public List<Post> getAllPosts(){
	List<Post> list = new ArrayList<>();
	try {
		PreparedStatement p = con.prepareStatement("select * from post order by pId desc");
		ResultSet set = p.executeQuery();
		while(set.next()) {
			int pId = set.getInt("pId");
			String pTitle = set.getString("pTitle"); 
			String pContent = set.getString("pContent"); 
			String pCode = set.getString("pCode"); 
			String pPic = set.getString("pPic"); 
			Timestamp pDate = set.getTimestamp("pDate");
			int catId = set.getInt("cId");
			int userId = set.getInt("userId");
			Post post = new Post(pId, pTitle, pContent, pPic, pCode, pDate, catId, userId);
			list.add(post);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return list;
	
}

public List<Post> getPostByCatId(int catId){
	List<Post> list = new ArrayList<>();
	try {
		PreparedStatement p = con.prepareStatement("select * from post where cId = ?");
		p.setInt(1, catId);
		ResultSet set = p.executeQuery();
		while(set.next()) {
			int pId = set.getInt("pId");
			String pTitle = set.getString("pTitle"); 
			String pContent = set.getString("pContent"); 
			String pCode = set.getString("pCode"); 
			String pPic = set.getString("pPic"); 
			Timestamp pDate = set.getTimestamp("pDate");
			int userId = set.getInt("userId");
			Post post = new Post(pId, pTitle, pContent, pPic, pCode, pDate, catId, userId);
			list.add(post);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return list;
	
}
public Post getPostByPostId(int postId) {
	Post post = null;
	try {
		String q = "select * from post where pId=?";
		PreparedStatement p = this.con.prepareStatement(q); 
		p.setInt(1, postId);
		ResultSet set = p.executeQuery();
		if(set.next()) {
			int pId = set.getInt("pId");
			String pTitle = set.getString("pTitle"); 
			String pContent = set.getString("pContent"); 
			String pCode = set.getString("pCode"); 
			String pPic = set.getString("pPic"); 
			Timestamp pDate = set.getTimestamp("pDate");
			int userId = set.getInt("userId");
			int catId = set.getInt("cId");
		    post = new Post(pId, pTitle, pContent, pPic, pCode, pDate, catId, userId);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return post;
	
}
}
