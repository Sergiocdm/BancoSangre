/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BaseDeDatos.Conexion;
import Controlador.Gestora;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SergioC
 */
public class JFModificar extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public JFModificar() {
        initComponents();
        gestora.cargarlistaPadecimientosD();
        gestora.cargarlistaPaisD();
        lblMensaje.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    DateFormat df = DateFormat.getDateInstance();
    Controlador.Gestora gestora = new Gestora();
    boolean bandera = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        cmbProvincia = new javax.swing.JComboBox();
        cmbCanton = new javax.swing.JComboBox();
        cmbPadecimientos1 = new javax.swing.JComboBox();
        cmbEstado = new javax.swing.JComboBox();
        cmbEstadoCivil = new javax.swing.JComboBox();
        cmbSiesDonadoroNO = new javax.swing.JComboBox();
        txtTelefonoDonador = new javax.swing.JFormattedTextField();
        cmbTipoSangre = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        JCalendar = new com.toedter.calendar.JDateChooser();
        txtCorreo = new javax.swing.JTextField();
        lblIden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setOpaque(false);

        jLabel1.setText("Nombre :");

        jLabel2.setText("Apellido1 :");

        jLabel3.setText("Apellido2 :");

        jLabel6.setText("Pais :");

        jLabel7.setText("Provincia :");

        jLabel8.setText("Fecha de Nacimiento :");

        jLabel10.setText("Tipo de Sangre :");

        jLabel11.setText("Padecimientos :");

        jLabel12.setText("Estado :");

        jLabel13.setText("Estado Civil :");

        jLabel14.setText("Es donador de órganos :");

        jLabel15.setText("Telefono :");

        jLabel16.setText("Correo Electronico :");

        txtNombre.setToolTipText("");

