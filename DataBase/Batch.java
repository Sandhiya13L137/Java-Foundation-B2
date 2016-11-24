package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.List;

import com.bigbazar.stock.Item;
import com.mcis.Employee;

public class Solution {
	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"secure");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into item values(?,?,?,?)");
			List<Item> stock = new LinkedList<Item>();
			Item item = new Item();
			item.setId("P001");
			item.setName("Shampoo");
			item.setQuantity(5);
			item.setPrice(125.0);
			stock.add(item);
			item = new Item();
			item.setId("P002");
			item.setName("Soap");
			item.setQuantity(10);
			item.setPrice(45.0);
			stock.add(item);
			item = new Item();
			item.setId("P003");
			item.setName("Paste");
			item.setQuantity(12);
			item.setPrice(15.0);
			stock.add(item);
			item = new Item();
			item.setId("P004");
			item.setName("Mouth Wash");
			item.setQuantity(7);
			item.setPrice(75.0);
			stock.add(item);
			for(Item each:stock) {
				preparedStatement.setString(1, each.getId());
				preparedStatement.setString(2, each.getName());
				preparedStatement.setInt(3, each.getQuantity());
				preparedStatement.setDouble(4, each.getPrice());
				preparedStatement.addBatch();
			}
			int count[] = preparedStatement.executeBatch();
			for(int ea:count) {
				System.out.println(ea+" row(s) inserted");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Please load oracle driver");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
