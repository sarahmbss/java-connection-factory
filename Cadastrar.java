package bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cadastrar {

	public static void main(String[] args) throws SQLException{
		Connection connection = new ConnectionFactory().getConnection();
		
		String sql = "insert into products (name, price, description) values (?, ?, ?)";
		PreparedStatement pSt= connection.prepareStatement(sql);
		
		pSt.setString(1, "Vestido 23");
		pSt.setDouble(2, 90.00);
		pSt.setString(3, "Vestido de algod�o na cor Amarelo");
		pSt.execute();
		
		pSt.setString(1, "Cal�a Jeans 19");
		pSt.setDouble(2, 110.00);
		pSt.setString(3, "Cal�a Jeans Feminina tamanho 38");
		pSt.execute();
		
		pSt.close();
		System.out.println("Gravado");
		
		connection.close();
	}
}
