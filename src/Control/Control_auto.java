/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ConexionSQL.Conx_bd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES
 */
public class Control_auto {
    
    private Sentencias sent;
    private Conx_bd con;
    PreparedStatement ps;
    ResultSet res;
    public Control_auto(){
        sent = new Sentencias();
    }
    
    public boolean registrar_auto(String placa, int cod_ciudadcarro, int cod_marca, int cod_tipocarro, int modelo, String motor, String color)
    {   
            
            String datos[] = {placa,Integer.toString(cod_ciudadcarro), Integer.toString(cod_marca),Integer.toString(cod_tipocarro),Integer.toString(modelo),motor, color};           
            return sent.ingresar_datos(datos, "insert into carros(placa,cod_ciudadcarro,cod_marca,cod_tipocarro,modelo,motor,color) values(?,?,?,?,?,?,?)");
                      
                
    }
//    public void modificarEstado(String placa, int cod_ciudadcarro, int cod_marca, int cod_tipocarro, int modelo, String motor, String color,String estado) {
//        System.out.println(placa);
//        
//        try {
//            
//            System.out.println("entraaaaaaaaaaa!!!");
//            Connection conexion = con.conectado();
//            Statement comando = conexion.createStatement();
//            // linea de codigo de mysql que actualiza regristos que va modificar
//            int cantidad = comando.executeUpdate("update carros set cod_ciudadcarro =" + cod_ciudadcarro + ", cod_marca =" + cod_marca + ", cod_tipocarro =" + cod_tipocarro + ", modelo =" + modelo + ", motor ='"+ motor +"', color ='"+ color +"' estado='"+ estado+"' where placa="+placa);
//            // linea de codigo de mysql que actualiza regristos que va modificar
//            if (cantidad == 1) {
//                JOptionPane.showMessageDialog(null," Modifico con Exito");
//            } else {
//                JOptionPane.showMessageDialog(null,"No existe Vendedor de un codigo "+placa);
//            }
//            conexion.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null," Error -->"+ex);
//        }
//    }
    
    
}
