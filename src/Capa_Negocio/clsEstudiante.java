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
public class clsEstudiante {
    
    cslJDBC objConectar = new cslJDBC();
    String strSQL;
    ResultSet rs = null;
    
    public String login(String usu, String con) throws Exception{
        strSQL = "select nombre from estudiante " + 
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
        strSQL = "select estado from estudiante where usuario = '" + usu + "'" ;
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
    
    public void registrar(String nom, String ape, String usu, String con, String uni, String correo, String tel) throws Exception{
        strSQL = "insert into estudiante values("+nom+" , '"+ape+"' , '"+usu+"' , '"+con+"' , '"+uni+"' , '"+correo+"' , "+tel+")";
        try {
            objConectar.ejecutarBD(strSQL);
        } catch (Exception e) {
            throw new Exception("Error al registrar estudiante");
        }
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
      public ResultSet capturarDatostabla() throws Exception{
        strSQL = "select * from estudiante";
        try
        {
            rs = objConectar.consultarBD(strSQL);
            return rs;
        } catch(Exception e){
            throw new Exception("Error al capturardatos"); 
        }
    }
      
       public ResultSet buscarEstudiante(String cod) throws Exception
    {
        strSQL = "Select * from estudiante where codigo='" + cod +"'";
        try{
            rs = objConectar.consultarBD(strSQL);
                return rs;
        }catch(Exception e)
        {
         throw new Exception("Error al buscar estudiante"); 
        }
    }
        public void eliminarEstudiante(String cod) throws Exception{
        strSQL = "delete from estudiante where codigo='" + cod +"'";
        try
        {
            objConectar.ejecutarBD(strSQL);
        } catch(Exception e){
            throw new Exception("Error al buscar estudiante"); 
        }
    }
    public void darBajaEstudiante (String cod) throws Exception
    {   
        strSQL ="update estudiante set estado=false where codigo='" + cod +"'";
        try{
            objConectar.ejecutarBD(strSQL);
        }catch(Exception e){
            throw new Exception("Error al dar de baja al estudiante"); 
        }
    }
    
    public void darAltaEstudiante (String cod) throws Exception
    {   
        strSQL ="update estudiante set estado=true where codigo='" + cod +"'";
        try{
            objConectar.ejecutarBD(strSQL);
        }catch(Exception e){
            throw new Exception("Error al dar de Alta al Estudiante"); 
        }
    }
}
