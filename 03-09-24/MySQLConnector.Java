import java.sql.*;

public class MySQLConnector (
public static Connection conenectar() {

    String status = "Nada aconteceu ainda...";
    String mysqlHost = "127.0.0.1";
    String mysqlDb = "db_senac";
    String mysqlUser = "root";
    String mysqlPassword = "senac002";
    String mysqlPort = "3306";
    String mysqlUrl = "jdc:mysql://" + mysqlHost + ":"+mysqlPort + "/" + mysqlDb + "?user=" + mysqlUser + "&password=" + mysqlPassword;
    Connection conn = null;

try {
    class.forName("com.mysql.cj.jdbc.Driver")newInstance();
    conn = DriverManager.getConnection(mysqlUrl);
    status = "Conexao realizada com sucesso!)";
} catch (SQLexeption | InstantiationException | IllegalAcessException | ClassNotFoundException e){
status = "Ops! Algo de errado não está certo com a conexão com o banco de dados MySQL!Mensagem do servidos:" + e;

}
System.out.println(status);
return conn;
}
