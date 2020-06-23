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
public class clsDocente {
    
    cslJDBC objConectar = new cslJDBC();
    String strSQL;
    ResultSet rs = null;
    
    public String login(String usu, String con) throws Exception{
        strSQL = "select nombre from docente " + 
                "where usuario='" + usu + "' and contraseña='" + con + "' and estado=true";
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
    
    public Boolean validarEstado(String usu) throws Exception{
        strSQL = "select estado from docente where usuario = '" + usu + "'" ;
        try {
            rs = objConectar.consultarBD(strSQL);
            while( rs.next() ){
                return rs.getBoolean("estado");
            }
        } catch (Exception e) {
            throw new Exception("Error al validar usuario.");
        }
        return false;
     }
    public ResultSet capturarDatosinterfaz() throws Exception{
        strSQL = "select * from estudiante";
        try
        {
            rs = objConectar.consultarBD(strSQL);
            rs.next();
            return rs;
        } catch(Exception e){
            throw new Exception("Error al capturardatos"); 
        }
    }
      public ResultSet capturarDatosTabla() throws Exception{
        strSQL = "select * from docente";
        try
        {
            rs = objConectar.consultarBD(strSQL);   
            return rs;
        } catch(Exception e){
            throw new Exception("Error al capturardatos"); 
        }
    }
      
      public ResultSet buscarDocente(String cod) throws Exception
    {
        strSQL = "Select * from docente where codigo='" + cod +"'";
        try{
            rs = objConectar.consultarBD(strSQL);
                return rs;
        }catch(Exception e)
        {
         throw new Exception("Error al buscar docente"); 
        }
    }
    
      public void eliminarDocente(String cod) throws Exception{
        strSQL = "delete from docente where codigo='" + cod +"'";
        try
        {
            objConectar.ejecutarBD(strSQL);
        } catch(Exception e){
            throw new Exception("Error al buscar docente"); 
        }
    }
    public void darBajaDocente (String cod) throws Exception
    {   
        strSQL ="update docente set estado=false where codigo='" + cod +"'";
        try{
            objConectar.ejecutarBD(strSQL);
        }catch(Exception e){
            throw new Exception("Error al dar de baja al docente"); 
        }
    }
    
    public void darAltaDocente (String cod) throws Exception
    {   
        strSQL ="update docente set estado=true where codigo='" + cod +"'";
        try{
            objConectar.ejecutarBD(strSQL);
        }catch(Exception e){
            throw new Exception("Error al dar de Alta al docente"); 
        }
    }
    
}
