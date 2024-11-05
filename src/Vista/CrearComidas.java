package Vista;

import Modelo.Comidas;
import Modelo.Ingredientes;
import Persistencia.ComidasData;
import Persistencia.IngredientesData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanz
 */
public class CrearComidas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private Ingredientes[] arrIngre = new Ingredientes[5];
    private IngredientesData id = new IngredientesData();
    private double[] arrCalorias = new double[5];
    private ComidasData cd = new ComidasData();

    public CrearComidas() {
        initComponents();
        cargarVacio();

        cargarIngredientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFNombre = new javax.swing.JTextField();
        JCBTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JCBIng1 = new javax.swing.JComboBox<>();
        JCBIng3 = new javax.swing.JComboBox<>();
        JCBIng2 = new javax.swing.JComboBox<>();
        JCBIng5 = new javax.swing.JComboBox<>();
        JCBIng4 = new javax.swing.JComboBox<>();
        JTF1 = new javax.swing.JTextField();
        JTF2 = new javax.swing.JTextField();
        JTF3 = new javax.swing.JTextField();
        JTF5 = new javax.swing.JTextField();
        JTF4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBAlta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        JBBaja = new javax.swing.JButton();
        JBNuevo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Comidas");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Tipo de Comida: ");

        JCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno", "Colacion", "Almuerzo", "Merienda", "Cena" }));
        JCBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingridiente 1:");

        jLabel7.setText("Ingridiente 3:");

        jLabel10.setText("Ingridiente 2:");

        jLabel11.setText("Ingridiente 4:");

        jLabel12.setText("Ingridiente 5:");

        JCBIng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBIng1ActionPerformed(evt);
            }
        });

        JCBIng3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBIng3ActionPerformed(evt);
            }
        });

        JCBIng2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBIng2ActionPerformed(evt);
            }
        });

        JCBIng5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBIng5ActionPerformed(evt);
            }
        });

        JCBIng4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBIng4ActionPerformed(evt);
            }
        });

        JTF1.setEnabled(false);

        JTF2.setEnabled(false);

        JTF3.setEnabled(false);

        JTF5.setEnabled(false);

        JTF4.setEnabled(false);

        jLabel5.setText("Pesos en gramos");

        JBAlta.setText("Alta");
        JBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAltaActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JBModificar.setText("Modificar");
        JBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModificarActionPerformed(evt);
            }
        });

        JBBaja.setText("Baja");
        JBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBajaActionPerformed(evt);
            }
        });

        JBNuevo.setText("Nuevo");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCBIng3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCBIng4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCBIng5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JCBIng2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JCBIng1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(77, 77, 77)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(JTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTF4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JBNuevo)
                                        .addGap(48, 48, 48)
                                        .addComponent(JBModificar)
                                        .addGap(50, 50, 50)
                                        .addComponent(JBAlta)
                                        .addGap(95, 95, 95)
                                        .addComponent(JBBaja)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCBIng1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JCBIng2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JCBIng3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JCBIng4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JCBIng5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNuevo)
                    .addComponent(JBModificar)
                    .addComponent(JBAlta)
                    .addComponent(JBBaja))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBTipoActionPerformed

    private void JBAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBAltaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBModificarActionPerformed

    private void JBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBBajaActionPerformed

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        try {
            String nom = JTFNombre.getText();
            String tipo = (String) JCBTipo.getSelectedItem();
            ArrayList<Ingredientes> arraylistIngre = new ArrayList<>();
            ArrayList<Double> lista = new ArrayList<>();
            double caltotales = caloriasTotales();
            int i = 0;
            for (Ingredientes in : arrIngre) {
                if (in != null) {
                    arraylistIngre.add(in);
                    int idIngrediente = in.getIdIngredientes();
                    lista.add((double) idIngrediente);
                    lista.add(arrCalorias[i]);
                }
                i++;
            }

            if (nom == null || nom.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un nombre");
            }
            Comidas com = new Comidas(nom, tipo, caltotales, null, arraylistIngre, lista);
            if (caltotales > 0) {
                cd.crearComida(com);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Complete los Campos");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Caracteres Invalidos");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Error en el constructor");

        }
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JCBIng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBIng1ActionPerformed
        habilitarPeso();
    }//GEN-LAST:event_JCBIng1ActionPerformed

    private void JCBIng2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBIng2ActionPerformed
        habilitarPeso();
    }//GEN-LAST:event_JCBIng2ActionPerformed

    private void JCBIng3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBIng3ActionPerformed
        habilitarPeso();
    }//GEN-LAST:event_JCBIng3ActionPerformed

    private void JCBIng4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBIng4ActionPerformed
        habilitarPeso();
    }//GEN-LAST:event_JCBIng4ActionPerformed

    private void JCBIng5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBIng5ActionPerformed
        habilitarPeso();
    }//GEN-LAST:event_JCBIng5ActionPerformed
    private void cargarIngredientes() {
        for (Ingredientes ingre : id.listarIngredientes()) {
            JCBIng1.addItem(ingre);
            JCBIng2.addItem(ingre);
            JCBIng3.addItem(ingre);
            JCBIng4.addItem(ingre);
            JCBIng5.addItem(ingre);
        }
    }

    private void cargarVacio() {
        JCBIng1.addItem(null);
        JCBIng2.addItem(null);
        JCBIng3.addItem(null);
        JCBIng4.addItem(null);
        JCBIng5.addItem(null);
    }

    private void habilitarPeso() {
        Ingredientes ele1 = (Ingredientes) JCBIng1.getSelectedItem();
        if (ele1 != null) {
            JTF1.setEnabled(true);
            arrIngre[0] = ele1;
        } else {
            JTF1.setEnabled(false);
            arrIngre[0] = null;
        }
        Ingredientes ele2 = (Ingredientes) JCBIng2.getSelectedItem();
        if (ele2 != null) {
            JTF2.setEnabled(true);
            arrIngre[1] = ele2;
        } else {

            JTF2.setEnabled(false);
            arrIngre[1] = null;
        }
        Ingredientes ele3 = (Ingredientes) JCBIng3.getSelectedItem();
        if (ele3 != null) {
            JTF3.setEnabled(true);
            arrIngre[2] = ele3;
        } else {

            JTF3.setEnabled(false);
            arrIngre[2] = null;
        }
        Ingredientes ele4 = (Ingredientes) JCBIng4.getSelectedItem();
        if (ele4 != null) {
            JTF4.setEnabled(true);
            arrIngre[3] = ele4;
        } else {

            JTF4.setEnabled(false);
            arrIngre[3] = null;
        }
        Ingredientes ele5 = (Ingredientes) JCBIng5.getSelectedItem();
        if (ele5 != null) {
            JTF5.setEnabled(true);
            arrIngre[4] = ele5;
        } else {

            JTF5.setEnabled(false);
            arrIngre[4] = null;
        }
    }

    public int cuantosIngre() {
        int cantidad = 0;
        for (Ingredientes aux : arrIngre) {
            if (aux != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public double caloriasTotales() {
        double tot = 0;

        try {
            // Inicializa las variables antes de usarlas
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;
            double e = 0;

            // Comprobar que cada JComboBox tenga un ingrediente seleccionado antes de intentar obtener el peso
            if (JCBIng1.getSelectedItem() != null) {
                a = Double.valueOf(JTF1.getText());
                if (a > 0) {
                    arrCalorias[0] = a;
                    tot += a;
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese peso válido y mayor a 0 en el primer ingrediente");
                }
            }

            if (JCBIng2.getSelectedItem() != null) {
                b = Double.valueOf(JTF2.getText());
                if (b > 0) {
                    arrCalorias[1] = b;
                    tot += b;
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese peso válido y mayor a 0 en el segundo ingrediente");
                }
            }

            if (JCBIng3.getSelectedItem() != null) {
                c = Double.valueOf(JTF3.getText());
                if (c > 0) {
                    arrCalorias[2] = c;
                    tot += c;
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese peso válido y mayor a 0 en el tercer ingrediente");
                }
            }

            if (JCBIng4.getSelectedItem() != null) {
                d = Double.valueOf(JTF4.getText());
                if (d > 0) {
                    arrCalorias[3] = d;
                    tot += d;
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese peso válido y mayor a 0 en el cuarto ingrediente");
                }
            }

            if (JCBIng5.getSelectedItem() != null) {
                e = Double.valueOf(JTF5.getText());
                if (e > 0) {
                    arrCalorias[4] = e;
                    tot += e;
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese peso válido y mayor a 0 en el quinto ingrediente");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos para los pesos");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos para los pesos");
        }

        return tot; // Retornar el total
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlta;
    private javax.swing.JButton JBBaja;
    private javax.swing.JButton JBModificar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<Ingredientes> JCBIng1;
    private javax.swing.JComboBox<Ingredientes> JCBIng2;
    private javax.swing.JComboBox<Ingredientes> JCBIng3;
    private javax.swing.JComboBox<Ingredientes> JCBIng4;
    private javax.swing.JComboBox<Ingredientes> JCBIng5;
    private javax.swing.JComboBox<String> JCBTipo;
    private javax.swing.JTextField JTF1;
    private javax.swing.JTextField JTF2;
    private javax.swing.JTextField JTF3;
    private javax.swing.JTextField JTF4;
    private javax.swing.JTextField JTF5;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
