package PJ_RPG;

import java.sql.Connection; //serve pra fazer a conexão
import java.sql.DriverManager; //onde está a biblioteca
import java.sql.SQLException; //para informar erros

public class Conexao {
    
 private static final String url = "jdbc:mysql://localhost:3306/inventario_rpg";
 
 private static final String user = "root";
 private static final String password = "";
 
 private static Connection conex;
 
 public static Connection getConexao() throws SQLException{
     try{
         if(conex == null){
            conex = DriverManager.getConnection(url,user,password);
            return conex;
         }else{
             return conex;
         }
         
     }
     catch(SQLException e){
                 e.printStackTrace();
                 return null;
                 }
 }
 
}
