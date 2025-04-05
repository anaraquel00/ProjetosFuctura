package Dados;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import DAO.Connexion;

public class Banco_Dados extends Connexion{
public static void main(String[] args) throws SQLException {
Connexion cnx =new Connexion();	
System.out.println("Bem vindo ao Banco de Dados Connexion!! ");	
cnx.abrirConexao();	
	
}


}
	
	
	

