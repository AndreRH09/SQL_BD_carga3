/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package credivis;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class A2T_TASA extends javax.swing.JFrame {

    Conexion con1 = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    private boolean modoModificacion = false;
    int idc;

    public A2T_TASA() {
        initComponents();
        setLocationRelativeTo(null);
        desahbilitarGrillas();
        consultar();
    }

    boolean MonFlaAct = false; // Flag para indicar si se realizará alguna acción de actualización
    String TipProEstRegDefault = "A"; // Valor por defecto para el estado de registro

    void limpiarCampos() {
        jTextField1.setText(""); // Código
        jTextField2.setText(""); // Descripción
        jTextField3.setText(""); // Estado de registro por defecto 'A'
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMon = new javax.swing.JTable();
        adicionar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Reactivar = new javax.swing.JButton();
        Inactivar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIPO PRODUCTO");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel2.setText("Descripcion:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel3.setText("Estado Registro:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel5.setText("Registro de Tipo de Producto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(49, 49, 49))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("GZZ_TIPO_PRODUCTO");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tabla Tipo de Producto");

        tablaMon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tablaMon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Estado de Registro"
            }
        ));
        tablaMon.setAutoscrolls(false);
        jScrollPane1.setViewportView(tablaMon);
        if (tablaMon.getColumnModel().getColumnCount() > 0) {
            tablaMon.getColumnModel().getColumn(0).setMinWidth(50);
            tablaMon.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaMon.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaMon.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaMon.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Reactivar.setText("Reactivar");
        Reactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReactivarActionPerformed(evt);
            }
        });

        Inactivar.setText("Inactivar");
        Inactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Inactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Reactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inactivar)
                    .addComponent(Reactivar)
                    .addComponent(Actualizar)
                    .addComponent(Salir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        limpiarCampos(); // Limpia los campos de texto

        // Habilita la edición de los campos para ingresar nuevo registro
        habilitarGrillas();

        // Establece el estado de registro por defecto 'A'
        jTextField3.setText("A");
        jTextField3.setEditable(false);
        jTextField3.setBackground(Color.LIGHT_GRAY);

        MonFlaAct = true; // Indica que se va a adicionar un registro
    }//GEN-LAST:event_adicionarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        int filaSeleccionada = tablaMon.getSelectedRow();
        if (filaSeleccionada >= 0) {
            jTextField1.setText(tablaMon.getValueAt(filaSeleccionada, 0).toString());
            jTextField2.setText(tablaMon.getValueAt(filaSeleccionada, 1).toString());
            jTextField3.setText(tablaMon.getValueAt(filaSeleccionada, 2).toString());

            modoModificacion = true;
            jTextField2.setEditable(true);
            jTextField2.setBackground(Color.WHITE);
            MonFlaAct = true; // Indicar que se va a modificar un registro
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = tablaMon.getSelectedRow();
        if (filaSeleccionada >= 0) {
            jTextField1.setText(tablaMon.getValueAt(filaSeleccionada, 0).toString());
            jTextField2.setText(tablaMon.getValueAt(filaSeleccionada, 1).toString());
            jTextField3.setText("*"); // Marcado lógico para eliminar
            MonFlaAct = true; // Indicar que se va a eliminar un registro
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_EliminarActionPerformed


    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiarCampos();
        MonFlaAct = false;
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        // Cambiar el color de fondo de los campos de texto a gris
        jTextField1.setBackground(Color.LIGHT_GRAY);
        jTextField2.setBackground(Color.LIGHT_GRAY);
        jTextField3.setBackground(Color.LIGHT_GRAY);
        // Desactivar la acción de actualización
    }//GEN-LAST:event_CancelarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        if (MonFlaAct) {
            String codigo = jTextField1.getText();
            String descripcion = jTextField2.getText();
            String estadoRegistro = jTextField3.getText();

            try {
                int codigoRol = Integer.parseInt(codigo);
                // Resto del código que utiliza codigoRol
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor válido para el código.");
                return;
            }
            String sql = "";
            boolean exito = false;

            try {
                PreparedStatement pst;

                if (estadoRegistro.equals("*")) {
                    // Eliminación lógica
                    sql = "UPDATE azz_tipo_producto SET TipProEstReg = '*' WHERE TipProCod = ?";
                    pst = con1.getConnection().prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(codigo));

                } else if (act && existeRegistro(codigo)) {
                    // Modificación de un registro existente
                    sql = "UPDATE azz_tipo_producto SET TipProDes = ?, TipProEstReg = ? WHERE TipProCod = ?";
                    pst = con1.getConnection().prepareStatement(sql);
                    pst.setString(1, descripcion);
                    pst.setString(2, estadoRegistro);
                    pst.setInt(3, Integer.parseInt(codigo));
                    act = false;
                } else if (modoModificacion) {
                    // Modificación de un registro existente
                    sql = "UPDATE azz_tipo_producto SET TipProDes = ?, TipProEstReg = ? WHERE TipProCod = ?";
                    pst = con1.getConnection().prepareStatement(sql);
                    pst.setString(1, descripcion);
                    pst.setString(2, estadoRegistro);
                    pst.setInt(3, Integer.parseInt(codigo));

                } else {
                    // Verificar si el registro existe para INSERT
                    sql = "SELECT COUNT(*) FROM azz_tipo_producto WHERE TipProCod = ?";
                    pst = con1.getConnection().prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(codigo));
                    ResultSet rs = pst.executeQuery();
                    rs.next();
                    int count = rs.getInt(1);

                    if (count > 0) {
                        // No permitir la creación de un nuevo registro con un TipProCod existente
                        JOptionPane.showMessageDialog(this, "Ya existe un registro con este código.");
                        return;
                    } else {
                        // Insertar un nuevo registro
                        sql = "INSERT INTO azz_tipo_producto (TipProCod, TipProDes, TipProEstReg) VALUES (?, ?, ?)";
                        pst = con1.getConnection().prepareStatement(sql);
                        pst.setInt(1, Integer.parseInt(codigo));
                        pst.setString(2, descripcion);
                        pst.setString(3, estadoRegistro);
                    }
                }

                int resultado = pst.executeUpdate();

                if (resultado > 0) {
                    exito = true;
                }

                limpiarCampos();

                if (exito) {
                    JOptionPane.showMessageDialog(this, "Operación realizada exitosamente.");
                    MonFlaAct = false; // Desactivar la operación activa
                    modoModificacion = false; // Desactivar el modo de modificación
                    consultar(); // Actualizar la tabla después de cualquier operación
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo realizar la operación.");
                }
                desahbilitarGrillas();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al ejecutar la operación SQL.");
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ingrese un valor válido para el código.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay operación activa para actualizar.");
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private boolean act = false;
    private void ReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReactivarActionPerformed
        int filaSeleccionada = tablaMon.getSelectedRow();
        if (filaSeleccionada >= 0) {
            jTextField1.setText(tablaMon.getValueAt(filaSeleccionada, 0).toString());
            jTextField2.setText(tablaMon.getValueAt(filaSeleccionada, 1).toString());
            jTextField3.setText("A"); // Reactivar el registro
            act = true;
            MonFlaAct = true; // Indicar que se va a reactivar un registro
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para reactivar.");
        }
    }//GEN-LAST:event_ReactivarActionPerformed

    private void InactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivarActionPerformed
        int filaSeleccionada = tablaMon.getSelectedRow();
        if (filaSeleccionada >= 0) {
            jTextField1.setText(tablaMon.getValueAt(filaSeleccionada, 0).toString());
            jTextField2.setText(tablaMon.getValueAt(filaSeleccionada, 1).toString());
            jTextField3.setText("I"); // Inactivar el registro
            MonFlaAct = true; // Indicar que se va a inactivar un registro
            act = true;
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para inactivar.");
        }
    }//GEN-LAST:event_InactivarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public boolean existeRegistro(String codigo) {
        boolean existe = false;
        String sql = "SELECT COUNT(*) FROM azz_tipo_producto WHERE TipProCod = ?";

        try {
            PreparedStatement pst = con1.getConnection().prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(codigo));
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    existe = true;  // Si count > 0, significa que ya existe un registro con ese TipProCod
                }
            }

            rs.close();
            pst.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores según tu implementación
        }

        return existe;
    }

    void consultar() {
        String sql = "Select * from azz_tipo_producto";
        try {
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] moned = new Object[3];
            modelo = (DefaultTableModel) tablaMon.getModel();
            modelo.setRowCount(0); // Limpia todas las filas actuales del modelo

            while (rs.next()) {

                int TipProCod = rs.getInt("TipProCod");
                String formattedTipProCod = String.format("%02d", TipProCod);
                moned[0] = formattedTipProCod; // Asigna el valor formateado
                moned[1] = rs.getString("TipProDes");
                moned[2] = rs.getString("TipProEstReg");

                modelo.addRow(moned);
            }
            tablaMon.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void habilitarGrillas() {
        jTextField1.setEditable(true);
        jTextField1.setBackground(Color.WHITE);
        jTextField2.setEditable(true);
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setEditable(true);
        jTextField3.setBackground(Color.WHITE);
    }

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
            java.util.logging.Logger.getLogger(A2T_TASA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A2T_TASA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A2T_TASA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A2T_TASA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A2T_TASA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Inactivar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Reactivar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton adicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tablaMon;
    // End of variables declaration//GEN-END:variables

    private void desahbilitarGrillas() {
        jTextField1.setEditable(false);
        jTextField1.setBackground(Color.LIGHT_GRAY);
        jTextField2.setEditable(false);
        jTextField2.setBackground(Color.LIGHT_GRAY);
        jTextField3.setEditable(false);
        jTextField3.setBackground(Color.LIGHT_GRAY);
    }

}
