
package CapaPresentacion;
import javax.swing.JOptionPane;
import CapaDatos.Usuario;
import CapaDatos.UsuarioDao;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import CapaDatos.conexiom;
import java.sql.*;
 

public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
    }
    
    public void validar (){
       
        
        String Correo = txtNombreUsuario.getText();
        String clave = String.valueOf(txtContrasena.getPassword());
        if (!"".equals(Correo)|| !"".equals(clave)) {
            
            Usuario U1 = new Usuario();
            UsuarioDao UDao1 = new UsuarioDao();
            
            U1 = UDao1.log(Correo, clave);
            
            if (U1.getCorreo()!=null && U1.getClave() != null) {
                
                Menu Menu = new Menu();
                
                Menu.setVisible(true);
                dispose();
                
                
            }else{JOptionPane.showMessageDialog(null, "Correo o contraseña incorrecta");
               
            }
            
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        lblCarritoCompra = new javax.swing.JLabel();
        lblLogoEmpresa = new javax.swing.JLabel();
        lblNombreSoftware = new javax.swing.JLabel();
        lblFondoDerecho = new javax.swing.JLabel();
        lblLogoSENA = new javax.swing.JLabel();
        lblBienvenidaInicio = new javax.swing.JLabel();
        lblBienvenidaFin = new javax.swing.JLabel();
        lblTextoInicioSesion = new javax.swing.JLabel();
        lblTextoContrasena = new javax.swing.JLabel();
        lblTextoUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        pnlContenedorPrincipal = new javax.swing.JPanel();
        btnCerrarProyecto = new javax.swing.JLabel();
        buttonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelFondo.setBackground(new java.awt.Color(43, 41, 54));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarritoCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarritoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compra.png"))); // NOI18N
        lblCarritoCompra.setPreferredSize(new java.awt.Dimension(200, 145));
        jPanelFondo.add(lblCarritoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 200, -1));

        lblLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoSparkBit.png"))); // NOI18N
        lblLogoEmpresa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblLogoEmpresaMouseDragged(evt);
            }
        });
        jPanelFondo.add(lblLogoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -10, -1, -1));

        lblNombreSoftware.setFont(new java.awt.Font("Anja Eliane", 0, 16)); // NOI18N
        lblNombreSoftware.setForeground(new java.awt.Color(43, 41, 54));
        lblNombreSoftware.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreSoftware.setText("R O U L E T T E   P O S ");
        lblNombreSoftware.setToolTipText("");
        jPanelFondo.add(lblNombreSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 200, 60));

        lblFondoDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgGrande.jpg"))); // NOI18N
        jPanelFondo.add(lblFondoDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        lblLogoSENA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoSena.png"))); // NOI18N
        jPanelFondo.add(lblLogoSENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        lblBienvenidaInicio.setFont(new java.awt.Font("Quicksand SemiBold", 1, 16)); // NOI18N
        lblBienvenidaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenidaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exclam1.png"))); // NOI18N
        lblBienvenidaInicio.setText("BIENVENIDO");
        jPanelFondo.add(lblBienvenidaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblBienvenidaFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exclam2.png"))); // NOI18N
        jPanelFondo.add(lblBienvenidaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        lblTextoInicioSesion.setFont(new java.awt.Font("Quicksand Light", 0, 14)); // NOI18N
        lblTextoInicioSesion.setForeground(new java.awt.Color(204, 204, 204));
        lblTextoInicioSesion.setText("Inicia sesion en su cuenta para continuar.");
        jPanelFondo.add(lblTextoInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 40));

        lblTextoContrasena.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextoContrasena.setForeground(new java.awt.Color(153, 153, 153));
        lblTextoContrasena.setText("Contraseña");
        lblTextoContrasena.setToolTipText("");
        jPanelFondo.add(lblTextoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lblTextoUsuario.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblTextoUsuario.setText("Usuario");
        lblTextoUsuario.setToolTipText("");
        jPanelFondo.add(lblTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtNombreUsuario.setBackground(new java.awt.Color(64, 57, 74));
        txtNombreUsuario.setFont(new java.awt.Font("Quicksand Light", 0, 12)); // NOI18N
        txtNombreUsuario.setForeground(java.awt.Color.lightGray);
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMousePressed(evt);
            }
        });
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, 40));

        txtContrasena.setBackground(new java.awt.Color(64, 57, 74));
        txtContrasena.setFont(new java.awt.Font("Quicksand Light", 0, 12)); // NOI18N
        txtContrasena.setForeground(java.awt.Color.lightGray);
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContrasenaMousePressed(evt);
            }
        });
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanelFondo.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 220, 40));

        pnlContenedorPrincipal.setBackground(new java.awt.Color(43, 41, 54));
        pnlContenedorPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlContenedorPrincipalMousePressed(evt);
            }
        });

        btnCerrarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar 1.png"))); // NOI18N
        btnCerrarProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarProyectoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarProyectoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnlContenedorPrincipalLayout = new javax.swing.GroupLayout(pnlContenedorPrincipal);
        pnlContenedorPrincipal.setLayout(pnlContenedorPrincipalLayout);
        pnlContenedorPrincipalLayout.setHorizontalGroup(
            pnlContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarProyecto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContenedorPrincipalLayout.setVerticalGroup(
            pnlContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarProyecto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFondo.add(pnlContenedorPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        buttonInicio.setBackground(new java.awt.Color(255, 130, 9));
        buttonInicio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        buttonInicio.setForeground(new java.awt.Color(255, 255, 255));
        buttonInicio.setText("Ingresar");
        buttonInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInicioActionPerformed(evt);
            }
        });
        jPanelFondo.add(buttonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void pnlContenedorPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlContenedorPrincipalMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlContenedorPrincipalMousePressed

    private void lblLogoEmpresaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoEmpresaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lblLogoEmpresaMouseDragged

    private void btnCerrarProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarProyectoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCerrarProyectoMouseClicked

    private void btnCerrarProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarProyectoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarProyectoMouseEntered

    private void txtNombreUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMousePressed
        if (txtNombreUsuario.getText().equals("Ingrese su nombre de Usuario")){
            txtNombreUsuario.setText("");
            txtNombreUsuario.setForeground(Color.white);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
           txtContrasena.setText("**********");
        txtContrasena.setForeground(Color.lightGray); 
        }
    }//GEN-LAST:event_txtNombreUsuarioMousePressed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMousePressed
        if (String.valueOf(txtContrasena.getPassword()).equals("**********")) {
        txtNombreUsuario.setText("Ingrese su nombre de Usuario");
        txtNombreUsuario.setForeground(Color.lightGray);
        }
        if (txtNombreUsuario.getText().isEmpty()) {
        txtContrasena.setText("");
        txtContrasena.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtContrasenaMousePressed

    private void buttonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInicioActionPerformed
    
       validar();
    }//GEN-LAST:event_buttonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarProyecto;
    public javax.swing.JButton buttonInicio;
    private javax.swing.JPanel jPanelFondo;
    public javax.swing.JLabel lblBienvenidaFin;
    public javax.swing.JLabel lblBienvenidaInicio;
    public javax.swing.JLabel lblCarritoCompra;
    public javax.swing.JLabel lblFondoDerecho;
    public javax.swing.JLabel lblLogoEmpresa;
    public javax.swing.JLabel lblLogoSENA;
    public javax.swing.JLabel lblNombreSoftware;
    public javax.swing.JLabel lblTextoContrasena;
    public javax.swing.JLabel lblTextoInicioSesion;
    public javax.swing.JLabel lblTextoUsuario;
    public javax.swing.JPanel pnlContenedorPrincipal;
    public javax.swing.JPasswordField txtContrasena;
    public javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
