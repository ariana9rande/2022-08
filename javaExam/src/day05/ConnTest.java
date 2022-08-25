package day05;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnTest
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		String user = "sku";
		String password = "skupw";

		Connection conn = DriverManager.getConnection(url, user, password);

		if (conn != null)
			System.out.println("^^");
		else
			System.out.println("-_-;;");

		conn.close();
	}

}