package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Modificar {
	
	public static void main(String[] args) {
	
	try {
		Connection connection = new ConnectionFactory().getConnection();
		
		String sql = "update products set price=?, description=? where name=?";
		
		PreparedStatement pSt = connection.prepareStatement(sql);
	
		pSt.setDouble(1, 120.00);
		pSt.setString(2, "Calça Jeans Feminina tamanho 36");
		pSt.setString(3, "Calça Jeans 19");
		
		pSt.execute();
		System.out.println("Atualizado");
		pSt.close();
		connection.close();
	}catch (SQLException e) {
		throw new RuntimeException(e);
	}
	}
}