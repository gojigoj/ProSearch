
package Model;

public class Join {
    private String idJoin;
    private User listUser;
    private Community listCommunity;
    private String tanggalJoin;
    
    public Join(String idJoin, String tanggalJoin) {
        this.idJoin = idJoin;
        this.tanggalJoin = tanggalJoin;
    }

    public String getIdJoin() {
        return idJoin;
    }

    public void setIdJoin(String idJoin) {
        this.idJoin = idJoin;
    }
    
    public void addUser(User user){
        listUser = user;
    }
    
    public void addCommunity(Community community){
        listCommunity = community;
    }

    public void setTanggalJoin(String tanggalJoin) {
        this.tanggalJoin = tanggalJoin;
    }

    public User getListUser() {
        return listUser;
    }

    public Community getListCommunity() {
        return listCommunity;
    }

    public String getTanggalJoin() {
        return tanggalJoin;
    }
    
    
}
