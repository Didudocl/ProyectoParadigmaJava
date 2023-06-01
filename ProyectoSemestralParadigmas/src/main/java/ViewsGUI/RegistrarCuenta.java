package ViewsGUI;

import Controllers.Controller;
import Models.Usuario;


public class RegistrarCuenta extends javax.swing.JFrame {

    Controller controler = new Controller();
    
    public RegistrarCuenta() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtTituloCrear = new javax.swing.JLabel();
        txtPreguntaRegistro = new javax.swing.JLabel();
        btnIngresa1 = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JLabel();
        txtRut = new javax.swing.JLabel();
        txtClave = new javax.swing.JLabel();
        txtFieldNombreUsuario = new javax.swing.JTextField();
        txtFieldNombres = new javax.swing.JTextField();
        txtFieldApellidoPaterno = new javax.swing.JTextField();
        txtFieldApellidoMaterno = new javax.swing.JTextField();
        txtFieldRut = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        passFieldClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 189, 89));

        jPanel1.setBackground(new java.awt.Color(255, 189, 89));

        txtTituloCrear.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        txtTituloCrear.setForeground(new java.awt.Color(0, 0, 0));
        txtTituloCrear.setText("Crea una cuenta");

        txtPreguntaRegistro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPreguntaRegistro.setForeground(new java.awt.Color(0, 0, 0));
        txtPreguntaRegistro.setText("¿Ya estás registrado?");

        btnIngresa1.setBackground(new java.awt.Color(255, 189, 89));
        btnIngresa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIngresa1.setForeground(new java.awt.Color(0, 0, 153));
        btnIngresa1.setText("Ingresa");
        btnIngresa1.setBorder(null);
        btnIngresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresa1ActionPerformed(evt);
            }
        });

        txtNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreUsuario.setText("NOMBRE USUARIO");

        txtNombres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setText("NOMBRES");

        txtApellidoPaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoPaterno.setText("APELLIDO PATERNO");

        txtApellidoMaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoMaterno.setText("APELLIDO MATERNO");

        txtRut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRut.setForeground(new java.awt.Color(0, 0, 0));
        txtRut.setText("RUT");

        txtClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtClave.setForeground(new java.awt.Color(0, 0, 0));
        txtClave.setText("CLAVE");

        txtFieldNombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFieldNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtFieldNombreUsuario.setBorder(null);
        txtFieldNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreUsuarioActionPerformed(evt);
            }
        });

        txtFieldNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldNombres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFieldNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtFieldNombres.setBorder(null);

        txtFieldApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldApellidoPaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFieldApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtFieldApellidoPaterno.setBorder(null);

        txtFieldApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldApellidoMaterno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFieldApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtFieldApellidoMaterno.setBorder(null);

        txtFieldRut.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldRut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFieldRut.setForeground(new java.awt.Color(0, 0, 0));
        txtFieldRut.setBorder(null);

        btnRegistrarse.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        passFieldClave.setBackground(new java.awt.Color(255, 255, 255));
        passFieldClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passFieldClave.setForeground(new java.awt.Color(0, 0, 0));
        passFieldClave.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres)
                            .addComponent(txtFieldNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtApellidoMaterno)
                            .addComponent(txtRut)
                            .addComponent(txtClave)
                            .addComponent(txtNombreUsuario)
                            .addComponent(txtFieldNombreUsuario)
                            .addComponent(txtApellidoPaterno)
                            .addComponent(txtFieldApellidoPaterno)
                            .addComponent(txtFieldApellidoMaterno)
                            .addComponent(txtFieldRut)
                            .addComponent(passFieldClave)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(txtPreguntaRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIngresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTituloCrear)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(txtTituloCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreguntaRegistro)
                    .addComponent(btnIngresa1))
                .addGap(29, 29, 29)
                .addComponent(txtNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidoPaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidoMaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Apartado para almacenar el nombre de usuario
    private void txtFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreUsuarioActionPerformed
        Usuario user = new Usuario();
        user.setNombreUsuario(this.toString());
    }//GEN-LAST:event_txtFieldNombreUsuarioActionPerformed

    //Boton para redireccionar a Ingresar Cuenta
    private void btnIngresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresa1ActionPerformed
        
        IngresarCuenta princ = new IngresarCuenta();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        this.dispose(); //sirve para cerrar la ventana
    }//GEN-LAST:event_btnIngresa1ActionPerformed

    //Boton para redireccionar a IngresarCuenta + pasar datos ingresador sobre el usuario
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        
        IngresarCuenta princ = new IngresarCuenta();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        String nombreUsuario = txtFieldNombreUsuario.getText();
        String nombres =  txtFieldNombres.getText(); 
        String apellidoPaterno = txtFieldApellidoPaterno.getText();
        String apellidoMaterno = txtFieldApellidoMaterno.getText();
        String rut = txtFieldRut.getText();
        String clave = passFieldClave.getText();
        
        controler.Registrarse(nombreUsuario, nombres, apellidoPaterno, 
                              apellidoMaterno, rut, clave);
        
        this.dispose();

    }//GEN-LAST:event_btnRegistrarseActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresa1;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passFieldClave;
    private javax.swing.JLabel txtApellidoMaterno;
    private javax.swing.JLabel txtApellidoPaterno;
    private javax.swing.JLabel txtClave;
    private javax.swing.JTextField txtFieldApellidoMaterno;
    private javax.swing.JTextField txtFieldApellidoPaterno;
    private javax.swing.JTextField txtFieldNombreUsuario;
    private javax.swing.JTextField txtFieldNombres;
    private javax.swing.JTextField txtFieldRut;
    private javax.swing.JLabel txtNombreUsuario;
    private javax.swing.JLabel txtNombres;
    private javax.swing.JLabel txtPreguntaRegistro;
    private javax.swing.JLabel txtRut;
    private javax.swing.JLabel txtTituloCrear;
    // End of variables declaration//GEN-END:variables
}
