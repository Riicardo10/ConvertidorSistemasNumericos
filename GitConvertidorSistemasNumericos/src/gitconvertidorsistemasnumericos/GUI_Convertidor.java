package gitconvertidorsistemasnumericos;
import javax.swing.JOptionPane;
public class GUI_Convertidor extends javax.swing.JFrame {
    int base1, base2;
    String entrada, salida;
    Hexadecimal proc = new Hexadecimal();
    public GUI_Convertidor() {
        initComponents();
        ajustes();
        txtResultado.setEditable(false);
    }
    private void ajustes(){
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private boolean selecCampos(){
        boolean error = false;
        String errores = "Error en los datos de entrada\nVerificar:\n";
        if(buttonGroup1.isSelected(null)){
            errores += "\t- Seleccion en base inicial.\n";
            error = true;
        }
        if(buttonGroup2.isSelected(null)){
            errores += "\t- Seleccion en base final.\n";
            error = true;
        }
        if(txtNumero.getText().length() == 0){
            errores += "\t- Ingresa numero a convertir.";
            error = true;
        }
        if(error){
            JOptionPane.showMessageDialog(null, errores, "Mensaje de error", JOptionPane.WARNING_MESSAGE);
        }
        return true;
    }
    private void limpiarCampos(){
        GUI_Convertidor f = new GUI_Convertidor();
        f.setVisible(false);
        txtNumero.setText("");
        txtResultado.setText("");
        jRadioButtonBinario1.setSelected(true);
        jRadioButtonBinario2.setSelected(true);
        jRadioButtonOctal1.setSelected(false);
        jRadioButtonOctal2.setSelected(false);
        jRadioButtonDecimal1.setSelected(false);
        jRadioButtonDecimal2.setSelected(false);
        jRadioButtonHexadecimal1.setSelected(false);
        jRadioButtonHexadecimal2.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButtonBinario1 = new javax.swing.JRadioButton();
        jRadioButtonOctal1 = new javax.swing.JRadioButton();
        jRadioButtonDecimal1 = new javax.swing.JRadioButton();
        jRadioButtonHexadecimal1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtNumero = new org.edisoncor.gui.textField.TextFieldRoundImage();
        jRadioButtonBinario2 = new javax.swing.JRadioButton();
        jRadioButtonOctal2 = new javax.swing.JRadioButton();
        jRadioButtonDecimal2 = new javax.swing.JRadioButton();
        jRadioButtonHexadecimal2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtResultado = new org.edisoncor.gui.textField.TextFieldRoundImage();
        bttCancelar = new org.edisoncor.gui.button.ButtonSeven();
        bttConvertir = new org.edisoncor.gui.button.ButtonSeven();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::CONVERTIDOR:::");
        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Introduce datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 0, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("GulimChe", 0, 14)); // NOI18N
        jLabel11.setText("Base inicial:");

        jRadioButtonBinario1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButtonBinario1);
        jRadioButtonBinario1.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonBinario1.setText("Binario");
        jRadioButtonBinario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonBinario1MouseClicked(evt);
            }
        });

        jRadioButtonOctal1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButtonOctal1);
        jRadioButtonOctal1.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonOctal1.setText("Octal");
        jRadioButtonOctal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonOctal1MouseClicked(evt);
            }
        });

        jRadioButtonDecimal1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButtonDecimal1);
        jRadioButtonDecimal1.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonDecimal1.setText("Decimal");
        jRadioButtonDecimal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonDecimal1MouseClicked(evt);
            }
        });

        jRadioButtonHexadecimal1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButtonHexadecimal1);
        jRadioButtonHexadecimal1.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonHexadecimal1.setText("Hexadecimal");
        jRadioButtonHexadecimal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonHexadecimal1MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel13.setText("Numero a convertir:");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jRadioButtonBinario2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(jRadioButtonBinario2);
        jRadioButtonBinario2.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonBinario2.setText("Binario");
        jRadioButtonBinario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonBinario2MouseClicked(evt);
            }
        });

        jRadioButtonOctal2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(jRadioButtonOctal2);
        jRadioButtonOctal2.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonOctal2.setText("Octal");
        jRadioButtonOctal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonOctal2MouseClicked(evt);
            }
        });

        jRadioButtonDecimal2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(jRadioButtonDecimal2);
        jRadioButtonDecimal2.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonDecimal2.setText("Decimal");
        jRadioButtonDecimal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonDecimal2MouseClicked(evt);
            }
        });

        jRadioButtonHexadecimal2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup2.add(jRadioButtonHexadecimal2);
        jRadioButtonHexadecimal2.setFont(new java.awt.Font("SimSun-ExtB", 0, 13)); // NOI18N
        jRadioButtonHexadecimal2.setText("Hexadecimal");
        jRadioButtonHexadecimal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonHexadecimal2MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("GulimChe", 0, 14)); // NOI18N
        jLabel14.setText("Base final:");

        jLabel15.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel15.setText("Resultado:");

        txtResultado.setBackground(new java.awt.Color(204, 204, 204));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        bttCancelar.setBackground(new java.awt.Color(255, 153, 153));
        bttCancelar.setText("Cancelar");
        bttCancelar.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttCancelar.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCancelarActionPerformed(evt);
            }
        });

        bttConvertir.setBackground(new java.awt.Color(153, 255, 51));
        bttConvertir.setText("Convertir");
        bttConvertir.setColorBrillo(new java.awt.Color(102, 0, 204));
        bttConvertir.setColorDeSombra(new java.awt.Color(255, 255, 204));
        bttConvertir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bttConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButtonHexadecimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonDecimal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonOctal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonBinario1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButtonHexadecimal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonDecimal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonOctal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonBinario2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonBinario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonOctal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonDecimal1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonHexadecimal1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonBinario2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOctal2))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonDecimal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonHexadecimal2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private void bttConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttConvertirActionPerformed
        if(selecCampos()){
            entrada = txtNumero.getText();
            if(base1 == 2){
                if(proc.validarBase1(entrada, 2)){
                    if(base2 == 2){
                        txtResultado.setText(entrada);
                    }
                    if(base2 == 8){
                        txtResultado.setText(proc.binario_a_octal(entrada));
                    }
                    if(base2 == 10){
                        txtResultado.setText(proc.binario_a_decimal(entrada));
                    }
                    if(base2 == 16){
                        txtResultado.setText(proc.binario_a_hexadecimal(entrada));
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Verifica entrada.\n\t- Numero no corresponde a la base.", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(base1 == 8){
                if(proc.validarBase1(entrada, 8)){
                    if(base2 == 2){
                        txtResultado.setText(proc.octal_a_binario(entrada));
                    }
                    if(base2 == 8){
                        txtResultado.setText(entrada);
                    }
                    if(base2 == 10){
                        txtResultado.setText(proc.octal_a_decimal(entrada));
                    }
                    if(base2 == 16){
                        txtResultado.setText(proc.octal_a_hexadecimal(entrada));
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Verifica entrada.\n\t- Numero no corresponde a la base.", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(base1 == 10){
                if(proc.validarBase1(entrada, 10)){
                    int base10 = Integer.parseInt(entrada);
                    if(base2 == 2){
                        txtResultado.setText(proc.decimal_a_otro(base10, 2));
                    }
                    if(base2 == 8){
                        txtResultado.setText(proc.decimal_a_otro(base10, 8));
                    }
                    if(base2 == 10){
                        txtResultado.setText(entrada);
                    }
                    if(base2 == 16){
                        txtResultado.setText(proc.decimal_a_otro(base10, 16));
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Verifica entrada.\n\t- Numero no corresponde a la base.", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
                }
            }
            if(base1 == 16){
                if(proc.validarBase1(entrada, 16)){
                    String mayus = "";
                    mayus = entrada.toUpperCase();
                    if(base2 == 2){
                        txtResultado.setText(proc.hexadecimal_a_binario(mayus));
                    }
                    if(base2 == 8){
                        txtResultado.setText(proc.hexadecimal_a_octal(mayus));
                    }
                    if(base2 == 10){
                        txtResultado.setText(proc.hexadecimal_a_decimal(mayus));
                    }
                    if(base2 == 16){
                        txtResultado.setText(mayus);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Verifica entrada.\n\t- Numero no corresponde a la base.", "Mensaje de error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bttConvertirActionPerformed
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed
    private void bttCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bttCancelarActionPerformed
    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed
    private void jRadioButtonBinario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonBinario1MouseClicked
        base1 = 2;
    }//GEN-LAST:event_jRadioButtonBinario1MouseClicked
    private void jRadioButtonOctal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonOctal1MouseClicked
        base1 = 8;
    }//GEN-LAST:event_jRadioButtonOctal1MouseClicked
    private void jRadioButtonDecimal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonDecimal1MouseClicked
        base1 = 10;
    }//GEN-LAST:event_jRadioButtonDecimal1MouseClicked
    private void jRadioButtonHexadecimal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonHexadecimal1MouseClicked
        base1 = 16;
    }//GEN-LAST:event_jRadioButtonHexadecimal1MouseClicked
    private void jRadioButtonBinario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonBinario2MouseClicked
        base2 = 2;
    }//GEN-LAST:event_jRadioButtonBinario2MouseClicked
    private void jRadioButtonOctal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonOctal2MouseClicked
        base2 = 8;
    }//GEN-LAST:event_jRadioButtonOctal2MouseClicked
    private void jRadioButtonDecimal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonDecimal2MouseClicked
        base2 = 10;
    }//GEN-LAST:event_jRadioButtonDecimal2MouseClicked
    private void jRadioButtonHexadecimal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonHexadecimal2MouseClicked
        base2 = 16;
    }//GEN-LAST:event_jRadioButtonHexadecimal2MouseClicked
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(GUI_Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven bttCancelar;
    private org.edisoncor.gui.button.ButtonSeven bttConvertir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBinario1;
    private javax.swing.JRadioButton jRadioButtonBinario2;
    private javax.swing.JRadioButton jRadioButtonDecimal1;
    private javax.swing.JRadioButton jRadioButtonDecimal2;
    private javax.swing.JRadioButton jRadioButtonHexadecimal1;
    private javax.swing.JRadioButton jRadioButtonHexadecimal2;
    private javax.swing.JRadioButton jRadioButtonOctal1;
    private javax.swing.JRadioButton jRadioButtonOctal2;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtNumero;
    private org.edisoncor.gui.textField.TextFieldRoundImage txtResultado;
    // End of variables declaration//GEN-END:variables
}
