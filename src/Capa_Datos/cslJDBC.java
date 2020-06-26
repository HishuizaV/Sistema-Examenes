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
    private static String driver= "org.postgresql.Driver";
    private static String url="jdbc:postgresql://localhost:5432/SEV";
    private static String user="postgres";
    private static String password="12345";       

    //Conectar
    public static Connection conectar() throws Exception{
        try{
           Class.forName(driver);        
           return DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException ex){
            throw new Exception("Error al conectar a la Base de Datos!");
        }
    }
}
