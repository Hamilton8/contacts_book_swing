package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionBase {
    private static Connection conn;
    private static final String driverClass="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/contacts_book";
    private static final String user="root";
    private static final String pass="12345678h";
    
    public static Connection getConnection(){
        try{
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Database connected");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Failed to connect database "+ e.getMessage());
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Failed to connect database "+ e);
        }
        return conn;
    }
}
