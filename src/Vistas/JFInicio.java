package Vistas;

import BaseDeDatos.Conexion;
import com.sun.awt.AWTUtilities;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SergioC
 */
public class JFInicio extends javax.swing.JFrame {

    int x, y;
    Conexion cc = new Conexion();
    FrmMenuSecundario menusecundario = new FrmMenuSecundario();

    /**
     * Creates new form JFInicio
     */
    public JFInicio() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        Shape format = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, format);

    }

    void acceder(String usuario, String pass) {

        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "Select * from usuario where Usuario=? and PasswordU=md5(?)";
        String cap = "";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            while (rs.next()) {
                cap = rs.getString("Permiso");
            }
            if (cap.equals("Administrador")) {
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
            }
            if (cap.equals("Usuario")) {
                JOptionPane.showMessageDialog(null, "Bienvenido Usuario");
            }
            if ((!cap.equals("Administrador") && (!cap.equals("Usuario")))) {
                JOptionPane.showMessageDialog(null, "No existe Usuario");
            }
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblClose = new javax.swing.JLabel();
        LblMax = new javax.swing.JLabel();
        LblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(51, 51, 51));
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        txtCuenta.setBackground(new java.awt.Color(51, 51, 51));
        txtCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCuentaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuenta");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoF.png"))); // NOI18N

        LblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rojo.png"))); // NOI18N
        LblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblCloseMouseExited(evt);
            }
        });

        LblMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Inactive.png"))); // NOI18N
        LblMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblMaxMouseExited(evt);
            }
        });

        LblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/verde.png"))); // NOI18N
        LblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 162, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)
                        .addComponent(LblMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblMax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(Password)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(LblMax)
                    .addComponent(LblClose)
                    .addComponent(LblMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void LblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_LblCloseMouseClicked

    private void LblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCloseMouseEntered
        LblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rojo_c.png")));
    }//GEN-LAST:event_LblCloseMouseEntered

    private void LblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCloseMouseExited
        LblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/rojo.png")));
    }//GEN-LAST:event_LblCloseMouseExited

    private void LblMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMaxMouseEntered
        LblMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Inactive_c.png")));
    }//GEN-LAST:event_LblMaxMouseEntered

    private void LblMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMaxMouseExited
        LblMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Inactive.png")));
    }//GEN-LAST:event_LblMaxMouseExited

    private void LblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_LblMinMouseClicked

    private void LblMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinMouseEntered
        LblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/verde_c.png")));
    }//GEN-LAST:event_LblMinMouseEntered

    private void LblMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblMinMouseExited
        LblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/verde.png")));
    }//GEN-LAST:event_LblMinMouseExited

    private void txtCuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyPressed

    }//GEN-LAST:event_txtCuentaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = txtCuenta.getText();
        String pass = new String(Password.getPassword());
        acceder(usuario, pass);
        menusecundario.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblClose;
    private javax.swing.JLabel LblMax;
    private javax.swing.JLabel LblMin;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
