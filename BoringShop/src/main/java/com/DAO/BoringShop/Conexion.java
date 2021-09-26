package com.DAO.BoringShop;

import java.sql.*;
/**
 *  
 * @author Julian Korr3a
 *
 */

public class Conexion {
	//**Parametros de conexion"/
	static String bd = "bd_boring_shop";
	static String Login ="root"; 
	//static String password= "admin"; 
	static String password = "root"; 
	static String url = "jdbc:mysql://localhost/"+bd; 
	Connection connection= null;
		
	//* Constructor de ObConnection "/"
	public Conexion() {
		try{
			//obtenemos el driver para mysql. 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//class.fortiame("org_cariadb.jdbc"); 
			// obtenemos la conexión
			connection = DriverManager.getConnection(url,Login,password);
			if (connection!=null){
				System.out.println("Conexión a base de datos "+bd+" OK\n");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
			
		}
	}
	/**Permite retornar la conexion**/
	public Connection getConnection() {
		return connection;
	}
	public void desconectar() {
		connection = null;
	}
}