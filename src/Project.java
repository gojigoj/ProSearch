
import java.util.*;


public class Project extends Detail{
    private String ProjectId;
    private int BidCount;
    private String Status;
    private Payment payment;
    private Date tanggal;
    private int Deadline;

    public Project(String ProjectId, int BidCount, String Status, Payment payment, Date tanggal, int Deadline, String title, int Price, String kategori) {
        super(title, Price, kategori);
        this.ProjectId = ProjectId;
        this.BidCount = BidCount;
        this.Status = Status;
        this.payment = payment;
        this.tanggal = tanggal;
        this.Deadline = Deadline;
    }
    
    public void createPayment(String transaksiId, int nominal, String rekening, String Bank){
        this.payment = new Payment(transaksiId,nominal,rekening,Bank);
    }

    public String getProjectId() {
        return ProjectId;
    }

    public int getBidCount() {
        return BidCount;
    }

    public String getStatus() {
        return Status;
    }

    public Payment getPayment() {
        return payment;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public int getDeadline() {
        return Deadline;
    }
    
    @Override
    public String getDeskripsi(String s) {
        return s;
    }
    
    

    
}
