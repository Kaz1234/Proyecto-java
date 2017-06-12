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

public class Actualizar_productos extends javax.swing.JFrame {
    private DefaultTableModels model;
    /**
     * Creates new form Actualizar_productos
     */
    public Actualizar_productos() {
        initComponents();
        DefaultTableModel model;
        cargar("");
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
        jRevisar.setModel((TableModel) model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bienvenida = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRevisar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        aux = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("SISTEMA DE INVENTARIO");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 330, 30));

        nombre.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("INVERSIONES: LA LLEGADA");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 30));

        jRevisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jRevisar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 800, 270));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        aux.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                auxKeyReleased(evt);
            }
        });
        getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 210, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el codigo del producto que desea!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 210, 20));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        jButton1.setText("MOSTRAR TODO");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 150, 40));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Valid.png"))); // NOI18N
        jButton2.setText("GUARDAR CAMBIOS");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/241688__astana-bike-astana-kazakhstan-cycling-the-best-team-claude-kloden_p.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void auxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auxKeyReleased
        cargar(aux.getText());
    }//GEN-LAST:event_auxKeyReleased

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
            java.util.logging.Logger.getLogger(Actualizar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JTextField aux;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jRevisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

    private void cargar(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class jrevisar {

        private static void setModel(TableModel tableModel) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jrevisar() {
        }
    }

    private static class DefaultTableModels {

        public DefaultTableModels(Object object, String[] titulos) {
        }

        private void addRow(String[] registros) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
