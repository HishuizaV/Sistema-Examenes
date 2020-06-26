/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Negocio;
import java.io.File;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author holce
 */
public class clsExamen {
   
    private int  codigo;
    private String nombre;
    private String reglas;
    private Time hora;
    private File documentos;
    private Date fecha;
    private boolean estado;
    private int idpreguntas;
    private int idsolucion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public File getDocumentos() {
        return documentos;
    }

    public void setDocumentos(File documentos) {
        this.documentos = documentos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdpreguntas() {
        return idpreguntas;
    }

    public void setIdpreguntas(int idpreguntas) {
        this.idpreguntas = idpreguntas;
    }

    public int getIdsolucion() {
        return idsolucion;
    }

    public void setIdsolucion(int idsolucion) {
        this.idsolucion = idsolucion;
    }
    
    
    
    
    
    
    
}
