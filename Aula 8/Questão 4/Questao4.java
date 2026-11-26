import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao4 extends JFrame implements ActionListener {
    private JLabel labelValor;
    private JButton botaoMais, botaoMenos, botaoZerar;
    private int valor = 0;

    private void criarComponentesJanela() {
        this.labelValor = new JLabel("0", JLabel.CENTER);
        this.labelValor.setFont(new Font("Arial", Font.BOLD, 30));
        this.botaoMais = new JButton("+1");
        this.botaoMenos = new JButton("-1");
        this.botaoZerar = new JButton("Zerar");
    }

    private void setarAtributosJanela() {
        this.setTitle("Contador");
        this.setSize(300, 130);
        this.setLocation(250, 150);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.getContentPane().add(this.labelValor);
        this.getContentPane().add(this.botaoMais);
        this.getContentPane().add(this.botaoMenos);
        this.getContentPane().add(this.botaoZerar);
    }

    private void adicionarListeners() {
        this.botaoMais.addActionListener(this);
        this.botaoMenos.addActionListener(this);
        this.botaoZerar.addActionListener(this);
    }

    public Questao4() {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarListeners();
        this.atualizar();
    }

    private void atualizar() {
        this.labelValor.setText("" + this.valor);
        this.botaoMenos.setEnabled(this.valor != 0);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botaoMais) {
            this.valor++;
        } else if (e.getSource() == this.botaoMenos) {
            if (this.valor > 0) {
                this.valor--;
            }
        } else if (e.getSource() == this.botaoZerar) {
            this.valor = 0;
        }
        this.atualizar();
    }

    public static void main(String[] args) {
        JFrame janela = new Questao4();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
