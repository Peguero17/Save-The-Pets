/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Walla Peguero
 */
public class DatosMascotas extends javax.swing.JFrame {

    /**
     * Creates new form DatosMascotas
     */
    public DatosMascotas() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/huella.png")).getImage()); //Imagen para el soft
        this.setTitle("Agregar datos mascotas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cerrar ventana 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMascota = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbVacunacion = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        cbAdopcion = new javax.swing.JComboBox<>();
        txtRaza = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMascota.setBackground(new java.awt.Color(15, 15, 15));
        pnlMascota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Mascota", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlMascota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(15, 15, 15));
        txtID.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtID.setToolTipText("");
        txtID.setBorder(null);
        pnlMascota.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 200, 20));

        txtNombre.setBackground(new java.awt.Color(15, 15, 15));
        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setToolTipText("");
        txtNombre.setBorder(null);
        pnlMascota.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 30));

        btnGuardar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_24x24.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar datos del contacto");
        pnlMascota.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 150, 47));

        btnCancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancel_24x24.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlMascota.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 150, 45));

        cbVacunacion.setBackground(new java.awt.Color(15, 15, 15));
        cbVacunacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbVacunacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Vacunado ", "No Vacunado" }));
        cbVacunacion.setBorder(null);
        pnlMascota.add(cbVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 200, 30));

        cbSexo.setBackground(new java.awt.Color(15, 15, 15));
        cbSexo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Macho", "Hembra", "Hermafrodita" }));
        cbSexo.setBorder(null);
        pnlMascota.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, 30));

        cbAdopcion.setBackground(new java.awt.Color(15, 15, 15));
        cbAdopcion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cbAdopcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Adoptado", "No Adoptado" }));
        cbAdopcion.setBorder(null);
        pnlMascota.add(cbAdopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 30));

        txtRaza.setBackground(new java.awt.Color(15, 15, 15));
        txtRaza.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtRaza.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRaza.setToolTipText("");
        txtRaza.setBorder(null);
        pnlMascota.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 200, 30));

        txtPeso.setBackground(new java.awt.Color(15, 15, 15));
        txtPeso.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPeso.setToolTipText("");
        txtPeso.setBorder(null);
        pnlMascota.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, 30));

        txtEspecie.setBackground(new java.awt.Color(15, 15, 15));
        txtEspecie.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtEspecie.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEspecie.setToolTipText("");
        txtEspecie.setBorder(null);
        pnlMascota.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estado de");
        pnlMascota.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 70, 30));

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 200, 10));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID/Clave");
        pnlMascota.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 70, 30));

        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 200, 10));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        pnlMascota.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, 30));

        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 10));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Especie");
        pnlMascota.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 60, 30));

        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 10));

        jSeparator5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 200, 10));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Raza");
        pnlMascota.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 40, 30));

        jSeparator6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 200, 10));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");
        pnlMascota.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 40, 30));

        jSeparator7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 200, 10));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Adopcion");
        pnlMascota.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 70, 20));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Peso");
        pnlMascota.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 40, 30));

        jSeparator8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pnlMascota.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, 10));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado de");
        pnlMascota.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vacunacion");
        pnlMascota.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DatosMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatArcDarkIJTheme.setup();
                new DatosMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbAdopcion;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cbVacunacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel pnlMascota;
    public javax.swing.JTextField txtEspecie;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
