
package Model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    private Connection conn;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<User> listUser = new ArrayList();
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/prosearch";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM user";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                listUser.add(new User(rs.getString("name"), rs.getString("username"), rs.getString("password"), rs.getString("birthdate"),rs.getString("address"),rs.getString("nohp"),rs.getString("email"),rs.getString("lasteduc"),rs.getString("skill")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public boolean cekUsername(String username){
        boolean cek = false;
        for (User usr : listUser){
            if (usr.getUsername().equals(username)){
                cek = true;
                break;
            }
        }
        
        return cek;
    }
    
    
}
