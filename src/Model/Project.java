
package Model;

import java.sql.Date;

public class Project extends Product{
    private char projectId;
    private String Status;
    private String tanggal;
    private int deadline;

    public Project(char projectId, String Status, String tanggal, int deadline, String title, int price, String kategori, String deskripsi) {
        super(title, price, kategori, deskripsi);
        this.projectId = projectId;
        this.Status = Status;
        this.tanggal = tanggal;
        this.deadline = deadline;
    }

    public char getProjectId() {
        return projectId;
    }

    public void setProjectId(char projectId) {
        this.projectId = projectId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
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
