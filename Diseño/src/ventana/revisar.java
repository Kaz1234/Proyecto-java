package ventana;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author usuari
 */
public class revisar extends javax.swing.JFrame {
    private DefaultTableModels model;

    /**
     * Creates new form revisar
     */
    public revisar() {
        DefaultTableModel model;
        cargar("");
        initComponents();
        setLocationRelativeTo(null);
    }

    void cargar(String[] registro, String valor){
        
        String [] titulos={"Codigo", "Tipo", "Marca", "Color", "Cantidad", "Precio"};
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        String [] registros =new String[5];
        
        String sql="SELECT * FROM Productos where Codigo LIKE '%"+valor+"%'";
        
        model = new DefaultTableModels(null, titulos);
        
        conectate_producto cc=new conectate_producto();
        Connection cn= cc.coneccion();
     
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
        while(rs.next()){
            registro[0]=rs.getString("Codigo");
            registro[1]=rs.getString("Tipo");
            registro[2]=rs.getString("Marca");
            registro[3]=rs.getString("Color");
            registro[4]=rs.getString("Cantidad");
            registro[5]=rs.getString("Precio");
            model.addRow(registros);
        }
        jrevisar.setModel((TableModel) model); //jrevisar es el nombre de la tabla donde aparecen los datos
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jrevisar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Bienvenida = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrevisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jrevisar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 770, 300));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        Bienvenida.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("SISTEMA DE INVENTARIO");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 330, 30));

        nombre.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("INVERSIONES: LA LLEGADA");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 30));

        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });
        getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 220, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el codigo del producto que desea!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        jButton1.setText("MOSTRAR TODO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 150, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/241688__astana-bike-astana-kazakhstan-cycling-the-best-team-claude-kloden_p.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 804, 492));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        cargar(aux.getText());
    }//GEN-LAST:event_auxKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(revisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(revisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(revisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(revisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new revisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField aux;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jrevisar;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

    private void cargar(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class DefaultTableModels {

        public DefaultTableModels() {
        }

        private DefaultTableModels(Object object, String[] titulos) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void addRow(String[] registros) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
    

