package com.ssafy.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public class JdbcTest {
	public JdbcTest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	//JdbcTest 클래스에 내용을 사용하기 위해서..
	public static void main(String[] args) {
		JdbcTest db = new JdbcTest(); //이제는 알아야해~
		
		for(Board b : db.selectAll()) {
			System.out.println(b);
		}
	}
	
	//전체 게시글 조회
	private List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		////////////////////////////////////
		// 데이터 베이스 연결도 하고 데이터를 가지고 오면 될 거 같아.
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC", "root","ssafy");
			
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM board"; // 게시글을 전체 조회하는 SQl 문
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Board board = new Board();	// 빈 바구니를 하나 생성
				board.setId(rs.getInt("id"));	// 라벨(컬럼명)
//				board.setId(rs.getInt(1));		// 인덱스
				board.setWriter(rs.getString("writer"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setViewCnt(rs.getInt("view_cnt"));
				board.setRegDate(rs.getString("reg_date"));
				list.add(board);
			}
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		////////////////////////////////////
		return list;
	}
}
