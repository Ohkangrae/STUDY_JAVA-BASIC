<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 만들기</title>
</head>
<body>
<%
// JDBC 드라이버 로딩
   Class.forName("com.mysql.jdbc.Driver");
// DB연결
   String url = "jdbc:mysql://localhost:3306/university";
   String id = "root";
   String pw = "0000";
   
   Connection conn = null;  // 디비 연결 객체
   PreparedStatement pstmt = null; // 디비에 전달할 SQL 구문객체
   
   conn = DriverManager.getConnection(url, id, pw);
   
// 테이블 만들기 SQL
      
   String sql = "CREATE TABLE student("
         +"hakbun int NOT NULL,"
         +"name   varchar(20),"// mysql 등 에서는 varchar 을 많이 사용한다.
         +"gender varchar(10),"
         +"year tinyint,"//tinyint 한글자 수준의 표기를 할때 사용한다. 단, 오라클에서는 지원하지 않는 기능이다.
         +"dept   varchar(30),"
         +"addr   varchar(50),"
         +"primary key(hakbun))";

   pstmt = conn.prepareStatement(sql);
   pstmt.executeUpdate();
   
      
   
// DB 연결 종료
   if (pstmt != null) pstmt.close();
   if (conn != null) conn.close();
   
   out.print("DB연결 문제 없음 by 23오강래");
  

  %>
</body>
</html>