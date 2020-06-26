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
public class clsUsuario {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String nickname;
    private String contraseña;
    private boolean estado;
    private String correo;
    private String telefono;
    private Tipo_Usuario tipo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Tipo_Usuario getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Usuario tipo) {
        this.tipo = tipo;
    }
    
    public static clsUsuario login(String usu, String con) throws Exception{
        String strSQL = "select * from usuario where nickname= ? and contraseña= ?";
        try {
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setString(1, usu);
            ps.setString(2, con);
            ResultSet rs = ps.executeQuery();                    
            if(rs.next()){
                if(rs.getBoolean("estado")){
                    clsUsuario obj = new clsUsuario();
                    obj.setCodigo(rs.getInt("codigo"));
                    obj.setNombre(rs.getString("nombre"));
                    obj.setApellido(rs.getString("apellido"));
                    obj.setNickname(rs.getString("nickname"));
                    obj.setContraseña(rs.getString("contraseña"));
                    obj.setCorreo(rs.getString("correo"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setEstado(rs.getBoolean("estado"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setTipo(Tipo_Usuario.buscar(rs.getInt("tipo")));
                    return obj;
                }else{
                    throw new Exception("Usuario inhabilitado");              
                }
            }else{
                throw new Exception("No se ha encontrado al usuario solicitado");
            }
        } catch (Exception e) {
            throw new Exception("Error al iniciar sesión.");
        }
    }
    
    public void registrar() throws Exception{
        String strSQL = "INSERT INTO usuario VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setString(1, this.nombre);
            ps.setString(2, this.apellido);
            ps.setString(3, this.nickname);
            ps.setString(4, this.contraseña);
            ps.setBoolean(5, this.estado);
            ps.setString(6, this.correo);
            ps.setString(7, this.telefono);
            ps.setInt(8, this.tipo.getId());           
            ps.executeUpdate();            
        } catch (Exception e) {
            throw new Exception("El usuario no ha podido Registrarse");
        }     
    }        

    public static clsUsuario compararUsuario(String usu) throws Exception{
        String strSQL = "select * from usuario where nickname = '?' ";
        try{
            usu=null;
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, usu);
            if(rs.next()){
                clsUsuario obj = new clsUsuario();                  
                    obj.setCodigo(rs.getInt("codigo"));
                    obj.setNombre(rs.getString("nombre"));
                    obj.setApellido(rs.getString("apellido"));
                    obj.setNickname(rs.getString("nickname"));
                    obj.setContraseña(rs.getString("contraseña"));
                    obj.setCorreo(rs.getString("correo"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setEstado(rs.getBoolean("estado"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setTipo(Tipo_Usuario.buscar(rs.getInt("tipo")));
                    return obj;
            }else{
                throw new Exception("No se ha encontrado a ningún usuario con ese código");            
            }
        }catch(Exception e){
         throw new Exception("Error al buscar usuario"); 
        }
    }
    
    public static ArrayList<clsUsuario> capturarDatos(int tipo) throws Exception{
        ArrayList<clsUsuario>  lista = new ArrayList();
        String strSQL = "select * from usuario where tipo = ?";
        try
        {
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setInt(1, tipo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                clsUsuario obj = new clsUsuario();
                    obj.setCodigo(rs.getInt("codigo"));
                    obj.setNombre(rs.getString("nombre"));
                    obj.setApellido(rs.getString("apellido"));
                    obj.setNickname(rs.getString("nickname"));
                    obj.setContraseña(rs.getString("contraseña"));
                    obj.setCorreo(rs.getString("correo"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setEstado(rs.getBoolean("estado"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setTipo(Tipo_Usuario.buscar(rs.getInt("tipo")));
                    lista.add(obj);                        
            }
            return lista;
        } catch(Exception e){
            throw new Exception("Error al capturar datos"); 
        }
    }
      
    public static clsUsuario buscarUsuario(int cod, int tipo) throws Exception{    
        String strSQL = "Select * from usuario where codigo = ? and tipo= ?";
        try{
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setInt(1, cod);
            ps.setInt(2, tipo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                clsUsuario obj = new clsUsuario();
                    obj.setCodigo(rs.getInt("codigo"));
                    obj.setNombre(rs.getString("nombre"));
                    obj.setNombre(rs.getString("apellido"));
                    obj.setNickname(rs.getString("nickname"));
                    obj.setContraseña(rs.getString("contraseña"));
                    obj.setCorreo(rs.getString("correo"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setEstado(rs.getBoolean("estado"));
                    obj.setTelefono(rs.getString("telefono"));
                    obj.setTipo(Tipo_Usuario.buscar(rs.getInt("tipo")));
                    return obj;                     
            }else{
                throw new Exception("No se ha encontrado a ningún usuario con ese código");            
            }

        }catch(Exception e){
         throw new Exception("Error al buscar usuario"); 
        }
    }
       
    public void eliminarUsuario(int cod, int tipo) throws Exception{
        String strSQL = "delete from usuario where codigo = ? and tipo= ? ";
        try{
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setInt(1, cod);
            ps.setInt(2, tipo);
            ps.executeUpdate();
        } catch(Exception e){
            throw new Exception("Error al eliminar usuario"); 
        }
    }
    
    public void dardeBajaUsuario (int cod, int tipo) throws Exception
    {   
        String strSQL = "update usuario set estado = false where codigo= ? and tipo= ? ";
        try{
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setInt(1, cod);
            ps.setInt(2, tipo);            
            ps.executeUpdate();
        } catch(Exception e){
            throw new Exception("Error al Dar de baja al usuario usuario"); 
        }
    }
    
    public void dardeAltaUsuario (int cod, int tipo) throws Exception
    {   
        String strSQL = "update usuario set estado=true where codigo= ? and tipo= ?";
        try{
            Connection conexion = cslJDBC.conectar();
            PreparedStatement ps = conexion.prepareStatement(strSQL);
            ps.setInt(1, cod);
            ps.setInt(2, tipo);
            ps.executeUpdate();
        } catch(Exception e){
            throw new Exception("Error al eliminar usuario"); 
        }
    }  

    public static int generarCodigo() throws Exception {
        try (Connection con = cslJDBC.conectar()) {
            String strSQL = "SELECT COALESCE(MAX(codigo),0) + 1 FROM usuario";
            ResultSet rs = con.createStatement().executeQuery(strSQL);
            rs.next();
            return rs.getInt(1);
        } catch (Exception e) {
            throw e;
        }
    } 




}   
