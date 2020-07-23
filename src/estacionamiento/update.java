/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NuCLeO
 */
public class update {
    conexion conecc = new conexion();
    
    public update() {
        try {
            conecc.conexion();
            Statement stmt = conecc.con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from espacios");

            while (rs.next()) {
                espacios.auto1.setText(rs.getString("auto1"));
                espacios.auto2.setText(rs.getString("auto2"));
                espacios.auto3.setText(rs.getString("auto3"));
                espacios.auto4.setText(rs.getString("auto4"));
                espacios.auto5.setText(rs.getString("auto5"));
                espacios.auto6.setText(rs.getString("auto6"));
                espacios.auto7.setText(rs.getString("auto7"));
                espacios.auto8.setText(rs.getString("auto8"));
                espacios.auto9.setText(rs.getString("auto9"));
                espacios.auto10.setText(rs.getString("auto10"));
                espacios.auto11.setText(rs.getString("auto11"));
                espacios.auto12.setText(rs.getString("auto12"));
                
                espacios.acceso1.setText(rs.getString("acceso1"));
                espacios.acceso2.setText(rs.getString("acceso2"));
                espacios.acceso3.setText(rs.getString("acceso3"));
                espacios.acceso4.setText(rs.getString("acceso4"));
                espacios.acceso5.setText(rs.getString("acceso5"));
                espacios.acceso6.setText(rs.getString("acceso6"));
                espacios.acceso7.setText(rs.getString("acceso7"));
                espacios.acceso8.setText(rs.getString("acceso8"));
                espacios.acceso9.setText(rs.getString("acceso9"));
                espacios.acceso10.setText(rs.getString("acceso10"));
                espacios.acceso11.setText(rs.getString("acceso11"));
                espacios.acceso12.setText(rs.getString("acceso12"));
                

                if (rs.getBoolean("y1")==true){
                    espacios.btndisp1.setText("DISPONIBLE 1");
                    espacios.btndisp1.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp1.setText("OCUPADO 1");
                    espacios.btndisp1.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y2")==true){
                    espacios.btndisp2.setText("DISPONIBLE 2");
                    espacios.btndisp2.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp2.setText("OCUPADO 2");
                    espacios.btndisp2.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y3")==true){
                    espacios.btndisp3.setText("DISPONIBLE 3");
                    espacios.btndisp3.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp3.setText("OCUPADO 3");
                    espacios.btndisp3.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y4")==true){
                    espacios.btndisp4.setText("DISPONIBLE 4");
                    espacios.btndisp4.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp4.setText("OCUPADO 4");
                    espacios.btndisp4.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y5")==true){
                    espacios.btndisp5.setText("DISPONIBLE 5");
                    espacios.btndisp5.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp5.setText("OCUPADO 5");
                    espacios.btndisp5.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y6")==true){
                    espacios.btndisp6.setText("DISPONIBLE 6");
                    espacios.btndisp6.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp6.setText("OCUPADO 6");
                    espacios.btndisp6.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y7")==true){
                    espacios.btndisp7.setText("DISPONIBLE 7");
                    espacios.btndisp7.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp7.setText("OCUPADO 7");
                    espacios.btndisp7.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y8")==true){
                    espacios.btndisp8.setText("DISPONIBLE 8");
                    espacios.btndisp8.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp8.setText("OCUPADO 8");
                    espacios.btndisp8.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y9")==true){
                    espacios.btndisp9.setText("DISPONIBLE 9");
                    espacios.btndisp9.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp9.setText("OCUPADO 9");
                    espacios.btndisp9.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y10")==true){
                    espacios.btndisp10.setText("DISPONIBLE 10");
                    espacios.btndisp10.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp10.setText("OCUPADO 10");
                    espacios.btndisp10.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y11")==true){
                    espacios.btndisp11.setText("DISPONIBLE 11");
                    espacios.btndisp11.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp11.setText("OCUPADO 11");
                    espacios.btndisp11.setBackground(new java.awt.Color(255, 51, 51));}
                if (rs.getBoolean("y12")==true){
                    espacios.btndisp12.setText("DISPONIBLE 12");
                    espacios.btndisp12.setBackground(new java.awt.Color(0, 153, 255));
                }else{
                    espacios.btndisp12.setText("OCUPADO 12");
                    espacios.btndisp12.setBackground(new java.awt.Color(255, 51, 51));}
                
                if (rs.getInt("pagoa1")>=0) {
                    if (rs.getInt("pagoa1")==0) {
                        espacios.pago1.setText("PENDIENTE");
                    }else{espacios.pago1.setText("Pago $"+rs.getString("pagoa1"));}
                }else{espacios.pago1.setText("");}
                
                if (rs.getInt("pagoa2")>=0) {
                    if (rs.getInt("pagoa2")==0) {
                        espacios.pago2.setText("PENDIENTE");
                    }else{espacios.pago2.setText("Pago $"+rs.getString("pagoa2"));}
                }else{espacios.pago2.setText("");}
                
                if (rs.getInt("pagoa3")>=0) {
                    if (rs.getInt("pagoa3")==0) {
                        espacios.pago3.setText("PENDIENTE");
                    }else{espacios.pago3.setText("Pago $"+rs.getString("pagoa3"));}
                }else{espacios.pago3.setText("");}
                
                if (rs.getInt("pagoa4")>=0) {
                    if (rs.getInt("pagoa4")==0) {
                        espacios.pago4.setText("PENDIENTE");
                    }else{espacios.pago4.setText("Pago $"+rs.getString("pagoa4"));}
                }else{espacios.pago4.setText("");}
                
                if (rs.getInt("pagoa5")>=0) {
                    if (rs.getInt("pagoa5")==0) {
                        espacios.pago5.setText("PENDIENTE");
                    }else{espacios.pago5.setText("Pago $"+rs.getString("pagoa5"));}
                }else{espacios.pago5.setText("");}
                
                if (rs.getInt("pagoa6")>=0) {
                    if (rs.getInt("pagoa6")==0) {
                        espacios.pago6.setText("PENDIENTE");
                    }else{espacios.pago6.setText("Pago $"+rs.getString("pagoa6"));}
                }else{espacios.pago6.setText("");}
                
                if (rs.getInt("pagoa7")>=0) {
                    if (rs.getInt("pagoa7")==0) {
                        espacios.pago7.setText("PENDIENTE");
                    }else{espacios.pago7.setText("Pago $"+rs.getString("pagoa7"));}
                }else{espacios.pago7.setText("");}
                
                if (rs.getInt("pagoa8")>=0) {
                    if (rs.getInt("pagoa8")==0) {
                        espacios.pago8.setText("PENDIENTE");
                    }else{espacios.pago8.setText("Pago $"+rs.getString("pagoa8"));}
                }else{espacios.pago8.setText("");}
                
                if (rs.getInt("pagoa9")>=0) {
                    if (rs.getInt("pagoa9")==0) {
                        espacios.pago9.setText("PENDIENTE");
                    }else{espacios.pago9.setText("Pago $"+rs.getString("pagoa9"));}
                }else{espacios.pago9.setText("");}
                
                if (rs.getInt("pagoa10")>=0) {
                    if (rs.getInt("pagoa10")==0) {
                        espacios.pago10.setText("PENDIENTE");
                    }else{espacios.pago10.setText("Pago $"+rs.getString("pagoa10"));}
                }else{espacios.pago10.setText("");}
                
                if (rs.getInt("pagoa11")>=0) {
                    if (rs.getInt("pagoa11")==0) {
                        espacios.pago11.setText("PENDIENTE");
                    }else{espacios.pago11.setText("Pago $"+rs.getString("pagoa11"));}
                }else{espacios.pago11.setText("");}
                
                if (rs.getInt("pagoa12")>=0) {
                    if (rs.getInt("pagoa12")==0) {
                        espacios.pago12.setText("PENDIENTE");
                    }else{espacios.pago12.setText("Pago $"+rs.getString("pagoa12"));}
                }else{espacios.pago12.setText("");}
                
                
            }
            stmt.close();
        } catch (Exception e) { System.out.println(e); }
    }
}
