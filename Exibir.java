package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exibir {
	
	public static void main(String[] args) {

	try {
		Connection connection = new ConnectionFactory().getConnection();
		String sql = "select * from products";
		PreparedStatement pSt = connection.prepareStatement(sql);
	
		ResultSet rs = pSt.executeQuery();
	
		while (rs.next()) {
			String name = rs.getString("name");
			Double price = rs.getDouble("price");
			String description = rs.getString("description");
		
			System.out.println("Nome: "+ name +  " Preço: " + price + " Descrição: " + description);
		}
	
		pSt.close();
		connection.close();
	}catch (SQLException e) {
		throw new RuntimeException(e);
	}
	}
}
