/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.sql.*;
/**
 *
 * @author nucleo
 */
public class conexion {
    //DIRECCION DEL SERVIDOR >>> uptapachula.chlbemlal9mz.us-east-2.rds.amazonaws.com <<<
    //PUERTO        >>> 5432 <<<
    //BASE DE DATOS >>> uptap <<<
    //USUARIO       >>> postgresql <<<
    //CONTRASEÑA    >>> qwsa1234 <<<

    public java.sql.Connection con;
    
    String BD = "jdbc:postgresql://uptapachula.chlbemlal9mz.us-east-2.rds.amazonaws.com:5432/uptap";
    String user = "pvisual";
    String pass = "qwsa1234";

    public Connection conexion() {
        try {
            con = DriverManager.getConnection(BD, user, pass);
            
        } catch (Exception e) {
            System.out.println("error al conectar" + e);
        }
    return con;      
    }
}
