package day04;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest
{

	public static void main(String[] args) throws Exception
	{
		// 1. 드라이버 로딩 - odjbc8.jar
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		// 프로토콜:oracle:드라이버타입:@호스트:포트번호:SID
		// url은 DBMS사마다 다르다.
		String user = "sku", pwd = "skupw";
		// 2. DB와 연결: DriverManager.getConnection()
		Connection con = DriverManager.getConnection(url, user, pwd);
		System.out.println("DB연결됨");

	}

}