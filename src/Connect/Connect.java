/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author ThinkPad X1 Carbon
 */
public class Connect {
    public static Connection MySQL(){
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("root");
            ds.setPassword("");
            ds.setServerName("localhost");
            ds.setDatabaseName("example");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            System.out.println("database connected");
            return c;     
        } catch (SQLException e){
            System.err.println("database tidak ada" + e.getMessage());
            return null;
        }
    }
}

   

