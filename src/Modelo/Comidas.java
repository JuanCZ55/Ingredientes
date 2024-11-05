package Modelo;

import java.util.ArrayList;

public class Comidas {

    private int idComida;
    private String nombre;
    private String tipoDeComida;
    private double caloriasComida;
    private String noApto;
    private ArrayList<Ingredientes> ingredientes;
    private ArrayList<Double> pesoIngre;
//[idIgredientes]:[peso]-[idIgredientes]:[peso]-[idIgredientes]:[peso]-[idIgredientes]:[peso]-
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
        this.noApto = noApto;
    }

    public Comidas(String nombre, String tipoDeComida, double caloriasComida, String noApto, boolean estado) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.caloriasComida = caloriasComida;
        this.noApto = noApto;
        this.estado = estado;
    }

    public Comidas(int idComida, String nombre, String tipoDeComida, double caloriasComida, String noApto, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.caloriasComida = caloriasComida;
        this.noApto = noApto;
        this.estado = estado;
    }

    public Comidas(String nombre, String tipoDeComida, double caloriasComida, String noApto, ArrayList<Ingredientes> ingredientes, ArrayList<Double> pesoIngre) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.caloriasComida = caloriasComida;
        this.noApto = noApto;
        this.ingredientes = ingredientes;
        this.pesoIngre = pesoIngre;
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
        return noApto;
    }

    public void setNoApto(String noApto) {
        this.noApto = noApto;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<Double> getPesoIngre() {
        return pesoIngre;
    }

    public void setPesoIngre(ArrayList<Double> pesoIngre) {
        this.pesoIngre = pesoIngre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
