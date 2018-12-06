
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
    private static User userLogin;
    private static User userJual;
    private static Product productBuy;
    private ArrayList<User> listUser = new ArrayList();
    private ArrayList<Transaksi> listTrx = new ArrayList();
    
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
    
    public void loadTransaction(){
        connect();
        loadUser();
        try {
            String query = "SELECT * FROM transaksi";
            rs = stmt.executeQuery(query);
            int i = 0;
            while (rs.next()){
                listTrx.add(new Transaksi(rs.getString("idtransaksi"),rs.getInt("nominal"),rs.getString("rekening"),rs.getString("bank")));
                for (User o : listUser){
                    if (o.getUsername().equals(rs.getString("username"))){
                        listTrx.get(i).addPembeli(o);
                        for (User x : listUser){
                            for (int j = 0; j < o.getNumJual(); j++) {
                                if (o.getListJual(j) instanceof Project){
                                    Project p = (Project) o.getListJual(j);
                                    if (p.getProjectId().equals(rs.getString("kode_product"))){
                                        o.AddJual(p);
                                    }
                                } else if (o.getListJual(j) instanceof Service){
                                    Service s = (Service) o.getListJual(j);
                                    if (s.getServiceId().equals(rs.getString("kode_product"))){
                                        o.AddJual(s);
                                    }
                                } else if (o.getListJual(j) instanceof ProductJadi){
                                    ProductJadi k = (ProductJadi) o.getListJual(j);
                                    if (k.getProductId().equals(rs.getString("kode_product"))){
                                        o.AddJual(k);
                                    }
                                }
                            }
                        }
                    }
                    for (int j = 0; j < o.getNumJual(); j++) {
                        if (o.getListJual(j) instanceof Project){
                            Project p = (Project) o.getListJual(j);
                            if (p.getProjectId().equals(rs.getString("kode_product"))){
                                listTrx.get(i).addPenjual(o);
                                listTrx.get(i).addProduct(p);
                            }
                        } else if (o.getListJual(j) instanceof Service){
                            Service s = (Service) o.getListJual(j);
                            if (s.getServiceId().equals(rs.getString("kode_product"))){
                                listTrx.get(i).addPenjual(o);
                                listTrx.get(i).addProduct(s);
                            }
                        } else if (o.getListJual(j) instanceof ProductJadi){
                            ProductJadi k = (ProductJadi) o.getListJual(j);
                            if (k.getProductId().equals(rs.getString("kode_product"))){
                                listTrx.get(i).addPenjual(o);
                                listTrx.get(i).addProduct(k);
                            }
                        }
                    }
                }
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public ArrayList<User> getListUser() {
        return listUser;
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
    
    public boolean cekPassword(String pass){
        boolean cek = false;
        for (User usr : listUser){
            if (usr.getPassword().equals(pass)){
                cek = true;
                break;
            }
        }
        
        return cek;
    }
    
    public boolean cekTitleBikin(String title){
        boolean cek = false;
        for (User usr : listUser){
            for (int j = 0; j < usr.getNumJual(); j++) {
                if (usr.getListJual(j).getTitle().equals(title)){
                    cek = true;
                    break;
                }
            }
        }
        
        return cek;
    }
    
    
    public String getLastIdProject(){
        connect();
        String lastIdPrj = null;
        try {
            String query = "select max(kode_product) from project";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                lastIdPrj = rs.getString("max(kode_product)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lastIdPrj;
    }
    
    public String getLastIdService(){
        connect();
        String lastIdSrv = null;
        try {
            String query = "select max(kode_product) from service";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                lastIdSrv = rs.getString("max(kode_product)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lastIdSrv;
    }
    
    public String getLastIdTrx(){
        connect();
        String lastTrx = null;
        try {
            String query = "select max(idtransaksi) from transaksi";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                lastTrx = rs.getString("max(idtransaksi)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lastTrx;
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
    
    
    public void addTrx(Transaksi trx){
        connect();
        String kodeproduct = null;
        if (trx.getProduct() instanceof Project){
            Project p = (Project) trx.getProduct();
            kodeproduct = p.getProjectId();
        } else if (trx.getProduct() instanceof Service){
            Service z = (Service) trx.getProduct();
            kodeproduct = z.getServiceId();
        } else if (trx.getProduct() instanceof ProductJadi){
            ProductJadi j = (ProductJadi) trx.getProduct();
            kodeproduct = j.getProductId();
        }
        String query = "INSERT INTO transaksi VALUES (";
        query += "'" + trx.getTransaksiId() + "',";
        query += "'" + trx.getRekening() + "',";
        query += "'" + trx.getNominal() + "',";
        query += "'" + trx.getBank() + "',";
        query += "'" + trx.getPembeli().getUsername() + "',";
        query += "'" + kodeproduct + "'";
        query += ")";
        if (manipulate(query)) listTrx.add(trx);
        disconnect();
    }
    
    
    public void addProject(Project p){
        connect();
        String query1 = "INSERT INTO product VALUES (";
        query1 += "'" + p.getProjectId() + "',";
        query1 += "'" + getUserLogin().getUsername() + "',";
        query1 += "'" + p.getTitle() + "',";
        query1 += "'" + p.getKategori() + "',";
        query1 += "'" + p.getPrice() + "',";
        query1 += "'" + p.getDeskripsi() + "'";
        query1 += ")";
        
        String query2 = "INSERT INTO project VALUES (";
        query2 += "'" + p.getProjectId() + "',";
        query2 += "CURRENT_TIME(),";
        query2 += "'" + p.getDeadline() + "'";
        query2 += ")";
        if (manipulate(query1) && manipulate(query2)){
            for (User u : listUser){
                if (u.getUsername().equals(userLogin.getUsername())){
                    u.AddJual(p);
                }
            }
        };
        disconnect();
    }
    
    public void addService(Service s){
        connect();
        String query1 = "INSERT INTO product VALUES (";
        query1 += "'" + s.getServiceId() + "',";
        query1 += "'" + getUserLogin().getUsername() + "',";
        query1 += "'" + s.getTitle() + "',";
        query1 += "'" + s.getKategori() + "',";
        query1 += "'" + s.getPrice() + "',";
        query1 += "'" + s.getDeskripsi() + "'";
        query1 += ")";
        
        String query2 = "INSERT INTO project VALUES (";
        query2 += "'" + s.getServiceId()+ "',";
        query2 += "'" + s.getDeadline() + "'";
        query2 += ")";
        if (manipulate(query1) && manipulate(query2)){
            for (User u : listUser){
                if (u.getUsername().equals(userLogin.getUsername())){
                    u.AddJual(s);
                }
            }
        };
        disconnect();
    }
    
    public void setUserLogin (User user){
        this.userLogin = user;
    }
    
    public void setUserJual (User user){
        this.userJual = user;
    }
    
    public void setProductBuy (Product product){
        this.productBuy = product;
    }

    public User getUserLogin() {
        return userLogin;
    }

    public User getUserJual() {
        return userJual;
    }

    public Product getProductBuy() {
        return productBuy;
    }
    
    
    
    
    
}
