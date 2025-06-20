package homework_01.com.gn.controlloer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnection {

	public Connection conn;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	
	public JDBCconnection() {
		
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc_board";
		String id = "root";
		String pw = "nixc132@";
		
		try {
			// DriverManager: 자바 프로그램을 JDBC 드라이버에 연결시켜주는 클래스
			// 자바 프로그램이 적절한 JDBC 드라이버를 통해 DB에 접속할 수 있도록 연결을 중개
			// (자바 프로그램 -> JDBC 드라이버 -> DB)
			// getConnection() 메소드로 DB에 연결 요청하고 생성된 Connection 객체를 반환
			conn = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공!");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
			e.printStackTrace();
		}
		
		
	}


	
	
	
}
