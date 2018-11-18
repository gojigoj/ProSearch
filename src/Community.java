
import java.util.*;


public class Community {
    private String Kategori;
    private String Deskripsi;
    private Date datePublish;

    public Community(String Kategori, Date datePublish) {
        this.Kategori = Kategori;
        this.datePublish = datePublish;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }
}
