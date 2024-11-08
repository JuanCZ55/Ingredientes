/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Paciente;
import Persistencia.PacienteData;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GestionarPaciente extends javax.swing.JInternalFrame {

    private HashSet<String> listaSet = new HashSet<>();

    private boolean flag = false;
    private PacienteData pd = new PacienteData();

    public GestionarPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFEdad = new javax.swing.JTextField();
        jTFAltura = new javax.swing.JTextField();
        jTFBuscado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBBajaLogica = new javax.swing.JButton();
        jBAltaLogica = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCondiciones = new javax.swing.JTextField();
        jCBQuitarCronicas = new javax.swing.JComboBox<>();
        jCBAgregarCronicas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBActualizarActual = new javax.swing.JButton();
        jBABuscado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTFID = new javax.swing.JTextField();

        jPanel1.setToolTipText("");

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Altura");

        jLabel4.setText("Peso Actual");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBBajaLogica.setText("Baja");
        jBBajaLogica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaLogicaActionPerformed(evt);
            }
        });

        jBAltaLogica.setText("Habilitar");
        jBAltaLogica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaLogicaActionPerformed(evt);
            }
        });

        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Condiciones Cronicas");

        jLabel7.setText("Peso Buscado");

        jTFCondiciones.setEditable(false);
        jTFCondiciones.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jCBQuitarCronicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jCBQuitarCronicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuitarCronicasActionPerformed(evt);
            }
        });

        jCBAgregarCronicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diabetes", "Hipertension", "Celiaca" }));
        jCBAgregarCronicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAgregarCronicasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Insertar Paciente");

        jLabel8.setText("Agregar");

        jLabel9.setText("Quitar");

        jBActualizarActual.setText("Actualizar");
        jBActualizarActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActualActionPerformed(evt);
            }
        });

        jBABuscado.setText("Modificar");
        jBABuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBABuscadoActionPerformed(evt);
            }
        });

        jLabel10.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jCBAgregarCronicas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jCBQuitarCronicas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBNuevo)
                        .addGap(20, 20, 20)
                        .addComponent(jBActualizar)
                        .addGap(20, 20, 20)
                        .addComponent(jBBajaLogica)
                        .addGap(20, 20, 20)
                        .addComponent(jBAltaLogica)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel6))
                            .addComponent(jTFCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFActual, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBActualizarActual, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBABuscado, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JBbuscar, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizarActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jBABuscado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBAgregarCronicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBQuitarCronicas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTFCondiciones, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBajaLogica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAltaLogica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Agrega una condicion de salud al campo textfield (para registar lo que se
     * subira)y al JComboBox (para luego poder retirar)
     *
     * @param evt
     */
    private void jCBAgregarCronicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAgregarCronicasActionPerformed

        String enfermedad = (String) jCBAgregarCronicas.getSelectedItem();
        if (enfermedad != null && !listaSet.contains(enfermedad) && !enfermedad.equals("Seleccione")) {
            listaSet.add(enfermedad); // Agregar al HashSet
            jTFCondiciones.setText(String.join(", ", listaSet));
            jCBQuitarCronicas.addItem(enfermedad);
        }
        System.out.println(listaSet);
    }//GEN-LAST:event_jCBAgregarCronicasActionPerformed
    private void jCBQuitarCronicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuitarCronicasActionPerformed
        String enfermedad = (String) jCBQuitarCronicas.getSelectedItem();
        if (enfermedad != null && !enfermedad.equals("Seleccione")) {
            if (listaSet.contains(enfermedad)) {
                listaSet.remove(enfermedad);
                jTFCondiciones.setText(String.join(",", listaSet));
                jCBQuitarCronicas.removeItem(enfermedad);
            }
        }
    }//GEN-LAST:event_jCBQuitarCronicasActionPerformed
//boton "Nuevo"
    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        try {
            if (jTFNombre.getText().isEmpty() || jTFEdad.getText().isEmpty()
                    || jTFAltura.getText().isEmpty() || jTFActual.getText().isEmpty() || jTFBuscado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }
            String nombre = jTFNombre.getText();
            int edad = Integer.parseInt(jTFEdad.getText());
            if (edad <= 0) {
                JOptionPane.showMessageDialog(this, "La edad debe ser un numero mayor a cero.");
                return;
            }
            double altura = Double.parseDouble(jTFAltura.getText());
            String condicionSalud = jTFCondiciones.getText();
            HashSet<String> listaCond = pd.convertirStringSet(condicionSalud);
            double PActual = Double.parseDouble(jTFActual.getText());
            double PBuscado = Double.parseDouble(jTFBuscado.getText());
            double PInicial = Double.parseDouble(jTFActual.getText());
            Paciente pac = new Paciente(nombre, edad, altura, listaCond, PActual, PBuscado, PInicial);
            pd.guardarPaciente(pac);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos numericos no contiene un valor valido.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
        }


    }//GEN-LAST:event_jBNuevoActionPerformed
