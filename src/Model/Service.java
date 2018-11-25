package Model;


public class Service extends Detail{

    private String ServiceId;
    private Payment payment;

    public Service(String ServiceId, String title, int Price, String kategori) {
        super(title, Price, kategori);
        this.ServiceId = ServiceId;
    }

    public void createPayment(String transaksiId, int nominal, String rekening, String Bank){
        this.payment = new Payment(transaksiId,nominal,rekening,Bank);
    }
    
    public String getServiceId() {
        return ServiceId;
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
    
    @Override
    public String getDeskripsi(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
