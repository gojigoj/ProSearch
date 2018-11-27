
package Model;


public class Payment {
    private String transaksiId;
    private int numPembeli;
    private int numPenjual;
    private int numProduct;
    private User[] listPembeli;
    private User[] listPenjual;
    private Product[] listProduct;
    private int nominal;
    private String rekening;
    private String Bank;

    public Payment(String transaksiId, int nominal, String rekening, String Bank) {
        this.transaksiId = transaksiId;
        this.nominal = nominal;
        this.rekening = rekening;
        this.Bank = Bank;
    }

    public void addPembeli(User pembeli){
        listPembeli[numPembeli] = pembeli;
        numPembeli++;
    }
    
    public void addPenjual(User penjual){
        listPenjual[numPenjual] = penjual;
        numPenjual++;
    }
    
    public void addProduct(Product product){
        listProduct[numProduct] = product;
        numProduct++;
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

    public int getNumPembeli() {
        return numPembeli;
    }

    public int getNumPenjual() {
        return numPenjual;
    }

    public int getNumProduct() {
        return numProduct;
    }

    public User getListPembeli(int i) {
        return listPembeli[i];
    }

    public User getListPenjual(int i) {
        return listPenjual[i];
    }

    public Product getListProduct(int i) {
        return listProduct[i];
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
