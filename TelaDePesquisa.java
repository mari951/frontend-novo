import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDePesquisa extends JFrame
{
    public static  JLabel lblPesquisa;
    public static JTextField txtPesquisa;

    public static JLabel lblId;
    public static JTextField txtId;

    public  static JLabel lblNome;
    public  static JTextField txtNome;

    public  staticJLabel lblEmail;
    public  staticJTextField txtEmail;

    public  staticJButton btnPesquisar;
    public  static JButton btnPrimeiro;
    public  static JButton btnAnterior;
    public  staticJButton btnProximo;
    public  staticJButton btnUltimo;

    public  staticJLabel lblNotificacoes;

    public  staticint tamanhoInputs = 20;

    public static TelaDePesquisa()
    {
        super("Tela de Pesquisa");
        setLayout(new GridLayout(7,1,5,5));

        JPanel linha_lblPesquisa = new JPanel(new GridLayout(1, 2));

        lblPesquisa = new JLabel("Pesquisa:", SwingConstants.CENTER);
        linha_lblPesquisa.add(lblPesquisa);

        btnPesquisar = new JButton("🔍");
        btnPesquisar.setToolTipText("Pesquisar");
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
        linha_id.add(txtId);

        add(linha_id);

        JPanel linha_nome = new JPanel(new GridLayout(1, 2));

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        linha_nome.add(lblNome);

        txtNome = new JTextField(tamanhoInputs);
        linha_nome.add(txtNome);

        add(linha_nome);

        JPanel linha_email = new JPanel(new GridLayout(1, 2));

        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        linha_email.add(lblEmail);

        txtEmail = new JTextField(10);
        linha_email.add(txtEmail);

        add(linha_email);

        JPanel linha_botoes = new JPanel(new GridLayout(1, 4));

        btnPrimeiro = new JButton("<<");
        linha_botoes.add(btnPrimeiro);

        btnAnterior = new JButton("<");
        linha_botoes.add(btnAnterior);

        btnProximo = new JButton(">");
        linha_botoes.add(btnProximo);

        btnUltimo = new JButton(">>");
        linha_botoes.add(btnUltimo);

        add(linha_botoes);

        JPanel linha_notificacoes = new JPanel(new GridLayout(1, 1));

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER);
        linha_notificacoes.add(lblNotificacoes);

        add(linha_notificacoes);

        btnUltimo.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (txtPesquisa.getText().trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("Por favor, digite algo e tente novamente."));
                        txtPesquisa.requestFocus();
                        return;
                    }else{

                    }
                }

            }


                    try {
                        Connection conexao = MySQLConnector.conectar();
                        String strSqlPesquisa = "select * from `db_senac`.`tbl_senac` where `nome` like '%" + txtPesquisa.getText() + "%' or `email` like '%" + txtPesquisa.getText() + "%';";
                        Statement stmSqlPesquisa = conexao.createStatement();
                        ResultSet rstSqlPesquisa = stmSqlPesquisa.executeQuery(strSqlPesquisa);
                       
                       txtPesquisa.addKeyListener(
                         new KeyAdapter() {
                        @override
                        public void keyReleased(KeyEvent e ) {
                        if(txtPesquisa.getText().trim().length() <=0) {
                            if(e.getKeyCode() ==10) {
                            NavegadorDeRegistro.pesquisar
                        }
                        
                    } else {
                        btnPesquisar.setEnabled(false);
                        if(e.getKeyCode() == 10)}
                        limparCampos();
                       }
                       
                    //System.out.println(e.getKeyCode());
                    if(e.)
                        
                    }
                }
            }
        );

        setSize(250, 300);
        setVisible(true);
        txtPesquisa.requestFocus();
    }

    private static boolean ntfCampoVazio() {
    }

    public static boolean ntfCampoVazio() {
        if (txtPesquisa.getText().trim().length() <= 0) {
            lblNotificacoes.setText(setHtmlFormat("Ops! Campo vazio. Por favor, digite algo e tente novamente."));
            txtPesquisa.requestFocus();
            return true;
        } else {
            return false;
        }
}
public static void limparCampos(String notificacao) { //limparCampos("")

        btnPesquisar.setEnabled(false);
        txtld.setText("");
        txNome.setText("");
        txtEmail.setTextext(" ");
        btnPrimeiro.setEnable(false);
        btnAnterior.setEnable(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        if (notificacao.equals("") == false) {

        lblNotificacoes.setText("Digite algo para pesquisar.");
     }
    }
     public static String setHtmlFormat(String strTexto) {
     return " <html>body>"+strTexto+"</body<>/html>";
     }

        TelaDePesquisa appTelaDePesquisa = new TelaDePesquisa();
        appTelaDePesquisa.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}