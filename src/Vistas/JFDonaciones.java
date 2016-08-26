package Vistas;

import BaseDeDatos.Conexion;
import Controlador.Gestora;
import Controlador.Ingeniero;
import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFDonaciones extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();

    DateFormat df = DateFormat.getDateInstance();

    public JFDonaciones() {
        initComponents();
        lblMensaje.setVisible(false);
        gestora.cargarlistaPadecimientos();
        gestora.cargarlistaPais();
        txtBNombre.setEnabled(false);
        txtBApellido.setEnabled(false);
        txtBIdentific.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        cmbBTS.setEnabled(false);
        lbNombreDo.setVisible(false);
        lbApellidoDo.setVisible(false);
        lbIdenDo.setVisible(false);
        lbTPDo.setVisible(false);
        btnConfimarDo.setEnabled(false);
        txtCantidadS.setEnabled(false);
        setLocationRelativeTo(null);
        h1 = new Thread(this);
        h1.start();
        mostrarTabla();
    }

    Controlador.Gestora gestora = new Gestora();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        cmbPadecimientos = new javax.swing.JComboBox();
        cmbEstado = new javax.swing.JComboBox();
        cmbEstadoCivil = new javax.swing.JComboBox();
        cmbSiesDonadoroNO = new javax.swing.JComboBox();
        txtTelefonoDonador = new javax.swing.JFormattedTextField();
        cmbTipoSangre = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        JCalendar = new com.toedter.calendar.JDateChooser();
        txtCorreo = new javax.swing.JTextField();
        txtidentificacion = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbBTS = new javax.swing.JComboBox();
        txtBNombre = new javax.swing.JTextField();
        txtBApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        cmbBuscarPor = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        txtBIdentific = new javax.swing.JFormattedTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtBIdentificDon = new javax.swing.JFormattedTextField();
        btnBuscar1 = new javax.swing.JButton();
        lbNombreDo = new javax.swing.JLabel();
        lbApellidoDo = new javax.swing.JLabel();
        lbIdenDo = new javax.swing.JLabel();
        lbTPDo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        txtCantidadS = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnConfimarDo = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        lblHora = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jPopupMenu3.setComponentPopupMenu(jPopupMenu3);
        jPopupMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setOpaque(false);

        jLabel1.setText("Nombre :");

        jLabel2.setText("Apellido1 :");

        jLabel3.setText("Apellido2 :");

        jLabel6.setText("Pais :");

        jLabel7.setText("Provincia :");

        jLabel8.setText("Fecha de Nacimiento :");

        jLabel9.setText("Identficacion :");

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
        jLabel18.setText("Formulario Donador ");

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

        cmbPadecimientos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Padecimiento" }));
        cmbPadecimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPadecimientosActionPerformed(evt);
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

        try {
            txtidentificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtidentificacion.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(48, 48, 48)
                                .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(70, 70, 70)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMensaje)
                                    .addComponent(txtCorreo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPadecimientos, 0, 160, Short.MAX_VALUE)
                                    .addComponent(cmbTipoSangre, 0, 160, Short.MAX_VALUE)
                                    .addComponent(txtidentificacion)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbSiesDonadoroNO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefonoDonador, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cmbTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbPadecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(cmbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
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
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
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
                            .addComponent(lblMensaje))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Formulario Don", null, jPanel2, "");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel19.setText("Identificacion:");

        jLabel20.setText("TP:");

        cmbBTS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Sangre", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        tbDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbDatos.setDragEnabled(true);
        tbDatos.setFocusable(false);
        tbDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbDatos);

        jLabel21.setText("Buscar Por:");

        cmbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por", "Nombre", "Apellido", "Identificacion", "Tipo de Sangre" }));
        cmbBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarPorActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        try {
            txtBIdentific.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbBuscarPor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBIdentific, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cmbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtBApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(cmbBTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBIdentific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        jTabbedPane5.addTab("Buscar/Editar Donador", jPanel3);

        jLabel22.setText("Identificacion:");

        try {
            txtBIdentificDon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBIdentificDon.setDragEnabled(true);
        txtBIdentificDon.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        lbNombreDo.setText("Nombre ");

        lbApellidoDo.setText("Apellido");

        lbIdenDo.setText("Identificacion");

        lbTPDo.setText("TipoSangre");

        jLabel27.setText("Cantidad de Sangre a Donar: ");

        jLabel28.setText("Recuerde que para donar sangre tiene que ser mayor de edad y contar con un peso superior a los 50 kg");

        btnConfimarDo.setText("Confirmar");
        btnConfimarDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfimarDoActionPerformed(evt);
            }
        });

        jLabel23.setText("ml");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbNombreDo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbApellidoDo)
                    .addComponent(txtBIdentificDon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbIdenDo)
                        .addGap(35, 35, 35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(lbTPDo)
                .addGap(44, 44, 44))
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfimarDo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidadS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addComponent(jLabel28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtBIdentificDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreDo)
                    .addComponent(lbApellidoDo)
                    .addComponent(lbIdenDo)
                    .addComponent(lbTPDo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtCantidadS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(41, 41, 41)
                .addComponent(btnConfimarDo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Donar Sangre", jPanel4);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbClientes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Clientes", jPanel5);

        lblHora.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblHora)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tbDatos.getSelectedRow();
        if (fila >= 0) {
            String Iden = tbDatos.getValueAt(fila, 2).toString();
            try {
                PreparedStatement pps = cn.prepareStatement("Delete from residenciadonador where "
                        + "IDDonador = (Select IDDonador from donadores where Identificacion ='" + Iden + "')");

                pps.executeUpdate();
                PreparedStatement pps1 = cn.prepareStatement("Delete from padecimientosdonadores where "
                        + "IDDonador = (Select IDDonador from donadores where Identificacion ='" + Iden + "')");

                pps1.executeUpdate();
                PreparedStatement pps2 = cn.prepareStatement("Delete  from donadores where "
                        + "Identificacion ='" + Iden + "'");

                pps2.executeUpdate();

                JOptionPane.showMessageDialog(null, "Eliminado con Exito");
                btnEliminar.setEnabled(false);
                btnModificar.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(JFDonaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ArrayList donador = new ArrayList();
        ArrayList donador1 = new ArrayList();
        ArrayList donador2 = new ArrayList();
        Calendar c = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int fila = tbDatos.getSelectedRow();
        if (fila >= 0) {
            String Iden = tbDatos.getValueAt(fila, 2).toString();
            donador = gestora.cargarModificar(Iden);
            donador1 = gestora.cargarModificar1(Iden);
            donador2 = gestora.cargarModificar2(Iden);
            JFModificar modif = new JFModificar();
            modif.setVisible(true);
            JFModificar.txtNombre.setText(donador.get(0).toString());
            JFModificar.txtApellido1.setText(donador.get(1).toString());
            JFModificar.txtApellido2.setText(donador.get(2).toString());
            try {
                c.setTime(sdf.parse(donador.get(3).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(JFDonaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
            JFModificar.JCalendar.setCalendar(c);
            JFModificar.lblIden.setText(Iden);
            JFModificar.cmbTipoSangre.setSelectedItem(donador.get(5).toString());
            JFModificar.cmbEstadoCivil.setSelectedItem(donador.get(6).toString());
            JFModificar.cmbEstado.setSelectedItem(donador.get(7).toString());
            JFModificar.cmbSiesDonadoroNO.setSelectedItem(donador.get(8).toString());
            JFModificar.txtTelefonoDonador.setText(donador.get(9).toString());
            JFModificar.txtCorreo.setText(donador.get(10).toString());
            JFModificar.cmbPadecimientos1.setSelectedItem(donador1.get(0).toString());
            JFModificar.cmbPais.setSelectedItem(donador2.get(0).toString());
            JFModificar.cmbProvincia.setSelectedItem(donador2.get(1).toString());
            JFModificar.cmbCanton.setSelectedItem(donador2.get(2).toString());
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Nombre = txtBNombre.getText();
        String Apellido = txtBApellido.getText();
        String Identificacion = txtBIdentific.getText();
        String TipoSangre = cmbBTS.getSelectedItem().toString();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Tipo de Sangre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        tbDatos.setModel(modelo);
        String sql = "";
        int op = cmbBuscarPor.getSelectedIndex();
        txtBNombre.setText("");
        txtBApellido.setText("");
        txtBIdentific.setText("");
        cmbBTS.setSelectedIndex(0);
        boolean bandera = false;

        switch (op) {
            case 1:
                sql = "Select Nombre, Apellido1, Identificacion, TipoDeSangre, Telefono, Correo "
                        + "from bancosangre.donadores where Nombre = '" + Nombre + "'";
                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                break;
            case 2:
                sql = "Select Nombre, Apellido1, Identificacion, TipoDeSangre,Telefono,Correo from "
                        + "bancosangre.donadores where  Apellido1 = '" + Apellido + "'";
                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                break;
            case 3:
                sql = "Select Nombre, Apellido1, Identificacion, TipoDeSangre,Telefono,Correo from "
                        + "bancosangre.donadores where Identificacion = '" + Identificacion + "'";
                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                break;
            case 4:
                sql = "Select Nombre, Apellido1, Identificacion, TipoDeSangre,Telefono,Correo from "
                        + "bancosangre.donadores where TipoDeSangre = '" + TipoSangre + "'";
                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                break;
            default:
                break;
        }

        String datos[] = new String[6];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
                bandera = true;
            }
            if (bandera == false) {
                JOptionPane.showMessageDialog(null, "No existe donador", "No existe", JOptionPane.INFORMATION_MESSAGE);
                btnEliminar.setEnabled(false);
                btnModificar.setEnabled(false);
            }
            tbDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarPorActionPerformed
        int Opcion = cmbBuscarPor.getSelectedIndex();
        switch (Opcion) {
            case 1:
                txtBNombre.setEnabled(true);
                txtBApellido.setEnabled(false);
                txtBIdentific.setEnabled(false);
                cmbBTS.setEnabled(false);
                break;
            case 2:
                txtBNombre.setEnabled(false);
                txtBApellido.setEnabled(true);
                txtBIdentific.setEnabled(false);
                cmbBTS.setEnabled(false);
                break;
            case 3:
                txtBNombre.setEnabled(false);
                txtBApellido.setEnabled(false);
                txtBIdentific.setEnabled(true);
                cmbBTS.setEnabled(false);
                break;
            case 4:
                txtBNombre.setEnabled(false);
                txtBApellido.setEnabled(false);
                txtBIdentific.setEnabled(false);
                cmbBTS.setEnabled(true);
            default:
                break;
        }
    }//GEN-LAST:event_cmbBuscarPorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nombre = txtNombre.getText();
        String Apellido = txtApellido1.getText();
        String Apellido2 = txtApellido2.getText();
        String identificación = txtidentificacion.getText();
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
        if (identificación.trim().length() == 0) {
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

        if (cmbPadecimientos.getSelectedIndex() == 0) {
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
        if (gestora.Identificacion(identificación) == false) {
            JOptionPane.showMessageDialog(null, "Ya existe cedula", "Error", JOptionPane.ERROR_MESSAGE);
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
            txtidentificacion.setText("");
            txtCorreo.setText("");
            txtTelefonoDonador.setText("");

            try {
                PreparedStatement pps = cn.prepareStatement("INSERT INTO donadores (Nombre,Apellido1,Apellido2,FechaNacimiento,Identificacion,TipoDeSangre,"
                        + "EstadoCivil,Estado,DonadorOrg,Telefono,Correo) "
                        + "VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ?, ? );");
                pps.setString(1, Nombre);
                pps.setString(2, Apellido);
                pps.setString(3, Apellido2);
                pps.setString(4, Cal);
                pps.setString(5, identificación);
                pps.setString(6, cmbTipoSangre.getSelectedItem().toString());
                pps.setString(7, cmbEstadoCivil.getSelectedItem().toString());
                pps.setString(8, cmbEstado.getSelectedItem().toString());
                pps.setString(9, cmbSiesDonadoroNO.getSelectedItem().toString());
                pps.setString(10, Tel);
                pps.setString(11, Correo);
                pps.executeUpdate();
                PreparedStatement pps2 = cn.prepareStatement("insert into residenciadonador (IDPais,IDProvincia,IDCanton,IDDonador)\n"
                        + "Values((Select IDPais from pais where NombrePais = ?),\n"
                        + "(Select IDProvincia from provincia where NombreProvincia = ?),\n"
                        + "(Select IDCanton from canton where NombreCanton = ?),\n"
                        + "(Select IDDonador from donadores where Identificacion = ?));");
                pps2.setString(1, cmbPais.getSelectedItem().toString());
                pps2.setString(2, cmbProvincia.getSelectedItem().toString());
                pps2.setString(3, cmbCanton.getSelectedItem().toString());
                pps2.setString(4, identificación);
                pps2.execute();
                PreparedStatement pps3 = cn.prepareStatement("insert into padecimientosdonadores (IDPadecimiento,IDDonador)\n"
                        + "values ((Select IDPadecimiento from padecimientos where NombrePadecimiento = ?),\n"
                        + "(Select IDDonador from donadores where Identificacion = ?));");
                pps3.setString(1, cmbPadecimientos.getSelectedItem().toString());
                pps3.setString(2, identificación);
                pps3.execute();

                JOptionPane.showMessageDialog(null, "Datos Guardados con Exito");

            } catch (SQLException ex) {
                Logger.getLogger(JFDonaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbPadecimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPadecimientosActionPerformed

    }//GEN-LAST:event_cmbPadecimientosActionPerformed

    private void cmbCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCantonActionPerformed

    }//GEN-LAST:event_cmbCantonActionPerformed

    private void cmbProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaActionPerformed
        cmbCanton.removeAllItems();
        cmbCanton.addItem("Seleccione el Cantón");
        if (bandera == false) {

        } else {
            String Provincia = cmbProvincia.getSelectedItem().toString();
            gestora.cargarlistaCanton(Provincia, cmbPais.getSelectedIndex());
        }
    }//GEN-LAST:event_cmbProvinciaActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        bandera = false;
        cmbProvincia.removeAllItems();
        cmbProvincia.addItem("Seleccione la Provincia");
        cmbCanton.removeAllItems();
        cmbCanton.addItem("Seleccione el Cantón");
        bandera = true;
        gestora.cargarlistaProvincia(cmbPais.getSelectedIndex());
    }//GEN-LAST:event_cmbPaisActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        Ingeniero ing = new Ingeniero();
        String Identificacion = txtBIdentificDon.getText();
        boolean flag = false;
        String ID = "";
        String fecha = "";
        String estado = "";
        String Padecimiento = "";
        String sql = "Select Nombre, Apellido1, Identificacion, TipoDeSangre, FechaNacimiento,Estado, IDDonador from "
                + "bancosangre.donadores where Identificacion = '" + Identificacion + "'";
        ArrayList datos = new ArrayList();
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("Identificacion").equals(Identificacion)) {
                    datos.add(rs.getString(1));
                    datos.add(rs.getString(2));
                    datos.add(rs.getString(3));
                    datos.add(rs.getString(4));
                    datos.add(rs.getString(5));
                    datos.add(rs.getString(6));
                    ID = rs.getString(7);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                lbNombreDo.setVisible(true);
                lbApellidoDo.setVisible(true);
                lbIdenDo.setVisible(true);
                lbTPDo.setVisible(true);
                lbNombreDo.setText(datos.get(0).toString());
                lbApellidoDo.setText(datos.get(1).toString());
                lbIdenDo.setText(datos.get(2).toString());
                lbTPDo.setText(datos.get(3).toString());
                fecha = datos.get(4).toString();
                estado = datos.get(5).toString();
                txtBIdentificDon.setText("");
                if(estado.equalsIgnoreCase("Activo")){
                if (Ingeniero.Edad(fecha)) {
                    sql = "Select NombrePadecimiento from padecimientos where IDPadecimiento  = (Select "
                            + "IDPadecimiento from PadecimientosDonadores where IDDonador = (Select IDDonador from "
                            + "bancosangre.donadores where Identificacion = '" + Identificacion + "'))";
                    st = cn.createStatement();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        Padecimiento = rs.getString(1);
                    }
                    if (Padecimiento.equalsIgnoreCase("Nada")) {
                        if (estado.equalsIgnoreCase("Activo")) {
                            btnConfimarDo.setEnabled(true);
                            txtCantidadS.setEnabled(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Tiene una enfermedad con la cual "
                                    + "no puede donar", "Error", JOptionPane.INFORMATION_MESSAGE);
                            btnConfimarDo.setEnabled(false);
                            txtCantidadS.setEnabled(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tiene una enfermedad con la cual "
                                + "no puede donar", "Error", JOptionPane.INFORMATION_MESSAGE);
                        btnConfimarDo.setEnabled(false);
                        txtCantidadS.setEnabled(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Es menor de edad "
                            + "no puede donar", "Error", JOptionPane.INFORMATION_MESSAGE);
                    btnConfimarDo.setEnabled(false);
                    txtCantidadS.setEnabled(false);
                }
                }else{
                int op = JOptionPane.showConfirmDialog(null, "desea activar su cuenta","Cuenta Inactiva",
                        JOptionPane.YES_NO_OPTION);
                if(op == JOptionPane.YES_OPTION){
                    String sql1 = "UPDATE IGNORE donadores SET\n"
                        + "Estado = 'Activo' where Identificacion  = '"+datos.get(2).toString()+"'";
                    PreparedStatement pps1 = cn.prepareStatement(sql1);
                    pps1.execute();
                    JOptionPane.showMessageDialog(null, "Se ha activado su cuenta","Activada",JOptionPane.INFORMATION_MESSAGE);
                }else{
  
                }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No"
                        + " existe donador", "Error", JOptionPane.INFORMATION_MESSAGE);
                lbNombreDo.setVisible(false);
                lbApellidoDo.setVisible(false);
                lbIdenDo.setVisible(false);
                lbTPDo.setVisible(false);
                btnConfimarDo.setEnabled(false);
                txtCantidadS.setEnabled(false);
                txtBIdentificDon.setText("");

            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnConfimarDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimarDoActionPerformed
        Gestora gestora = new Gestora();
        String Cantidad = txtCantidadS.getText();
        String Iden = lbIdenDo.getText();
        String TipoSangre = lbTPDo.getText();
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String fecha = "";
        if (day <= 9) {
            fecha = "0" + day + "/" + month + "/" + year;
        } else if (month <= 9) {
            fecha = day + "/0" + month + "/" + year;
        } else if (day <= 9 && month <= 9) {
            fecha = "0" + day + "/0" + month + "/" + year;
        } else {
            fecha = day + "/" + month + "/" + year;
        }
        if (Integer.parseInt(Cantidad) <= 4500) {
                try {
                    if (gestora.UltimaDon(Iden)) {
                        int op = JOptionPane.showConfirmDialog(null, "Seguro desea donar sangre","Acepta Donar",
                        JOptionPane.YES_NO_OPTION);
                if(op == JOptionPane.YES_OPTION){
                        PreparedStatement pps = cn.prepareStatement("INSERT INTO donaciones (IDDonador, Fecha, cantidad, TipoSangre) VALUES (("
                                + "Select IDDonador from donadores where Identificacion = ?), ?, ?, ?);");
                        pps.setString(1, Iden);
                        pps.setString(2, fecha);
                        pps.setString(3, Cantidad);
                        pps.setString(4, TipoSangre);
                        pps.execute();
                        JOptionPane.showMessageDialog(null, "Se a completado la donación", "Donación", JOptionPane.DEFAULT_OPTION);
                        limpiardonar();
                }else{
                limpiardonar();
                }
                    } else {
                        JOptionPane.showMessageDialog(null, "Su última donación fue hace 2 "
                                + "meses no puede donar", "Error", JOptionPane.INFORMATION_MESSAGE);
                        limpiardonar();
                    }
                    
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR 404", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede donar más de 4500 ml de sangre");
        }
        txtCantidadS.setText("");
    }//GEN-LAST:event_btnConfimarDoActionPerformed
    boolean bandera = false;

    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lblHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? ""
                    + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? ""
                + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? ""
                + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    private void limpiardonar() {
        lbNombreDo.setVisible(false);
        lbApellidoDo.setVisible(false);
        lbIdenDo.setVisible(false);
        lbTPDo.setVisible(false);
        lbNombreDo.setText("");
        lbApellidoDo.setText("");
        lbIdenDo.setText("");
        lbTPDo.setText("");
        txtCantidadS.setText("");
        btnConfimarDo.setEnabled(false);
        txtCantidadS.setEnabled(false);
    }

    void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Tipo de Sangre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        tbClientes.setModel(modelo);

        String sql = "Select Nombre, Apellido1, Identificacion, TipoDeSangre, FechaNacimiento,Estado, IDDonador from "
                + "bancosangre.donadores";

        String datos[] = new String[6];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            tbClientes.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }

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
            java.util.logging.Logger.getLogger(JFDonaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDonaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDonaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDonaciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDonaciones().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JCalendar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnConfimarDo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cmbBTS;
    private javax.swing.JComboBox cmbBuscarPor;
    public static javax.swing.JComboBox cmbCanton;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbEstadoCivil;
    public static javax.swing.JComboBox cmbPadecimientos;
    public static javax.swing.JComboBox cmbPais;
    public static javax.swing.JComboBox cmbProvincia;
    private javax.swing.JComboBox cmbSiesDonadoroNO;
    private javax.swing.JComboBox cmbTipoSangre;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel lbApellidoDo;
    private javax.swing.JLabel lbIdenDo;
    private javax.swing.JLabel lbNombreDo;
    private javax.swing.JLabel lbTPDo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTable tbClientes;
    public static javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBApellido;
    private javax.swing.JFormattedTextField txtBIdentific;
    private javax.swing.JFormattedTextField txtBIdentificDon;
    private javax.swing.JTextField txtBNombre;
    private javax.swing.JTextField txtCantidadS;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefonoDonador;
    private javax.swing.JFormattedTextField txtidentificacion;
    // End of variables declaration//GEN-END:variables
}
