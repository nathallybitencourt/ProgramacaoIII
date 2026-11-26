import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao2 extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField t1;
    private JPasswordField p2;
    private JButton b1;

    private void criarComponentesJanela() {
        this.l1 = new JLabel("Usuário: ", JLabel.LEFT);
        this.t1 = new JTextField(15);
        this.l2 = new JLabel("Senha: ", JLabel.LEFT);
        this.p2 = new JPasswordField(15);
        this.p2.setEchoChar('*');
        this.b1 = new JButton("Entrar");
    }

    private void setarAtributosJanela() {
        this.setTitle("Login");
        this.setSize(300, 150);
        this.setLocation(250, 150);
        this.getContentPane().setBackground(new Color(180, 180, 180));
        this.getContentPane().setLayout(new GridLayout(3, 2, 5, 5));
        this.getContentPane().add(this.l1);
        this.getContentPane().add(this.t1);
        this.getContentPane().add(this.l2);
        this.getContentPane().add(this.p2);
        this.getContentPane().add(new JLabel(""));
        this.getContentPane().add(this.b1);
    }

    private void adicionarListeners() {
        this.b1.addActionListener(this);
    }

    public Questao2() {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarListeners();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {
            String usuario = this.t1.getText().trim();
            String senha = new String(this.p2.getPassword());
            if (usuario.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha usuário e senha.", "Login", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + usuario + "!", "Login", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Questao2();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
