import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import java.sql.*;

public class TelaDePesquisa extends JFrame {
    public static JLabel lblPesquisa;  documentacao de pesquisa,linha_inputPesquisa
    public static JTextField txtPesquisa;

    public static JLabel lblId;
    public static JTextField txtId;

    public static JLabel lblNome;
    public static JTextField txtNome; documentacao de nome,linha de nome 

    public static JLabel lblEmail;
    public static JTextField txtEmail;documentacao de email 

    public static JButton btnPesquisar; inicio pesquisar 
    public static JButton btnPrimeiro; primeira linha 
    public static JButton btnAnterior;linha anterior 
    public static JButton btnProximo;linha do proximo 
    public static JButton btnUltimo;linha do ultimo da tela de pesquisa 

    public static JLabel lblNotificacoes;

    public static int tamanhoInputs = 20;
    public static String txtUsuario = "";

    public TelaDePesquisa() tela de pesquisa inicio da linha 
    {
        super("Tela de Pesquisa");
        setLayout(new GridLayout(7,1,5,5));

        JPanel linha_lblPesquisa = new JPanel(new GridLayout(1, 2));

        lblPesquisa = new JLabel("Pesquisa:", SwingConstants.CENTER);
        linha_lblPesquisa.add(lblPesquisa);

        btnPesquisar = new JButton("🔍"); inicio da bnt pesquisa documentacao 
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.setEnabled(false);
        linha_lblPesquisa.add(btnPesquisar);

        add(linha_lblPesquisa);

        JPanel linha_inputPesquisa = new JPanel(new GridLayout(1, 1));

        txtPesquisa = new JTextField(tamanhoInputs);
        linha_inputPesquisa.add(txtPesquisa);

        add(linha_inputPesquisa);

        JPanel linha_id = new JPanel(new GridLayout(1, 2));

        lblId = new JLabel("Id:", SwingConstants.RIGHT);
        linha_id.add(lblId);

        txtId = new JTextField(tamanhoInputs);
        txtId.setEnabled(false);
        linha_id.add(txtId);

        add(linha_id);

        JPanel linha_nome = new JPanel(new GridLayout(1, 2)); documentacao numero de linhas 

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        linha_nome.add(lblNome);

        txtNome = new JTextField(tamanhoInputs);
        txtNome.setEditable(false);
        linha_nome.add(txtNome);

        add(linha_nome);

        JPanel linha_email = new JPanel(new GridLayout(1, 2));documentacao numero de linhas 

        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        linha_email.add(lblEmail); linha de email

        txtEmail = new JTextField(10); documentacao de linha de email 
        txtEmail.setEditable(false);
        linha_email.add(txtEmail);

        add(linha_email);

        JPanel linha_botoes = new JPanel(new GridLayout(1, 4)); numero de linhas e botoes 

        btnPrimeiro = new JButton("<<"); linha primeiro botoes 
        btnPrimeiro.setEnabled(false); linha primeiro false 
        linha_botoes.add(btnPrimeiro); adiciona linha botoes primeiro 

        btnAnterior = new JButton("<"); linha anterior 
        btnAnterior.setEnabled(false); linha anterior false 
        linha_botoes.add(btnAnterior); linha anterior botoes 

        btnProximo = new JButton(">"); linha proximo 
        btnProximo.setEnabled(false); linha proximo false 
        linha_botoes.add(btnProximo); 

        btnUltimo = new JButton(">>"); linha ultimo 
        btnUltimo.setEnabled(false); linha ultimo false 
        linha_botoes.add(btnUltimo); linha ultimo botoes 

        add(linha_botoes);

        JPanel linha_notificacoes = new JPanel(new GridLayout(1, 1)); numero de linhas botoes 

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER); linha de notificacoes 
        linha_notificacoes.add(lblNotificacoes);

        add(linha_notificacoes);

        btnPesquisar.addActionListener( linha de pesquisar 
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (txtPesquisa.getText().trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("Por favor, digite algo e tente novamente.")); linha de digitar por favor digite algo e tente nomamente 
                        txtPesquisa.requestFocus();
                        return;
                    } else {
                        NavegadorDeRegistro.pesquisar(); navegador de pesquisa pesquisa inicio 
                    }
                }
            }
        );

        btnPrimeiro.addActionListener( linha primeiro 
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.primeiroRegistro();
                    }
                }
            }
        );

        btnAnterior.addActionListener( linha anterior 
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.registroAnterior();
                    }
                }
            }
        );

        btnProximo.addActionListener( linha do proximo documentacao 
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.proximoRegistro();
                    }
                }
            }
        );

        btnUltimo.addActionListener( linha do ultimo 
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.ultimoRegistro();
                    }
                }
            }
        );

        txtPesquisa.addKeyListener( linha de pesquisa 
            new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    if (txtPesquisa.getText().trim().equals(txtUsuario) == false && txtPesquisa.getText().trim().length() > 0) {
                        if (e.getKeyCode() == 10) {
                            NavegadorDeRegistro.pesquisar();
                        }
                    } else {
                        limparCampos("Digite algo para continuar.");
                    }
                    btnPesquisar.setEnabled(true);
                }
            }
        );

        setSize(250, 300); numero de linhas 
        setVisible(true); numero de linhas verdadeiro 
        txtPesquisa.requestFocus();
    }

    public static boolean ntfCampoVazio() { numero de linhas de campo vazio 
        if (txtPesquisa.getText().trim().length() <= 0) {
            lblNotificacoes.setText(setHtmlFormat("Ops! Campo vazio. Por favor, digite algo e tente novamente."));
            txtPesquisa.requestFocus();
            return true;
        } else {
            return false;
        }
    }

    public static void limparCampos(String notificacao) { // limparCampos("") 
        btnPesquisar.setEnabled(false);numero de linha falso 
        txtId.setText("");
        txtNome.setText(""); linha de nome 
        txtEmail.setText(""); linha de email 
        btnPrimeiro.setEnabled(false); linha primeiro false 
        btnAnterior.setEnabled(false); linha anterior falso 
        btnProximo.setEnabled(false); linha do proximo falso 
        btnUltimo.setEnabled(false); linha do ultimo falso 
        if (notificacao.trim().length() > 0) { 
            lblNotificacoes.setText(setHtmlFormat(notificacao));
        }
    }

    public static String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>";
    }

    public static void main(String[] args) {
        TelaDePesquisa appTelaDePesquisa = new TelaDePesquisa();
        appTelaDePesquisa.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}