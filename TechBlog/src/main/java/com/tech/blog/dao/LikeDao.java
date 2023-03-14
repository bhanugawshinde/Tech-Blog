package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LikeDao {
private Connection con;

/**
 * @param con
 */
public LikeDao(Connection con) {
	super();
	this.con = con;
}
public boolean insertLike(int pId , int uId) {
	boolean f = false;
	try {
		String q = "insert into liked(pId,uId) values(?,?)";
		PreparedStatement p = con.prepareStatement(q);
		//set values;
		p.setInt(1, pId);
		p.setInt(2, uId);
		p.executeUpdate();
		f = true;
		
		
	} catch (Exception e) {
		//: handle exception
		e.printStackTrace();
	}
	return f;
}
public int countLikeOnPost(int pId) {
	int count = 0;
	try {
		String q ="select count(*) from liked where pid=?";
		PreparedStatement p = con.prepareStatement(q);
		p.setInt(1, pId);
		ResultSet set = p.executeQuery();
		if(set.next()) {
			count = set.getInt("count(*)");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return count;
}
public boolean isLikedByUser(int pId, int uId) {
	boolean f = false;
	try {
		PreparedStatement p = con.prepareStatement("select * from liked where pId=? and uId=?");
		p.setInt(1, pId);
		p.setInt(2, uId);
		ResultSet set = p.executeQuery();
		if(set.next()) {
			f = true;
		}
	} catch (Exception e) {
		//  handle exception
		e.printStackTrace();
	}
	
	return f;
}
public boolean deleteLike(int pId, int uId) {
	boolean f= false;
	try {
		PreparedStatement p = con.prepareStatement("delete from liked where pId=? and uId=?");
		p.setInt(1, pId);
		p.setInt(2, uId);
		p.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}
}
