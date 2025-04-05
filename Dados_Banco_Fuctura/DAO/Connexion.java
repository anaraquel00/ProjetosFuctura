package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connexion {
	
private Connexion connexion;
private String url="jdbc:mysql://localhost:3306/anaraquel99";
private String username="anaraquel99";
private String password="MySqL99#";




public Connexion getConnexion() {
	return connexion;
}
public void setConnexion(Connexion connexion) {
	this.connexion = connexion;
}
public void abrirConexao() throws SQLException{
		
	try {
		Class.forName("com.msql.jc.jdbc.Driver");
		this.connexion=(Connexion) DriverManager.getConnection("jdbc:mysql://localhost:3306/anaraquel99","anaraquel99","MySqL99#");
		System.out.println("Conectado ao banco de dados");
	} catch (ClassNotFoundException e) {
		System.out.println("Erro de conexao ao banco de dados" + e.getMessage());
		e.printStackTrace();
	}
	
	
}
public void fecharConexao() {
	if (connexion!=null && !Connexion.isClosed()) {
		connexion.isClosed();
		System.out.println("Desconectado ao banco de dados");
	} else {
	    
	}
}
private static boolean isClosed() {
	// TODO Auto-generated method stub
	return false;
}
}


