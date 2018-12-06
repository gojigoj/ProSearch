
package Model;


public class Community {
    private String idCommunity;
    private String title;
    private String kategori;
    private String deskripsi;
    private String tanggalBuat;

    public Community(String idCommunity, String title, String kategori, String deskripsi, String tanggalBuat) {
        this.idCommunity = idCommunity;
        this.title = title;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        this.tanggalBuat = tanggalBuat;
    }

    public String getIdCommunity() {
        return idCommunity;
    }

    public void setIdCommunity(String idCommunity) {
        this.idCommunity = idCommunity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   
    
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTanggalBuat() {
        return tanggalBuat;
    }

    public void setTanggalBuat(String tanggalBuat) {
        this.tanggalBuat = tanggalBuat;
    }
    
    
}
