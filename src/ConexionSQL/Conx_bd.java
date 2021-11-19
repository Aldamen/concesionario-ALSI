/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ANDRES
 */
public class Conx_bd {
    private final String url = "jdbc:mysql://localhost/marketelvecino";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public Conx_bd() {
     try{  
        
         Class.forName("com.mysql.jdbc.Driver");         
         con = DriverManager.getConnection(url,"root","12345");
         if (con!=null){
            System.out.println("Conexion con Tienda OK");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
        System.out.println("Conectado");
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("Conexion terminada");

    } 

 
}
