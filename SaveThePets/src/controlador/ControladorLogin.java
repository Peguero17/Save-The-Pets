package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.LoginDAO;
import modelo.Login;
import vista.LoginV;
import vista.PantallaPrincipal;

/**
 * Clase controladora para las operaciones de inicio de sesión.
 * @author WilfredoFC
 */
public class ControladorLogin implements ActionListener {
    LoginDAO dao = new LoginDAO();
    Login l = new Login();
    LoginV loginv = new LoginV();

    /**
     * Constructor para la clase ControladorLogin.
     * @param l El objeto LoginV (vista).
     */
    public ControladorLogin(LoginV l) {
        this.loginv = l;
        this.loginv.btnIngresar.addActionListener(this);
    }
    
    /**
     * Limpia los campos de usuario y contraseña en el formulario de inicio de sesión.
     * @param l El objeto LoginV (vista) que contiene los campos.
     */
    private void limpiarCampos(LoginV l) {
        l.txtUsuario.setText("");
        l.txtClave.setText("");
        l.txtUsuario.requestFocus();
    }
     
    /**
     * Valida que los campos de usuario y contraseña no estén vacíos.
     * @param l El objeto LoginV (vista) que contiene los campos.
     * @return True si los campos son válidos, false en caso contrario.
     */
    private boolean validarCampos(LoginV l) {
        if (l.txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "Por favor, ingresa tu usuario!", "Error!", JOptionPane.ERROR_MESSAGE);
            l.txtUsuario.requestFocus();
            return false;
        }
        if (l.txtClave.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(loginv, "Por favor, ingresa tu clave!", "Error!", JOptionPane.ERROR_MESSAGE);
            l.txtClave.requestFocus();
            return false;
        }
        return true;
    }
     
    /**
     * Intenta iniciar sesión al usuario usando las credenciales proporcionadas.
     * @param usuario El nombre de usuario.
     * @param clave La contraseña.
     * @param login El objeto LoginV (vista).
     * @return True si el inicio de sesión es exitoso, false en caso contrario.
     */
    public boolean AccionarLogin(String usuario, String clave, LoginV login) {
        if (validarCampos(login)) {
            //Campos validados!
            try {
                //Verificar si los datos ya existen
                if (dao.realizarLogin(usuario, clave)) {                   
                    login.setVisible(false);
                    //Ingresando al formulario
                    PantallaPrincipal v = new PantallaPrincipal();
                    ControladorPantallaPrincipal control = new ControladorPantallaPrincipal(v);
                    v.setVisible(true);
                    v.setLocationRelativeTo(null);
                    return true;
                } else{
                    JOptionPane.showMessageDialog(login,"Error al tratar de ingresar.\n El usuario o la clave estan incorrectos!", "Error!",JOptionPane.ERROR_MESSAGE);
                    limpiarCampos(login);
                    return false;
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(loginv, "Error al tratar de ingresar: " + e, "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
        return false;
    }
     
     
    /**
     * Maneja los eventos de clic de botón.
     * @param e El evento ActionEvent.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginv.btnIngresar) {
            String usuario = loginv.txtUsuario.getText();
            String clave   = loginv.txtClave.getText();
            AccionarLogin(usuario, clave, loginv);
        }
    }
}