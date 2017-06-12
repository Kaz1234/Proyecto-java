package ventana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ingresos_productos extends javax.swing.JFrame {

    private Object stmt;
    private Object e;
    private String cadena1;
    private String cadena2;
    private String cadena3;
    private String cadena4;
    private String cadena5;
    private String cadena6;
    
    public Ingresos_productos() {
        initComponents();
        limpiar();
        this.setLocationRelativeTo(null);
        this.deshabilitar();
    }

    void habilitar(){
        opcionColor.isSelected();
        jColor.setSelectedItem(true);
    }
    void deshabilitar(){
        opcionColor.isSelected();
        jColor.setSelectedItem(false);
    }
    void limpiar(){
        jCodigo.setText("");
        jTipo.getSelectedItem();
        jColor.getSelectedItem();
        jMarca.getSelectedItem();
        jCantidad.getSelectedItem();
        jPrecio.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ANTEStITULO = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jRetorno = new javax.swing.JButton();
        codigo = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jCodigo = new javax.swing.JTextField();
        jMarca = new javax.swing.JComboBox();
        jTipo = new javax.swing.JComboBox();
        jCantidad = new javax.swing.JComboBox();
        jColor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        opcionColor = new javax.swing.JCheckBox();
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
        getContentPane().add(ANTEStITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO PRODUCTO");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

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
        getContentPane().add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 130, -1));

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

        codigo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setText("CODIGO :");
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        marca.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("MARCA :");
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        Tipo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 255, 255));
        Tipo.setText("TIPO :");
        getContentPane().add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        Cantidad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(255, 255, 255));
        Cantidad.setText("CANTIDAD :");
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        Precio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("PRECIO :");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        jPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(jPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 170, 30));

        jCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 280, 30));

        jMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "KAMIKAZE", "KENDA", "SHIMANO", "SHARK", "MIURA" }));
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 180, 30));

        jTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "CAUCHO", "CAMARA DE AIRE", "MANUBRIO", "MANILLA DE FRENO", "PALANCAS DE CAMBIOS", "GUAYA SOLA FRENO", "GUAYA SOLA CAMBIO", "GUAYA C/FORRO FRENO", "GUAYA C/FORRO CAMBIOS", "JGO. FRENOS HIERRO", "JGO. FRENOS ALUMNIO", "PUÑOS", "POTENCIA", "HORQUILLA", "ROLINERAS DE DIRECCION", "ROLINERAS DELANTERAS", "ROLINERAS TRASERAS", "ROLINERAS CENTRALES", "ROLINERAS CENTRALES C/GRANDE", "ARO HIERRO", "ARO ALUMINIO", "RIN HIERRO", "RIN ALUMINIO", "BOCINA H/D", "BOCINA H/T", "BOCINA H/T DOBLE ROSCA", "JGO. BOCINA ALUMINIO", "JGO. BOCINA ALUMNIO DOBLE ROSCA", "RAYOS", "EJE DELANTERO", "EJE DELANTERO GRUESO", "EJE C/CUADRANTE", "EJE C/CUÑAS", "EJE C/CAJA GRANDE", "EJE TRASERO", "CUADRO", "GUSANILLOS", "PERRO DE CADENA", "CORONA", "CADENA" }));
        getContentPane().add(jTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 280, 30));

        jCantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        getContentPane().add(jCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 130, 30));

        jColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COLOR", "NEGRO", "AZUL", "ROJO", "VERDE", "AMARILLO", "NARANJA", "BLANCO", "CROMADO", "ROSADO", "NO ESPECIFICADO" }));
        getContentPane().add(jColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 190, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COLOR:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        opcionColor.setText("Seleccionar");
        opcionColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionColorActionPerformed(evt);
            }
        });
        getContentPane().add(opcionColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/232191_(www.GdeFon.ru).jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        conectate_empleados cc=new conectate_empleados();
            Connection cn = cc.coneccion();
            String sql="";
            sql="INSERT INTO empleados(Codigo, Tipo, Color, Marca, Cantidad, Precio) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement psd= cn.prepareStatement(sql);
            psd.setString(1,cadena1);
            psd.setString(2,cadena2);
            psd.setString(3,cadena3);
            psd.setString(4,cadena4);
            psd.setString(5,cadena5);
            psd.setString(6,cadena6);
            int n=psd.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }
            String cadena1, cadena2, cadena3, cadena4, cadena5, cadena6;
            cadena1= jCodigo.getText();
            cadena2= (String) jTipo.getSelectedItem();
            cadena3= (String) jColor.getSelectedItem();
            cadena4= (String) jMarca.getSelectedItem();
            cadena5= (String) jCantidad.getSelectedItem();
            cadena6= jPrecio.getText();
            if((jPrecio.getText().equals("")) ||(jCodigo.getText().equals(""))){
                
                javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                jCodigo.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingresos_empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRetornoActionPerformed
        accesos2 obj=new accesos2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jRetornoActionPerformed

    private void jCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCodigoKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_jCodigoKeyTyped

    private void jPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrecioKeyTyped
        char c= evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_jPrecioKeyTyped

    private void opcionColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionColorActionPerformed
        this.habilitar();
    }//GEN-LAST:event_opcionColorActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresos_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresos_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresos_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresos_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresos_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANTEStITULO;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox jCantidad;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JComboBox jColor;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox jMarca;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JButton jRetorno;
    private javax.swing.JComboBox jTipo;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel nombre;
    private javax.swing.JCheckBox opcionColor;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
