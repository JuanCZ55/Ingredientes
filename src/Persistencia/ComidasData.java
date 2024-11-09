package Persistencia;

import Modelo.Comidas;
import Modelo.Conexion;
import Modelo.Ingredientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.client.result.ResultSetMetaData;

/**
 *
 * @author juanz
 */
public class ComidasData {

    private Connection con = null;

    public ComidasData() {
        con = (Connection) Conexion.getConexion();
    }

    public boolean crearComida(Comidas com, HashMap<Integer, Double> ingrePesos) {
        String sql = "INSERT INTO comidas(Nombre, TipoDeComida, CaloriasComida, NoApto) VALUES (?,?,?,?);";
        boolean fla = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, com.getNombre());
            ps.setString(2, com.getTipoDeComida());
            ps.setDouble(3, caloriasComidas(ingrePesos));
            ps.setString(4, noAptoComidas(ingrePesos));

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                com.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida Registrada Existosamente");
                fla = true;
            }
            insertarIngredientesComidas(com, ingrePesos);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar una comida");
        }
        return fla;
    }

    public void insertarIngredientesComidas(Comidas com, HashMap<Integer, Double> ingrePesos) {
        String sql = "INSERT INTO ingredientescomidas(IdComidas, IdIngredientes, peso) VALUES  (?,?,?) ;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            for (HashMap.Entry<Integer, Double> ip : ingrePesos.entrySet()) {
                ps.setInt(1, com.getIdComida());
                ps.setInt(2, ip.getKey());
                ps.setDouble(3, ip.getValue());
                ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Ingredientes agregados a la comida exitosamente.");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar ComidasIngredientes");
        }
    }

    public String noAptoComidas(HashMap<Integer, Double> ingrePesos) {
        PacienteData pd = new PacienteData();//uso para convertir el HashSet en un String
        HashSet<String> condiCom = new HashSet<>();
        HashSet<String> condiIng;
        IngredientesData id = new IngredientesData();
        String cond;
        for (HashMap.Entry<Integer, Double> ip : ingrePesos.entrySet()) {
            Ingredientes ingrediente = id.buscarIngredientesID(ip.getKey());

            condiIng = pd.convertirStringSet(ingrediente.getNoApto());
            condiCom.addAll(condiIng);
        }
        cond = pd.convertirSetString(condiCom);
        return cond;
    }

    public double caloriasComidas(HashMap<Integer, Double> ingredientesPesos) {
        double calorias = 0;
        IngredientesData id = new IngredientesData();
        for (HashMap.Entry<Integer, Double> ip : ingredientesPesos.entrySet()) {
            Ingredientes ingrediente = id.buscarIngredientesID(ip.getKey());
            if (ingrediente != null) {
                double aux = ingrediente.getCaloriasPor100() / 100;
                calorias += aux * ip.getValue();
            }
        }
        return calorias;
    }

    public Comidas buscarComidas(int id) {
        Comidas com = new Comidas();
        String sql = "SELECT * FROM comidas WHERE IdComidas=? AND Estado=1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                com.setIdComida(rs.getInt("IdComidas"));
                com.setNombre(rs.getString("Nombre"));
                com.setTipoDeComida(rs.getString("TipoDeComida"));
                com.setCaloriasComida(rs.getDouble("CaloriasComida"));
                com.setNoApto(rs.getString("NoApto"));
                com.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No esta esa comida o esta dada de baja");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Buscar Comidas");
        }
        return com;
    }

    public HashMap<Integer, Double> buscarIngredientesComidas(int idCom) {
        HashMap<Integer, Double> ingredientesPesos = new HashMap<>();
        String sql = "SELECT * FROM ingredientescomidas WHERE IdComidas=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCom);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ingredientesPesos.put(rs.getInt("IdIngredientes"), rs.getDouble("peso"));
            }
            if (ingredientesPesos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun ingrediente para esa comida");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Buscar en IngredientesComidas");
        }
        return ingredientesPesos;
    }

    public boolean modificarComida(Comidas com, HashMap<Integer, Double> ingredientesPesos) {
        String sql = "UPDATE comidas SET Nombre=? ,TipoDeComida=? ,CaloriasComida= ?,NoApto=? WHERE IdComidas=? ;";
        boolean as = true;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, com.getNombre());
            ps.setString(2, com.getTipoDeComida());
            ps.setDouble(3, com.getCaloriasComida());
            ps.setString(4, noAptoComidas(ingredientesPesos));
            ps.setInt(5, com.getIdComida());
            int cont = ps.executeUpdate();
            if (cont > 0) {
                JOptionPane.showMessageDialog(null, "Se modifico en comidas correctamente");
                actualizaringredientescomidas(com.getIdComida(), ingredientesPesos);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la comida o esta dada de baja");
                as = false;
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar en comidas");
            as = false;

        }
        return as;
    }

    public void actualizaringredientescomidas(int idComida, HashMap<Integer, Double> ingredientesPesos) {
        String sql1 = "DELETE FROM ingredientescomidas WHERE IdComidas = ?;";
        String sql2 = "INSERT INTO ingredientescomidas (IdComidas, IdIngredientes, peso) VALUES (?, ?, ?);";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql1);
            ps.setInt(1, idComida);
            ps.executeUpdate();//elimina las tuplas para IdComidas
            ps = con.prepareStatement(sql2);
            for (HashMap.Entry<Integer, Double> ip : ingredientesPesos.entrySet()) {
                int id = ip.getKey();
                double peso = ip.getValue();
                ps.setInt(1, idComida);
                ps.setInt(2, id);
                ps.setDouble(3, peso);
                ps.executeUpdate();//Inserta los nuevos ingredientes
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar en IngredientesComidas");
        }
    }

    public void bajaComidas(int idComida) {
        String sql = "UPDATE comidas set Estado=0 WHERE IdComidas=?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida Deshabilitada");
            } else {
                JOptionPane.showMessageDialog(null, "Comida no encontrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comidas");
        }
    }

    public void altaComidas(int id) {
        String sql = "UPDATE comidas set Estado=1 WHERE IdComidas=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida Habilitada");
            } else {
                JOptionPane.showMessageDialog(null, "Comida no encontrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comidas");
        }
    }
}
