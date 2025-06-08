import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginInterfaz extends JFrame {
    private boolean loginExitoso = false;

    public boolean isLoginExitoso() {
        return loginExitoso;
    }
    public LoginInterfaz() {
        // Configuración de la ventana
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        // Componentes de la interfaz
        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField();
        JLabel lblContrasena = new JLabel("Contraseña:");
        JPasswordField txtContrasena = new JPasswordField();
        JButton btnLogin = new JButton("Iniciar sesión");
        JLabel lblMensaje = new JLabel("", SwingConstants.CENTER);

        // Añadir componentes a la ventana
        add(lblUsuario);
        add(txtUsuario);
        add(lblContrasena);
        add(txtContrasena);
        add(btnLogin);
        add(lblMensaje);

        // Acción del botón
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());

                // Validación simple
                if (usuario.equals("admin") && contrasena.equals("1234")) {
                    lblMensaje.setText("¡Login exitoso!");
                    lblMensaje.setForeground(Color.GREEN);
                } else {
                    lblMensaje.setText("Usuario o contraseña incorrectos.");
                    lblMensaje.setForeground(Color.RED);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginInterfaz login = new LoginInterfaz();
            login.setVisible(true);
        });
    }
}