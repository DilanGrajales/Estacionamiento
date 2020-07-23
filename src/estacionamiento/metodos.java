/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import javafx.scene.text.Text;


/**
 *
 * @author NuCLeO
 */
public class metodos {
    conexion conecc=new conexion();
    
    
    public void inserTauto(String id_placa, String marca, String modelo, String color, int id_cli)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="INSERT INTO auto (id_placa,marca,modelo,color,id_cli) VALUES ('"+id_placa+"','"+marca+"','"+modelo+"','"+color+"',"+id_cli+");";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public void inserTcliente(int id_cli, String nombre, String direccion, String telefono)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="INSERT INTO cliente (id_cli,nombre,direccion,telefono) VALUES ("+id_cli+",'"+nombre+"','"+direccion+"','"+telefono+"');";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public void inserTpago(int id_cli, String fecha_salida, String hora_salida, int tiempo, int cantidad_pagar, String fecha_entrada, String hora_entrada, String id_placa, int posicion)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="INSERT INTO concepto_pago (id_cli,tiempo,cantidad_pagar,fecha_salida,hora_salida, fecha_entrada, hora_entrada, id_placa, posicion) VALUES ("+id_cli+","+tiempo+","+cantidad_pagar+",'"+fecha_salida+"','"+hora_salida+"','"+fecha_entrada+"','"+hora_entrada+"', '"+id_placa+"',"+posicion+");";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public void inserTregistro(int id_lugar, String fecha_entrada, String hora_entrada, String observacion)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="INSERT INTO detalle_registro (id_lugar,fecha_entrada,hora_entrada,observacion) VALUES ("+id_lugar+",'"+fecha_entrada+"','"+hora_entrada+"','"+observacion+"');";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public void inserTestacion(int id_lugar, int posicion, String id_placa, boolean pago)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="INSERT INTO estacionamiento (id_lugar, posicion, id_placa, pago) VALUES ("+id_lugar+","+posicion+",'"+id_placa+"',"+pago+");";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public void inserTfolio(String folio, int id_cli)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="INSERT INTO folios (folio,id_cli) VALUES ('"+folio+"',"+id_cli+");";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public void inserTespacios(String auto, String id_placa, String y, boolean x, String nombrepago, int p, String acceso, String hora)throws SQLException{
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            String consulta="UPDATE espacios SET "+auto+"='"+id_placa+"', "+y+"="+x+", "+nombrepago+"="+p+", "+acceso+"='"+hora+"' WHERE id=1";
            stmt.executeQuery(consulta);
            stmt.close();
            conecc.con.close();
        } catch (Exception e) { System.out.println(e); }
    }
    public int scanFolios(){
        int id=1000;
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from folios");
            
            while (rs.next()){id++;}
            stmt.close();
            conecc.con.close();
        } catch (Exception e){ System.out.println(e);}
        return id;
    }
    public int scanId(){
        int id_cli=1;
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cliente");
            while (rs.next()){id_cli++;}
            stmt.close();
            conecc.con.close();
        } catch (Exception e){ System.out.println(e);}
        return id_cli;    
    }
    public int scanIdLugar(){
        int id_lugar=1;
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from estacionamiento");
            while (rs.next()){id_lugar++;}
            stmt.close();
            conecc.con.close();
        } catch (Exception e){ System.out.println(e);}
        return id_lugar;    
    }
    
    
    
    
}
