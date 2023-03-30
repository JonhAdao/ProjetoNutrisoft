/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author A39533
 */
public class TelaGastoCalorico extends javax.swing.JFrame {

    /**
     * Creates new form TelaGastoCalorico
     */
    public TelaGastoCalorico() {
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        boxMulher = new javax.swing.JRadioButton();
        boxHomem = new javax.swing.JRadioButton();
        comBoxAtividade = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBasal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GASTO CALÓRICO");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel2.setText("Peso (kg):");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setText("Altura (cm):");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setText("Idade:");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setText("Nível de atividade:");

        txtPeso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        txtAltura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        txtIdade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(5, 46, 86));
        btnCalcular.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        boxMulher.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        boxMulher.setText("Mulher");
        boxMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMulherActionPerformed(evt);
            }
        });

        boxHomem.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        boxHomem.setText("Homem");
        boxHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHomemActionPerformed(evt);
            }
        });

        comBoxAtividade.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        comBoxAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedentário", "Leve", "Moderado", "Ativo", "Extremamente ativo" }));
        comBoxAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxAtividadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(boxMulher)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAltura)
                                            .addComponent(txtPeso)
                                            .addComponent(txtIdade)
                                            .addComponent(comBoxAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxHomem)
                                        .addGap(56, 56, 56))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMulher)
                    .addComponent(boxHomem))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comBoxAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel6.setText("Gasto Basal:");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel7.setText("Gasto Total:");

        lblBasal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lblBasal.setForeground(new java.awt.Color(13, 110, 45));

        lblTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(13, 110, 45));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBasal, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblBasal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/logo-con-texto-removebg-preview_resized.png"))); // NOI18N

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comBoxAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxAtividadeActionPerformed

    private void boxHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHomemActionPerformed
        // TODO add your handling code here:
        boxMulher.setSelected(false);
        txtPeso.setText("");
        txtAltura.setText("");
        txtIdade.setText("");
        lblBasal.setText("");
        lblTotal.setText("");
    }//GEN-LAST:event_boxHomemActionPerformed

    private void boxMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMulherActionPerformed
        // TODO add your handling code here:
        boxHomem.setSelected(false);
        txtPeso.setText("");
        txtAltura.setText("");
        txtIdade.setText("");
        lblBasal.setText("");
        lblTotal.setText("");
    }//GEN-LAST:event_boxMulherActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:

        if (txtAltura.getText().isEmpty() || txtPeso.getText().isEmpty() || txtIdade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira algum valor para cálculo");
        } else {

            boolean alturaValida = txtAltura.getText().matches("[0-9]{3}");
            boolean pesoValido = txtPeso.getText().matches("[0-9]{2,3}");
            boolean idadeValida = txtIdade.getText().matches("[0-9]{2,3}");

            if (alturaValida == true & pesoValido == true & idadeValida == true) {

                Double peso = Double.parseDouble(txtPeso.getText());
                Double altura = Double.parseDouble(txtAltura.getText());
                Integer idade = Integer.parseInt(txtIdade.getText());
                Double calBasal = 66 + (13.8 * peso) + (5 * altura) - (6.8 * idade);
                Double calBasal2 = 655 + (9.6 * peso) + (1.9 * altura) - (4.7 * idade);
                String escolha = comBoxAtividade.getSelectedItem().toString();

                if (boxHomem.isSelected() & escolha.equals("Sedentário")) {
                    lblBasal.setText(calBasal.toString());
                    Double total = calBasal * 1.2;
                    lblTotal.setText(total.toString());
                } else if (boxHomem.isSelected() & escolha.equals("Leve")) {
                    lblBasal.setText(calBasal.toString());
                    Double total = calBasal * 1.375;
                    lblTotal.setText(total.toString());
                } else if (boxHomem.isSelected() & escolha.equals("Moderado")) {
                    lblBasal.setText(calBasal.toString());
                    Double total = calBasal * 1.55;
                    lblTotal.setText(total.toString());
                } else if (boxHomem.isSelected() & escolha.equals("Ativo")) {
                    lblBasal.setText(calBasal.toString());
                    Double total = calBasal * 1.725;
                    lblTotal.setText(total.toString());
                } else if (boxHomem.isSelected() & escolha.equals("Extremamente ativo")) {
                    lblBasal.setText(calBasal.toString());
                    Double total = calBasal * 1.9;
                    lblTotal.setText(total.toString());
                } else if (boxMulher.isSelected() & escolha.equals("Sedentário")) {
                    lblBasal.setText(calBasal2.toString());
                    Double total = calBasal2 * 1.2;
                    lblTotal.setText(total.toString());
                } else if (boxMulher.isSelected() & escolha.equals("Leve")) {
                    lblBasal.setText(calBasal2.toString());
                    Double total = calBasal2 * 1.375;
                    lblTotal.setText(total.toString());
                } else if (boxMulher.isSelected() & escolha.equals("Moderado")) {
                    lblBasal.setText(calBasal2.toString());
                    Double total = calBasal2 * 1.55;
                    lblTotal.setText(total.toString());
                } else if (boxMulher.isSelected() & escolha.equals("Ativo")) {
                    lblBasal.setText(calBasal2.toString());
                    Double total = calBasal2 * 1.725;
                    lblTotal.setText(total.toString());
                } else if (boxMulher.isSelected() & escolha.equals("Extremamente ativo")) {
                    lblBasal.setText(calBasal2.toString());
                    Double total = calBasal2 * 1.9;
                    lblTotal.setText(total.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o sexo");
                }
            } else if (alturaValida == true & pesoValido == false & idadeValida == true) {
                JOptionPane.showMessageDialog(null, "O Peso tem que ser no formato válido. EX: 65,80,90,100");
            } else if (alturaValida == false & pesoValido == true & idadeValida == true) {
                JOptionPane.showMessageDialog(null, "A Altura tem que ser em um formato válido. EX: 180, 190, 160");
            } else if (alturaValida == false & pesoValido == false & idadeValida == true) {
                JOptionPane.showMessageDialog(null, "Altura e peso inválidos. Use os formatos: 1.80 | 65");
            } else if (alturaValida == true & pesoValido == true & idadeValida == false) {
                JOptionPane.showMessageDialog(null, "Idade inválida");
            } else {
                JOptionPane.showMessageDialog(null, "Os campos foram preenchidos incorretamente, Utilize os formatos válidos");
            }

        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGastoCalorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGastoCalorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boxHomem;
    private javax.swing.JRadioButton boxMulher;
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comBoxAtividade;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBasal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}