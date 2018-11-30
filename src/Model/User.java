
package Model;

import java.util.ArrayList;

public class User {
    private String name;
    private String username;
    private String password;
    private String birthday;
    private String address;
    private String noHp;
    private String email;
    private String lastEduc;
    private String skill;
    private int numJual = 0;
    private int numBeli = 0;
    private Product[] listJual;
    private Product[] listBeli;

    public User(String name, String username, String password, String birthday, String address, String noHp, String email, String lastEduc, String skill) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.noHp = noHp;
        this.email = email;
        this.lastEduc = lastEduc;
        this.skill = skill;
    }


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void AddJual(Product jual){
        listJual[numJual] = jual;
        numJual++;
    }
    
    public void AddBeli(Product beli){
        listBeli[numBeli] = beli;
        numBeli++;
    }
    
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }

    public int getNumJual() {
        return numJual;
    }

    public int getNumBeli() {
        return numBeli;
    }

    public Product getListJual(int i) {
        return listJual[i];
    }

    public Product getListBeli(int i) {
        return listBeli[i];
    }

    public String getLastEduc() {
        return lastEduc;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    
    public void setLastEduc(String lastEduc) {
        this.lastEduc = lastEduc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
