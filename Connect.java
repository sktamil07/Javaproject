package Accord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {
	protected Connection con;
	public Connect()
	{
		try
		{	
			
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/summa","root","tamil");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public PreparedStatement prepareStatement(String q) {
		return null;
	}

}
