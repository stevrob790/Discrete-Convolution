package Vista;

import Modelo.Convolucion;
import Modelo.Funcion;
import Modelo.Graficador;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuConvolucionDiscreta extends javax.swing.JFrame {

    Funcion funcionX;
    Funcion funcionH;
    Convolucion conv;

    public MenuConvolucionDiscreta() {
        initComponents();

        ubicar1.setEnabled(false);
        mostrar1.setEnabled(false);
        ubicar2.setEnabled(false);
        mostrar2.setEnabled(false);
        realizar.setEnabled(false);
        mostrar3.setEnabled(false);

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imgs/nodes.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ubicar1 = new javax.swing.JButton();
        ingresar1 = new javax.swing.JButton();
        mostrar1 = new javax.swing.JButton();
        ingresar2 = new javax.swing.JButton();
        mostrar2 = new javax.swing.JButton();
        realizar = new javax.swing.JButton();
        ubicar2 = new javax.swing.JButton();
        mostrar3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        y = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        salidaH = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        salidaX = new javax.swing.JTextPane();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REALIZAR CONVOLUCION");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ubicar1.setText("UBICAR CERO");
        ubicar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicar1ActionPerformed(evt);
            }
        });
        getContentPane().add(ubicar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        ingresar1.setText("INGRESAR VECTOR");
        ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        mostrar1.setText("MOSTRAR GRAFICA");
        mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        ingresar2.setText("INGRESAR VECTOR");
        ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar2ActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        mostrar2.setText("MOSTRAR GRAFICA");
        mostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        realizar.setText("REALIZAR CONVOLUCION");
        realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarActionPerformed(evt);
            }
        });
        getContentPane().add(realizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        ubicar2.setText("UBICAR CERO");
        ubicar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicar2ActionPerformed(evt);
            }
        });
        getContentPane().add(ubicar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        mostrar3.setText("MOSTRAR GRAFICA y[n]");
        mostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar3ActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        y.setEditable(false);
        jScrollPane3.setViewportView(y);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 220, 70));

        salidaH.setEditable(false);
        salidaH.setText("h[n]");
        jScrollPane2.setViewportView(salidaH);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 230, 60));

        salidaX.setEditable(false);
        salidaX.setText("x[n]");
        jScrollPane1.setViewportView(salidaX);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 220, 60));

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
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int ubicarCero(Funcion a) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(this, "CONTANDO DESDE 1, INDIQUE LA POSICION EXACTA DEL NUEMRO QUE ESTÁ UBICADO EN CERO"));
        return num - 1;
    }

    private void ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar1ActionPerformed
        try{
        int tam = Integer.parseInt(JOptionPane.showInputDialog(this, "DEFINA EL TAMAÑO DEL VECTOR x[n]"));
        int arr[][] = new int[2][tam];

        for (int i = 0; i < tam; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(this, "INGRESE EL NUMERO " + (i + 1) + " DEL VECTOR", "TAMAÑO VECTOR: " + tam, JOptionPane.QUESTION_MESSAGE));
            arr[0][i] = num;
        }

        ubicar1.setEnabled(true);
        funcionX = new Funcion(tam, arr);
        funcionX.setPosCero(0);
        salidaX.setText(funcionX.mostrarFuncion(funcionX));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "INTENTE OTRA VEZ", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ingresar1ActionPerformed

    private void ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar2ActionPerformed
        try{
        int tam = Integer.parseInt(JOptionPane.showInputDialog(this, "DEFINA EL TAMAÑO DEL VECTOR h[n]"));
        int arr[][] = new int[2][tam];

        for (int i = 0; i < tam; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(this, "INGRESE EL NUMERO " + (i + 1) + " DEL VECTOR", "TAMAÑO VECTOR: " + tam, JOptionPane.QUESTION_MESSAGE));
            arr[0][i] = num;
        }

        ubicar2.setEnabled(true);
        funcionH = new Funcion(tam, arr);
        funcionH.setPosCero(0);
        salidaH.setText(funcionH.mostrarFuncion(funcionH));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "INTENTE OTRA VEZ", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ingresar2ActionPerformed

    private void ubicar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicar1ActionPerformed
        try {
            int pos = ubicarCero(funcionX);
            funcionX.setPosCero(pos);
            salidaX.setText(funcionX.mostrarFuncion(funcionX));
            mostrar1.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "INTENTE OTRA VEZ", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ubicar1ActionPerformed

    private void ubicar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicar2ActionPerformed
        try {
            int pos = ubicarCero(funcionH);
            funcionH.setPosCero(pos);
            salidaH.setText(funcionH.mostrarFuncion(funcionH));
            mostrar2.setEnabled(true);
            realizar.setEnabled(true);
            mostrar3.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "INTENTE OTRA VEZ", "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_ubicar2ActionPerformed

    private void realizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarActionPerformed
        conv = new Convolucion(funcionX, funcionH);
        y.setText(conv.getSalidaDelSistema().mostrarFuncion(conv.getSalidaDelSistema()));
    }//GEN-LAST:event_realizarActionPerformed

    private void mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar1ActionPerformed
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel();
        ventana.setSize(600, 600);
        Graficador graf = new Graficador(funcionX, panel, "x[n]", "Entrada");
        ventana.add(panel);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);

    }//GEN-LAST:event_mostrar1ActionPerformed

    private void mostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar2ActionPerformed
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel();
        ventana.setSize(600, 600);
        Graficador graf = new Graficador(funcionH, panel, "h[n]", "Impulso");
        ventana.add(panel);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_mostrar2ActionPerformed

    private void mostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar3ActionPerformed
        JFrame ventana = new JFrame();
        JPanel panel = new JPanel();
        ventana.setSize(600, 600);
        Graficador graf = new Graficador(conv.getSalidaDelSistema(), panel, "y[n]", "Salida del Sistema");
        ventana.add(panel);
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_mostrar3ActionPerformed

    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
     }//GEN-LAST:event_fondoMousePressed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged

    }//GEN-LAST:event_fondoMouseDragged

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
            java.util.logging.Logger.getLogger(Convolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConvolucionDiscreta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar1;
    private javax.swing.JButton ingresar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton mostrar1;
    private javax.swing.JButton mostrar2;
    private javax.swing.JButton mostrar3;
    private javax.swing.JButton realizar;
    private javax.swing.JTextPane salidaH;
    private javax.swing.JTextPane salidaX;
    private javax.swing.JButton ubicar1;
    private javax.swing.JButton ubicar2;
    private javax.swing.JTextPane y;
    // End of variables declaration//GEN-END:variables
}
