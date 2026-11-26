import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao5 extends JFrame implements ActionListener {
    private JLabel labelNome, labelEmail, labelTelefone;
    private JTextField tNome, tEmail, tTelefone;
    private JButton botaoSalvar, botaoLimpar;
    private JPanel painelCampos, painelBotoes;

    private void criarComponentesJanela() {
        this.labelNome = new JLabel("Nome: ");
        this.tNome = new JTextField(20);
        this.labelEmail = new JLabel("E-mail: ");
        this.tEmail = new JTextField(20);
        this.labelTelefone = new JLabel("Telefone: ");
        this.tTelefone = new JTextField(20);
        this.botaoSalvar = new JButton("Salvar");
        this.botaoLimpar = new JButton("Limpar");

        this.painelCampos = new JPanel(new GridLayout(3, 2, 5, 5));
        this.painelCampos.add(this.labelNome);
        this.painelCampos.add(this.tNome);
        this.painelCampos.add(this.labelEmail);
        this.painelCampos.add(this.tEmail);
        this.painelCampos.add(this.labelTelefone);
        this.painelCampos.add(this.tTelefone);

        this.painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.painelBotoes.add(this.botaoSalvar);
        this.painelBotoes.add(this.botaoLimpar);
    }

    private void setarAtributosJanela() {
        this.setTitle("Formulário de Cadastro");
        this.setSize(380, 200);
        this.setLocation(250, 150);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(this.painelCampos, BorderLayout.CENTER);
        this.getContentPane().add(this.painelBotoes, BorderLayout.SOUTH);
    }

    private void adicionarListeners() {
        this.botaoSalvar.addActionListener(this);
        this.botaoLimpar.addActionListener(this);
    }

    public Questao5() {
        this.criarComponentesJanela();
        this.setarAtributosJanela();
        this.adicionarListeners();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botaoSalvar) {
            String nome = this.tNome.getText().trim();
            String email = this.tEmail.getText().trim();
            String telefone = this.tTelefone.getText().trim();

            if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "Cadastro", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Nome: " + nome + "\nE-mail: " + email + "\nTelefone: " + telefone,
                        "Dados salvos", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == this.botaoLimpar) {
            this.tNome.setText("");
            this.tEmail.setText("");
            this.tTelefone.setText("");
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Questao5();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
