
package Model;

import java.sql.Date;

public class Project extends Product{
    private String projectId;
    private String tanggal;
    private int deadline;

    public Project(String projectId, String tanggal, int deadline, String title, int price, String kategori, String deskripsi) {
        super(title, price, kategori, deskripsi);
        this.projectId = projectId;
        this.tanggal = tanggal;
        this.deadline = deadline;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
    
    
    
    
}
