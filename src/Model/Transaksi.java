
package Model;


public class Transaksi {
    private String transaksiId;
    private int numPembeli;
    private int numPenjual;
    private int numProduct;
    private User Pembeli;
    private User Penjual;
    private Product Product;
    private int nominal;
    private String rekening;
    private String Bank;

    public Transaksi(String transaksiId, int nominal, String rekening, String Bank) {
        this.transaksiId = transaksiId;
        this.nominal = nominal;
        this.rekening = rekening;
        this.Bank = Bank;
    }

    public void addPembeli(User pembeli){
        this.Pembeli = pembeli;
    }
    
    public void addPenjual(User penjual){
        this.Penjual = penjual;
    }
    
    public void addProduct(Product product){
        this.Product = product;
    }

    public void setTransaksiId(String transaksiId) {
        this.transaksiId = transaksiId;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setRekening(String rekening) {
        this.rekening = rekening;
    }

    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    public String getTransaksiId() {
        return transaksiId;
    }

    public User getPembeli() {
        return Pembeli;
    }

    public User getPenjual() {
        return Penjual;
    }

    public Product getProduct() {
        return Product;
    }

    public int getNominal() {
        return nominal;
    }

    public String getRekening() {
        return rekening;
    }

    public String getBank() {
        return Bank;
    }
    
    
    
    
}
