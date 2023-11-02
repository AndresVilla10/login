/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Andres Villamil
 */
public class Metodos_sql {
    
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;    
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String nombre, String apellidos, String usuario, String contraseña){
        
        int resultado = 0;
        Connection conexion = null;
        
        
        String sentencia_guardar = ("INSERT INTO usuarios (nommbre,apellidos,usuario,contraseña) VALUES (?,?,?)");
        
        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, usuario);
            sentencia_preparada.setString(4, contraseña);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            
        } catch (Exception e){
            
            System.out.println(e);
        }
        
        return resultado;
    }
    
}
