/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Main;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alsolis
 */
public class Despegue extends javax.swing.JFrame {

    /**
     * Creates new form Despegue
     */
    public Despegue() {
        initComponents();
        this.setLocationRelativeTo(null);
        btn_atras.setOpaque(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.setBorderPainted(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_despegue = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_vuelo = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_despegue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N Piloto", "Modelo Avion", "Cantidad Pasajeros", "Cantidad Sobrecargos"
            }
        ));
        jScrollPane1.setViewportView(tbl_despegue);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 600, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PistaDespegue.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 570, 70));

        btn_vuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_despegar_lista.png"))); // NOI18N
        btn_vuelo.setBorder(null);
        btn_vuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vueloActionPerformed(evt);
            }
        });
        jPanel1.add(btn_vuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 200, -1));

        btn_atras.setBorder(null);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 640, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        Main.ocultar_Despegue();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_vueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vueloActionPerformed
        Main.logicaDespegue();
    }//GEN-LAST:event_btn_vueloActionPerformed

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
            java.util.logging.Logger.getLogger(Despegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Despegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Despegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Despegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Despegue().setVisible(true);
            }
        });
    }
    public DefaultTableModel getTbl_despegue() {
        DefaultTableModel modelo = (DefaultTableModel)tbl_despegue.getModel();
        return modelo;
    }

    public void setTbl_despegue(DefaultTableModel modelo) {
        this.tbl_despegue.setModel(modelo);
    }
    
    public JTable getTable(){
        return this.tbl_despegue;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_vuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_despegue;
    // End of variables declaration//GEN-END:variables
}
