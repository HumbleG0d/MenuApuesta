/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;
import register.Register;
import clases.SwingValidator;
import clases.BaseDatos;

import app.ApuestaApp;
import javax.swing.JOptionPane;
//import clases.RegisterUser;
//import java.util.ArrayList;
//import clases.BaseDatos;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

    SwingValidator sv = new SwingValidator();
    BaseDatos bd = new BaseDatos();
    String nameDir =  "C:\\Users\\sergi\\OneDrive\\Escritorio\\ProyectoDota2\\MenuApuestas";
    String nameFile = "registerUser.txt";       
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); //Pone la interfaz al centro de la pantalla.
        
    }
    
    public boolean validDatos(){
        return sv.isPresent(jTuser, "El nombre del usuario ") && sv.isPassword(jPpassword, "La contraseña es") && validPass();
    }
    public void abrirApuestaApp(){
        ApuestaApp app = new ApuestaApp();
        app.setVisible(true); //Nos permite ver el menu apuestas.
        this.dispose(); //Cierra el formulario principal.
        
    }
    
    public void abrirRegister(){
        Register rg = new Register();
        rg.setVisible(true); //Nos permite ver el registro.
        this.dispose(); //Cierra el formulario principal.
        
    }
    
    //Verifica si la contraseña es igual a la registrada.
    public boolean validPass(){
        boolean val;
        String p = new String(jPpassword.getPassword());
        String u = jTuser.getText();
        String d [] = bd.readFile(nameFile, nameDir);
        
        if(p.equals(d[1]) && u.equals(d[0])){
                val = true;
            }
        else{
                JOptionPane.showMessageDialog(jPpassword, "¡Contraseña o Usuario incorrecta!", "Dato no válido", JOptionPane.ERROR_MESSAGE);
                val = false;
            }
        return val;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelPasword = new javax.swing.JLabel();
        jTuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPpassword = new javax.swing.JPasswordField();
        btnLoding = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 71, 59), 3));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuario.setBackground(new java.awt.Color(14, 146, 205));
        labelUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(14, 146, 205));
        labelUsuario.setText("User:");
        jPanel2.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, -1));

        labelPasword.setBackground(new java.awt.Color(14, 146, 205));
        labelPasword.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelPasword.setForeground(new java.awt.Color(14, 146, 205));
        labelPasword.setText("Password:");
        jPanel2.add(labelPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 100, -1));

        jTuser.setForeground(new java.awt.Color(153, 153, 153));
        jTuser.setBorder(null);
        jTuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTuserActionPerformed(evt);
            }
        });
        jPanel2.add(jTuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 200, 20));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 366, 240, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 250, 30));

        jPpassword.setForeground(new java.awt.Color(153, 153, 153));
        jPpassword.setBorder(null);
        jPpassword.setCaretColor(new java.awt.Color(187, 187, 187));
        jPpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jPpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 460, 200, 30));

        btnLoding.setBackground(new java.awt.Color(14, 146, 205));
        btnLoding.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnLoding.setForeground(new java.awt.Color(255, 255, 255));
        btnLoding.setText("LODING");
        btnLoding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLodingActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoding, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 110, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/user.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 40, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/key.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/juger.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 210, 200));

        jLabel5.setBackground(new java.awt.Color(14, 146, 205));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 146, 205));
        jLabel5.setText("Register");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 526, 70, 30));

        jSeparator3.setForeground(new java.awt.Color(14, 146, 205));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 60, 10));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(214, 217, 223)));

        btnSalir.setBackground(new java.awt.Color(14, 146, 205));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/DOTA2.png"))); // NOI18N

        btnSalir1.setBackground(new java.awt.Color(14, 146, 205));
        btnSalir1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("-");
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnSalir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTuserActionPerformed
        
    }//GEN-LAST:event_jTuserActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    
    //Permite q el usuario mueva la interfaz.
    int xx , xy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX(); //Obtiene la posicion x del mouse.
        xy = evt.getY(); //Obtiene la posicion y del mouse.
        
    }//GEN-LAST:event_jPanel2MousePressed
    //Permite q el usuario mueva la interfaz.
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x-xx , y-xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void btnLodingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLodingActionPerformed
       if(validDatos()){
           abrirApuestaApp();
       }
        
    }//GEN-LAST:event_btnLodingActionPerformed

    private void jPpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPpasswordActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        abrirRegister();
    }//GEN-LAST:event_jLabel5MouseClicked

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
    private javax.swing.JButton btnLoding;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPpassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTuser;
    private javax.swing.JLabel labelPasword;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
