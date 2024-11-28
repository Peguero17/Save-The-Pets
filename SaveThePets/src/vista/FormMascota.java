package vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * Vista del formolario Mascotas
 * @author Walla Peguero
 */
public class FormMascota extends javax.swing.JFrame {

    /**
     * Creates new form ContactosSQLite
     */
    public FormMascota() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/huella.png")).getImage()); //Imagen para el soft
        this.setTitle("Mascotas");
        this.setLocationRelativeTo(null);
        txtBuscar.requestFocus();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cerrar Ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlMascota2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contactos");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        PnlMascota2.setBackground(new java.awt.Color(15, 15, 15));
        PnlMascota2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Animales Inscritos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18))); // NOI18N
        PnlMascota2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMascotas.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Sexo", "Estado De Vacunacion", "Peso", "Estado De Adopcion", "Raza", "Especie"
            }
        ));
        tblMascotas.setToolTipText("");
        tblMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMascotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMascotas);

        PnlMascota2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 880, 280));

        txtBuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtBuscar.setToolTipText("");
        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        PnlMascota2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 190, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search_32x32.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar contacto");
        PnlMascota2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 90, 40));

        btnActualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Update.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        PnlMascota2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, 70));

        btnAgregar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PnlMascota2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 70));

        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        PnlMascota2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 220, -1));

        btnEditar.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        PnlMascota2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 220, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlMascota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlMascota2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMascotasMouseClicked
        this.btnAgregar.setEnabled(false);
    }//GEN-LAST:event_tblMascotasMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       DatosMascotas Presentar = new DatosMascotas();
       Presentar.setVisible(true);
       Presentar.setLocation(200, 150);
    }//GEN-LAST:event_btnAgregarActionPerformed


 
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
            java.util.logging.Logger.getLogger(PrincipalPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         FlatArcDarkIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMascota().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlMascota2;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblMascotas;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
