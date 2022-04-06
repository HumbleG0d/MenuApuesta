
package app;

import AppPackage.AnimationClass;
import clases.RegisterAdd;
import java.util.ArrayList;
import clases.BaseDatosbet;
import clases.SwingValidator;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ApuestaApp extends javax.swing.JFrame {
    AnimationClass animation = new AnimationClass();
    SwingValidator sv = new SwingValidator();
    
    
    String nameC [] = {"ID" , "Nombre" , "Apellido" ,"Numero" , "Yape"};
    String data[][] ={};
    
    DefaultTableModel tabla = new DefaultTableModel(data , nameC);
    DefaultTableModel tabla1 = new DefaultTableModel(data , nameC);
    
    String nameC1 [] = {"ID" , "Nombre" , "Apellido" ,"Numero" , "Yape" , "Pago"};
    
    DefaultTableModel tabla2 = new DefaultTableModel(data , nameC1);
    
    ArrayList<RegisterAdd> arr = new ArrayList<>();
    String nameDir =  "C:\\Users\\sergi\\OneDrive\\Escritorio\\ProyectoDota2\\MenuApuestas";
    String nameFile = "registerBet.txt";        
    public ApuestaApp() {
        initComponents();
        this.setLocationRelativeTo(null);
        BaseDatosbet.createFile(nameFile, nameDir);
        jtTabla.setModel(tabla);
        jtTabla2.setModel(tabla1);
        jtTabla3.setModel(tabla2);
    }
    
    int cont = 0;
    
    public void animationSlide(){
     
        if(Home.getX() == -58){
           
            animation.jLabelXRight(-58, 0, 10, 5, Home);
            animation.jLabelXRight(-58, 0, 10, 5, jladd);
            animation.jLabelXRight(-58, 0, 10, 5, jlremove);
            animation.jLabelXRight(-58, 0, 10, 5, jlpay);
        }
        else if(Home.getX() == 0){
            
            animation.jLabelXLeft(0, -58, 2, 2, Home);
            animation.jLabelXLeft(0, -58, 2, 2, jladd);
            animation.jLabelXLeft(0, -58, 2, 2, jlremove);
            animation.jLabelXLeft(0, -58, 2, 2, jlpay);
        }
    }
    
    public void addBet() throws IOException{
        cont ++;
        RegisterAdd ra = new RegisterAdd(cont);
        
        String name = jtNombre.getText();
        ra.setName(name);
        
        String apellido = jtApellido.getText();
        ra.setApellido(apellido);
        
        String yape = jtYape.getText();
        ra.setYape(Double.parseDouble(yape));
        
        String numero = jtNumero.getText();
        ra.setNumero(Integer.parseInt(numero));
        
        arr.add(ra);
        BaseDatosbet.addFile(nameFile, nameDir, arr);
        
        //Elimina filas de la tabla
        for (int i = jtTabla.getRowCount() -1; i >= 0; i--){
            tabla.removeRow(i);
        }
        //Agrega datos a la tabla.
        BaseDatosbet.writeTable(nameFile, nameDir, tabla);
    }
    
    public boolean validDatos(){
        return sv.isPresent(jtNombre, "El nombre") && sv.isPresent(jtApellido, "El apellido") && sv.isInteger(jtNumero, "El numero")
                && sv.isDouble(jtYape, "El yape");
    }
    
    public void actuTabla1Tabla2(){
        //Elimina filas de la tabla
        for (int i = jtTabla.getRowCount() -1; i >= 0; i--){
            tabla.removeRow(i);
        }
        //Agrega datos a la tabla.
        BaseDatosbet.writeTable(nameFile, nameDir, tabla);
        
        //Elimina filas de la tabla
        for (int i = jtTabla2.getRowCount() -1; i >= 0; i--){
            tabla1.removeRow(i);
        }
        //Agrega datos a la tabla.
        BaseDatosbet.writeTable(nameFile, nameDir, tabla1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        minimizar = new javax.swing.JButton();
        menu = new javax.swing.JLabel();
        jlpay = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        jladd = new javax.swing.JLabel();
        jlremove = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpAdd = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jlNumero = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jbAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jtYape = new javax.swing.JTextField();
        jpRemove = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtEliNumero = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabla2 = new javax.swing.JTable();
        jpPagar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jbWin = new javax.swing.JButton();
        jbLose = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTabla3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        minimizar.setBackground(new java.awt.Color(204, 204, 204));
        minimizar.setForeground(new java.awt.Color(204, 204, 204));
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_compress_16px.png"))); // NOI18N
        minimizar.setBorder(null);
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 40));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_menu_48px.png"))); // NOI18N
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jlpay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_refund_64px.png"))); // NOI18N
        jlpay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlpayMouseClicked(evt);
            }
        });
        jPanel1.add(jlpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(-58, 440, 60, 60));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_home_page_64px_1.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(-58, 70, 60, 60));

        jladd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_add_dollar_64px.png"))); // NOI18N
        jladd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jladdMouseClicked(evt);
            }
        });
        jPanel1.add(jladd, new org.netbeans.lib.awtextra.AbsoluteConstraints(-58, 200, 60, 60));

        jlremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_cancel_64px.png"))); // NOI18N
        jlremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlremoveMouseClicked(evt);
            }
        });
        jPanel1.add(jlremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(-58, 320, 60, 60));

        salir.setBackground(new java.awt.Color(204, 204, 204));
        salir.setForeground(new java.awt.Color(204, 204, 204));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_multiply_16px.png"))); // NOI18N
        salir.setBorder(null);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 40));

        jPanel2.setLayout(new java.awt.CardLayout());

        jpHome.setBackground(new java.awt.Color(214, 217, 223));
        jpHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 75, 254), 2));
        jpHome.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_facebook_48px.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/maca.jpg"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(107, 75, 254));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(107, 75, 254));
        jLabel3.setText("Macarius2.0");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_YouTube_48px.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(107, 75, 254));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(107, 75, 254));
        jLabel5.setText("Macarius2.0");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8_Instagram_48px.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(107, 75, 254));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(107, 75, 254));
        jLabel7.setText("macarius2.0");

        javax.swing.GroupLayout jpHomeLayout = new javax.swing.GroupLayout(jpHome);
        jpHome.setLayout(jpHomeLayout);
        jpHomeLayout.setHorizontalGroup(
            jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeLayout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jpHomeLayout.createSequentialGroup()
                        .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jpHomeLayout.setVerticalGroup(
            jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHomeLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel2.add(jpHome, "card2");

        jLabel9.setBackground(new java.awt.Color(164, 186, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(164, 186, 255));
        jLabel9.setText("Nombre:");

        jtNombre.setBackground(new java.awt.Color(242, 236, 148));
        jtNombre.setForeground(new java.awt.Color(102, 102, 102));
        jtNombre.setDisabledTextColor(new java.awt.Color(51, 51, 255));
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(164, 186, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(164, 186, 255));
        jLabel10.setText("Apellido:");

        jtApellido.setBackground(new java.awt.Color(242, 236, 148));
        jtApellido.setForeground(new java.awt.Color(102, 102, 102));

        jlNumero.setBackground(new java.awt.Color(164, 186, 255));
        jlNumero.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jlNumero.setForeground(new java.awt.Color(164, 186, 255));
        jlNumero.setText("Numero:");

        jtNumero.setBackground(new java.awt.Color(242, 236, 148));
        jtNumero.setForeground(new java.awt.Color(102, 102, 102));

        jbAñadir.setBackground(new java.awt.Color(0, 27, 94));
        jbAñadir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jbAñadir.setForeground(new java.awt.Color(0, 0, 255));
        jbAñadir.setText("Añadir");
        jbAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAñadirActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTabla.setFocusable(false);
        jScrollPane1.setViewportView(jtTabla);

        jLabel13.setBackground(new java.awt.Color(164, 186, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(164, 186, 255));
        jLabel13.setText("Yape:");

        jtYape.setBackground(new java.awt.Color(242, 236, 148));
        jtYape.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jpAddLayout = new javax.swing.GroupLayout(jpAdd);
        jpAdd.setLayout(jpAddLayout);
        jpAddLayout.setHorizontalGroup(
            jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jbAñadir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpAddLayout.createSequentialGroup()
                .addGroup(jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpAddLayout.createSequentialGroup()
                                            .addGap(69, 69, 69)
                                            .addComponent(jtYape, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jLabel9)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAddLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jpAddLayout.setVerticalGroup(
            jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAddLayout.createSequentialGroup()
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jlNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtYape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAñadir)
                .addGap(59, 59, 59))
        );

        jPanel2.add(jpAdd, "card3");

        jLabel8.setBackground(new java.awt.Color(164, 186, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(164, 186, 255));
        jLabel8.setText("Numero:");

        jtEliNumero.setBackground(new java.awt.Color(242, 236, 148));
        jtEliNumero.setForeground(new java.awt.Color(102, 102, 102));

        jbEliminar.setBackground(new java.awt.Color(0, 27, 94));
        jbEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jtTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTabla2.setFocusable(false);
        jScrollPane2.setViewportView(jtTabla2);

        javax.swing.GroupLayout jpRemoveLayout = new javax.swing.GroupLayout(jpRemove);
        jpRemove.setLayout(jpRemoveLayout);
        jpRemoveLayout.setHorizontalGroup(
            jpRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRemoveLayout.createSequentialGroup()
                .addGroup(jpRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRemoveLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jpRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpRemoveLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jtEliNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpRemoveLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jbEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpRemoveLayout.setVerticalGroup(
            jpRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRemoveLayout.createSequentialGroup()
                .addGroup(jpRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRemoveLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jtEliNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(jbEliminar))
                    .addGroup(jpRemoveLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.add(jpRemove, "card4");

        jLabel12.setBackground(new java.awt.Color(164, 186, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(164, 186, 255));
        jLabel12.setText("Resultado de la partida:");

        jbWin.setBackground(new java.awt.Color(0, 27, 94));
        jbWin.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jbWin.setForeground(new java.awt.Color(0, 0, 255));
        jbWin.setText("Win");
        jbWin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbWinActionPerformed(evt);
            }
        });

        jbLose.setBackground(new java.awt.Color(234, 71, 59));
        jbLose.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jbLose.setForeground(new java.awt.Color(255, 0, 51));
        jbLose.setText("Lose");
        jbLose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoseActionPerformed(evt);
            }
        });

        jtTabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtTabla3);

        javax.swing.GroupLayout jpPagarLayout = new javax.swing.GroupLayout(jpPagar);
        jpPagar.setLayout(jpPagarLayout);
        jpPagarLayout.setHorizontalGroup(
            jpPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPagarLayout.createSequentialGroup()
                .addGroup(jpPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPagarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbWin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLose))
                    .addGroup(jpPagarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jpPagarLayout.setVerticalGroup(
            jpPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPagarLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jpPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPagarLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(33, 33, 33)
                        .addGroup(jpPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbWin)
                            .addComponent(jbLose))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.add(jpPagar, "card5");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 750, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        animationSlide();
    }//GEN-LAST:event_menuMouseClicked
int xx , xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX(); //Obtiene la posicion x del mouse.
        xy = evt.getY(); //Obtiene la posicion y del mouse.
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
      this.setLocation(x-xx , y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
        BaseDatosbet.deleteFile(nameFile, nameDir);
    }//GEN-LAST:event_salirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jpHome.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        jpHome.setVisible(true);
        jpAdd.setVisible(false);
        jpRemove.setVisible(false);
        jpPagar.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void jladdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jladdMouseClicked
        jpHome.setVisible(false);
        jpAdd.setVisible(true);
        jpRemove.setVisible(false);
        jpPagar.setVisible(false);
    }//GEN-LAST:event_jladdMouseClicked

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if(sv.isInteger(jtEliNumero, "El numero")){
            int numero = Integer.parseInt(jtEliNumero.getText());
            BaseDatosbet.deleteFile(nameFile, nameDir);
            jtEliNumero.setText("");
            jtEliNumero.requestFocusInWindow();
        try {
            BaseDatosbet.actFile(nameFile, nameDir, arr, numero);
            actuTabla1Tabla2();
        } catch (IOException ex) {
            Logger.getLogger(ApuestaApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jlremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlremoveMouseClicked
        jpRemove.setVisible(true);
        jpHome.setVisible(false);
        jpAdd.setVisible(false);
        jpPagar.setVisible(false);
    }//GEN-LAST:event_jlremoveMouseClicked

    private void jlpayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlpayMouseClicked
        jpHome.setVisible(false);
        jpAdd.setVisible(false);
        jpRemove.setVisible(false);
        jpPagar.setVisible(true);
    }//GEN-LAST:event_jlpayMouseClicked

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAñadirActionPerformed
        //Añadir apostador
        if(validDatos()){
            try {
                addBet();
                jtNombre.setText("");
                jtApellido.setText("");
                jtNumero.setText("");
                jtYape.setText("");
                jtNombre.requestFocusInWindow();
            } catch (IOException ex) {
                Logger.getLogger(ApuestaApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbAñadirActionPerformed

    private void jbWinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbWinActionPerformed
        String nameDir1 =  "C:\\Users\\sergi\\OneDrive\\Escritorio\\ProyectoDota2\\MenuApuestas";
        String nameFile1 = "ApuestaGanada.txt";     
        try {
            BaseDatosbet.FileWin(nameFile1, nameDir1, arr);
        } catch (IOException ex) {
            Logger.getLogger(ApuestaApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = jtTabla3.getRowCount() -1; i >= 0; i--){
            tabla2.removeRow(i);
        }
        //Agrega datos a la tabla.
        
        BaseDatosbet.writeTable(nameFile1, nameDir1, tabla2);
    }//GEN-LAST:event_jbWinActionPerformed

    private void jbLoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoseActionPerformed
        String nameDir1 =  "C:\\Users\\sergi\\OneDrive\\Escritorio\\ProyectoDota2\\MenuApuestas";
        String nameFile1 = "ApuestaPerdida.txt";     
        try {
            BaseDatosbet.FileLose(nameFile1, nameDir1, arr);
        } catch (IOException ex) {
            Logger.getLogger(ApuestaApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = jtTabla3.getRowCount() -1; i >= 0; i--){
            tabla2.removeRow(i);
        }
        BaseDatosbet.writeTable(nameFile1, nameDir1, tabla2);
    }//GEN-LAST:event_jbLoseActionPerformed

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
            java.util.logging.Logger.getLogger(ApuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApuestaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApuestaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAñadir;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLose;
    private javax.swing.JButton jbWin;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jladd;
    private javax.swing.JLabel jlpay;
    private javax.swing.JLabel jlremove;
    private javax.swing.JPanel jpAdd;
    private javax.swing.JPanel jpHome;
    private javax.swing.JPanel jpPagar;
    private javax.swing.JPanel jpRemove;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtEliNumero;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTable jtTabla2;
    private javax.swing.JTable jtTabla3;
    private javax.swing.JTextField jtYape;
    private javax.swing.JLabel menu;
    private javax.swing.JButton minimizar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
