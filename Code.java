package Accord;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Code extends Connect{	
	public int addproduct(int mobileid,int Brandid,String model,String processor,String ram,String storage,float display_size,String camera,int battery) {
		int count=0;
		System.out.println("in add metod");
		try
		{
			String q="insert into specification(mobileid,Brandid,model,processor,ram,storage,display_size,camera,battery) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst= con.prepareStatement(q);
			pst.setLong(1, mobileid);
			pst.setInt(2, Brandid);	
			pst.setString(3, model);
			pst.setString(4, processor);
			pst.setString(5, ram);
			pst.setString(6, storage);
			pst.setFloat(7, display_size);
			pst.setString(8, camera);
			pst.setInt(9, battery);
			count=pst.executeUpdate();
			System.out.println(count);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return count;
	}
	public int Addmobiles(int id,String brand) {
		int count=0;
		try {
		String q="insert into mobiles (id,brand)values(?,?)";
		PreparedStatement pst=con.prepareStatement(q);
		pst.setInt(1, id);
		pst.setString(2,brand);
		count=pst.executeUpdate();

		}catch(SQLException e)
		{
			System.out.println(e);
		}
		return count;
	}

	public void viewall() {
		try
		{
			String q="select * from mobiles";
			PreparedStatement pst= con.prepareStatement(q);
			ResultSet rs= pst.executeQuery();
			while(rs.next())
			{
				int a=rs.getInt("id");
				String b=rs.getString("brand");
				System.out.println(a+"\t"+b);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
	public void view2table() {
		try {
	String q= "select * from mobiles inner join specification on id=brandid";
	PreparedStatement pst= con.prepareStatement(q);
	ResultSet rs= pst.executeQuery();
	while(rs.next())
	{
		int a=rs.getInt("id");
		String b=rs.getString("brand");
		int c=rs.getInt("mobileid");
		int d=rs.getInt("Brandid");
		String e=rs.getString("model");
		String f=rs.getString("processor");
		String g=rs.getString("ram");
		String h=rs.getString("storage");
		int i=rs.getInt("display_size");
		String j=rs.getString("camera");
		int k=rs.getInt("battery");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+g+"\t"+h+"\t"+i+"\t"+j+"\t"+k);
	}
	
}
catch(SQLException e)
{
	System.out.println(e);
}

}

	public void searchbybrand(int brandid) {
		try {
			String q= "select * from mobiles inner join specification on id=brandid where Brandid=?";
			PreparedStatement pst= con.prepareStatement(q);
			pst.setInt(1, brandid);
			ResultSet rs= pst.executeQuery();
			while(rs.next())
			{
				int a=rs.getInt("id");
				String b=rs.getString("brand");
				int c=rs.getInt("mobileid");
				int d=rs.getInt("Brandid");
				String e=rs.getString("model");
				String f=rs.getString("processor");
				String g=rs.getString("ram");
				String h=rs.getString("storage");
				int i=rs.getInt("display_size");
				String j=rs.getString("camera");
				int k=rs.getInt("battery");
				System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+g+"\t"+h+"\t"+i+"\t"+j+"\t"+k);
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

		}

	public int updatebrand(int mobileid,String ram,String storage) {
		int count=0;
		try
		{
			String q="update specification set ram=?,storage=? where mobileid=?";
			
			//String q="update specification set ram=? where model=?";
			PreparedStatement pst= con.prepareStatement(q);
			pst.setInt(3, mobileid);
			//pst.setInt(2, Brandid);
			//pst.setString(3,model);
			//pst.setString(4,processor);
			pst.setString(1,ram);
			pst.setString(2,storage);
			//pst.setFloat(7, display_size1);
			//pst.setString(8,camera);
			//pst.setInt(9, battery);
			
			count=pst.executeUpdate();			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return count;
	}


	public int removebrand(int mobileid) {
		int count=0;
		try
		{
			String q="delete from specification where mobileid=?";
			PreparedStatement pst= con.prepareStatement(q);
			
			pst.setInt(1,mobileid);
			count=pst.executeUpdate();			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return count;
		
	}
}




