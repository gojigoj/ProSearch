
package Model;


import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    private Connection conn;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<User> listUser = new ArrayList();
    private ArrayList<Project> listProject = new ArrayList();
    private ArrayList<Service> listService = new ArrayList();
    private ArrayList<ProductJadi> listProduct = new ArrayList();
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost:3306/prosearch";
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
            System.out.println("data tidak masuk");
        }
        return cek;
    }
    
    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM user";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                listUser.add(new User(rs.getString("name"), rs.getString("username"), rs.getString("password"), rs.getString("birthday"),rs.getString("address"),rs.getString("nohp"),rs.getString("email"),rs.getString("lasteduc"),rs.getString("skill")));
            }
            for (User o : listUser){
//                String querypro = "select * from product where username = " + "'" + o.getUsername() + "'";
//                rs = stmt.executeQuery(querypro);
//                while(rs.next()){
//                    o.AddJual(new Product(rs.getString("title"),rs.getInt("price"),rs.getString("kategori"),rs.getString("deskripsi")));
//                }
                String queryprj = "select * from product join project using (kode_product) where kode_product like 'PRJ%' and username = " + "'" + o.getUsername() + "'";
                rs = stmt.executeQuery(queryprj);
                while (rs.next()){
                    o.AddJual(new Project(rs.getString("kode_product"), rs.getString("tanggal"), rs.getInt("deadline"), rs.getString("title"),rs.getInt("price"),rs.getString("kategori"),rs.getString("deskripsi")));
                }
                String querysrv = "select * from product join service using (kode_product) where kode_product like 'SRV%' and username = " + "'" + o.getUsername() + "'";
                rs = stmt.executeQuery(querysrv);
                while (rs.next()){
                    o.AddJual(new Service(rs.getString("kode_product"), rs.getInt("deadline"), rs.getString("title"),rs.getInt("price"),rs.getString("kategori"),rs.getString("deskripsi")));
                }
                String queryprd = "select * from product join productjadi using (kode_product) where kode_product like 'PRD%' and username = " + "'" + o.getUsername() + "'";
                rs = stmt.executeQuery(queryprd);
                while (rs.next()){
                    o.AddJual(new ProductJadi(rs.getString("kode_product"), rs.getString("title"), rs.getInt("price"), rs.getString("kategori"), rs.getString("deskripsi")));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadProject() {
        connect();
        try {
            String query = "select * from product join project using (kode_product) where kode_product like 'PRJ%'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                listProject.add(new Project(rs.getString("kode_product"), rs.getString("tanggal"), rs.getInt("deadline"), rs.getString("title"),rs.getInt("price"),rs.getString("kategori"),rs.getString("deskripsi")));
            }
            System.out.println("Test");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public void loadService() {
        connect();
        try {
            String query = "select * from product join service using (kode_product) where kode_product like 'SRV%'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                listService.add(new Service(rs.getString("kode_product"), rs.getInt("deadline"), rs.getString("title"),rs.getInt("price"),rs.getString("kategori"),rs.getString("deskripsi")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadProduct() {
        connect();
        try {
            String query = "select * from product join productjadi using (kode_product) where kode_product like 'PRD%'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                listProduct.add(new ProductJadi(rs.getString("kode_product"), rs.getString("title"), rs.getInt("price"), rs.getString("kategori"), rs.getString("deskripsi")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public ArrayList<User> getListUser() {
        return listUser;
    }
    
    public ArrayList<Project> getListProject() {
        return listProject;
    }
    
    public ArrayList<Service> getListService() {
        return listService;
    }
    
    public ArrayList<ProductJadi> getListProductJadi() {
        return listProduct;
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
    
    public boolean cekPassword(String password){
        boolean cek = false;
        for (User usr : listUser){
            if (usr.getPassword().equals(password)){
                cek = true;
                break;
            }
        }
        
        return cek;
    }
    
    public void addUser(User x) {
        connect();
        String query = "INSERT INTO user VALUES (";
        query += "'" + x.getName() + "',";
        query += "'" + x.getUsername() + "',";
        query += "'" + x.getPassword() + "',";
        query += "'" + x.getEmail() + "',";
        query += "'" + x.getBirthday() + "',";
        query += "'" + x.getAddress() + "',";
        query += "'" + x.getLastEduc() + "',";
        query += "'" + x.getNoHp() + "',";
        query += "'" + x.getSkill() + "'";
        query += ")";
        if (manipulate(query)) listUser.add(x);
        disconnect();
    }
    
    
    
}
