
public class Payment {
    private String transaksiId;
    private int nominal;
    private String rekening;
    private String Bank;

    public Payment(String transaksiId, int nominal, String rekening, String Bank) {
        this.transaksiId = transaksiId;
        this.nominal = nominal;
        this.rekening = rekening;
        this.Bank = Bank;
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

    public String getTransaksiId() {
        return transaksiId;
    }
    
    
    
}
