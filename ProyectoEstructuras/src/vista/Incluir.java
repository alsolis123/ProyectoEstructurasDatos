/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Main;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author alsolis
 */
public class Incluir extends javax.swing.JFrame {

    /**
     * Creates new form Incluir
     */
    public Incluir() {
        initComponents();
        setResizable(false);
        setBounds(800, 300, 473, 537);
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
        btn_atras = new javax.swing.JButton();
        fld_modelo = new javax.swing.JTextField();
        fld_sobrecargos = new javax.swing.JTextField();
        fld_pasajeros = new javax.swing.JTextField();
        fld_piloto = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        cbox_area = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 50, 40));

        fld_modelo.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        fld_modelo.setBorder(null);
        fld_modelo.setOpaque(false);
        jPanel1.add(fld_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 139, -1));

        fld_sobrecargos.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        fld_sobrecargos.setBorder(null);
        fld_sobrecargos.setOpaque(false);
        jPanel1.add(fld_sobrecargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 139, -1));

        fld_pasajeros.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        fld_pasajeros.setBorder(null);
        fld_pasajeros.setOpaque(false);
        jPanel1.add(fld_pasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 139, -1));

        fld_piloto.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        fld_piloto.setBorder(null);
        fld_piloto.setOpaque(false);
        fld_piloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_pilotoActionPerformed(evt);
            }
        });
        jPanel1.add(fld_piloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 139, -1));

        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_Agregar2.png"))); // NOI18N
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 120, 40));

        cbox_area.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cbox_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aleatorio", "Aviones en Vuelo", "Aviones en Hangar", "Pista de Despegue", "Pista de Aterrizaje" }));
        cbox_area.setBorder(null);
        jPanel1.add(cbox_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 180, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarAvion.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fld_pilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_pilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_pilotoActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        Main.ocultar_Incluir();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        Main.incluirAvion();
    }//GEN-LAST:event_btn_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Incluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Incluir().setVisible(true);
            }
        });
    }

    public String getCbox_area() {
        String area = (String) cbox_area.getSelectedItem();
        return area;
    }

    public void setCbox_area(String area) {
        this.cbox_area.setSelectedItem(area);
    }

    public String getFld_modelo() {
        return fld_modelo.getText();
    }

    public void setFld_modelo(String modelo) {
        this.fld_modelo.setText(modelo);
    }

    public String getFld_pasajeros() {
        return fld_pasajeros.getText();
    }

    public void setFld_pasajeros(String pasajeros) {
        this.fld_pasajeros.setText(pasajeros);
    }

    public String getFld_piloto() {
        return fld_piloto.getText();
    }

    public void setFld_piloto(String piloto) {
        this.fld_piloto.setText(piloto);
    }

    public String getFld_sobrecargos() {
        return fld_sobrecargos.getText();
    }

    public void setFld_sobrecargos(String sobrecargos) {
        this.fld_sobrecargos.setText(sobrecargos);
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JComboBox<String> cbox_area;
    private javax.swing.JTextField fld_modelo;
    private javax.swing.JTextField fld_pasajeros;
    private javax.swing.JTextField fld_piloto;
    private javax.swing.JTextField fld_sobrecargos;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
