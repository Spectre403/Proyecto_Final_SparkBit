package CapaDatos;
import java.sql.*;


public class conexiom {
    Connection con;
    
    public conexiom(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdsistemaventa","root","");
            System.out.println("Conexión exitosa a la base de datos!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: "+e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public static void main(String[] args) {
        conexiom com = new conexiom();
        com.getConnection();
    }
    
}

    

  


