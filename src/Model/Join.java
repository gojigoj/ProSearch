
package Model;

public class Join {
    private int numUser = 0;
    private int numCommunity = 0;
    private User[] listUser;
    private Community[] listCommunity;
    private String tanggalJoin;

    public Join(String tanggalJoin) {
        this.tanggalJoin = tanggalJoin;
    }
    
    public void addUser(User user){
        listUser[numUser] = user;
        numUser++;
    }
    
    public void addCommunity(Community community){
        listCommunity[numCommunity] = community;
        numCommunity++;
    }

    public void setTanggalJoin(String tanggalJoin) {
        this.tanggalJoin = tanggalJoin;
    }

    public int getNumUser() {
        return numUser;
    }

    public int getNumCommunity() {
        return numCommunity;
    }

    public User getListUser(int i) {
        return listUser[i];
    }

    public Community getListCommunity(int i) {
        return listCommunity[i];
    }

    public String getTanggalJoin() {
        return tanggalJoin;
    }
    
    
}
