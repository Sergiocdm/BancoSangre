/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import BaseDeDatos.Conexion;
import Vistas.JFDonaciones;
import Vistas.JFDonaciones;
import Vistas.JFDonaciones;
import Vistas.JFInicio;
import Vistas.JFInicio;
import Vistas.JFInicio;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class FrmAgregarAdminUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmAgregarAdminUsuario
     */
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    public FrmAgregarAdminUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        CbClientes.setEnabled(false);
        CbDonadores.setEnabled(false);
        CbAyuda.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CbClientes = new javax.swing.JCheckBox();
        CbDonadores = new javax.swing.JCheckBox();
        CbAyuda = new javax.swing.JCheckBox();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre :");

        jLabel2.setText("Password :");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel3.setText("Permiso:");

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo Usuario", "Administrador", "Usuario" }));
        cmbTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Formulario Tipo  Usuario");

        CbClientes.setText("Clientes");

        CbDonadores.setText("Donadores");

        CbAyuda.setSelected(true);
        CbAyuda.setText("Ayuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(CbClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbDonadores)
                            .addComponent(CbAyuda)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CbClientes))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(CbDonadores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbAyuda))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Usuario = txtCuenta.getText();
        String Pass = new String(txtPassword.getPassword());
        String Permiso = cmbTipoUsuario.getSelectedItem().toString();
        String Clientes = "";
        String Donaciones = "";
        String Ayuda = "";
        boolean bandera = true;

        if (Usuario.trim().length() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;

        }
        if (Pass.trim().length() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;

        }
        if (cmbTipoUsuario.getSelectedIndex() == 0) {
            lblMensaje.setForeground(Color.red);
            lblMensaje.setText("Error en algun campo");
            lblMensaje.setVisible(true);
            bandera = false;

        }
        if (cmbTipoUsuario.getSelectedIndex() == 1) {
            Clientes = "Permitir";
            Donaciones = "Permitir";
            Ayuda = "Permitir";
        } else {
            if (CbClientes.isSelected()) {
                Clientes = "Permitir";
            } else {
                Clientes = "Denegar";
            }
            if (CbDonadores.isSelected()) {
                Donaciones = "Permitir";
            } else {
                Donaciones = "Denegar";
            }
            if (CbAyuda.isSelected()) {
                Ayuda = "Permitir";
            } else {
                Ayuda = "Denegar";
            }
        }
        if (bandera == true) {
            try {
                PreparedStatement pps = cn.prepareStatement("INSERT INTO usuario (Usuario,PasswordU,Permiso)"
                        + "VALUES (? , MD5(?) , ? );");
                pps.setString(1, Usuario);
                pps.setString(2, Pass);
                pps.setString(3, Permiso);
                pps.executeUpdate();
                PreparedStatement pps2 = cn.prepareStatement("INSERT INTO permisos (ClientesV,DonadoresV,AyudaV,IDUsuario)"
                        + "VALUES (? , ? , ?, (Select IDUsuario from usuario where Usuario = ?) );");
                pps2.setString(1, Clientes);
                pps2.setString(2, Donaciones);
                pps2.setString(3, Ayuda);
                pps2.setString(3, Usuario);
                pps2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos Guardados con Exito");

            } catch (SQLException ex) {
                Logger.getLogger(JFDonaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            lblMensaje.setText("Usuario o Administrador  agregado con Exito!!");
            lblMensaje.setForeground(Color.green);
            bandera = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoUsuarioActionPerformed
        int Op = cmbTipoUsuario.getSelectedIndex();
        switch (Op) {
            case 1:
                CbClientes.setEnabled(false);
                CbDonadores.setEnabled(false);
                CbAyuda.setEnabled(false);
                break;
            case 2:
                CbClientes.setEnabled(true);
                CbDonadores.setEnabled(true);
                CbAyuda.setEnabled(true);
                break;
            default:
                break;

        }
    }//GEN-LAST:event_cmbTipoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarAdminUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CbAyuda;
    private javax.swing.JCheckBox CbClientes;
    private javax.swing.JCheckBox CbDonadores;
    private javax.swing.JComboBox cmbTipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
