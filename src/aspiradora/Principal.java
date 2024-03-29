/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aspiradora;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal extends javax.swing.JFrame {

    int punto;
    
    public Principal() {
        initComponents();
        aspiradora1.setVisible(false);
        aspiradora2.setVisible(false);
        basura1.setVisible(false);
        basura2.setVisible(false);
        barprog.setValue(100);
    }
    public void dorm(){
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void accprin(){
        int aspiAleatorio = (int) (Math.random()*2+1);
        int basuAleatorio = (int) (Math.random()*4+1);
        
        
        //Generar aspiradora
        if(aspiAleatorio == 1){
            aspiradora1.setVisible(true);
            aspiradora2.setVisible(false);
            aspiCuarto.setText("Aspiradora en el cuarto Rojo");
        }
        else{
            aspiradora2.setVisible(true);
            aspiradora1.setVisible(false);
            aspiCuarto.setText("Aspiradora en el cuarto Azul");
        }
        
            //Generar basura
            if(basuAleatorio == 1){
                basura1.setVisible(true);
                basura2.setVisible(false);
                limpio.setText("Cuarto Azul Limpio");
                sucio.setText("Cuarto Rojo Sucio");
                if (aspiAleatorio == 1){
                    dorm();
                    basura1.setVisible(false);
                    limpio.setText("Ambos cuartos están Limpios");
                    sucio.setText("Ningún cuarto está Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                }else{
                    dorm();
                    aspiradora2.setVisible(false);
                    aspiradora1.setVisible(true);
                    aspiCuarto.setText("Aspiradora en el cuarto Rojo");
                    punto = punto - 1;
                    barprog.setValue(punto);
                    dorm();
                    basura1.setVisible(false);
                    limpio.setText("Ambos cuartos están Limpios");
                    sucio.setText("Ningún cuarto está Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                }
            }
            else if(basuAleatorio == 2){
                basura2.setVisible(true);
                basura1.setVisible(false);
                limpio.setText("Cuarto rojo Limpio");
                sucio.setText("Cuarto azul Sucio");
                if (aspiAleatorio == 1){
                    dorm();
                    aspiradora1.setVisible(false);
                    aspiradora2.setVisible(true);
                    aspiCuarto.setText("Aspiradora en el cuarto Azul");
                    punto = punto - 1;
                    barprog.setValue(punto);
                    dorm();
                    basura2.setVisible(false);
                    limpio.setText("Ambos cuartos están Limpios");
                    sucio.setText("Ningún cuarto está Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                }else{
                    dorm();
                    basura2.setVisible(false);
                    limpio.setText("Ambos cuartos están Limpios");
                    sucio.setText("Ningún cuarto está Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                }
            }
            else if(basuAleatorio == 3){
                basura2.setVisible(true);
                basura1.setVisible(true);
                limpio.setText("Ningún cuarto está Limpio");
                sucio.setText("Ambos cuartos están Sucios");
                if (aspiAleatorio == 1){
                    dorm();
                    basura1.setVisible(false);
                    limpio.setText("Cuarto Rojo Limpio");
                    sucio.setText("Cuarto Azul Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                    dorm();
                    aspiradora1.setVisible(false);
                    aspiradora2.setVisible(true);
                    aspiCuarto.setText("Aspiradora en el cuarto Azul");
                    punto = punto - 1;
                    barprog.setValue(punto);
                    dorm();
                    basura2.setVisible(false);
                    limpio.setText("Ambos cuartos están Limpios");
                    sucio.setText("Ningún cuarto está Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                }else{
                    dorm();
                    basura2.setVisible(false);
                    limpio.setText("Cuarto Azul Limpio");
                    sucio.setText("Cuarto Rojo Sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                    dorm();
                    aspiradora2.setVisible(false);
                    aspiradora1.setVisible(true);
                    aspiCuarto.setText("Aspiradora en el cuarto Rojo");
                    punto = punto - 1;
                    barprog.setValue(punto);
                    dorm();
                    basura1.setVisible(false);
                    limpio.setText("Ambos cuartos están limpios");
                    sucio.setText("Ningún cuarto está sucio");
                    punto = punto - 2;
                    barprog.setValue(punto);
                }
            }
            else if(basuAleatorio == 4){
                basura2.setVisible(false);
                basura1.setVisible(false);
                limpio.setText("Ambos cuartos están Limpios");
                sucio.setText("Ningún cuarto está Sucio");
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

        aspiradora2 = new javax.swing.JLabel();
        aspiradora1 = new javax.swing.JLabel();
        basura1 = new javax.swing.JLabel();
        basura2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        aspiCuarto = new javax.swing.JLabel();
        limpio = new javax.swing.JLabel();
        sucio = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        barprog = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 153, 46));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aspiradora2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aspiradora/Imagenes/aspiradora.png"))); // NOI18N
        aspiradora2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                aspiradora2HierarchyChanged(evt);
            }
        });
        aspiradora2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                aspiradora2ComponentHidden(evt);
            }
        });
        getContentPane().add(aspiradora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 60, 40));

        aspiradora1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aspiradora/Imagenes/aspiradora.png"))); // NOI18N
        aspiradora1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                aspiradora1HierarchyChanged(evt);
            }
        });
        aspiradora1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                aspiradora1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        aspiradora1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                aspiradora1ComponentHidden(evt);
            }
        });
        getContentPane().add(aspiradora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 60, 40));

        basura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aspiradora/Imagenes/basura.png"))); // NOI18N
        basura1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                basura1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(basura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 50, 40));

        basura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aspiradora/Imagenes/basura.png"))); // NOI18N
        basura2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                basura2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(basura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aspiradora/Imagenes/cuartos.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 270));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aspiCuarto.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jPanel1.add(aspiCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 340, 30));

        limpio.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        limpio.setForeground(new java.awt.Color(51, 102, 0));
        jPanel1.add(limpio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 330, 30));

        sucio.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        sucio.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(sucio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 340, 30));

        Iniciar.setBackground(new java.awt.Color(255, 255, 255));
        Iniciar.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        Iniciar.setText("Iniciar");
        Iniciar.setBorder(null);
        Iniciar.setBorderPainted(false);
        Iniciar.setFocusPainted(false);
        Iniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 60, 30));

        barprog.setStringPainted(true);
        jPanel1.add(barprog, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 320, 170, 30));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Batería de Aspiradora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aspiradora2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_aspiradora2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_aspiradora2ComponentHidden

    private void aspiradora2HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_aspiradora2HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aspiradora2HierarchyChanged

    private void basura2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_basura2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_basura2AncestorAdded

    private void aspiradora1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_aspiradora1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aspiradora1HierarchyChanged

    private void aspiradora1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_aspiradora1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_aspiradora1ComponentHidden

    private void basura1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_basura1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_basura1AncestorAdded

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        punto = 100;
        barprog.setValue(100);
        Thread hilo = new Thread(){
            @Override
            public void run(){
                while(punto>=1){
                    try {
                        sleep(1000);
                        accprin();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }  
                }   
            }
        };
        hilo.start();
                
    }//GEN-LAST:event_IniciarActionPerformed

    private void aspiradora1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_aspiradora1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_aspiradora1AncestorMoved

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
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel aspiCuarto;
    private javax.swing.JLabel aspiradora1;
    private javax.swing.JLabel aspiradora2;
    private javax.swing.JProgressBar barprog;
    private javax.swing.JLabel basura1;
    private javax.swing.JLabel basura2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel limpio;
    private javax.swing.JLabel sucio;
    // End of variables declaration//GEN-END:variables
}
