/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Negocio;

import Capa_Datos.cslJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author holce
 */
public class Tipo_Usuario {
    
    private int id;
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public static Tipo_Usuario buscar(int id) throws Exception{
        String strSQL = "select * from tipo_usuario where id=?";
        try {
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Tipo_Usuario obj = new Tipo_Usuario();
                obj.setId(rs.getInt(1));
                obj.setDescripcion(rs.getString(2));
                return obj;
            }else{
                throw new Exception("No se ha encontrado el Tipo de Usuario");
            }                     
        } catch (Exception e) {
            throw new Exception("Error al encontrar al Tipo de usuario");
        }
    }
    
    public static ArrayList<Tipo_Usuario> listar() throws Exception{               
        try
        {
            ArrayList<Tipo_Usuario>  lista = new ArrayList();
            String strSQL = "select * from tipo_usuario where id not in (0) ";
            Connection conexion = cslJDBC.conectar();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(strSQL);
            while(rs.next()){
                Tipo_Usuario obj = new Tipo_Usuario();
                    obj.setId(rs.getInt(1));
                    obj.setDescripcion(rs.getString(2));
                    lista.add(obj);                        
            }
            return lista;
        } catch(Exception e){
            throw new Exception("Error al capturar datos"); 
        } 
    
    
    
    }
    
    
    
}
