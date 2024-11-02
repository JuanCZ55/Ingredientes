package Persistencia;

import Modelo.Comidas;
import Modelo.Conexion;
import Modelo.Ingredientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
//solo ocupa los id de la comida como los ids de los ingredientes para agregarlo a la tabla ingredientescomidas
    public void insertarIngredientesComidas(Comidas com) {
        String sql = "INSERT INTO ingredientescomidas (IdComidas,IdIngredientes) VALUES (?,?) ;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            for (Ingredientes ingrediente : com.getIngredientes()) {
                ps.setInt(1, com.getIdComida());
                ps.setInt(2, ingrediente.getIdIngredientes());
                ps.executeUpdate();
            }
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Ingredientes agregados a la comida exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar ComidasIngredientes");
        }
    }

}
