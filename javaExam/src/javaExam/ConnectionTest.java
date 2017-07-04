package javaExam;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	public static void main(String[] args) throws Exception{
		Connection connection = null;		
 	     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tododb?useSSL=false", "joon", "tiger");
 	     if(connection != null){
 		        System.out.println("success");
 		        connection.close();
 	     }else
 		      System.out.println("fail");	
	}
}
