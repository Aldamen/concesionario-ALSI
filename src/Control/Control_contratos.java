/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ConexionSQL.Conx_bd;
import java.sql.PreparedStatement;

/**
 *
 * @author 
 */
public class Control_contratos {
    
  private Sentencias sent;
  Conx_bd con = new Conx_bd();
  public Control_contratos(){
      sent = new Sentencias();
      
  }
  
  public boolean registrar_contrato(String fecha, String cod_cliente, String cod_docvend, String cod_placa, int valor)
    {   
        
            String datos[] = {fecha, cod_cliente, cod_docvend, cod_placa, Integer.toString(valor)};           
            return sent.ingresar_datos(datos, "insert into contratos(fecha, cod_doccliente, cod_docvend, cod_placa,valor) values(?,?,?,?,?)");
                      
                
    }
  
  public Object[][] datos_cliente(String doc, String campo1, String campo2, String campo3, String campo4, String tabla, String docu, String cod)
     {
        String[] columnas={campo1, campo2, campo3, campo4};
        Object[][] resultado = sent.tablas(columnas, tabla, "select * from "+tabla+", ciudades where id_ciudad = "+cod+" and "+docu+"='"+doc+"';");
        return resultado;
      }
  

  public Object[][] datos_contrato()
     {
        String[] columnas={"id_contrato","Fecha","cod_doccliente","cod_docvend","Valor"};
        Object[][] resultado = sent.tablas(columnas, "contratos", "select id_contrato,fecha,cod_doccliente,cod_docvend,cod_placa,valor from contratos,vendedores,carros,clientes where cod_doccliente=documento and cod_docvend=No_documento and cod_placa=placa");
        return resultado;
      }
  

  
  public Object[][] datos_carro(String placa)
     {
        String[] columnas={"descripcion_tipo","color", "descripcion", "modelo" };
        Object[][] resultado = sent.tablas(columnas, "carros", "select * from carros, marcas, tipo_carros where cod_marca = id_marca and cod_tipocarro = idtipo_carro and placa='"+placa+"';");
        return resultado;
      }
    public Object[][] datos_contratoFech(String fecha)
     {
        String[] columnas={"id_contrato","Fecha","cod_doccliente","cod_docvend","Valor"};
        Object[][] resultado = sent.tablas(columnas, "contratos", "select * from contratos, clientes, vendedores, carros where fecha='"+fecha+"' and cod_doccliente=documento and cod_docvend=No_documento and cod_placa=placa;");
        return resultado;
      }
   
}
    