        jLabel17.setText("Canton :");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Modificar Donador ");

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione país" }));
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione la Provincia" }));
        cmbProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaActionPerformed(evt);
            }
        });

        cmbCanton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el Cantón" }));
        cmbCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCantonActionPerformed(evt);
            }
        });

        cmbPadecimientos1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Padecimiento" }));
        cmbPadecimientos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPadecimientos1ActionPerformed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));

        cmbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Casado", "Soltero", "Divorciado", "Viudo", "Union Libre" }));

        cmbSiesDonadoroNO.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione si es donador", "NO", "SI" }));

        try {
            txtTelefonoDonador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoDonador.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        cmbTipoSangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo de Sangre", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMensaje.setText("jLabel5");

        lblIden.setText("identificacion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)
                                .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(10, 10, 10)
                                .addComponent(cmbCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(4, 4, 4)
                                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblMensaje)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(70, 70, 70)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(48, 48, 48)
                                .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPadecimientos1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtCorreo))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbSiesDonadoroNO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTelefonoDonador, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblIden)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6))
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel17))
                            .addComponent(cmbCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(JCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensaje)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbPadecimientos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSiesDonadoroNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15))
                            .addComponent(txtTelefonoDonador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblIden)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        bandera = false;
        cmbProvincia.removeAllItems();
        cmbProvincia.addItem("Seleccione la Provincia");
        cmbCanton.removeAllItems();
        cmbCanton.addItem("Seleccione el Cantón");
        bandera = true;
        gestora.cargarlistaProvinciaD(cmbPais.getSelectedIndex());
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void cmbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaActionPerformed
        cmbCanton.removeAllItems();
        cmbCanton.addItem("Seleccione el Cantón");
        if (bandera == false) {

        } else {
            gestora.cargarlistaCantonD(cmbProvincia.getSelectedItem().toString(), cmbPais.getSelectedIndex());
        }
    }//GEN-LAST:event_cmbProvinciaActionPerformed

    private void cmbCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantonActionPerformed

    }//GEN-LAST:event_cmbCantonActionPerformed

    private void cmbPadecimientos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPadecimientos1ActionPerformed

    }//GEN-LAST:event_cmbPadecimientos1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nombre = txtNombre.getText();
        String Apellido = txtApellido1.getText();
        String Apellido2 = txtApellido2.getText();
        String identificacion = lblIden.getText();
        String Correo = txtCorreo.getText();

        int Longitud = Correo.length();
        char valor;
        boolean bandera = true;
        /*Aqui valido el nombre si la longitud del nombre es igual a 0 mando el error*/
        if (Nombre.trim().length() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }
        /*Aqui valido el apellido 1 y 2 si la longitud alguno es igual a 0 mando el error*/
        if (Apellido.trim().length() == 0 || Apellido2.trim().length() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }
        /*Aqui valido la identificación si la longitud es igual a 0 mando el error*/
        if (identificacion.trim().length() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }

        if (cmbPais.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }

        if (cmbProvincia.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }

        if (cmbCanton.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }

        if (cmbPadecimientos1.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }

        if (cmbTipoSangre.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }

        if (cmbEstadoCivil.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }
        if (txtTelefonoDonador.getText().trim().length() < 9) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;
        }
        for (char i = 0; i < Longitud; i++) {
            valor = Correo.charAt(i);
            if (valor == '@' && i == 0) {
                lblMensaje.setForeground(Color.red);
                lblMensaje.setText("Error en algun campo");
                lblMensaje.setVisible(true);
                bandera = false;
                break;
            }
            if (valor == '@') {
                break;
            } else if (i == Longitud - 1) {
                lblMensaje.setForeground(Color.red);
                lblMensaje.setText("Error en algun campo");
                lblMensaje.setVisible(true);
                bandera = false;
                break;
            }
        }
        /*Con este if lo que hago es ver si entro a algún método si entro no entra aquí entonces
         no esta correcto algún campo y si entra todos los campos están correctos*/
        if (bandera == true) {
            lblMensaje.setText("Donador agregado con Exito!!");
            lblMensaje.setForeground(Color.green);

            String Tel = txtTelefonoDonador.getText();
            String Cal = df.format(JCalendar.getDate());
            txtNombre.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            txtCorreo.setText("");
            txtTelefonoDonador.setText("");

            try {
                PreparedStatement pps = cn.prepareStatement("UPDATE  ignore donadores SET Nombre = ?, Apellido1 = ?, \n"
                        + "Apellido2 = ?, FechaNacimiento = ?\n"
                        + ", TipoDeSangre = ?, \n"
                        + "EstadoCivil = ?, Estado = ?, \n"
                        + "DonadorOrg = ?, Telefono = ?, correo = ? WHERE Identificacion = ?;");
                pps.setString(1, Nombre);
                pps.setString(2, Apellido);
                pps.setString(3, Apellido2);
                pps.setString(4, Cal);
                pps.setString(5, cmbTipoSangre.getSelectedItem().toString());
                pps.setString(6, cmbEstadoCivil.getSelectedItem().toString());
                pps.setString(7, cmbEstado.getSelectedItem().toString());
                pps.setString(8, cmbSiesDonadoroNO.getSelectedItem().toString());
                pps.setString(9, Tel);
                pps.setString(10, Correo);
                pps.setString(11, identificacion);
                pps.executeUpdate();
                PreparedStatement pps2 = cn.prepareStatement("UPDATE IGNORE residenciadonador SET\n"
                        + "IDPais = (Select IDPais from pais where NombrePais = ?),\n"
                        + "IDProvincia =(Select IDProvincia from provincia where NombreProvincia = ?),\n"
                        + "IDCanton =(Select IDCanton from canton where NombreCanton = ?) where IDDonador ="
                        + "(select IDDonador from donadores where identificacion = ?);");
                pps2.setString(1, cmbPais.getSelectedItem().toString());
                pps2.setString(2, cmbProvincia.getSelectedItem().toString());
                pps2.setString(3, cmbCanton.getSelectedItem().toString());
                pps2.setString(4, identificacion);
                pps2.execute();
                PreparedStatement pps3 = cn.prepareStatement("UPDATE IGNORE padecimientosdonadores SET\n"
                        + "IDPadecimiento = (Select IDPadecimiento from padecimientos where NombrePadecimiento = ?)");
                pps3.setString(1, cmbPadecimientos1.getSelectedItem().toString());
                pps3.execute();

                JOptionPane.showMessageDialog(null, "Datos Guardados con Exito");
                this.dispose();
                JFDonaciones don = new JFDonaciones();
                don.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(JFDonaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            java.util.logging.Logger.getLogger(JFModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser JCalendar;
    public static javax.swing.JComboBox cmbCanton;
    public static javax.swing.JComboBox cmbEstado;
    public static javax.swing.JComboBox cmbEstadoCivil;
    public static javax.swing.JComboBox cmbPadecimientos1;
    public static javax.swing.JComboBox cmbPais;
    public static javax.swing.JComboBox cmbProvincia;
    public static javax.swing.JComboBox cmbSiesDonadoroNO;
    public static javax.swing.JComboBox cmbTipoSangre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lblIden;
    private javax.swing.JLabel lblMensaje;
    public static javax.swing.JTextField txtApellido1;
    public static javax.swing.JTextField txtApellido2;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JFormattedTextField txtTelefonoDonador;
    // End of variables declaration//GEN-END:variables
}
