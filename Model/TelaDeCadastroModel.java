package Model;

public class TelaDeCadastroModel {
    
}
package view;
import controller
import model.MySQLConnector;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeCadastro extends JFrame
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
                public void actionPerformed(ActionEvent event) {
                    try {
                        Connection conexao = MySQLConnector.conectar();
                        String strSqlCadastro = "select * from `db_senac`.`tbl_senac` where `email` = '" + txtLogin.getText() + "' and `senha` = '" + String.valueOf(txtSenha.getPassword()) + "';";
                        Statement stmSqlCadastrStatement = conexao.createStatement();
                        ResultSet rstSqlEmail = stmSqlEmail.executeQuery(strSqlEmail);
                        if (rstSqlEmail.next()) {

                            lblNotificacoes.setText(setHtmlFormat("Ops!Já existe um usuario utilizado este email.Por favor,digite outro email e tente novamente."));
                        } else {
                            //lblNotificacoes.setText(setHtmlFormat("Login   ")

                            
                            String strSqlCadastrar = "insert into 'db_senac','tbl_senac'(`nome`,`email`,`senha`)values(´"+txtNome.getText()+",`")+txtEmail.getText()+
                            
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




        

    

    




    
    


    
