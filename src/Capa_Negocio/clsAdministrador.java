/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Negocio;

import Capa_Datos.cslJDBC;
import java.sql.ResultSet;

/**
 *
 * @author holce
 */
public class clsAdministrador {
    
    cslJDBC objConectar = new cslJDBC();
    String strSQL;
    ResultSet rs = null;
    
    public String login(String usu, String con) throws Exception{
        strSQL = "select nombre from administrador " + 
                "where usuario='" + usu + "' and contraseña='" + con + "'";
        try {
            rs = objConectar.consultarBD(strSQL);
            while( rs.next() ){
                return rs.getString("nombre");
            }
        } catch (Exception e) {
            throw new Exception("Error al iniciar sesión.");
        }
        return "";
    }
    public ResultSet capturarDatos() throws Exception{
        strSQL = "select * from administrador";
        try
        {
            rs = objConectar.consultarBD(strSQL);
            rs.next();
            return rs;
        } catch(Exception e){
            throw new Exception("Error al capturardatos"); 
        }
    }
    
    
}
