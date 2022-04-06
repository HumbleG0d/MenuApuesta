
package register;
import clases.BaseDatos;
import clases.RegisterUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.Principal;
import clases.SwingValidator;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    RegisterUser user = new RegisterUser();
    SwingValidator sv = new SwingValidator();
    BaseDatos bd = new BaseDatos();
    
    ArrayList<RegisterUser> r = new ArrayList<>();
    String nameDir =  "C:\\Users\\sergi\\OneDrive\\Escritorio\\ProyectoDota2\\MenuApuestas";
    String nameFile = "registerUser.txt";
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        BaseDatos.createFile(nameFile, nameDir);
    }
    
    public boolean validDatos(){
        return sv.isPresent(jTuser, "El nombre del usuario") && sv.isPassword(jpPassword, "La contraseña es")
                && sv.isPassword(jpPasswordC, "La contraseña es") && validPass();
    }
    
    public void register() throws IOException{
        String u = jTuser.getText(); 
        user.setUser(u);
        
        String p = new String(jpPassword.getPassword());
        user.setPassword(p);
        
        String p1 = new String(jpPasswordC.getPassword());
        user.setPassword(p1);
        
        r.add(user);
        BaseDatos.writeFile(nameFile, nameDir, r);
    }
    public void abrirPrincipal(){
        Principal pr = new Principal();
        pr.setVisible(true); //Nos permite ver el formulario.
        this.dispose(); //Cierra el formulario principal.
        
    }
    
    public boolean validPass(){
        boolean val;
        String s1 = new String(jpPassword.getPassword());
        String s2 = new String(jpPasswordC.getPassword());
        
        if(s1.equals(s2)){
                val = true;
            }
        else{
                JOptionPane.showMessageDialog(jpPassword, "¡Las contraseñas no coinciden!", "Dato no válido", JOptionPane.ERROR_MESSAGE);
                val = false;
            }
        return val;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jpPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpPasswordC = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jbRegister = new javax.swing.JButton();
        jbMini = new javax.swing.JButton();
        jbSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(234, 71, 59), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/juger.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, 200));

        jLabel2.setBackground(new java.awt.Color(14, 146, 205));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(14, 146, 205));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 30));

        jTuser.setForeground(new java.awt.Color(153, 153, 153));
        jTuser.setBorder(null);
        jTuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTuserActionPerformed(evt);
            }
        });
        jPanel1.add(jTuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 230, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 280, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/user.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/key.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 280, -1));

        jLabel5.setBackground(new java.awt.Color(14, 146, 205));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 146, 205));
        jLabel5.setText("User:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 30));

        jpPassword.setForeground(new java.awt.Color(153, 153, 153));
        jpPassword.setBorder(null);
        jPanel1.add(jpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 442, 230, 30));

        jLabel6.setBackground(new java.awt.Color(14, 146, 205));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(14, 146, 205));
        jLabel6.setText("Confirm Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 180, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/key.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        jpPasswordC.setForeground(new java.awt.Color(153, 153, 153));
        jpPasswordC.setBorder(null);
        jPanel1.add(jpPasswordC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 230, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 280, -1));

        jbRegister.setBackground(new java.awt.Color(14, 146, 205));
        jbRegister.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbRegister.setForeground(new java.awt.Color(255, 255, 255));
        jbRegister.setText("Register");
        jbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, -1, -1));

        jbMini.setBackground(new java.awt.Color(14, 146, 205));
        jbMini.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jbMini.setForeground(new java.awt.Color(255, 255, 255));
        jbMini.setText("-");
        jbMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMiniActionPerformed(evt);
            }
        });
        jPanel1.add(jbMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 50, 30));

        jbSalir1.setBackground(new java.awt.Color(14, 146, 205));
        jbSalir1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbSalir1.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir1.setText("X");
        jbSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTuserActionPerformed

    private void jbMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMiniActionPerformed
        setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_jbMiniActionPerformed

    private void jbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegisterActionPerformed
        if(validDatos()){
            try {
            register();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        abrirPrincipal();
        }
    }//GEN-LAST:event_jbRegisterActionPerformed

    private void jbSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalir1ActionPerformed
    int xx , xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx , y -xy);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTuser;
    private javax.swing.JButton jbMini;
    private javax.swing.JButton jbRegister;
    private javax.swing.JButton jbSalir1;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JPasswordField jpPasswordC;
    // End of variables declaration//GEN-END:variables
}
