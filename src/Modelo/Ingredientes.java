package Modelo;



public class Ingredientes {
    private int idIngredientes;
    private String nombre;
    private double caloriasPor100;
    private String noApto;
    private boolean estado;

    public Ingredientes() {
    }

    public Ingredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public Ingredientes(String nombre, double caloriasPor100,  String noApto) {
        this.nombre = nombre;
        this.caloriasPor100 = caloriasPor100;
        this.noApto = noApto;
    }

    public Ingredientes(String nombre, double caloriasPor100, String noApto, boolean estado) {
        this.nombre = nombre;
        this.caloriasPor100 = caloriasPor100;
        this.noApto = noApto;
        this.estado = estado;
    }

    public Ingredientes(int idIngredientes, String nombre, double caloriasPor100,  String noApto, boolean estado) {
        this.idIngredientes = idIngredientes;
        this.nombre = nombre;
        this.caloriasPor100 = caloriasPor100;
        this.noApto = noApto;
        this.estado = estado;
    }

    public int getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCaloriasPor100() {
        return caloriasPor100;
    }

    public void setCaloriasPor100(double caloriasPor100) {
        this.caloriasPor100 = caloriasPor100;
    }

    public String getNoApto() {
        return noApto;
    }

    public void setNoApto(String noApto) {
        this.noApto = noApto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idIngredientes+"-"+nombre+"-"+caloriasPor100+"-"+noApto;
    }
    
    
}
