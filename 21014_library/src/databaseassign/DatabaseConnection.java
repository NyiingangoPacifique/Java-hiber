
package databaseassign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


public class DatabaseConnection {
           private Connection con;
    static Scanner sc = new Scanner(System.in);
    private final String url="jdbc:postgresql://localhost:5432/jean";
    private final String username="postgres";
    private final String password="root";
    public Connection Connect() {
        Connection con = null;
      try {
         Class.forName("org.postgresql.Driver");
         con = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/Pacifique",
            "postgres", "root");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
        return con;
    }
}
