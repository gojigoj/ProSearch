
package Model;


public class Service extends Product{
    private String serviceId;
    private int deadline;

    public Service(String serviceId, int deadline, String title, int price, String kategori, String deskripsi) {
        super(title, price, kategori, deskripsi);
        this.serviceId = serviceId;
        this.deadline = deadline;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
    
    
}
