/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.Arrays;

/**
 *
 * @author 
 */
public class Control_vendedor extends Persona_vendedor{
    
    public Control_vendedor(String documento, String tipo, String nombre,  String apellidos, String direccion, 
            String sexo, String correo,int ciudad, String contra){
           super (documento, tipo, nombre, apellidos, direccion, sexo, correo, ciudad, contra);
        
    }
    
    public boolean registrar_vend(String tabla)
    {       
            String datos[] = {documento, tipo, nombre,  apellidos, direccion,sexo,correo,Integer.toString(ciudad),contra};           
            return sql.ingresar_datos(datos, "insert into "+tabla+"(No_documento,tipo_doc,nombres_ven,apellidos_ven,direccion_ven,sexo_ven,correo_ven,cod_ciudadvend,contra) values(?,?,?,?,?,?,?,?,?)");
           
                
    }
     public Object[][] consulta_vendedor(){
        String[] columnas={"No_documento","tipo_doc","nombres_ven","apellidos_ven","direccion_ven","sexo_ven","correo_ven","nombre_ciudad","contra"};
        Object[][] datos = sql.tablas(columnas, "vendedores", "select No_documento,tipo_doc,nombres_ven,apellidos_ven,direccion_ven,sexo_ven, correo_ven,nombre_ciudad,contra from vendedores,ciudades where cod_ciudadvend=id_ciudad;");
        return datos;
    }
    
     
}
