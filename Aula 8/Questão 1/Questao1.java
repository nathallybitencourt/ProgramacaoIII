import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao1 extends JFrame implements ActionListener {
    private JLabel label1;
    private JButton botaoFechar;

    private void criarComponentesJanela() {
        this.label1 = new JLabel("Seja bem-vindo ao sistema!", JLabel.CENTER);
        this.label1.setFont(new Font("Arial", Font.BOLD, 18));
        this.botaoFechar = new JButton("Fechar");
        this.botaoFechar.setToolTipText("Clique aqui para fechar a janela");
    }

    private void setarAtributosJanela() {
        this.setTitle("Tela de Boas-vindas");
        this.setSize(350, 130);
        this.setLocation(250, 150);
        this.setResizable(false);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.botaoFechar);
    }

    private void adicionarListeners() {
        this.botaoFechar.addActionListener(this);
    }

    public Questao1() {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarListeners();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botaoFechar) {
            this.dispose();
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Questao1();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
