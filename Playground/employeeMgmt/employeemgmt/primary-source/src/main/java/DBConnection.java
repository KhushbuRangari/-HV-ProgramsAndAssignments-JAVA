
import java.sql.*;

public class DBConnection {
    static Connection con;
  public static Connection createDBConnection(){

   try {
    Class.forName("org.mariadb.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mariadb://localhost/EmployeeMgmt", "root", "root");


   } catch (Exception e) {
      System.out.println(e);
   }
    return con;
  }


  // public static void main(String[] args) throws SQLException, ClassNotFoundException {
  
  //   System.out.println("It works!");

  //   Statement stmt = connection.createStatement();
  //   ResultSet rs = stmt.executeQuery("select * from CustomerData");
  //   while (rs.next())
  //     System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+ "  " + rs.getString(4)+ "  " + rs.getString(5)+ "  " + rs.getString(6)+ "  " + rs.getString(7)+ "  " + rs.getInt(8));
   
  //   connection.close();
  // }
}