package kr.ac.sku.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil
{
	// 접속
	public static Connection getConnection() throws Exception
	{
		Connection conn = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		String user = "sku";
		String password = "skupw";

		conn = DriverManager.getConnection(url, user, password);

		return conn;
	}

	// 종료
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs)
	{
		if (rs != null)
		{
			try
			{
				rs.close();
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		close(conn, ps);
	}

	public static void close(Connection conn, PreparedStatement ps)
	{
		if (ps != null)
		{
			try
			{
				ps.close();
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (conn != null)
		{
			try
			{
				conn.close();
			} catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}