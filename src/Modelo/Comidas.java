package Modelo;

import java.util.ArrayList;

public class Comidas {
    private int idComida;
    private String nombre;
    private String tipoDeComida;
    private double caloriasComida;
    private String Apto;
    private ArrayList<Ingredientes> ingredientes;
    private boolean estado;

    public Comidas() {
    }

    public Comidas(int idComida) {
        this.idComida = idComida;
    }

    public Comidas(String nombre, String tipoDeComida, double caloriasComida, String noApto) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.caloriasComida = caloriasComida;
        this.Apto = noApto;
    }

    public Comidas(String nombre, String tipoDeComida, double caloriasComida, String noApto, boolean estado) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.caloriasComida = caloriasComida;
        this.Apto = noApto;
        this.estado = estado;
    }

    public Comidas(int idComida, String nombre, String tipoDeComida, double caloriasComida, String noApto, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.caloriasComida = caloriasComida;
        this.Apto = noApto;
        this.estado = estado;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public double getCaloriasComida() {
        return caloriasComida;
    }

    public void setCaloriasComida(double caloriasComida) {
        this.caloriasComida = caloriasComida;
    }

    public String getNoApto() {
        return Apto;
    }

    public void setNoApto(String noApto) {
        this.Apto = noApto;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