//boton "Actualizar"
    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        try {
            if (jTFID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese el ID");
                return;
            }
            int id = Integer.parseInt(jTFID.getText());
            String nombre = jTFNombre.getText();
            int edad = Integer.parseInt(jTFEdad.getText());
            if (edad <= 0) {
                JOptionPane.showMessageDialog(this, "La edad debe ser un numero mayor a cero.");

                return;
            }
            double altura = Double.parseDouble(jTFAltura.getText());
            String condicionSalud = jTFCondiciones.getText();
            HashSet<String> listaCond = pd.convertirStringSet(condicionSalud);

            Paciente pac = new Paciente(id, nombre, edad, altura, listaCond);
            pd.actualizarPaciente(pac);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos numericos no contiene un valor valido.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        }


    }//GEN-LAST:event_jBActualizarActionPerformed
//botion "Baja"
    private void jBBajaLogicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaLogicaActionPerformed

        int id = Integer.parseInt(jTFID.getText());
        if (jTFID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete el campo de ID");
            return;
        }
        pd.bajaLogica(id);
    }//GEN-LAST:event_jBBajaLogicaActionPerformed

    private void jBAltaLogicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaLogicaActionPerformed
        int id = Integer.parseInt(jTFID.getText());
        if (jTFID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete el campo de ID");
            return;
        }
        pd.altaLogica(id);
    }//GEN-LAST:event_jBAltaLogicaActionPerformed

    private void jBActualizarActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActualActionPerformed
        int id = Integer.parseInt(jTFID.getText());
        if (jTFID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete el campo de ID");
            return;
        }

        double Pactual = Double.parseDouble(jTFActual.getText());
        if (jTFActual.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete el campo de Peso Actual");
            return;
        }
        pd.actualizarPesoActual(id, Pactual);
    }//GEN-LAST:event_jBActualizarActualActionPerformed

    private void jBABuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBABuscadoActionPerformed
        int id = Integer.parseInt(jTFID.getText());
        if (jTFID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete el campo de ID");
            return;
        }

        double Pbuscado = Double.parseDouble(jTFBuscado.getText());
        if (jTFBuscado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete el campo de Peso Buscado");
            return;
        }
        pd.cambiarPesoBuscado(id, Pbuscado);
    }//GEN-LAST:event_jBABuscadoActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try {
            if (jTFID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }
            int id = Integer.parseInt(jTFID.getText());
            Paciente paci = pd.buscarPaciente(id);
            if (paci != null) {
                jTFNombre.setText(paci.getNombre());
                jTFEdad.setText(String.valueOf(paci.getEdad()));
                jTFAltura.setText(String.valueOf(paci.getAltura()));
                jTFActual.setText(String.valueOf(paci.getPesoActual()));
                jTFBuscado.setText(String.valueOf(paci.getPesoBuscado()));
                //Como pasar de HashSet a String
                //Creo un HashSet
                listaSet = paci.getCondicionSalud();
                //Creo una cadena vacia en donde se guardara lista de las condiciones del paciente
                String condiciones = "";
                //Verfico que no se nula y no este vacia
                if (listaSet != null && !listaSet.isEmpty()) {
                    //Junto cada contenido de listaCond con separacion por comas en condiciones
                    condiciones = String.join(",", listaSet);
                }
                //Seteo el esas condiciones en textfield correspondientes y si esta vacia es por que no tiene ninguna condicion
                jTFCondiciones.setText(condiciones);
                //seteo de jCBQuitarCronicas
                jCBQuitarCronicas.removeAllItems();
                jCBQuitarCronicas.addItem("Seleccione");
                String[] auxs = jTFCondiciones.getText().split(",");
                for (String aux : auxs) {
                    aux = aux.trim();
                    if (!aux.isEmpty()) {
                        jCBQuitarCronicas.addItem(aux);
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos numericos no contiene un valor valido.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        }


    }//GEN-LAST:event_JBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton jBABuscado;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBActualizarActual;
    private javax.swing.JButton jBAltaLogica;
    private javax.swing.JButton jBBajaLogica;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JComboBox<String> jCBAgregarCronicas;
    private javax.swing.JComboBox<String> jCBQuitarCronicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFActual;
    private javax.swing.JTextField jTFAltura;
    private javax.swing.JTextField jTFBuscado;
    private javax.swing.JTextField jTFCondiciones;
    private javax.swing.JTextField jTFEdad;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables

}
