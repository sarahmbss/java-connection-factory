package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Remover {
	
	public static void main(String[] args) throws SQLException{
		
		Connection connection = new ConnectionFactory().getConnection();
		
		String sql = "delete from products where name = ?";
		PreparedStatement pSt = connection.prepareStatement(sql);
		pSt.setString(1, "Vestido 23");
		
		pSt.execute();
		System.out.println("Removido");
		
		pSt.close();
		connection.close();
	}

}
