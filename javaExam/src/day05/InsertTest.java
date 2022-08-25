package day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest
{

	public static void main(String[] args) throws Exception
	{
		// 1. 접속 -- Connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		String user = "sku";
		String password = "skupw";

		Connection conn = DriverManager.getConnection(url, user, password);
		// 2. 쿼리작성 -- PreparedStatement
		String sql = "insert into member values(?,?,?,?,default)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, "carami");
		ps.setString(2, "강경미");
		ps.setString(3, "caramipw");
		ps.setString(4, "carami@carami.com");

		// 3. 쿼리실행
		int resultCount = ps.executeUpdate();
		// 4. 쿼리결과를 확인!!
		if (resultCount > 0)
			System.out.println(resultCount + "건 입력 ^^");
		// 5. 접속종료!!!! (반드시!!)
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
	}

}