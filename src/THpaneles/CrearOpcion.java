
package THpaneles;

import THlogica.grupos;
import java.awt.geom.RoundRectangle2D;

public class CrearOpcion extends javax.swing.JPanel {

    grupos variable;
    public CrearOpcion() {
        initComponents();
       
    }

    public grupos getVariable() {
        return variable;
    }

    public void setVariable(grupos variable) {
        this.variable = variable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        Entrada = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        dias = new javax.swing.JComboBox<>();
        nSalida = new javax.swing.JSpinner();
        nEntrada = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        AM = new javax.swing.JToggleButton();
        PM = new javax.swing.JToggleButton();
        Cancelar = new javax.swing.JLabel();
        Guardar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(176, 235, 176));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO OPCION");
        jPanel1.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        Dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Dia");
        jPanel1.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, -1));

        Entrada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Entrada.setText("Entrada");
        jPanel1.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, -1));

        Salida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Salida.setForeground(new java.awt.Color(255, 255, 255));
        Salida.setText("Salida");
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, -1));

        dias.setBackground(new java.awt.Color(209, 243, 222));
        dias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        dias.setForeground(new java.awt.Color(102, 102, 102));
        dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        jPanel1.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, 20));

        nSalida.setModel(new javax.swing.SpinnerNumberModel(8, 1, 12, 1));
        nSalida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 70, 30));

        nEntrada.setModel(new javax.swing.SpinnerNumberModel(6, 1, 12, 1));
        nEntrada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 70, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 300, 10));

        AM.setBackground(new java.awt.Color(112, 173, 71));
        AM.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        AM.setForeground(new java.awt.Color(255, 255, 255));
        AM.setText("PM");
        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });
        jPanel1.add(AM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 70, -1));

        PM.setBackground(new java.awt.Color(112, 173, 71));
        PM.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        PM.setForeground(new java.awt.Color(255, 255, 255));
        PM.setText("AM");
        PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMActionPerformed(evt);
            }
        });
        jPanel1.add(PM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 70, -1));

        Cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, -1));

        Guardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMActionPerformed

    private void PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PMActionPerformed

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CancelarMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
      
    }//GEN-LAST:event_GuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AM;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Entrada;
    private javax.swing.JLabel Guardar;
    private javax.swing.JToggleButton PM;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel creandog;
    private javax.swing.JComboBox<String> dias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner nEntrada;
    private javax.swing.JSpinner nSalida;
    // End of variables declaration//GEN-END:variables
}
