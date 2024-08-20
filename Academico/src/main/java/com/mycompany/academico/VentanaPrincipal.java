package com.mycompany.academico;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-26
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    int arrayMenores[]= new int[5];
    int arrayMayores[]= new int[5];
    int arrayAdultoMayor[]= new int[5];
    
    
    
    
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Sistema Academico");

        Create.setText("Crear");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Search.setText("Consultar");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Create)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Create)
                    .addComponent(Search))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
       int c=0;
        arrayMenores=new int[5];
        arrayMayores=new int[5];
        arrayAdultoMayor=new int[5];
       int men=0;;
       int may=0;
       int adul=0;
     
       do{
       int edad=Integer.parseInt( 
            JOptionPane.showInputDialog(rootPane, "Ingrese su edad"));
       if(edad<18){
    JOptionPane.showMessageDialog(rootPane, "Usted es menor de edad");
    arrayMenores[men]=edad;
    men++;}
       else if (edad>=18 && edad<59){
    JOptionPane.showMessageDialog(rootPane, "Usted es mayor de edad");
    arrayMayores[may]=edad;
    may++;
    }else{
    JOptionPane.showMessageDialog(rootPane, "Usted es un adulto mayor");
    arrayAdultoMayor[adul]=edad;
    adul++;
    }
       c++;
   } while (c<15);
    }//GEN-LAST:event_CreateActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       int con=0;
        
        
        String consulta= JOptionPane.showInputDialog("Ingrese Que edades quiere consultar (menores de edad,mayores y adultos mayores)");
        
        String espacio= " ";
        String espacio2= " ";
        String espacio3= " ";
        
        
        
        switch (consulta){
            case "menores de edad" -> { 
                do{
                    espacio += arrayMenores[con] + " ";               
                    con++;
                }while(con<5);
                JOptionPane.showMessageDialog(rootPane, "las edades digitadas fueron: " + espacio);
            }
            
            case "mayores de edad" -> {
                do{
                    espacio2 += arrayMayores[con] + " ";
                    con++;
                }while(con<5);
                JOptionPane.showMessageDialog(rootPane, "las edades digitadas fueron: " + espacio2);
            }
            
            case "adultos mayores" ->{
                do{
                    espacio3 += arrayAdultoMayor[con] + " ";
                    con++;
                }while(con<5);
                JOptionPane.showMessageDialog(rootPane, "las edades digitadas fueron: " + espacio3);
            }
        }
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
