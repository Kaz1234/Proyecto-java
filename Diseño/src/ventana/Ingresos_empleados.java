package ventana;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuari
 */
public class Ingresos_empleados extends javax.swing.JFrame {
    private Object stmt;
    private Object e;
    private String cadena1;
    private String cadena2;
    private String cadena3;
    private String cadena4;
    private String cadena5;

    /**
     * Creates new form Ingreso
     */
    public Ingresos_empleados() {
        initComponents();
        limpiar();
        this.setLocationRelativeTo(null);
    }

    void limpiar(){
        tCI.setText("");
        tNombre.setText("");
        tTelefono.setText("");
        tCuenta.setText("");
        tCodigo.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        jCI = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        jCuenta = new javax.swing.JLabel();
        tCI = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        tCuenta = new javax.swing.JTextField();
        jGuardar = new javax.swing.JButton();
        jRetorno = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        ANTEStITULO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVERSIONES: LA LLEGADA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("INVERSIONES: LA LLEGADA");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 270, 30));

        Bienvenida.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("SISTEMA DE INVENTARIO");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 250, 30));

        jCI.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCI.setForeground(new java.awt.Color(255, 255, 255));
        jCI.setText("CI o RIF :");
        getContentPane().add(jCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jNombre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("NOMBRE :");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jTelefono.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTelefono.setText("TELEFONO :");
        getContentPane().add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jCuenta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jCuenta.setText("CUENTA :");
        getContentPane().add(jCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        tCI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCIActionPerformed(evt);
            }
        });
        tCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCIKeyTyped(evt);
            }
        });
        getContentPane().add(tCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 320, 30));

        tNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });
        tNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNombreKeyTyped(evt);
            }
        });
        getContentPane().add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 320, 30));

        tTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelefonoActionPerformed(evt);
            }
        });
        tTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(tTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 320, 30));

        tCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCuentaActionPerformed(evt);
            }
        });
        tCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCuentaKeyTyped(evt);
            }
        });
        getContentPane().add(tCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 320, 30));

        jGuardar.setBackground(new java.awt.Color(51, 51, 255));
        jGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Valid.png"))); // NOI18N
        jGuardar.setText("GUARDAR");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jRetorno.setBackground(new java.awt.Color(255, 0, 0));
        jRetorno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRetorno.setForeground(new java.awt.Color(255, 255, 255));
        jRetorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Button_Rewind.png"))); // NOI18N
        jRetorno.setText("REGRESAR AL MENU");
        jRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(jRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO EMPLEADO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        ANTEStITULO.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ANTEStITULO.setForeground(new java.awt.Color(255, 255, 255));
        ANTEStITULO.setText("DATOS DEL");
        getContentPane().add(ANTEStITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODIGO :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        tCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCodigoActionPerformed(evt);
            }
        });
        tCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(tCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 320, 30));

        jFondo.setBackground(new java.awt.Color(51, 51, 255));
        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos de pantala hd 1.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 848, 526));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        tNombre.transferFocus();
    }//GEN-LAST:event_tNombreActionPerformed

    private void tTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefonoActionPerformed
        tTelefono.transferFocus();
    }//GEN-LAST:event_tTelefonoActionPerformed

    private void jRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetornoActionPerformed
        accesos2 obj=new accesos2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jRetornoActionPerformed

    @SuppressWarnings("null")
    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        
            conectate_empleados cc=new conectate_empleados();
            Connection cn = cc.coneccion();
            String sql="";
            sql="INSERT INTO empleados(CI, Nombre, Telefono, Cuenta, Codigo) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement psd= cn.prepareStatement(sql);
            psd.setString(1,cadena1);
            psd.setString(2,cadena2);
            psd.setString(3,cadena3);
            psd.setString(4,cadena4);
            psd.setString(5,cadena5);
            int n=psd.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }
            String cadena1, cadena2, cadena3, cadena4, cadena5;
            cadena1= tCI.getText();
            cadena2= tNombre.getText();
            cadena3= tTelefono.getText();
            cadena4= tCuenta.getText();
            cadena5= tCodigo.getText();
            if((tCI.getText().equals("")) || (tNombre.getText().equals("")) || (tTelefono.getText().equals("")) || (tCuenta.getText().equals("") || (tCodigo.getText().equals("")))){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                tNombre.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingresos_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void tCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCIKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_tCIKeyTyped

    private void tTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTelefonoKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_tTelefonoKeyTyped

    private void tCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCuentaKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_tCuentaKeyTyped

    private void tNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNombreKeyTyped
        char c= evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_tNombreKeyTyped

    private void tCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCodigoKeyTyped
        char c= evt.getKeyChar();
        if((c<'A' || c>'Z') && (c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_tCodigoKeyTyped

    private void tCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCIActionPerformed
        tCI.transferFocus();
    }//GEN-LAST:event_tCIActionPerformed

    private void tCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCuentaActionPerformed
        tCuenta.transferFocus();
    }//GEN-LAST:event_tCuentaActionPerformed

    private void tCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCodigoActionPerformed
        tCodigo.transferFocus();
    }//GEN-LAST:event_tCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresos_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresos_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresos_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresos_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresos_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANTEStITULO;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel jCI;
    private javax.swing.JLabel jCuenta;
    private javax.swing.JLabel jFondo;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JButton jRetorno;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField tCI;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tCuenta;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private static class PreparatedStatement {

        public PreparatedStatement() {
        }
    }
}
