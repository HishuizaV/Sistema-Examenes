/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Negocio;

/**
 *
 * @author holce
 */
public class clsPreguntas {
 
    private int id;
    private double valor;
    private int idtipoPregunta;

    public int getIdtipoPregunta() {
        return idtipoPregunta;
    }

    public void setIdtipoPregunta(int idtipoPregunta) {
        this.idtipoPregunta = idtipoPregunta;
    }
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
