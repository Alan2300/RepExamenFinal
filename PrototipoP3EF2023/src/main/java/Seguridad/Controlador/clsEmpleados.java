/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Controlador;
import java.util.List;
import Seguridad.Modelo.daoEmpleados;
/**
 *
 * @author visitante
 */

public class clsEmpleados {
    private int idEmpleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private int TelefonoEmpleado;
    private int DpiEmpleado;
    private String DireccionEmpleado;
    private String FechaNacEmpleado;
    private int idUsuario;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    public int getTelefonoEmpleado() {
        return TelefonoEmpleado;
    }

    public void setTelefonoEmpleado(int TelefonoEmpleado) {
        this.TelefonoEmpleado = TelefonoEmpleado;
    }

    public int getDpiEmpleado() {
        return DpiEmpleado;
    }

    public void setDpiEmpleado(int DpiEmpleado) {
        this.DpiEmpleado = DpiEmpleado;
    }

    public String getDireccionEmpleado() {
        return DireccionEmpleado;
    }

    public void setDireccionEmpleado(String DireccionEmpleado) {
        this.DireccionEmpleado = DireccionEmpleado;
    }

    public String getFechaNacEmpleado() {
        return FechaNacEmpleado;
    }

    public void setFechaNacEmpleado(String FechaNacEmpleado) {
        this.FechaNacEmpleado = FechaNacEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado, String ApellidoEmpleado, int TelefonoEmpleado, int DpiEmpleado, String DireccionEmpleado, String FechaNacEmpleado, int idUsuario) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.TelefonoEmpleado = TelefonoEmpleado;
        this.DpiEmpleado = DpiEmpleado;
        this.DireccionEmpleado = DireccionEmpleado;
        this.FechaNacEmpleado = FechaNacEmpleado;
        this.idUsuario = idUsuario;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado, String ApellidoEmpleado, int TelefonoEmpleado, int DpiEmpleado, String DireccionEmpleado, String FechaNacEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.TelefonoEmpleado = TelefonoEmpleado;
        this.DpiEmpleado = DpiEmpleado;
        this.DireccionEmpleado = DireccionEmpleado;
        this.FechaNacEmpleado = FechaNacEmpleado;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado, String ApellidoEmpleado, int TelefonoEmpleado, int DpiEmpleado, String DireccionEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.TelefonoEmpleado = TelefonoEmpleado;
        this.DpiEmpleado = DpiEmpleado;
        this.DireccionEmpleado = DireccionEmpleado;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado, String ApellidoEmpleado, int TelefonoEmpleado, int DpiEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.TelefonoEmpleado = TelefonoEmpleado;
        this.DpiEmpleado = DpiEmpleado;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado, String ApellidoEmpleado, int TelefonoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.TelefonoEmpleado = TelefonoEmpleado;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado, String ApellidoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoEmpleado = ApellidoEmpleado;
    }

    public clsEmpleados(int idEmpleado, String NombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
    }

    public clsEmpleados(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public clsEmpleados() {
    }
    
    
    //Metodos de acceso a la capa controlador
    public clsEmpleados getBuscarInformacionAplicacionPorNombre(clsEmpleados empleado)
    {
        daoEmpleados daoEmpleados = new daoEmpleados();
        return daoEmpleados.consultaAplicacionPorNombre(empleado);
    }
    public clsEmpleados getBuscarInformacionAplicacionPorId(clsEmpleados empleado)
    {
        daoEmpleados daoEmpleados = new daoEmpleados();
        return daoEmpleados.consultaAplicacionPorId(empleado);
    }    
    public List<clsEmpleados> getListadoAplicaciones()
    {
        daoEmpleados daoEmpleados = new daoEmpleados();
        List<clsEmpleados> listadoUsuarios = daoEmpleados.consultaAplicacion();
        return listadoUsuarios;
    }
    public int setBorrarAplicacion(clsEmpleados empleado)
    {
        daoEmpleados daoEmpleados = new daoEmpleados();
        return daoEmpleados.borrarAplicacion(empleado);
    }          
    public int setIngresarAplicacion(clsEmpleados empleado)
    {
        daoEmpleados daoEmpleados = new daoEmpleados();
        return daoEmpleados.ingresaAplicacion(empleado);
    }              
    public int setModificarAplicacion(clsEmpleados empleado)
    {
        daoEmpleados daoEmpleados = new daoEmpleados();
        return daoEmpleados.actualizaAplicacion(empleado);
    }              
}
