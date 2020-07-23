package estacionamiento;
import java.text.SimpleDateFormat;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author NuCLeO
 */
public class administrador extends javax.swing.JFrame implements ActionListener{
    conexion conn = new conexion();
    SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd" );
            String date;
   
    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        this.setTitle("Administrador");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        regresarBtn.addActionListener(this);
        totaladmin.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        regresarBtn = new javax.swing.JButton();
        repDiarioBtn = new javax.swing.JButton();
        repMensBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        totalEtq = new javax.swing.JLabel();
        totaladmin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        getreportedia = new com.toedter.calendar.JDateChooser();
        getreportemes = new com.toedter.calendar.JDateChooser();
        pdfmes = new javax.swing.JButton();
        pdfdia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnmes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regresarBtn.setText("Regresar");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        repDiarioBtn.setText("Reporte Diario");
        repDiarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repDiarioBtnActionPerformed(evt);
            }
        });

        repMensBtn.setText("Reporte Mensual");
        repMensBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repMensBtnActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCLI", "FECHA ENTRADA", "HORA ENTRADA", "FECHA SALIDA", "HORA SALIDA", "PLACA", "LUGAR", "PAGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabladatos);

        totalEtq.setText("Total final: ");

        totaladmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRADOR");

        getreportedia.setDateFormatString("yyyy-MM-dd");

        getreportemes.setDateFormatString("yyyy-MM-dd");

        pdfmes.setText("PDF");
        pdfmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfmesActionPerformed(evt);
            }
        });

        pdfdia.setText("PDF");
        pdfdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfdiaActionPerformed(evt);
            }
        });

        jButton1.setText("Boleto Diario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnmes.setText("Boleto MES");
        btnmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalEtq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)
                        .addComponent(btnmes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(totaladmin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(repDiarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(pdfdia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getreportedia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(repMensBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pdfmes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getreportemes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getreportedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(repDiarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(repMensBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pdfmes)
                        .addComponent(pdfdia))
                    .addComponent(getreportemes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totaladmin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(totalEtq))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnmes))
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void repDiarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repDiarioBtnActionPerformed
            try {
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            String fecha=formateador.format(getreportedia.getDate());
            
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabladatos.setModel(modelo);

            conn.conexion();
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery("select id_cli, fecha_entrada, hora_entrada, fecha_salida, hora_salida, id_placa, posicion, cantidad_pagar from concepto_pago where fecha_entrada='"+fecha+"' ");

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("id_cli");
            modelo.addColumn("fecha_entrada");
            modelo.addColumn("hora_entrada");
            modelo.addColumn("fecha_salida");
            modelo.addColumn("hora_salida");
            modelo.addColumn("id_placa");
            modelo.addColumn("posicion");
            modelo.addColumn("cantidad_pagar");
            
            
            int[] anchos = {5, 25, 25, 25, 25, 25, 5, 20};
            for (int i = 0; i < tabladatos.getColumnCount(); i++) {
                tabladatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                    
                }
                modelo.addRow(filas);
                
            }
            

        } catch(Exception e) {System.out.println(e);
        }System.out.println("consullta del dia");
        
        
        try {
            pagosuma=0;
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            String fecha=formateador.format(getreportedia.getDate());
            
            conn.conexion();
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery("select cantidad_pagar from concepto_pago where fecha_entrada='"+fecha+"'");
            while (rs.next()) {
                pagosuma=pagosuma + rs.getInt("cantidad_pagar");
            }
            stmt.close();
            rs.close();
            conn.con.close();
        } catch (Exception e) { System.out.println(e); }
        
        
        totaladmin.setText(""+pagosuma);
    }//GEN-LAST:event_repDiarioBtnActionPerformed

    private void repMensBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repMensBtnActionPerformed
        
        
        try {
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM");
            String mes=formateador.format(getreportemes.getDate());
            
            System.out.println(mes);
            
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabladatos.setModel(modelo);

            conn.conexion();
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery("select id_cli, fecha_entrada, hora_entrada, fecha_salida, hora_salida, id_placa, posicion, cantidad_pagar from concepto_pago where fecha_entrada between '"+mes+"-01' and '"+mes+"-30' ");

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("id_cli");
            modelo.addColumn("fecha_entrada");
            modelo.addColumn("hora_entrada");
            modelo.addColumn("fecha_salida");
            modelo.addColumn("hora_salida");
            modelo.addColumn("id_placa");
            modelo.addColumn("posicion");
            modelo.addColumn("cantidad_pagar");
            
            
            int[] anchos = {5, 25, 25, 25, 25, 25, 5, 20};
            for (int i = 0; i < tabladatos.getColumnCount(); i++) {
                tabladatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                    
                }
                modelo.addRow(filas);
                
            }
            

        } catch(Exception e) {System.out.println(e);
        }System.out.println("consullta del mes");
        
        try {
            pagosuma=0;
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM");
            String mes=formateador.format(getreportemes.getDate());
            
            conn.conexion();
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery("select cantidad_pagar from concepto_pago where fecha_entrada  between '"+mes+"-01' and '"+mes+"-30'");
            while (rs.next()) {
                pagosuma=pagosuma + rs.getInt("cantidad_pagar");
            }
            stmt.close();
            rs.close();
            conn.con.close();
        } catch (Exception e) { System.out.println(e); }
        
        
        totaladmin.setText(""+pagosuma);
    }//GEN-LAST:event_repMensBtnActionPerformed

    private void pdfdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfdiaActionPerformed
        if (getreportedia.getDate() == null) {
            JOptionPane.showMessageDialog(null, "No seleccionó un DIA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
                String dia=formateador.format(getreportedia.getDate());

                Connection conect= conn.conexion();
                JasperReport reporte = null;
                String path = "src\\estacionamiento\\reportecompleto.jasper";

                Map parametro = new HashMap();
                parametro.put("fecha", dia);


                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conect);

                JasperViewer view = new JasperViewer(jprint, false);

                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_pdfdiaActionPerformed

    private void pdfmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfmesActionPerformed
        if (getreportemes.getDate() == null) {
            JOptionPane.showMessageDialog(null, "No seleccionó un MES", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM");
                String mes=formateador.format(getreportemes.getDate());

                Connection conect= conn.conexion();
                JasperReport reporte = null;
                String path = "src\\estacionamiento\\reportemes.jasper";

                Map parametro = new HashMap();
                parametro.put("mes1", mes+"-01");
                parametro.put("mes2", mes+"-30");

                reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

                JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conect);

                JasperViewer view = new JasperViewer(jprint, false);

                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                view.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pdfmesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (getreportedia.getDate() == null) {
            JOptionPane.showMessageDialog(null, "No seleccionó un DIA", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = formateador.format(getreportedia.getDate());

                DefaultTableModel modelo = new DefaultTableModel();
                tabladatos.setModel(modelo);

                conn.conexion();
                Statement stmt = conn.con.createStatement();
                ResultSet rs = stmt.executeQuery("select id_cli, fecha_entrada, hora_entrada, fecha_salida, hora_salida, id_placa, posicion, cantidad_pagar from concepto_pago where hora_entrada='BOLETO' and fecha_entrada='"+fecha+"' ");

                ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("id_cli");
                modelo.addColumn("fecha_entrada");
                modelo.addColumn("hora_entrada");
                modelo.addColumn("fecha_salida");
                modelo.addColumn("hora_salida");
                modelo.addColumn("id_placa");
                modelo.addColumn("posicion");
                modelo.addColumn("cantidad_pagar");

                int[] anchos = {5, 25, 25, 25, 25, 25, 5, 20};
                for (int i = 0; i < tabladatos.getColumnCount(); i++) {
                    tabladatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }

                while (rs.next()) {
                    Object[] filas = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }
                    modelo.addRow(filas);
                }
            } catch (Exception e) {System.out.println(e);}
            System.out.println("consullta del dia");

            try {
                pagosuma=0;
                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
                String fecha=formateador.format(getreportedia.getDate());

                conn.conexion();
                Statement stmt = conn.con.createStatement();
                ResultSet rs = stmt.executeQuery("select cantidad_pagar from concepto_pago where hora_entrada='BOLETO' and fecha_entrada='"+fecha+"'");
                while (rs.next()) {
                    pagosuma=pagosuma + rs.getInt("cantidad_pagar");
                }
                stmt.close();
                rs.close();
                conn.con.close();
            } catch (Exception e) { System.out.println(e); }
        }
        
        totaladmin.setText(""+pagosuma);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmesActionPerformed
        if (getreportemes.getDate() == null) {
            JOptionPane.showMessageDialog(null, "No seleccionó un MES", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM");
                String mes=formateador.format(getreportemes.getDate());

                System.out.println(mes);


                DefaultTableModel modelo = new DefaultTableModel();
                tabladatos.setModel(modelo);

                conn.conexion();
                Statement stmt = conn.con.createStatement();
                ResultSet rs = stmt.executeQuery("select id_cli, fecha_entrada, hora_entrada, fecha_salida, hora_salida, id_placa, posicion, cantidad_pagar from concepto_pago where hora_entrada='BOLETO' and fecha_entrada between '"+mes+"-01' and '"+mes+"-30' ");

                ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("id_cli");
                modelo.addColumn("fecha_entrada");
                modelo.addColumn("hora_entrada");
                modelo.addColumn("fecha_salida");
                modelo.addColumn("hora_salida");
                modelo.addColumn("id_placa");
                modelo.addColumn("posicion");
                modelo.addColumn("cantidad_pagar");


                int[] anchos = {5, 25, 25, 25, 25, 25, 5, 20};
                for (int i = 0; i < tabladatos.getColumnCount(); i++) {
                    tabladatos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                }

                while (rs.next()) {
                    Object[] filas = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }
                    modelo.addRow(filas);

                }


            } catch(Exception e) {System.out.println(e);
            }System.out.println("consullta del mes");

            try {
                pagosuma=0;
                SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM");
                String mes=formateador.format(getreportemes.getDate());

                conn.conexion();
                Statement stmt = conn.con.createStatement();
                ResultSet rs = stmt.executeQuery("select cantidad_pagar from concepto_pago where hora_entrada='BOLETO' and fecha_entrada  between '"+mes+"-01' and '"+mes+"-30'");
                while (rs.next()) {
                    pagosuma=pagosuma + rs.getInt("cantidad_pagar");
                }
                stmt.close();
                rs.close();
                conn.con.close();
            } catch (Exception e) { System.out.println(e); }


            totaladmin.setText(""+pagosuma);
        }
    }//GEN-LAST:event_btnmesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmes;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private com.toedter.calendar.JDateChooser getreportedia;
    private com.toedter.calendar.JDateChooser getreportemes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pdfdia;
    private javax.swing.JButton pdfmes;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JButton repDiarioBtn;
    private javax.swing.JButton repMensBtn;
    private javax.swing.JTable tabladatos;
    private javax.swing.JLabel totalEtq;
    private javax.swing.JTextField totaladmin;
    // End of variables declaration//GEN-END:variables
    int pagosuma=0;
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Listener
        JButton presionBoton = (JButton) e.getSource();
        if (presionBoton == regresarBtn) {
            Login login = new Login();
            this.dispose();
        }
    }
}
