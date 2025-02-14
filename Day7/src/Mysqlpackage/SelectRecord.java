package Mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) {
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/test1", "root", "root");
			stmt = con.createStatement();
			String sql = "SELECT id, name, address, age FROM Person";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
			// Retrieve by column name
				int id = rs.getInt("id");
				int age = rs.getInt("age");
				String name = rs.getString("name");
				String address = rs.getString("address");

				// Display values
				System.out.print("ID is : " + id +" || ");
				System.out.print(" Age is: " + age +" || ");
				System.out.print(" Name is: " + name +" || ");
				System.out.println(" Address is: " + address);
				} } catch (Exception e) {
				e.printStackTrace();
		}
	}
}
