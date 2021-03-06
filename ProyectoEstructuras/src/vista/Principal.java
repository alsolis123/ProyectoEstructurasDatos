/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Main;

/**
 *
 * @author alsolis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setResizable(false);
        setBounds(800, 300, 910, 560);
        this.setLocationRelativeTo(null);
        btn_incluir.setOpaque(false);
        btn_incluir.setContentAreaFilled(false);
        btn_incluir.setBorderPainted(false);
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
        btn_salir = new javax.swing.JButton();
        btn_incluir = new javax.swing.JButton();
        btn_envuelo = new javax.swing.JButton();
        btn_hangar = new javax.swing.JButton();
        btn_despegue = new javax.swing.JButton();
        btn_aterrizaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_salir.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, 40));

        btn_incluir.setBorder(null);
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_incluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 50));

        btn_envuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_vuelo.png"))); // NOI18N
        btn_envuelo.setOpaque(false);
        btn_envuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_envueloActionPerformed(evt);
            }
        });
        jPanel1.add(btn_envuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, 60));

        btn_hangar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_hangar.png"))); // NOI18N
        btn_hangar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_hangar.setOpaque(false);
        btn_hangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hangarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hangar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 210, 60));

        btn_despegue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_despegue.png"))); // NOI18N
        btn_despegue.setOpaque(false);
        btn_despegue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_despegueActionPerformed(evt);
            }
        });
        jPanel1.add(btn_despegue, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 210, 60));

        btn_aterrizaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_aterrizaje.png"))); // NOI18N
        btn_aterrizaje.setOpaque(false);
        btn_aterrizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aterrizajeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aterrizaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 210, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_envueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_envueloActionPerformed
        Main.mostrar_Vuelo();
    }//GEN-LAST:event_btn_envueloActionPerformed

    private void btn_hangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hangarActionPerformed
        Main.mostrar_Hangar();
    }//GEN-LAST:event_btn_hangarActionPerformed

    private void btn_despegueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_despegueActionPerformed
        Main.mostrar_Despegue();
    }//GEN-LAST:event_btn_despegueActionPerformed

    private void btn_aterrizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aterrizajeActionPerformed
        Main.mostrar_Aterrizar();
    }//GEN-LAST:event_btn_aterrizajeActionPerformed

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        Main.mostrar_Incluir();
    }//GEN-LAST:event_btn_incluirActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        /*Salir*/
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aterrizaje;
    private javax.swing.JButton btn_despegue;
    private javax.swing.JButton btn_envuelo;
    private javax.swing.JButton btn_hangar;
    private javax.swing.JButton btn_incluir;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
