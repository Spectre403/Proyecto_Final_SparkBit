
package CapaDatos;


import java.sql.*;
import java.sql.ResultSet;



public class UsuarioDao {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rS;
    conexiom cn = new conexiom();
    
    public Usuario log (String Correo, String clave){
      Usuario U = new Usuario();
      String sql = "SELECT * FROM usuario WHERE Correo = ? AND Clave = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Correo);
            ps.setString(2, clave);
            rS= ps.executeQuery();
            if (rS.next()) {
                U.setCorreo(rS.getString("Correo"));
                U.setClave(rS.getString("clave"));
                
                
            }
            
                                          
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return U;
         
     }
     
}
