/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import FrontEnd.DocReg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yashraj
 */
public class JdbcConnection {
    Connection conn;
    public Connection Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wecare","root","ABHIpatil123#");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DocReg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
