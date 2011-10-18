/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Inicio.java
 *
 * Created on 14-oct-2011, 13:43:21
 */
package IDE;


import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nelson Reyes
 */

/**
 * Aplicacion para la simulacion de la metodologia
 * Xtreme Programming
 * del Curso de Analisis y Diseño de Sistemas 1
 * 
 */

public class Inicio extends javax.swing.JFrame {

   
    final DefaultTableModel modelo = new DefaultTableModel();
    JTable table = new JTable();
    /** Creates new form Inicio */
    public Inicio() {
        
        initComponents();        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        ingresar_aplicacion = new javax.swing.JButton();
        informacion = new javax.swing.JLabel();
        compra = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Agregar_al_carrito = new javax.swing.JButton();
        Aceptar_compra = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menu_nuevo1 = new javax.swing.JMenuItem();
        menu_salir1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        verificar_carrito = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        menu_nuevo2 = new javax.swing.JMenuItem();
        menu_salir2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        Ventana1 = new javax.swing.JButton();
        Ventana2 = new javax.swing.JButton();
        Facturar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_nuevo = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        Login.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Login.setTitle("Login - Xtreme Programming");
        Login.setBounds(new java.awt.Rectangle(420, 200, 400, 240));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        ingresar_aplicacion.setText("Ingresar");
        ingresar_aplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_aplicacionActionPerformed(evt);
            }
        });

        informacion.setFont(new java.awt.Font("Tahoma", 1, 11));
        informacion.setForeground(new java.awt.Color(204, 0, 0));
        informacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(password)
                                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                            .addComponent(informacion, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ingresar_aplicacion)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresar_aplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Seleccione el productos que desee:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Refrigerador", "Estufa", "Lavadora" }));

        jLabel4.setText("Cantidad:");

        Agregar_al_carrito.setText("Agregar al Carrito");
        Agregar_al_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_al_carritoActionPerformed(evt);
            }
        });

        Aceptar_compra.setText("Aceptar Compra");
        Aceptar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar_compraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Aceptar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Agregar_al_carrito)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar_al_carrito)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Aceptar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu3.setText("Archivo");

        menu_nuevo1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menu_nuevo1.setText("Inicio");
        menu_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nuevo1ActionPerformed(evt);
            }
        });
        jMenu3.add(menu_nuevo1);

        menu_salir1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_salir1.setText("Salir");
        menu_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salir1ActionPerformed(evt);
            }
        });
        jMenu3.add(menu_salir1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Ayuda");
        jMenuBar2.add(jMenu4);

        compra.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout compraLayout = new javax.swing.GroupLayout(compra.getContentPane());
        compra.getContentPane().setLayout(compraLayout);
        compraLayout.setHorizontalGroup(
            compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        compraLayout.setVerticalGroup(
            compraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("Seleccione el Producto que desea eliminar:");

        jButton4.setText("Finalizar Compra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar Productos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu5.setText("Archivo");

        menu_nuevo2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menu_nuevo2.setText("Inicio");
        menu_nuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nuevo2ActionPerformed(evt);
            }
        });
        jMenu5.add(menu_nuevo2);

        menu_salir2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_salir2.setText("Salir");
        menu_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salir2ActionPerformed(evt);
            }
        });
        jMenu5.add(menu_salir2);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Ayuda");
        jMenuBar3.add(jMenu6);

        verificar_carrito.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout verificar_carritoLayout = new javax.swing.GroupLayout(verificar_carrito.getContentPane());
        verificar_carrito.getContentPane().setLayout(verificar_carritoLayout);
        verificar_carritoLayout.setHorizontalGroup(
            verificar_carritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verificar_carritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        verificar_carritoLayout.setVerticalGroup(
            verificar_carritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verificar_carritoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setName("Inicio"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Ventana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/comprar.png"))); // NOI18N
        Ventana1.setText("Comprar");
        Ventana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventana1ActionPerformed(evt);
            }
        });

        Ventana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/verificar.png"))); // NOI18N
        Ventana2.setText("Verificar");
        Ventana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ventana2ActionPerformed(evt);
            }
        });

        Facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/factura.png"))); // NOI18N
        Facturar.setText("Facturar");
        Facturar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        menu_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menu_nuevo.setText("Nuevo");
        menu_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_nuevo);

        menu_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menu_salir.setText("Salir");
        menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(menu_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Ventana1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(Ventana2)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(Facturar)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ventana2)
                    .addComponent(Ventana1))
                .addGap(44, 44, 44)
                .addComponent(Facturar)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boton que envia a la funcionalidad 2 : Carretilla de compras
     */
    private void Ventana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventana1ActionPerformed
        
        System.out.println("Me tiene que enviar ala ventana con una funcionalidad X");
        this.compra.setBounds(150, 150, 700, 300);
        this.compra.setVisible(true);

   

        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad a Comprar");
        modelo.addColumn("Precio");


        this.jTable1.setModel(modelo);

    }//GEN-LAST:event_Ventana1ActionPerformed

    /**
     * boton que me envia a la funcionalidad 3 : hacer compras
     */
    private void Ventana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ventana2ActionPerformed
         System.out.println("Me tiene que enviar ala ventana con una funcionalidad Y");
         this.verificar_carrito.setBounds(150, 150, 700, 400);
         this.verificar_carrito.setVisible(true);
         this.jTable2.setModel(modelo);
         
    }//GEN-LAST:event_Ventana2ActionPerformed

    /**
     * 
     * al abrirse la aplicacion mostrara la ventana de login
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
     /**
     * 
     * al abrirse la aplicacion mostrara la ventana de login
     **/
       this.setVisible(false);          // ocultamos la ventana principal
       this.Login.setVisible(true);     // mostramos la ventana de login
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * boton que me envia al menu principal de la aplicacion si me logeo correctamente
     */    
    private void ingresar_aplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_aplicacionActionPerformed
               
        comprobar_usuario();      // Comprobamos datos
    }//GEN-LAST:event_ingresar_aplicacionActionPerformed

    /**
     * Item de la barra de menus para salir
     */
    private void menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salirActionPerformed
        System.exit(0); // cierra la aplicacion
    }//GEN-LAST:event_menu_salirActionPerformed

    /**
     * Item de la barra de menus para abrir una nueva ventana
     */
    private void menu_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nuevoActionPerformed
        
        new Inicio().setVisible(true);  // una nueva ventana
        this.dispose();                 // cerramos la ventana actual
    }//GEN-LAST:event_menu_nuevoActionPerformed

    /**
     * evento que verifica si presiono la tecla enter
     */
    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        
       
        if(evt.getKeyCode() == 10)      // tecla enter presionada
        {
            comprobar_usuario();        // Comprobamos datos
        }
    }//GEN-LAST:event_passwordKeyPressed

    /**
     * boton que me envia a la ventana de factura
     */   
    
    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed

       imprimir_fac fac = new imprimir_fac();
       fac.setVisible(true);
    }//GEN-LAST:event_FacturarActionPerformed

    private void menu_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nuevo1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        this.compra.setVisible(false);
    }//GEN-LAST:event_menu_nuevo1ActionPerformed

    /**
     * 
     * @param evt , boton salir
     */
    private void menu_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salir1ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_menu_salir1ActionPerformed

    /**
     * 
     * @param evt Agregar al carrito
     */
    private void Agregar_al_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_al_carritoActionPerformed
    
        String producto = this.jComboBox1.getSelectedItem().toString();
     
        //jTable1.setModel(null);
        if(producto.equalsIgnoreCase("Refrigerador"))
        {
            Object [] fila = new Object[5];
            fila[0] = "Refrigeradora";
            fila[1] = this.jTextField1.getText();
            fila[2] = "Q4000.00";

            modelo.addRow(fila);
            this.jTable1.setModel(modelo);
        }

        if(producto.equalsIgnoreCase("Estufa"))
        {
            Object [] fila = new Object[5];
            fila[0] = "Estufa";
            fila[1] = this.jTextField1.getText();
            fila[2] = "Q3250.00";
            modelo.addRow(fila);
            this.jTable1.setModel(modelo);
        }

        if(producto.equalsIgnoreCase("Lavadora"))
        {
            Object [] fila = new Object[5];
            fila[0] = "Lavadora";
            fila[1] = this.jTextField1.getText();
            fila[2] = "Q3000.00";
            modelo.addRow(fila);
            this.jTable1.setModel(modelo);

        }
    }//GEN-LAST:event_Agregar_al_carritoActionPerformed

    /**
     * 
     * @param evt , aceptar compra
     */
    private void Aceptar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar_compraActionPerformed
       
        this.compra.setVisible(false);
    }//GEN-LAST:event_Aceptar_compraActionPerformed

    private void menu_nuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nuevo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_nuevo2ActionPerformed

    private void menu_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_salir2ActionPerformed

    /**
     * 
     * @param evt se elimina el item seleccionado de la tabla
     */
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
         int fila = jTable2.rowAtPoint(evt.getPoint());
         int columna = jTable2.columnAtPoint(evt.getPoint());
         if ((fila > -1) && (columna > -1))
            System.out.println("ESTA FUE LA Q SE QUIZO ELIMINAR:"+modelo.getValueAt(fila,columna));
            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(jTable2, "Se elimino el producto seleccionado de su carrito de compras");
    }//GEN-LAST:event_jTable2MouseClicked

    /**
     * 
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       this.compra.setBounds(150, 150, 700, 300);
        this.compra.setVisible(true);
        this.verificar_carrito.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * 
     * @param evt 
     * Confirmacion de la compra
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(jTable2, "SU compra se realizo exitosamente!!");
    }//GEN-LAST:event_jButton4ActionPerformed
 
    /**
     * metodo local para comprobar el acceso del usuario a la aplicacion
     */
    private void comprobar_usuario()
    {
        String usuario_t = this.usuario.getText();              // obtiene el nombre de usuario del JText
        String password_t = this.password.getText();               // obtiene el password del usuario del JText
        
        LogIn ingresar = new LogIn();                           // creamos un objeto de la clase LogIn
        
        boolean respuesta = false;                              // inicializamos la bandera de entrada
        
        respuesta = ingresar.validarIngreso(password_t, usuario_t); // obtenemos el resultado de la comparacion
            
        if(respuesta == true)                                   // si es verdadero el login
        {
            this.Login.dispose();                               // cerramos la ventana de login
            this.setVisible(true);                              // mostramos el menu principal
        }
        else                                                    // si no es correcta la informacion
        {   
            informacion.setText("Vuelva a intentar...");        // mostramos mensaje al usuario
            this.password.setText("");                          // iniciamos los campos de entrada
            this.usuario.setText("");
        }
        
       
    }
    /**
     * @param args main, programa principal
     */
    public static void main(String args[]) 
    {
        try
        {           
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            System.out.println("ERROR en LOOK & FEEL"+e);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar_compra;
    private javax.swing.JButton Agregar_al_carrito;
    private javax.swing.JButton Facturar;
    private javax.swing.JFrame Login;
    private javax.swing.JButton Ventana1;
    private javax.swing.JButton Ventana2;
    private javax.swing.JFrame compra;
    private javax.swing.JLabel informacion;
    private javax.swing.JButton ingresar_aplicacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem menu_nuevo;
    private javax.swing.JMenuItem menu_nuevo1;
    private javax.swing.JMenuItem menu_nuevo2;
    private javax.swing.JMenuItem menu_salir;
    private javax.swing.JMenuItem menu_salir1;
    private javax.swing.JMenuItem menu_salir2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField usuario;
    private javax.swing.JFrame verificar_carrito;
    // End of variables declaration//GEN-END:variables
}
