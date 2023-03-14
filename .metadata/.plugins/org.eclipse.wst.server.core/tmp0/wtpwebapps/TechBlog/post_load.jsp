<%@page import="com.tech.blog.entities.User"%>
<%@page import="com.tech.blog.dao.LikeDao"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.Category"%>
<%@page import="com.mysql.cj.x.protobuf.MysqlxDatatypes.Array"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<script src="js/javaScript.js"></script>
<div class="row">
<%
User user = (User)session.getAttribute("currentUser");
Thread.sleep(500);

PostDao d = new PostDao(ConnectionProvider.getConnection());
int cId = Integer.parseInt(request.getParameter("cId"));

List<Post> posts ;
if(cId==0) posts = d.getAllPosts();
else posts = d.getPostByCatId(cId);
if(posts.size()==0){
	out.println("<h3 class='display-3  text-center' >No Post in this category</h3>");
	return;
}
for(Post p:posts){
%>
	<div class="col-md-6 mt-2">
		
		<div class="card">
			<img class="card-img-top" alt="title pic" src="blog_pic/<%=p.getpPic() %>">
			<div class="card-body">
				<b><%=p.getpTitle() %></b>
				<p><%=p.getpContent() %></p>
				<pre><%=p.getpCode()  %></pre>
			</div>
			
			<div class="card-footer primary-background text-center">
				<%
				LikeDao ld = new LikeDao(ConnectionProvider.getConnection());
				 
				%>
				<a href="#" onclick="doLike(<%=p.getpId() %>,<%=user.getId() %>)" class="btn btn-outline-light btn-sm"  > <i class="fa fa-thumbs-o-up"></i> <span id="like-counter-<%=p.getpId()%>"> <%=ld.countLikeOnPost(p.getpId()) %> </span></a>
				
				<a href="#" class="btn btn-outline-light btn-sm"  > <i class="fa fa-comments-o"> <span>10 </span></i></a>
				<a href="show_blog.jsp?postId=<%= p.getpId() %>" class="btn btn-outline-light btn-sm"  >Read More ...</a> 
			</div>
		</div>
	</div>
<%
     }
%> 
</div>