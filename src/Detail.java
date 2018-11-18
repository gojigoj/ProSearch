
public abstract class Detail {
    private String title;
    private int Price;
    private String kategori;

    public Detail(String title, int Price, String kategori) {
        this.title = title;
        this.Price = Price;
        this.kategori = kategori;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return Price;
    }

    public String getKategori() {
        return kategori;
    }
    
    public abstract String getDeskripsi(String s);
}
