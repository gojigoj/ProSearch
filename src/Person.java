
import java.util.*;


public class Person {
    private String Name;
    private String Username;
    private String Password;
    private String Birthday;// Date
    private String Address;
    private String NoHp;
    private String Email;
    private String LastEduc;
    private String Exp;
    private ArrayList<Project> project;
    public ArrayList<Service> service;
    public ArrayList<Product> product;
    public ArrayList<Community> community;

    public Person(String Name, String Username, String Password, String Birthday, String Address, String NoHp, String Email, String LastEduc, String Exp) {
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
        this.Birthday = Birthday;
        this.Address = Address;
        this.NoHp = NoHp;
        this.Email = Email;
        this.LastEduc = LastEduc;
        this.Exp = Exp;
        project = new ArrayList();
        service = new ArrayList();
        product = new ArrayList();
        community = new ArrayList();
    }

    public Person(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getAddress() {
        return Address;
    }

    public String getNoHp() {
        return NoHp;
    }

    public String getEmail() {
        return Email;
    }

    public String getLastEduc() {
        return LastEduc;
    }

    public String getExp() {
        return Exp;
    }
    
    public void AddProduct(Product product){
        this.product.add(product);
    }
    
    public void AddService(Service service){
        this.service.add(service);
    }
    
    public void AddProject(Project project){
        this.project.add(project);
    }
    
    public void AddCommunity(Community community){
        this.community.add(community);
    }

    public ArrayList<Project> getProject() {
        return project;
    }

    public ArrayList<Service> getService() {
        return service;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public ArrayList<Community> getCommunity() {
        return community;
    }
}
