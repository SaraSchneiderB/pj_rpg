package PJ_RPG;

import java.sql.Connection; //serve pra fazer a conexão
import java.sql.DriverManager; //onde está a biblioteca
import java.sql.SQLException; //para informar erros
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/inventario_rpg";

    private static final String user = "root";
    private static final String password = "Sah13579135";

    private static Connection conex;

    public static Connection getConexao() throws SQLException {
        //while (true) {
        //try {
        if (conex == null) {
            conex = DriverManager.getConnection(url, user, password);
            return conex;
        } else {
            return conex;
        }

        /*} catch (SQLException e) {
                System.out.println("");
                e.printStackTrace();
                System.out.println("1 - Tentar de novo");
                System.out.println("2 - Sair");
                System.out.print("Opcao: ");
                Scanner s = new Scanner(System.in);
                if (s.nextInt() == 2) {
                return null;
                }
                }*/
        //}
    }

    public static int conectar() {
        while (true) {
            try {
                conex = DriverManager.getConnection(url, user, password);
                return 0;
            } catch (SQLException ex) {
                //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
                System.out.println("1 - Tentar de novo");
                System.out.println("2 - Sair");
                System.out.print("Opção: ");
                Scanner s = new Scanner(System.in);
                if (s.nextInt() == 2) {
                    return -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Conexao().conectar());
    }
}
