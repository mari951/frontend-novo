
package view;
import controller
import model.MySQLConnector;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeCadastroModel {
public static boolean cadastrar(String nome,String email,String senha) }
try {
    Connection conexao = MySQLConnector.conectar();
    String strSqlEmail = "select*from'db_senac','tbl_senac'where 'email'='"+email+"';";
    Statement stmSqlEmail=conexao.createSteatement();
    ResultSet rstSqlEmail = stmSqlEmail.executeQuery=stmSqlEmail.executeQuery(strSqlEmail);
    if(rstSqlEmail.next()) {
        return false;
        //lblNotificacoes.setText(setHtmlFortmat("Ops!Já existe um usuario utlizado este email.Por favor,digite um usuario utlizado este email.Por favor,digite outro email e tente novamente."))


{
    private final JLabel lblNome;
    private final JTextField JTextFieldNome;


    private final JLabel lblemail;
    private final JTextField lblEmail;

    private final JLabel lblSenha;
    private final JPasswordField txtSenha;

    private final JButton btncadastrar;

    private final JLabel lblNotificacao;

    public TeladeCadastro() {
    
    
    super("Tela de cadastro ");
    setLayout(new Layout grade (4,2,5,5));

    lblNome=JLabel lblNome;
    add(lblNome);
     
    lblEmail=JLabel lblEmail;
    add(lblEmail);

    txtEmail=new JLabel lblEmail;
    add(lblEmail); 


    lblSenha = new JLabel("Senha:");
    add(lblSenha);

    txtSenha = new JPasswordField(10);
    add(txtSenha);

    btnEntrar = new JButton("Entrar");
    add(btnEntrar); 


         btnEntrar.addActionListener(
            new ActionListener() {
                @Override
                public static boolean cadastrar( {
                    try {
                        Connection conexao = MySQLConnector.conectar();
                        String strSqlCadastro = "insert into `db_senac`.`tbl_senac`('nome','email') = '" + email.getText() + "' and `senha` = '" + String.valueOf(txtSenha.getPassword()) + "';";
                        Statement stmSqlCadastrStatement = conexao.createStatement();
                        ResultSet rstSqlEmail = stmSqlEmail.executeQuery(strSqlEmail);
                        if (rstSqlEmail.next()) {
                            lblNotificacoes.setText(setHtmlFormat("Ops!Já existe um usuario utilizado este email.Por favor,digite outro email e tente novamente."));
                        } else {
                            lblNotificacoes.setText(setHtmlFormat("Login e/ou senha não encontrado! Por favor, verifique e tente novamente."));
                            String strSqlCadastrar = "insert into "db_senac`.`tbl_senac`,
                        }
                        stmSqlLogin.close();
                    } catch (Exception e) {
                        lblNotificacoes.setText(setHtmlFormat("Não foi possível encontrar o login e/ou senha digitados/informados! Por favor, verifique e tente novamente. Veja o erro: " + e));
                    }
                }
            }
        );

        setSize(150, 200);
        setVisible(true);

    }

    private String setHtmlFormat(String strTexto) {
        return "<html><body>" + strTexto + "</body></html>";
    }
            


    public static void main(String[] args) {
        TelaDeCadastro appTelaDeCadastro = new TelaDeCadastro();
            appTelaDeCadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}




        

    

    




    
    


    
