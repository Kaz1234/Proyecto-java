/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Ingresos_cliente extends javax.swing.JFrame {
    private Object stmt;
    private Object e;
    private String cadena1;
    private String cadena2;
    private String cadena3;
    private String cadena4;
    private String cadena5;

    /**
     * Creates new form Ingresos_cliente
     */
    public Ingresos_cliente() {
        initComponents();
        limpiar();
        this.setLocationRelativeTo(null);
    }

    void limpiar(){
        txtCI.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCuenta.setText("");
        txtCodigo.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ANTEStITULO = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jRetorno = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jCI = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        jCuenta = new javax.swing.JLabel();
        jCodigo = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVERSIONES: LA LLEGADA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("SISTEMA DE INVENTARIO");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 250, 30));

        nombre.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("INVERSIONES: LA LLEGADA");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 270, 30));

        ANTEStITULO.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ANTEStITULO.setForeground(new java.awt.Color(255, 255, 255));
        ANTEStITULO.setText("DATOS DEL");
        getContentPane().add(ANTEStITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO CLIENTE");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

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
        getContentPane().add(jRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

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
        getContentPane().add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 130, -1));

        jCI.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCI.setForeground(new java.awt.Color(255, 255, 255));
        jCI.setText("CI o RIF :");
        getContentPane().add(jCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jNombre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("NOMBRE :");
        getContentPane().add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jTelefono.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTelefono.setText("TELEFONO :");
        getContentPane().add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jCuenta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jCuenta.setText("CUENTA :");
        getContentPane().add(jCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jCodigo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jCodigo.setText("CODIGO :");
        getContentPane().add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        txtCI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIActionPerformed(evt);
            }
        });
        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });
        getContentPane().add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 430, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 430, 30));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 430, 30));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 430, 30));

        txtCuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });
        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 430, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos de pantala hd 1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 846, 525));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetornoActionPerformed
        accesos2 obj=new accesos2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jRetornoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
            
            conectate_cliente cc=new conectate_cliente();
            Connection cn = cc.coneccion();
            String sql="";
            sql="INSERT INTO clientes(CI, Nombre, Telefono, Cuenta, Codigo) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement psd= cn.prepareStatement(sql);
            psd.setString(1,cadena1);
            psd.setString(2,cadena2);
            psd.setString(3,cadena5);
            psd.setString(4,cadena3);
            psd.setString(5,cadena4);
            int n=psd.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }
            String cadena1, cadena2, cadena3, cadena4, cadena5;
            cadena1= txtCI.getText();
            cadena2= txtNombre.getText();
            cadena3= txtTelefono.getText();
            cadena4= txtCuenta.getText();
            cadena5= txtCodigo.getText();
            if((txtCI.getText().equals("")) || (txtNombre.getText().equals("")) || (txtTelefono.getText().equals("")) || (txtCuenta.getText().equals("") || (txtCodigo.getText().equals("")))){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingresos_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c= evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaActionPerformed
        txtCuenta.transferFocus();
    }//GEN-LAST:event_txtCuentaActionPerformed

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
        txtCI.transferFocus();
    }//GEN-LAST:event_txtCIActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        txtCodigo.transferFocus();
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed
 
   
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
            java.util.logging.Logger.getLogger(Ingresos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresos_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresos_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANTEStITULO;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jCI;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jCuenta;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jNombre;
    private javax.swing.JButton jRetorno;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private static class conectate_clientes extends conectate_empleados {

        public conectate_clientes() {
        }
    }
}
