/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.io.IOException;

/**
 *
 * @author usuari
 */
public class accesos2 extends javax.swing.JFrame {

    /**
     * Creates new form accesos2
     */
    public accesos2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accesos2 = new javax.swing.ButtonGroup();
        Bienvenida = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        panelIngresar = new javax.swing.JPanel();
        empleadoN = new javax.swing.JRadioButton();
        clienteN = new javax.swing.JRadioButton();
        productoN = new javax.swing.JRadioButton();
        panelVentas = new javax.swing.JPanel();
        producto = new javax.swing.JRadioButton();
        servicio = new javax.swing.JRadioButton();
        panelPagos = new javax.swing.JPanel();
        proveedor = new javax.swing.JRadioButton();
        empleado = new javax.swing.JRadioButton();
        cerrar = new javax.swing.JButton();
        acceder = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        MenuInventario = new javax.swing.JMenu();
        RevisarInventario = new javax.swing.JMenuItem();
        ActualizarInventario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ActaulizarPrecio = new javax.swing.JMenu();
        ActualizarPProducto = new javax.swing.JMenuItem();
        ActualizarPServicios = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        InventarioBorrar = new javax.swing.JMenu();
        BorrarEmpleados = new javax.swing.JMenuItem();
        BorrarClientes = new javax.swing.JMenuItem();
        BorrarProveedores = new javax.swing.JMenuItem();
        BorrarProductos = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        EditarEmpleados = new javax.swing.JMenuItem();
        EditarClientes = new javax.swing.JMenuItem();
        EditarProveedores = new javax.swing.JMenuItem();
        MenuRegistros = new javax.swing.JMenu();
        RegistrosFacturas = new javax.swing.JMenuItem();
        RegistrosRecibo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        registrosActividad = new javax.swing.JMenu();
        actividadEmpleado = new javax.swing.JMenuItem();
        actividadProducto = new javax.swing.JMenuItem();
        actividadIngresos = new javax.swing.JMenuItem();
        MenuAlmacen = new javax.swing.JMenu();
        IrAlmacen = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        ConsultarAyuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        AyudaAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVERSIONES: LA LLEGADA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("SISTEMA DE INVENTARIO");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 330, 30));

        nombre.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("INVERSIONES: LA LLEGADA");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 30));

        panelIngresar.setBackground(new java.awt.Color(0, 51, 255));
        panelIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), java.awt.Color.white)); // NOI18N
        panelIngresar.setForeground(new java.awt.Color(204, 204, 204));

        accesos2.add(empleadoN);
        empleadoN.setForeground(new java.awt.Color(255, 255, 255));
        empleadoN.setText("EMPLEADO NUEVO");
        empleadoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoNActionPerformed(evt);
            }
        });

        accesos2.add(clienteN);
        clienteN.setForeground(new java.awt.Color(255, 255, 255));
        clienteN.setText("CLIENTE NUEVO");

        accesos2.add(productoN);
        productoN.setForeground(new java.awt.Color(255, 255, 255));
        productoN.setText("PRODUCTO NUEVO");
        productoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresarLayout = new javax.swing.GroupLayout(panelIngresar);
        panelIngresar.setLayout(panelIngresarLayout);
        panelIngresarLayout.setHorizontalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empleadoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clienteN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productoN, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelIngresarLayout.setVerticalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(empleadoN)
                .addGap(27, 27, 27)
                .addComponent(clienteN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(productoN)
                .addGap(28, 28, 28))
        );

        getContentPane().add(panelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 200));

        panelVentas.setBackground(new java.awt.Color(51, 102, 0));
        panelVentas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VENTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), java.awt.Color.white)); // NOI18N

        accesos2.add(producto);
        producto.setForeground(new java.awt.Color(255, 255, 255));
        producto.setText("PRODUCTOS");

        accesos2.add(servicio);
        servicio.setForeground(new java.awt.Color(255, 255, 255));
        servicio.setText("SERVICIOS");

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentasLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto))
                .addGap(29, 29, 29))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(servicio)
                .addGap(37, 37, 37))
        );

        getContentPane().add(panelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 180, 200));

        panelPagos.setBackground(new java.awt.Color(205, 0, 0));
        panelPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAGOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), java.awt.Color.white)); // NOI18N

        accesos2.add(proveedor);
        proveedor.setForeground(new java.awt.Color(255, 255, 255));
        proveedor.setText("PROVEEDORES");

        accesos2.add(empleado);
        empleado.setForeground(new java.awt.Color(255, 255, 255));
        empleado.setText("EMPLEADOS");

        javax.swing.GroupLayout panelPagosLayout = new javax.swing.GroupLayout(panelPagos);
        panelPagos.setLayout(panelPagosLayout);
        panelPagosLayout.setHorizontalGroup(
            panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelPagosLayout.setVerticalGroup(
            panelPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPagosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(proveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(empleado)
                .addGap(36, 36, 36))
        );

        getContentPane().add(panelPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 180, 200));

        cerrar.setBackground(new java.awt.Color(204, 0, 0));
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Error.png"))); // NOI18N
        cerrar.setText("CERRAR SESION");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 180, -1));

        acceder.setBackground(new java.awt.Color(0, 102, 204));
        acceder.setForeground(new java.awt.Color(255, 255, 255));
        acceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Checkmark.png"))); // NOI18N
        acceder.setText("ACEPTAR");
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });
        getContentPane().add(acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 140, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/241688__astana-bike-astana-kazakhstan-cycling-the-best-team-claude-kloden_p.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        BarraMenu.setBackground(new java.awt.Color(0, 0, 204));

        MenuInventario.setText("Inventario");

        RevisarInventario.setText("Revisar inventario");
        RevisarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisarInventarioActionPerformed(evt);
            }
        });
        MenuInventario.add(RevisarInventario);

        ActualizarInventario.setText("Actualizar lista Productos");
        ActualizarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarInventarioActionPerformed(evt);
            }
        });
        MenuInventario.add(ActualizarInventario);
        MenuInventario.add(jSeparator2);

        ActaulizarPrecio.setText("Actualizar lista Precios");

        ActualizarPProducto.setText("Precio de Productos");
        ActualizarPProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPProductoActionPerformed(evt);
            }
        });
        ActaulizarPrecio.add(ActualizarPProducto);

        ActualizarPServicios.setText("Precio de Servicios");
        ActualizarPServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPServiciosActionPerformed(evt);
            }
        });
        ActaulizarPrecio.add(ActualizarPServicios);

        MenuInventario.add(ActaulizarPrecio);
        MenuInventario.add(jSeparator3);

        InventarioBorrar.setText("Borrar Datos");

        BorrarEmpleados.setText("Empleados");
        InventarioBorrar.add(BorrarEmpleados);

        BorrarClientes.setText("Clientes");
        InventarioBorrar.add(BorrarClientes);

        BorrarProveedores.setText("Proveedores");
        InventarioBorrar.add(BorrarProveedores);

        BorrarProductos.setText("Productos");
        BorrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarProductosActionPerformed(evt);
            }
        });
        InventarioBorrar.add(BorrarProductos);

        MenuInventario.add(InventarioBorrar);

        BarraMenu.add(MenuInventario);

        MenuEditar.setText("Editar");

        EditarEmpleados.setText("Empleados");
        MenuEditar.add(EditarEmpleados);

        EditarClientes.setText("Clientes");
        MenuEditar.add(EditarClientes);

        EditarProveedores.setText("Proveedores");
        MenuEditar.add(EditarProveedores);

        BarraMenu.add(MenuEditar);

        MenuRegistros.setText("Registros");

        RegistrosFacturas.setText("Facturas");
        MenuRegistros.add(RegistrosFacturas);

        RegistrosRecibo.setText("Recibos de Pagos");
        MenuRegistros.add(RegistrosRecibo);
        MenuRegistros.add(jSeparator4);

        registrosActividad.setText("Registros de Actividades");

        actividadEmpleado.setText("Empleaods");
        registrosActividad.add(actividadEmpleado);

        actividadProducto.setText("Productos");
        registrosActividad.add(actividadProducto);

        actividadIngresos.setText("Ingresos");
        registrosActividad.add(actividadIngresos);

        MenuRegistros.add(registrosActividad);

        BarraMenu.add(MenuRegistros);

        MenuAlmacen.setText("Almacen");

        IrAlmacen.setText("Ir a...");
        IrAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAlmacenActionPerformed(evt);
            }
        });
        MenuAlmacen.add(IrAlmacen);

        BarraMenu.add(MenuAlmacen);

        MenuAyuda.setText("Ayuda");

        ConsultarAyuda.setText("Consultar la ayuda                        F1");
        ConsultarAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarAyudaActionPerformed(evt);
            }
        });
        MenuAyuda.add(ConsultarAyuda);
        MenuAyuda.add(jSeparator1);

        AyudaAcerca.setText("Acerca de...");
        AyudaAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaAcercaActionPerformed(evt);
            }
        });
        MenuAyuda.add(AyudaAcerca);

        BarraMenu.add(MenuAyuda);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        interfaz2 obj=new interfaz2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        if(empleadoN.isSelected()){
            Ingresos_empleados obj=new Ingresos_empleados();
            obj.setVisible(true);
            dispose();
        }
        if(clienteN.isSelected()){
            Ingresos_cliente obj=new Ingresos_cliente();
            obj.setVisible(true);
            dispose();
        }
        if(productoN.isSelected()){
            Ingresos_productos obj=new Ingresos_productos();
            obj.setVisible(true);
            dispose();
        }
        if(proveedor.isSelected()){
            Pagos_proveedor obj=new Pagos_proveedor();
            obj.setVisible(true);
            dispose();
        }
        if(empleado.isSelected()){
            Pagos_clientes obj=new Pagos_clientes();
            obj.setVisible(true);
            dispose();
        }
        if(producto.isSelected()){
            Ventas_producto obj=new Ventas_producto();
            obj.setVisible(true);
            dispose();
        }
        if(servicio.isSelected()){
            Ventas_servicios obj=new Ventas_servicios();
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_accederActionPerformed

    private void empleadoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoNActionPerformed

    private void productoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoNActionPerformed

    private void IrAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAlmacenActionPerformed
        Almacen1 obj=new Almacen1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_IrAlmacenActionPerformed

    private void AyudaAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaAcercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AyudaAcercaActionPerformed

    private void BorrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrarProductosActionPerformed

    private void RevisarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisarInventarioActionPerformed
        revisar obj=new revisar();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_RevisarInventarioActionPerformed

    private void ActualizarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarInventarioActionPerformed
        Actualizar_productos onj=new Actualizar_productos();
        onj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ActualizarInventarioActionPerformed

    private void ActualizarPProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPProductoActionPerformed
        Actualizar_PP obj=new Actualizar_PP();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ActualizarPProductoActionPerformed

    private void ActualizarPServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPServiciosActionPerformed
        Actualizar_PS obj=new Actualizar_PS();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ActualizarPServiciosActionPerformed

    private void ConsultarAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarAyudaActionPerformed
        try { Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "MANUAL.pdf");
        } catch (IOException e) {}
    }//GEN-LAST:event_ConsultarAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(accesos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accesos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accesos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accesos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accesos2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ActaulizarPrecio;
    private javax.swing.JMenuItem ActualizarInventario;
    private javax.swing.JMenuItem ActualizarPProducto;
    private javax.swing.JMenuItem ActualizarPServicios;
    private javax.swing.JMenuItem AyudaAcerca;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JMenuItem BorrarClientes;
    private javax.swing.JMenuItem BorrarEmpleados;
    private javax.swing.JMenuItem BorrarProductos;
    private javax.swing.JMenuItem BorrarProveedores;
    private javax.swing.JMenuItem ConsultarAyuda;
    private javax.swing.JMenuItem EditarClientes;
    private javax.swing.JMenuItem EditarEmpleados;
    private javax.swing.JMenuItem EditarProveedores;
    private javax.swing.JMenu InventarioBorrar;
    private javax.swing.JMenuItem IrAlmacen;
    private javax.swing.JMenu MenuAlmacen;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuInventario;
    private javax.swing.JMenu MenuRegistros;
    private javax.swing.JMenuItem RegistrosFacturas;
    private javax.swing.JMenuItem RegistrosRecibo;
    private javax.swing.JMenuItem RevisarInventario;
    private javax.swing.JButton acceder;
    private javax.swing.ButtonGroup accesos2;
    private javax.swing.JMenuItem actividadEmpleado;
    private javax.swing.JMenuItem actividadIngresos;
    private javax.swing.JMenuItem actividadProducto;
    private javax.swing.JButton cerrar;
    private javax.swing.JRadioButton clienteN;
    private javax.swing.JRadioButton empleado;
    private javax.swing.JRadioButton empleadoN;
    private javax.swing.JLabel fondo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JPanel panelPagos;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JRadioButton producto;
    private javax.swing.JRadioButton productoN;
    private javax.swing.JRadioButton proveedor;
    private javax.swing.JMenu registrosActividad;
    private javax.swing.JRadioButton servicio;
    // End of variables declaration//GEN-END:variables
}
