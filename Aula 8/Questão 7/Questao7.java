import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Questao7 extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JTextField t1;
    private JMenu menuArquivo, menuAbrir, menuAjuda;
    private JMenuItem miNovo, miAbrirTexto, miAbrirImagem, miSair, miSobre;

    public Questao7() {
        this.setBounds(150, 50, 480, 280);
        this.setTitle("Menu de Aplicação");
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.t1 = new JTextField(30);
        this.t1.setEditable(false);
        this.getContentPane().add(this.t1);

        this.menuBar = new JMenuBar();
        this.setJMenuBar(this.menuBar);

        this.menuArquivo = new JMenu("Arquivo");
        this.miNovo = new JMenuItem("Novo");
        this.menuAbrir = new JMenu("Abrir");
        this.miAbrirTexto = new JMenuItem("Arquivo de texto");
        this.miAbrirImagem = new JMenuItem("Imagem");
        this.miSair = new JMenuItem("Sair");

        this.menuArquivo.add(this.miNovo);
        this.menuAbrir.add(this.miAbrirTexto);
        this.menuAbrir.add(this.miAbrirImagem);
        this.menuArquivo.add(this.menuAbrir);
        this.menuArquivo.add(this.miSair);

        this.menuAjuda = new JMenu("Ajuda");
        this.miSobre = new JMenuItem("Sobre");
        this.menuAjuda.add(this.miSobre);

        this.menuBar.add(this.menuArquivo);
        this.menuBar.add(this.menuAjuda);

        this.miNovo.addActionListener(this);
        this.miAbrirTexto.addActionListener(this);
        this.miAbrirImagem.addActionListener(this);
        this.miSair.addActionListener(this);
        this.miSobre.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.miNovo) {
            this.t1.setText("Escolhido o item Novo");
        } else if (e.getSource() == this.miAbrirTexto) {
            this.t1.setText("Escolhido o item Abrir > Arquivo de texto");
        } else if (e.getSource() == this.miAbrirImagem) {
            this.t1.setText("Escolhido o item Abrir > Imagem");
        } else if (e.getSource() == this.miSobre) {
            this.t1.setText("Escolhido o item Sobre");
        } else if (e.getSource() == this.miSair) {
            this.t1.setText("Escolhido o item Sair");
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?",
                    "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else {
            this.t1.setText("Item escolhido inválido");
        }
    }

    public static void main(String[] args) {
        JFrame janela = new Questao7();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
