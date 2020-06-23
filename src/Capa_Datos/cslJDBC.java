/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author holce
 */
public class cslJDBC {
    private String driver, url,user,password;
    private Connection con;
    private Statement sent=null;
    
    public cslJDBC() {
        this.driver = "org.postgresql.Driver";
        this.url = "jdbc:postgresql://localhost:5432/SEV";
        this.user = "postgres";
        this.password = "12345";
        this.con = null;
    }

    //Conectar
    public void conectar() throws Exception{
        try{
           Class.forName(driver);        
           con=DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException ex){
            throw new Exception("Error al conectar a la Base de Datos!");
        }
    }
    //Desconectar
    public void desconectar() throws Exception{
        try{
            //Termina la secuencia en proceso que se està realizando, liberando ciertos recursos utilizados en la secuencia
           con.close();
        } catch (SQLException ex) {
             throw new Exception("Error al desconectar de la BD!");
        }
    }
    
    //Ejecutar una consulta SELECT
    public ResultSet consultarBD (String strSQL) throws Exception{
        ResultSet rs=null;
        try {
            conectar();
            sent = con.createStatement();
            rs = sent.executeQuery(strSQL);
            return rs;
        } catch (Exception e) {
            throw new Exception("Error al ejecutar consulta");
        } finally{
            if (con != null){
                desconectar();
            }
        }
    }
    
    //Ejecutar una instruccion INSERT, UPDATE, DELETE
    public void ejecutarBD (String strSQL) throws Exception{
        try {
            conectar();
            sent = con.createStatement();
            sent.executeUpdate(strSQL);
        } catch (Exception e) {
            throw new Exception("Error al ejecutar consulta");
        } finally{
            if (con != null){
                desconectar();
            }
        }
    }
    
    
    
    
    
    
    
    
    
}
