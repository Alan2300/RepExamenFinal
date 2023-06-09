/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Modelo;

import Seguridad.Controlador.clsEmpleados;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoEmpleados {

    private static final String SQL_SELECT = "SELECT empid, empnombre, empapellido, emptelefono, empdpi, empdireccion, empfechanacimiento, usuid FROM tbl_empleados";
    private static final String SQL_INSERT = "INSERT INTO tbl_empleados(empnombre, empapellido, emptelefono, empdpi, empdireccion, empfechanacimiento, usuid) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_empleados SET empnombre=?, empapellido=?, emptelefono=?, empdpi=?, empdireccion=?, empfechanacimiento=?, usuid=? WHERE empid = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_empleados WHERE empid=?";
    private static final String SQL_SELECT_NOMBRE = "SELECT empid, empnombre, empapellido, emptelefono, empdpi, empdireccion, empfechanacimiento, usuid FROM tbl_empleados WHERE empnombre = ?";
    private static final String SQL_SELECT_ID = "SELECT empid, empnombre, empapellido, emptelefono, empdpi, empdireccion, empfechanacimiento, usuid FROM tbl_empleados WHERE empid = ?";    

    public List<clsEmpleados> consultaAplicacion() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<clsEmpleados> empleados = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("empid");
                String nombre = rs.getString("empnombre");
                String apellido = rs.getString("empapellido");
                int telefono = rs.getInt("emptelefono");
                int dpi = rs.getInt("empdpi");
                String direccion = rs.getString("empdireccion");
                String Fechana = rs.getString("empfechanacimiento");
                int idusu = rs.getInt("usuid");
                clsEmpleados empleado = new clsEmpleados();
                empleado.setIdEmpleado(id);
                empleado.setNombreEmpleado(nombre);
                empleado.setApellidoEmpleado(apellido);
                empleado.setTelefonoEmpleado(telefono);
                empleado.setDpiEmpleado(dpi);
                empleado.setDireccionEmpleado(direccion);
                empleado.setFechaNacEmpleado(Fechana);
                empleado.setIdUsuario(idusu);
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return empleados;
    }

    public int ingresaAplicacion(clsEmpleados empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, empleado.getNombreEmpleado());
            stmt.setString(2, empleado.getApellidoEmpleado());
            stmt.setInt(3, empleado.getTelefonoEmpleado());
            stmt.setInt(4, empleado.getDpiEmpleado());
            stmt.setString(5, empleado.getDireccionEmpleado());
            stmt.setString(6, empleado.getFechaNacEmpleado());
            stmt.setInt(7, empleado.getIdUsuario());
            

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int actualizaAplicacion(clsEmpleados empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getNombreEmpleado());
            stmt.setString(2, empleado.getApellidoEmpleado());
            stmt.setInt(3, empleado.getTelefonoEmpleado());
            stmt.setInt(4, empleado.getDpiEmpleado());
            stmt.setString(5, empleado.getDireccionEmpleado());
            stmt.setString(6, empleado.getFechaNacEmpleado());
            stmt.setInt(7, empleado.getIdUsuario());
            stmt.setInt(8, empleado.getIdEmpleado());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public int borrarAplicacion(clsEmpleados empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, empleado.getIdEmpleado());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    public clsEmpleados consultaAplicacionPorNombre(clsEmpleados empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + empleado);
            stmt = conn.prepareStatement(SQL_SELECT_NOMBRE);
            //stmt.setInt(1, aplicacion.getIdAplicacion());            
            stmt.setString(1, empleado.getNombreEmpleado());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("empid");
                String nombre = rs.getString("empnombre");
                String apellido = rs.getString("empapellido");
                int telefono = rs.getInt("emptelefono");
                int dpi = rs.getInt("empdpi");
                String direccion = rs.getString("empdireccion");
                String Fechana = rs.getString("empfechanacimiento");
                int idusu = rs.getInt("usuid");

                //aplicacion = new clsAplicacion();
                empleado.setIdEmpleado(id);
                empleado.setNombreEmpleado(nombre);
                empleado.setApellidoEmpleado(apellido);
                empleado.setTelefonoEmpleado(telefono);
                empleado.setDpiEmpleado(dpi);
                empleado.setDireccionEmpleado(direccion);
                empleado.setFechaNacEmpleado(Fechana);
                empleado.setIdUsuario(idusu);
                System.out.println(" registro consultado: " + empleado);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return empleado;
    }
    public clsEmpleados consultaAplicacionPorId(clsEmpleados empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_SELECT_NOMBRE + " objeto recibido: " + empleado);
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, empleado.getIdEmpleado());            
            //stmt.setString(1, aplicacion.getNombreAplicacion());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("empid");
                String nombre = rs.getString("empnombre");
                String apellido = rs.getString("empapellido");
                int telefono = rs.getInt("emptelefono");
                int dpi = rs.getInt("empdpi");
                String direccion = rs.getString("empdireccion");
                String Fechana = rs.getString("empfechanacimiento");
                int idusu = rs.getInt("usuid");

                //aplicacion = new clsAplicacion();
                empleado.setIdEmpleado(id);
                empleado.setNombreEmpleado(nombre);
                empleado.setApellidoEmpleado(apellido);
                empleado.setTelefonoEmpleado(telefono);
                empleado.setDpiEmpleado(dpi);
                empleado.setDireccionEmpleado(direccion);
                empleado.setFechaNacEmpleado(Fechana);
                empleado.setIdUsuario(idusu);
                System.out.println(" registro consultado: " + empleado);                
            }
            //System.out.println("Registros buscado:" + persona);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //return personas;  // Si se utiliza un ArrayList
        return empleado;
    }    
}
