/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Controlador;
import java.util.List;
import Seguridad.Modelo.daoPaciente;
/**
 *
 * @author visitante
 */

public class clsPaciente {
    private int idPaciente;
    private String NombrePaciente;
    private String ApellidoPaciente;
    private String FechaNacimientoPaciente;
    private int GeneroPaciente;
    private String DireccionPaciente;
    private int TelefonoPaciente;
    private int EstadoPaciente;
    private int idReferenciaPaciente;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public String getApellidoPaciente() {
        return ApellidoPaciente;
    }

    public void setApellidoPaciente(String ApellidoPaciente) {
        this.ApellidoPaciente = ApellidoPaciente;
    }

    public String getFechaNacimientoPaciente() {
        return FechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(String FechaNacimientoPaciente) {
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
    }

    public int getGeneroPaciente() {
        return GeneroPaciente;
    }

    public void setGeneroPaciente(int GeneroPaciente) {
        this.GeneroPaciente = GeneroPaciente;
    }

    public String getDireccionPaciente() {
        return DireccionPaciente;
    }

    public void setDireccionPaciente(String DireccionPaciente) {
        this.DireccionPaciente = DireccionPaciente;
    }

    public int getTelefonoPaciente() {
        return TelefonoPaciente;
    }

    public void setTelefonoPaciente(int TelefonoPaciente) {
        this.TelefonoPaciente = TelefonoPaciente;
    }

    public int getEstadoPaciente() {
        return EstadoPaciente;
    }

    public void setEstadoPaciente(int EstadoPaciente) {
        this.EstadoPaciente = EstadoPaciente;
    }

    public int getIdReferenciaPaciente() {
        return idReferenciaPaciente;
    }

    public void setIdReferenciaPaciente(int idReferenciaPaciente) {
        this.idReferenciaPaciente = idReferenciaPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente, String FechaNacimientoPaciente, int GeneroPaciente, String DireccionPaciente, int TelefonoPaciente, int EstadoPaciente, int idReferenciaPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
        this.GeneroPaciente = GeneroPaciente;
        this.DireccionPaciente = DireccionPaciente;
        this.TelefonoPaciente = TelefonoPaciente;
        this.EstadoPaciente = EstadoPaciente;
        this.idReferenciaPaciente = idReferenciaPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente, String FechaNacimientoPaciente, int GeneroPaciente, String DireccionPaciente, int TelefonoPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
        this.GeneroPaciente = GeneroPaciente;
        this.DireccionPaciente = DireccionPaciente;
        this.TelefonoPaciente = TelefonoPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente, String FechaNacimientoPaciente, int GeneroPaciente, String DireccionPaciente, int TelefonoPaciente, int EstadoPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
        this.GeneroPaciente = GeneroPaciente;
        this.DireccionPaciente = DireccionPaciente;
        this.TelefonoPaciente = TelefonoPaciente;
        this.EstadoPaciente = EstadoPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente, String FechaNacimientoPaciente, int GeneroPaciente, String DireccionPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
        this.GeneroPaciente = GeneroPaciente;
        this.DireccionPaciente = DireccionPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente, String FechaNacimientoPaciente, int GeneroPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
        this.GeneroPaciente = GeneroPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente, String FechaNacimientoPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente, String ApellidoPaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
        this.ApellidoPaciente = ApellidoPaciente;
    }

    public clsPaciente(int idPaciente, String NombrePaciente) {
        this.idPaciente = idPaciente;
        this.NombrePaciente = NombrePaciente;
    }

    public clsPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public clsPaciente() {
    }
    

    
    
    //Metodos de acceso a la capa controlador
   /* public clsPaciente getBuscarInformacionAplicacionPorNombre(clsPaciente paciente)
    {
        daoPaciente daoPaciente = new daoPaciente();
        return daoPaciente.consultaAplicacionPorNombre(paciente);
    }
    public clsPaciente getBuscarInformacionAplicacionPorId(clsPaciente paciente)
    {
        daoPaciente daoPaciente = new daoPaciente();
        return daoPaciente.consultaAplicacionPorId(paciente);
    }    
    public List<clsPaciente> getListadoAplicaciones()
    {
        daoPaciente daoPaciente = new daoPaciente();
        List<clsPaciente> listadoUsuarios = daoPaciente.consultaAplicacion();
        return listadoUsuarios;
    }
    public int setBorrarAplicacion(clsPaciente paciente)
    {
        daoPaciente daoPaciente = new daoPaciente();
        return daoPaciente.borrarAplicacion(paciente);
    }          
    public int setIngresarAplicacion(clsPaciente paciente)
    {
        daoPaciente daoPaciente = new daoPaciente();
        return daoPaciente.ingresaAplicacion(paciente);
    }              
    public int setModificarAplicacion(clsPaciente paciente)
    {
        daoPaciente daoPaciente = new daoPaciente();
        return daoPaciente.actualizaAplicacion(paciente);
    }    */          
}
