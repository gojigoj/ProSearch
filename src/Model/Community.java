
package Model;


public class Community {
    private String kategori;
    private String deskripsi;
    private String tanggalBuat;

    public Community(String kategori, String deskripsi, String tanggalBuat) {
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        this.tanggalBuat = tanggalBuat;
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
