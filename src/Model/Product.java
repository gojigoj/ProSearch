
package Model;


public class Product {
    private String title;
    private int price;
    private String kategori;
    private String deskripsi;

    public Product(String title, int price, String kategori, String deskripsi) {
        this.title = title;
        this.price = price;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
    }
    
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getKategori() {
        return kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
