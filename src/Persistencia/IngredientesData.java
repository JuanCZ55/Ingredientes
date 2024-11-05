/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Ingredientes;
import java.sql.*;
import org.mariadb.jdbc.Connection;
import Modelo.Conexion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juanz
 */
public class IngredientesData {

    private Connection con = null;

    public IngredientesData() {
        con = (Connection) Conexion.getConexion();
    }

    public ArrayList<Ingredientes> listarIngredientes() {
        ArrayList<Ingredientes> lista = new ArrayList<>();
        String sql = "SELECT IdIngredientes, Nombre, CaloriasPor100, NoApto, Estado FROM ingredientes WHERE Estado=1";
        Ingredientes ingredientes = null;
        int x = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ingredientes = new Ingredientes();
                ingredientes.setIdIngredientes(rs.getInt("IdIngredientes"));
                ingredientes.setNombre(rs.getString("Nombre"));
                ingredientes.setCaloriasPor100(rs.getDouble("CaloriasPor100"));
                ingredientes.setNoApto(rs.getString("NoApto"));
                ingredientes.setEstado(rs.getBoolean("Estado"));

                lista.add(ingredientes);
                x++;
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No hay Ingredientes");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ingredientes");
        }
        return lista;
    }

    /**
     * listarAptos(String cond):Devuelve una lista de ingredientes apto para las
     * condiciones cronicas de salud (celiaco,diabetico,hipertenso). -Recibe por
     * parametos las condiciones una o varias juntas separadas por coma luego
     * con un foreach construye la consulta necesaria dependiendo la cantidad de
     * condiciones cronicas. Luego al momento de cargar los datos para dicha
     * consulta se usa otro foreach que carga cada condicion por separado.
     *
     * @param cond - Condiciones de salud en formato de string, separadas por
     * comas.
     * @return ArrayList<Ingredientes> - Lista de ingredientes aptos.
     */
    public ArrayList<Ingredientes> listarAptos(String cond) {
        PacienteData pd = new PacienteData();
        ArrayList<Ingredientes> lista = new ArrayList<>();
        int i = 1;
        int x = 0;
        String sql = "SELECT * FROM ingredientes WHERE Estado = 1 ";
        HashSet<String> condSet = pd.convertirStringSet(cond);
        for (String aux : condSet) {
            sql += "AND NoApto NOT LIKE CONCAT('%', ?, '%')";
        }
        sql += ";";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            for (String aux : condSet) {
                ps.setString(i, aux);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ingredientes in = new Ingredientes();
                in.setIdIngredientes(rs.getInt("IdIngredientes"));
                in.setNombre(rs.getString("Nombre"));
                in.setCaloriasPor100(rs.getDouble("CaloriasPor100"));
                in.setNoApto(rs.getString("NoApto"));
                in.setEstado(rs.getBoolean("Estado"));
                lista.add(in);
                x++;
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No hay ingredientes aptos para esa condicion");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar los ingredientes aptos");
        }
        return lista;
    }

    //Usar estos 3 metodos con 2 textfield min y max en una metodo propio de la vista para ver cual se usa de los 3 si el campo min tiene algo se usa listaMinCalorias(), si usa el campo max usa listaMaxCalorias() y si tiene ambos campos usa listaMinMaxCalorias()
    public ArrayList<Ingredientes> listaMaxCalorias(double maxCalorias) {
        ArrayList<Ingredientes> lista = new ArrayList<>();
        int x = 1;
        String sql = "SELECT * FROM ingredientes WHERE Estado = 1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double calo = rs.getDouble("CaloriasPor100");
                double peso = rs.getDouble("Peso");
                double caloT = (calo / 100) * peso;
                if (caloT <= maxCalorias) {
                    Ingredientes in = new Ingredientes();
                    in.setIdIngredientes(rs.getInt("IdIngredientes"));
                    in.setNombre(rs.getString("Nombre"));
                    in.setCaloriasPor100(rs.getDouble("CaloriasPor100"));
                    in.setNoApto(rs.getString("NoApto"));
                    in.setEstado(rs.getBoolean("Estado"));
                    lista.add(in);
                    x++;
                }
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No hay ingredientes menores a esa cantidad de calorias");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar maximas calorias");
        }
        return lista;
    }

    public ArrayList<Ingredientes> listaMinCalorias(double minCalorias) {
        ArrayList<Ingredientes> lista = new ArrayList<>();
        int x = 1;
        String sql = "SELECT * FROM ingredientes WHERE Estado = 1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double calo = rs.getDouble("CaloriasPor100");
                double peso = rs.getDouble("Peso");
                double caloT = (calo / 100) * peso;
                if (caloT >= minCalorias) {
                    Ingredientes in = new Ingredientes();
                    in.setIdIngredientes(rs.getInt("IdIngredientes"));
                    in.setNombre(rs.getString("Nombre"));
                    in.setCaloriasPor100(rs.getDouble("CaloriasPor100"));
                    in.setNoApto(rs.getString("NoApto"));
                    in.setEstado(rs.getBoolean("Estado"));
                    lista.add(in);
                    x++;
                }
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No hay ingredientes mayores a esa cantidad de calorias");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar minimas calorias");
        }
        return lista;
    }

    public ArrayList<Ingredientes> listaMinMaxCalorias(double minCalorias, double maxCalorias) {
        ArrayList<Ingredientes> lista = new ArrayList<>();
        int x = 1;
        String sql = "SELECT * FROM ingredientes WHERE Estado = 1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                double calo = rs.getDouble("CaloriasPor100");
                double peso = rs.getDouble("Peso");
                double caloT = (calo / 100) * peso;
                if (caloT >= minCalorias && caloT <= maxCalorias) {
                    Ingredientes in = new Ingredientes();
                    in.setIdIngredientes(rs.getInt("IdIngredientes"));
                    in.setNombre(rs.getString("Nombre"));
                    in.setCaloriasPor100(rs.getDouble("CaloriasPor100"));
                    in.setNoApto(rs.getString("NoApto"));
                    in.setEstado(rs.getBoolean("Estado"));
                    lista.add(in);
                    x++;
                }
            }
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "No hay ingredientes entre ese rango de calorias.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar ingredientes del rango establecido");
        }
        return lista;
    }

    //Se usa en campo textfield con evento KeyTyped
    public ArrayList<Ingredientes> buscarPorNombre(String nom) {
        ArrayList<Ingredientes> lista = new ArrayList<>();
        String sql = "SELECT * FROM ingredientes WHERE Estado = 1 AND Nombre LIKE CONCAT('%', ?, '%');";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ingredientes ingr = new Ingredientes();
                ingr.setIdIngredientes(rs.getInt("IdIngrediente"));
                ingr.setNombre(rs.getString("Nombre"));
                ingr.setCaloriasPor100(rs.getDouble("CaloriasPor100"));
                ingr.setEstado(rs.getBoolean("Estado"));
                ingr.setNoApto(rs.getString("NoApto"));
                lista.add(ingr);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar por nombre");
        }
        return lista;
    }
}
