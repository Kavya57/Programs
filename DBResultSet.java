import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class DBResultSet
{

	public static void main(String[] args)
	{
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try
		  {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
		       con=DriverManager.getConnection(url,"scott","tiger");
		      // st=con.prepareStatement("select * from dept");
		       st=con.prepareStatement("select * from dept",ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		       rs=st.executeQuery();
		      /* ResultSetMetaData rsmd=rs.getMetaData();
		       int count=rsmd.getColumnCount();
		       for(int i=1; i<=count;i++)
		    	   System.out.print(rsmd.getColumnName(i)+" ");
		       System.out.println();
		       while(rs.next())
		       {
		    	   for(int i=1;i<=count;i++)
		    		   System.out.print(rs.getString(i)+" ");
		    	   System.out.println();
		       }*/
		       while(rs.next())
		    	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		       System.out.println();
		       while(rs.previous())
		    	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		       System.out.println();
			
		  }
		 catch(Exception e)
		  {
			e.printStackTrace();
		  }
		  finally
		  {
			  try
			  {
				  if(rs!=null) rs.close();
				  if(st!=null) st.close();
				  if(con!=null) con.close();
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		  }
	}

}
