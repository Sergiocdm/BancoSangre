package Controlador;

import BaseDeDatos.Conexion;
import Vistas.JFInicio;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Gestora {

    Conexion cc = new Conexion();

    public void cargarlistaPadecimientos() {
        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("select NombrePadecimiento from padecimientos");
            while (rs.next()) {
                rs.getString("NombrePadecimiento");
                Vistas.JFDonaciones.cmbPadecimientos.addItem(rs.getString("NombrePadecimiento"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaPais() {
        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("select NombrePais from pais");
            while (rs.next()) {
                rs.getString("NombrePais");
                Vistas.JFDonaciones.cmbPais.addItem(rs.getString("NombrePais"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaProvincia(int x) {
        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("select NombreProvincia from provincia where IDPais = " + x);

            while (rs.next()) {
                rs.getString("NombreProvincia");
                Vistas.JFDonaciones.cmbProvincia.addItem(rs.getString("NombreProvincia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaCanton(int y, int x) {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("Select NombreCanton from canton where IDPais = " + y + " and IDProvincia = " + x);

            while (rs.next()) {
                rs.getString("NombreCanton");
                Vistas.JFDonaciones.cmbCanton.addItem(rs.getString("NombreCanton"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaPadecimientosD() {
        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("select NombrePadecimiento from padecimientos");
            while (rs.next()) {
                rs.getString("NombrePadecimiento");
                Vistas.JFModificar.cmbPadecimientos1.addItem(rs.getString("NombrePadecimiento"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaPaisD() {
        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("select NombrePais from pais");
            while (rs.next()) {
                rs.getString("NombrePais");
                Vistas.JFModificar.cmbPais.addItem(rs.getString("NombrePais"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaProvinciaD(int x) {
        Connection cn = cc.conexion();
        PreparedStatement pst = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("select NombreProvincia from provincia where IDPais = " + x);

            while (rs.next()) {
                rs.getString("NombreProvincia");
                Vistas.JFModificar.cmbProvincia.addItem(rs.getString("NombreProvincia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarlistaCantonD(int y, int x) {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("Select NombreCanton from canton where IDPais = " + y + " and IDProvincia = " + x);

            while (rs.next()) {
                rs.getString("NombreCanton");
                Vistas.JFModificar.cmbCanton.addItem(rs.getString("NombreCanton"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void CargarModificar() {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;

    }

    public boolean Identificacion(String Iden) {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;
        boolean bandera = true;

        try {
            st = cn.createStatement();
            rs = st.executeQuery("Select Identificacion from donadores");

            while (rs.next()) {
                rs.getString("Identificacion");
                if (rs.getString("Identificacion").equals(Iden)) {
                    bandera = false;
                    break;
                } else {
                    bandera = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bandera;
    }

    public ArrayList cargarModificar(String Iden) {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;

        ArrayList donador = new ArrayList();

        try {
            st = cn.createStatement();
            rs = st.executeQuery("Select * from donadores where Identificacion = '" + Iden + "'");
            while (rs.next()) {
                donador.add(rs.getString(2));
                donador.add(rs.getString(3));
                donador.add(rs.getString(4));
                donador.add(rs.getString(5));
                donador.add(rs.getString(6));
                donador.add(rs.getString(7));
                donador.add(rs.getString(8));
                donador.add(rs.getString(9));
                donador.add(rs.getString(10));
                donador.add(rs.getString(11));
                donador.add(rs.getString(12));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donador;
    }

    public ArrayList cargarModificar1(String Iden) {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;
        ArrayList donador = new ArrayList();

        try {
            st = cn.createStatement();
            rs = st.executeQuery("Select NombrePadecimiento from padecimientos where "
                    + "IDPadecimiento =(Select IDPadecimiento from padecimientosdonadores where "
                    + "IDDonador = (Select IDDonador from donadores where Identificacion ='" + Iden + "'))");
            while (rs.next()) {
                donador.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donador;
    }

    public ArrayList cargarModificar2(String Iden) {
        Connection cn = cc.conexion();
        Statement st = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ArrayList donador = new ArrayList();

        try {
            st = cn.createStatement();
            rs = st.executeQuery("Select NombrePais from pais where IDPais = (Select IDPais from residenciadonador where "
                    + "IDDonador = (Select IDDonador from donadores where Identificacion ='" + Iden + "'))");
            st = null;
            st = cn.createStatement();
            rs2 = st.executeQuery("Select NombreProvincia from provincia where IDProvincia = (Select IDProvincia from residenciadonador where "
                    + "IDDonador = (Select IDDonador from donadores where Identificacion ='" + Iden + "'))");
            st = null;
            st = cn.createStatement();
            rs3 = st.executeQuery("Select NombreCanton from canton where IDCanton = (Select IDCanton from residenciadonador where "
                    + "IDDonador = (Select IDDonador from donadores where Identificacion ='" + Iden + "'))");
            while (rs.next()) {
                donador.add(new String(rs.getString(1)));
            }
            while (rs2.next()) {
                donador.add(new String(rs2.getString(1)));
            }
            while (rs3.next()) {
                donador.add(new String(rs3.getString(1)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JFInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donador;
    }
}
