/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_sql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Andres Villamil
 */
public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/login_bd";
    public static String usuario = "root";
    public static String contraseña = "Andres14.";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e);

        }
        return conexion;
    }

}
