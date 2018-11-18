
public class Product extends Detail{
    private String productId;
    private Payment payment;

    public Product(String productId, String title, int price, String kategori) {
        super(title,price,kategori);
        this.productId = productId;
    }
    
    public void createPayment(String transaksiId, int nominal, String rekening, String Bank){
        this.payment = new Payment(transaksiId,nominal,rekening,Bank);
    }
    
    @Override
    public String getDeskripsi(String s) {
        return s;
    }

    public String getProductId() {
        return productId;
    }
    
    public String getTitle(){
        return super.getTitle();
    }
    
    public int getPrice() {
        return super.getPrice();
    }

    public String getKategori() {
        return super.getKategori();
    }

    public Payment getPayment() {
        return payment;
    }
    
    
    
}
