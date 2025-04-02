/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor;

import java.awt.Color;

/**
 *
 * @author Biehl
 */
public class conversorJframe extends javax.swing.JFrame {

    /**
     * Creates new form conversorJframe
     */
    public conversorJframe() {
        initComponents();
        escolhaBtn.add(btnCel);
        escolhaBtn.add(btnFah);

    }

    public Color cores(double tm) {
        if (tm <= 64.2) {
            return Color.blue;
        } else if (tm >= 66.2 && tm <= 73.4) {
            return Color.green;
        } else if (tm >= 75.2 && tm <= 95) {
            return Color.orange;
        } else {
            return Color.red;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        escolhaBtn = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtValue = new javax.swing.JTextField();
        btnCel = new javax.swing.JRadioButton();
        btnFah = new javax.swing.JRadioButton();
        txtTemperatura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn = new javax.swing.JToggleButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtValue.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtValue.setCaretColor(new java.awt.Color(10, 10, 10));
        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });

        btnCel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnCel.setText("C / F");
        btnCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelActionPerformed(evt);
            }
        });

        btnFah.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnFah.setText("F / C");
        btnFah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahActionPerformed(evt);
            }
        });

        txtTemperatura.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtTemperatura.setText("Resultado");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Temperatura/Temperature");

        btn.setText("Covnersor");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCel)
                    .addComponent(btnFah)
                    .addComponent(txtTemperatura)
                    .addComponent(jLabel1)
                    .addComponent(btn))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemperatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelActionPerformed


    }//GEN-LAST:event_btnCelActionPerformed

    private void btnFahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahActionPerformed


    }//GEN-LAST:event_btnFahActionPerformed

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed


    }//GEN-LAST:event_txtValueActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        if (txtValue.getText().trim().isEmpty()) {
            txtTemperatura.setText("Por favor, insira um valor!");
        }

        double fah = Double.parseDouble(txtValue.getText());

        conversorTemperatura t1 = new conversorTemperatura(fah);

        if (btnCel.isSelected()) {
            double tempCelsius = t1.getTemperaturaCelsius();

            txtTemperatura.setText(String.format("%.2f °F", tempCelsius));

            txtValue.setText(" ");
        } else {
            double tempFah = t1.getTemperaturaFahrenheit();

            String clima = t1.getTipoClima();

            txtTemperatura.setForeground(cores(fah));

            txtTemperatura.setText(String.format("%.2f °C - %s", tempFah, clima));

            txtValue.setText(" ");
        }
    }//GEN-LAST:event_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conversorJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn;
    private javax.swing.JRadioButton btnCel;
    private javax.swing.JRadioButton btnFah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup escolhaBtn;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtTemperatura;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
