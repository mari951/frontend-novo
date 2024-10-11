

package Model;

public class TelaDePesquisaModel {
    
}public static void pesquisarModel(String textoPesquisa) {

 try{
Connection conexao = MySqlConector.conectar();
String strSqlPesquisa = "select*from'db_senac'where'nome'like'%"+textoPesquisa+"%'or'email'like'%+"+textoPesquisa+"%' order by 'id'asc;";
Statemente stmSqlPesquisa = conexao .createSteatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
Resultset rstSqlPesquisa = stmSqlPesquisa.executeQuery(strSqlPesquisa);
if(rstSqlPesquisa.next()) {
rstSqlPesquisa.last();
int rowNumbers = rstSqlPesquisa.getRow();
rstsqlPesquisa.first();

stmSqlPesquisa.close();
TelaDePesquisaController.notificarUsuario("Legal!Foi(foram)encontrado(s)"+rowNumbers+"resultado(s),");

TelaDePesquisaController.preencherCampos (rsSqlPesquisa.getString("id"),rstSqlPesquisa.getString("nome"),rstSqlPesquisa.getString("email"));

TelaDePesquisaController.desabilitarPesquisa();
if(rowNumbers > 1) {
    TelaDePesquisaController.habilitarAvancar();

}
} else{
TelaDePesquisaController.registrarPesquisa();
TelaDePesquisaController.desabilitarPesquisa();
stmSqlPesquisa.close();
TelaDePesquisaController.notificarUsuario("Poxa vida!Não foram encontrados resultados para:\"" + textoPesquisa+"\".");

}
 }
 catch(exception e) {
System.err.println("erro:" + e);
TelaDePesquisaController.notificarUsuario("Não foi possível prosseguir com a pesquisa!Por favor,verifique e tente novamente.");


 }
}
public static void proximoRegistroModel(String textoPesquisa) {
    try {
    Connection conexao = MySqlConector.conectar();
    String strSqlPesquisa= "select*from'db_senac'where'nome'like'%"+textoPesquisa+"%'or'email'like'%+"+textoPesquisa+"%' order by 'id'asc;";
    Statemente stmSqlPesquisa = conexao.createSteatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    ResultSet rstSqlPesquisa = StmSqlPesquisa.executeQuery(strSqlPesquisa);
    if(rstsqlPesquisa.next()) {
        rstSqlPesquisa.last();
        int nowNumbers = rstSqlPesquisa.getRow();
        rstSqlPesquisa.first();

        TelaDePesquisaController.notificarUsuario("Legal!Foi(foram)encontrados(s)"+rowNumbers+"resultado(s).");

        TelaDePesquisaController.preencherCampos(rstSqlPesquisa.getString
        ("id"),rsSqlPesquisa.getString("nome"),rstSqlPesquisa.getString("email"));

    
        
        
        
        
        
        
        
        
        
        
        TelaDePesquisaController.preencherCampos(rstSqlPesquisa.getString("id"),rstSqlPesquisa





        TelaDePesquisaController.registrarPesquisa();
         TelaDePesquisaController.desabilitar
;



    


      public static 
        super("Tela de Pesquisa");
        setLayout(new GridLayout(7,1,5,5));

        JPanel linha_lblPesquisa = new JPanel(new GridLayout(1, 2));

        lblPesquisa = new JLabel("Pesquisa:", SwingConstants.CENTER);
        linha_lblPesquisa.add(lblPesquisa);

        btnPesquisar = new JButton("🔍");
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

        JPanel linha_nome = new JPanel(new GridLayout(1, 2));

        lblNome = new JLabel("Nome:", SwingConstants.RIGHT);
        linha_nome.add(lblNome);

        txtNome = new JTextField(tamanhoInputs);
        txtNome.setEditable(false);
        linha_nome.add(txtNome);

        add(linha_nome);

        JPanel linha_email = new JPanel(new GridLayout(1, 2));

        lblEmail = new JLabel("Email:", SwingConstants.RIGHT);
        linha_email.add(lblEmail);

        txtEmail = new JTextField(10);
        txtEmail.setEditable(false);
        linha_email.add(txtEmail);

        add(linha_email);

        JPanel linha_botoes = new JPanel(new GridLayout(1, 4));

        btnPrimeiro = new JButton("<<");
        btnPrimeiro.setEnabled(false);
        linha_botoes.add(btnPrimeiro);

        btnAnterior = new JButton("<");
        btnAnterior.setEnabled(false);
        linha_botoes.add(btnAnterior);

        btnProximo = new JButton(">");
        btnProximo.setEnabled(false);
        linha_botoes.add(btnProximo);

        btnUltimo = new JButton(">>");
        btnUltimo.setEnabled(false);
        linha_botoes.add(btnUltimo);

        add(linha_botoes);

        JPanel linha_notificacoes = new JPanel(new GridLayout(1, 1));

        lblNotificacoes = new JLabel("Notificações", SwingConstants.CENTER);
        linha_notificacoes.add(lblNotificacoes);

        add(linha_notificacoes);

        btnPesquisar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (txtPesquisa.getText().trim().length() <= 0) {
                        lblNotificacoes.setText(setHtmlFormat("Por favor, digite algo e tente novamente."));
                        txtPesquisa.requestFocus();
                        return;
                    } else {
                        NavegadorDeRegistro.pesquisar();
                    }
                }
            }
        );

        btnPrimeiro.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.primeiroRegistro();
                    }
                }
            }
        );

        btnAnterior.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.registroAnterior();
                    }
                }
            }
        );

        btnProximo.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.proximoRegistro();
                    }
                }
            }
        );

        btnUltimo.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    if (ntfCampoVazio() == false) {
                        NavegadorDeRegistro.ultimoRegistro();
                    }
                }
            }
        );

        txtPesquisa.addKeyListener(
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

        setSize(250, 300);
        ImageIcon img = new ImageIcon("./senac-logo.png");
        setIconImage(img.getImage());
        setVisible(true);
        txtPesquisa.requestFocus();
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

    public static void limparCampos(String notificacao) { // limparCampos("")
        btnPesquisar.setEnabled(false);
        txtId.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
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