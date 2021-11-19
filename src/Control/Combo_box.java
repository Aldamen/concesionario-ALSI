/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author 
 */
public class Combo_box {
    
    private Sentencias sen;
    
    public Combo_box(){
     sen = new Sentencias();
    }
    
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
    
    public Object[][] ingresa_cod(String campo, String id_campo, String tabla, String col)
     { 
       String[] columnas = {id_campo};
       Object[][] result = sen.tablas(columnas,tabla, "select * from "+tabla+" where "+col+"='"+campo+"';");
       return result;
    }
    public Object[] ingresa_placa(String id_campo, String tabla, String col)
     {
        String[] columnas = {id_campo};
       Object[][] result = sen.tablas(columnas,tabla, "select * from "+tabla+";");
       return result;
     }
    
}
