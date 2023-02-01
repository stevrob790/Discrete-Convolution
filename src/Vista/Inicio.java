package Vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    int xx, xy;

    public Inicio() {
        initComponents();

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imgs/nodes.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        integrantes = new javax.swing.JButton();
        empezar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 27)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("PROYECTO FINAL TGS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        integrantes.setForeground(new java.awt.Color(255, 255, 255));
        integrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/integrantes - 64px.png"))); // NOI18N
        integrantes.setText("INTEGRANTES");
        integrantes.setBorder(null);
        integrantes.setContentAreaFilled(false);
        integrantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        integrantes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/integrantes - 72px.png"))); // NOI18N
        integrantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        integrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrantesActionPerformed(evt);
            }
        });
        getContentPane().add(integrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 44, 100, 100));

        empezar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/power2.png"))); // NOI18N
        empezar.setBorder(null);
        empezar.setContentAreaFilled(false);
        empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empezarActionPerformed(evt);
            }
        });
        getContentPane().add(empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 300, 10));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/redbox exit.png"))); // NOI18N
        salir.setBorder(null);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/fondo2.gif"))); // NOI18N
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empezarActionPerformed
        new MenuConvolucionDiscreta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empezarActionPerformed

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_fondoMouseDragged

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int confirmado = JOptionPane.showConfirmDialog(this, "DESEA SALIR DEL PROGRAMA?", "AVISO",
                JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if (JOptionPane.OK_OPTION == confirmado) {
            JOptionPane.showMessageDialog(this, "GRACIAS POR UTILIZAR EL PROGRAMA");
            System.exit(0);
        }
    }//GEN-LAST:event_salirActionPerformed

    private void integrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integrantesActionPerformed
        JOptionPane.showMessageDialog(null, "ALEJANDRO MORALES \n STEVEN ROBLEDO", "INTEGRANTES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_integrantesActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empezar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton integrantes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
