package Persistencia;

import Modelo.Comidas;
import Modelo.Conexion;
import Modelo.Ingredientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author juanz
 */
public class ComidasData {

    private Connection con = null;

    public ComidasData() {
        con = (Connection) Conexion.getConexion();
    }

    public void crearComida(Comidas com) {
        String sql = "INSERT INTO comidas(Nombre, TipoDeComida, CaloriasComida, noApto,PesoIngredientes) VALUES (?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, com.getNombre());
            ps.setString(2, com.getTipoDeComida());
            ps.setDouble(3, caloriasComida(com));
            ps.setString(4, noAptoComidas(com));
            ps.setString(5, convertirArrayString(com.getPesoIngre()));

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                com.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida Registrada Existosamente");
            }
            insertarIngredientesComidas(com);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar una comida");
        }
    }

//solo ocupa los id de la comida como los ids de los ingredientes para agregarlo a la tabla ingredientescomidas
    public void insertarIngredientesComidas(Comidas com) {
        String sql = "INSERT INTO ingredientescomidas (IdComidas,IdIngredientes) VALUES (?,?) ;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            for (Ingredientes ingrediente : com.getIngredientes()) {
                ps.setInt(1, com.getIdComida());
                ps.setInt(2, ingrediente.getIdIngredientes());
                ps.executeUpdate();
            }
                JOptionPane.showMessageDialog(null, "Ingredientes agregados a la comida exitosamente.");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar ComidasIngredientes");
        }
    }

    public String noAptoComidas(Comidas com) {
        PacienteData pd = new PacienteData();//uso para convertir el HashSet en un String
        HashSet<String> condiCom = new HashSet<>();
        HashSet<String> condiIng;
        String cond;
        for (Ingredientes ingrediente : com.getIngredientes()) {
            condiIng = pd.convertirStringSet(ingrediente.getNoApto());
            condiCom.addAll(condiIng);
        }
        cond = pd.convertirSetString(condiCom);
        return cond;
    }

    public double caloriasComida(Comidas com) {
        double calorias = 0;
        for (Ingredientes ingrediente : com.getIngredientes()) {
            calorias += ingrediente.getCaloriasPor100();
        }
        return calorias;
    }

    public ArrayList<Double> convertirStringArray(String pesos) {
        ArrayList<Double> lista = new ArrayList<>();
        String[] partes = pesos.split("-");

        for (String parte : partes) {
            String[] div = parte.split(":");
            lista.add(Double.valueOf(div[0]));
            lista.add(Double.valueOf(div[1]));
        }
        return lista;
    }

    public String convertirArrayString(ArrayList<Double> lista) {
        String resultado = "";
        for (int i = 0; i < lista.size(); i += 2) {
            if (i > 0) {
                resultado += "-";
            }
            resultado += lista.get(i) + ":" + lista.get(i + 1);
        }
        return resultado;
    }
}
