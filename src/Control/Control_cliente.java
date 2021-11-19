/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author 
 */
public class Control_cliente extends Persona_concesionario{
    
   
   
   public Control_cliente(String documento, String tipo, String nombre,  String apellidos, String direccion, 
            String sexo, String correo, int ciudad){
           super (documento, tipo, nombre,  apellidos, direccion,sexo,correo,ciudad);
        
       
    }
   
   public Object[][] consulta_clientes(){
        String[] columnas={"documento","tipo_documento","nombres","apellidos","direccion","sexo","correo","nombre_ciudad"};
        Object[][] datos = sql.tablas(columnas, "clientes", "select documento,tipo_documento,nombres,apellidos,direccion,sexo, correo,nombre_ciudad from clientes,ciudades where cod_ciudad=id_ciudad;");
        return datos;
    }
   
   
   }
   
   

