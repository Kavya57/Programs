import java.sql.*;
public class DBTest
{
	public static void main(String[] args) throws Exception
	{ 
		Connection con=null;
		PreparedStatement st=null;
		 //ResultSet rs=null;
	  try
	  {
	   String url="jdbc:oracle:thin:@localhost:1521:ORCL";
	   Class.forName("oracle.jdbc.driver.OracleDriver");
       con=DriverManager.getConnection(url,"scott","tiger");
       st=con.prepareStatement("delete from employee where empid=?");
       st.setInt(1,102);
       int count= st.executeUpdate();
       System.out.println(count+" row(s) updated");
       /*st=con.prepareStatement("update employee set salary=? where empid=?");
       st.setDouble(1,1100); st.setInt(2, 102);
       int count= st.executeUpdate();
       System.out.println(count+" row(s) updated");
       st=con.prepareStatement("select * from emp where sal > ?");
       st.setDouble(1, 2000);
       rs=st.executeQuery();
      /* while(rs.next())
    	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
       st.setDouble(1, 3000);
       rs=st.executeQuery();
       while(rs.next())
    	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
       st=con.prepareStatement("select * from emp where ename like ?");
       st.setString(1, "SCOTT");
       rs=st.executeQuery();
        if(rs.next())
    	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));*/
       /* con.setAutoCommit(false);
        st=con.prepareStatement("insert into employee values(?,?,?,?)");
        st.setInt(1, 101); st.setString(2,"Ajay");  st.setDouble(3, 3000.00);
        st.setDate(4, new Date(1990,10,12));
        int count=st.executeUpdate();
        System.out.println(count+" row(s) inserted");
        st.setInt(1, 102); st.setString(2,"Vijay");  st.setDouble(3, 9000.00);
        st.setDate(4,new Date(1990,10,13));
        count=st.executeUpdate();
        System.out.println(count+" row(s) inserted");
        con.commit();*/
	  }
	  catch(Exception e)
	  {
		e.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  //if(rs!=null) rs.close();
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
