
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class ReportFrame extends javax.swing.JFrame {

    public ReportFrame() {
        initComponents();
        SelectorDependencia.setVisible(false);
        TextDependencia.setVisible(false);
        LabelCambiable.setVisible(false);
        CuadroTexto2.setVisible(false);
        BotonConfirmar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selector = new javax.swing.JComboBox<>();
        TextTipoTramite = new javax.swing.JLabel();
        SelectorDependencia = new javax.swing.JComboBox<>();
        TextDependencia = new javax.swing.JLabel();
        LabelCambiable = new javax.swing.JLabel();
        BotonConfirmar = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CuadroTexto2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        CURP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Denuncia", "Queja", "Reclamacion", "Sugerencia" }));
        Selector.setSelectedIndex(-1);
        Selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorActionPerformed(evt);
            }
        });

        TextTipoTramite.setText("Tipo de Tramite");

        SelectorDependencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CFE", "JMAS", "Transito", "Municipio", "Otro" }));
        SelectorDependencia.setSelectedIndex(-1);
        SelectorDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorDependenciaActionPerformed(evt);
            }
        });

        TextDependencia.setText("Dependencia");

        BotonConfirmar.setText("Texto");
        BotonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmarActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        CuadroTexto2.setColumns(20);
        CuadroTexto2.setRows(5);
        CuadroTexto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CuadroTexto2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(CuadroTexto2);

        jLabel1.setText("Ingrese su CURP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextDependencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(LabelCambiable, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                .addComponent(Selector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SelectorDependencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextTipoTramite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addComponent(jLabel1)
                            .addComponent(CURP, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(CURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextTipoTramite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextDependencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectorDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelCambiable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonConfirmar)
                    .addComponent(CancelButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorActionPerformed
        SelectorDependencia.setVisible(true);
        TextDependencia.setVisible(true);
        LabelCambiable.setText("Motivo de la " + Selector.getSelectedItem() + " dirigida a " + SelectorDependencia.getSelectedItem());
        BotonConfirmar.setText("Enviar " + Selector.getSelectedItem());
    }//GEN-LAST:event_SelectorActionPerformed

    private void SelectorDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorDependenciaActionPerformed
        LabelCambiable.setText("Motivo de la " + Selector.getSelectedItem() + " dirigida a " + SelectorDependencia.getSelectedItem());
        LabelCambiable.setVisible(true);
        CuadroTexto2.setVisible(true);

        BotonConfirmar.setText("Enviar " + Selector.getSelectedItem());
    }//GEN-LAST:event_SelectorDependenciaActionPerformed

    private void BotonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmarActionPerformed
        // Obtener los datos de los selectores y el área de texto
        String curp = CURP.getText();
        String selectedItem = Selector.getSelectedItem().toString();
        Object selectedDependencia = SelectorDependencia.getSelectedItem();
        String textAreaContent = CuadroTexto2.getText();

        // Crear el nombre del archivo basado en los datos de los selectores
        String fileName = curp + "_" + selectedItem + "_" + selectedDependencia.toString() + ".txt";

        // Obtener la ruta completa del directorio
        String directorio = "C:\\FFB2Engine\\";
        String rutaCompleta = directorio + fileName;

        // Verificar si el directorio existe, si no, crearlo
        try {
            Path path = Paths.get(directorio);
            if (Files.notExists(path)) {
                Files.createDirectories(path);
            }

            // Crear el archivo y escribir los datos
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaCompleta))) {
                writer.write("CURP: " + curp + "\n");
                writer.write("Datos del Selector: " + selectedItem + "\n");
                writer.write("Dependencia seleccionada: " + selectedDependencia.toString() + "\n");
                writer.write("Contenido del área de texto:\n" + textAreaContent);
            } catch (IOException e) {
                e.printStackTrace();
                // Manejar la excepción según sea necesario
            }

            System.out.println("Archivo guardado con éxito en: " + rutaCompleta);
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar la excepción según sea necesario
        }
        this.dispose();
    }//GEN-LAST:event_BotonConfirmarActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea cancelar la operación?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void CuadroTexto2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuadroTexto2KeyReleased
        String textoEnCuadro = CuadroTexto2.getText().trim();

        if (textoEnCuadro.length() >= 10) {
            BotonConfirmar.setVisible(true);
        } else {
            BotonConfirmar.setVisible(false);
        }
    }//GEN-LAST:event_CuadroTexto2KeyReleased

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConfirmar;
    private javax.swing.JTextField CURP;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextArea CuadroTexto2;
    private javax.swing.JLabel LabelCambiable;
    private javax.swing.JComboBox<String> Selector;
    private javax.swing.JComboBox<String> SelectorDependencia;
    private javax.swing.JLabel TextDependencia;
    private javax.swing.JLabel TextTipoTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
