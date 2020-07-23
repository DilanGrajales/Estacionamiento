/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.sql.*;


/**
 *
 * @author NuCLeO
 */
public class conexion_local {

    
    String BD = "jdbc:postgresql://localhost:5432/Aseguradora";
    String user = "postgres";
    String pass = "1234";

    public void conexion() {
        try {
            Connection con = DriverManager.getConnection(BD, user, pass);
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println("error al conectar" + e);
        }
    }
}
