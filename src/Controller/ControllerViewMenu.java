
package Controller;

import Model.*;
import View.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ControllerViewMenu extends MouseAdapter implements ActionListener{
    
    private MenuView view;
    private Database db;

    public ControllerViewMenu() {
        view = new MenuView();
        db = new Database();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        db.loadUser();
        view.resetBrowseProject();
        view.resetCreateProject();
        loadTableProject();
    }

    public void loadTableProject(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Title", "Category", "Budget", "Deadline"}, 0);
        ArrayList<User> user = db.getListUser();
        for (User o : user) {
            for (int i = 0; i < o.getNumJual() ; i++) {
                if (o.getListJual(i) instanceof Project){
                    Project p = (Project) o.getListJual(i);
                    model.addRow(new Object[]{p.getTitle(), p.getKategori(), p.getPrice(), p.getDeadline()});
                }
            }
        }
        view.setTbBProject(model);
    }
    
    public void loadTableProjectBuy(){
        User user = db.getUserJual();
        int i = view.getSelectedProject();
        if (i == -1){
            view.showMessage("Anda belum memilih product", "failed", 0);
        } else {
            String title = view.getTbBProject().getModel().getValueAt(i, 0).toString();
                for (int j = 0; j < user.getNumJual(); j++) {
                    if (user.getListJual(j) instanceof Project){
                        Project p = (Project) user.getListJual(j);
                        if (p.getTitle().equals(title)){
                            db.setProductBuy(p);
                            new ControllerPayment("Salary");
                        }
                    }
                }
        }
    }
    
    public String getLastIdPrj(){
        String LastPrj = db.getLastIdProject();
        System.out.println(LastPrj);
        String s;
        if (LastPrj == null){
            s = "0";
        } else {
            char[] c = LastPrj.toCharArray();
            int i = 0;
            while (i < c.length && c[i] != 'J'){
                i++;
            }
            char[] x = new char[(c.length-1)-i];
            for (int k = 0; k < x.length; k++) {
                for (int j = i; j < c.length; j++) {
                    x[k] = c[j];
                }
            }
            s = String.valueOf(x);
        }
        
        return s;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnApplyProject())){
            loadTableProjectBuy();
        }
        if (source.equals(view.getBtnSearchProject())){
            btnSearchProjectActionPerformed();
            view.resetSearchProject();
        }
        if (source.equals(view.getBtnPublishProject())){
            btnPublishProjectActionPerformed();
        }
    }
    
    public void btnSearchProjectActionPerformed(){
        String kategori = view.getCbSearchProject();
        if (kategori == "All"){
            loadTableProject();
        } else {
            DefaultTableModel model = new DefaultTableModel(new String[]{"Title", "Category", "Budget", "Deadline"}, 0);
            ArrayList<User> user = db.getListUser();
            for (User o : user){
                for (int i = 0; i < o.getNumJual(); i++) {
                    if (o.getListJual(i) instanceof Project){
                        Project p = (Project) o.getListJual(i);
                        if (p.getKategori().equals(kategori)){
                            model.addRow(new Object[]{p.getTitle(), p.getKategori(), p.getPrice(), p.getDeadline()});
                        }
                    }
                }
            }
            view.setTbBProject(model);
        }
    }
    
    public void btnPublishProjectActionPerformed(){
        int lastNum = Integer.parseInt(getLastIdPrj());
        String idPrj = "PRJ" + Integer.toString(lastNum+1);
        Date tgl = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = sdf.format(tgl);
        int deadline = Integer.parseInt(view.getTfDeadlineCProject());
        String title = view.getTfTitleCProject();
        int price = Integer.parseInt(view.getTfBudgetCProject());
        String kategori = view.getCbCreateProject();
        String deskripsi = view.getTaDescCProject();
        if (idPrj.isEmpty() || tanggal.isEmpty() || deadline == 0 || title.isEmpty() || price == 0 || kategori.isEmpty() || deskripsi.isEmpty()){
            view.showMessage("Data Belum terisi semua", "Error", 0);
        } else {
            if (db.cekTitleProject(title)){
                view.showMessage("Title yang anda masukkan sudah ada", "Failed", 0);
            } else {
                db.addProject(new Project(idPrj,tanggal,deadline,title,price,kategori,deskripsi));
                view.showMessage("Register berhasil dilakukan", "Success", 1);
                view.resetCreateProject();
            }
        }
    }
    
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getBtnProject())){
            getBtnProjectMousePressed();
            loadTableProject();
            view.resetBrowseProject();
        } else if (source.equals(view.getBtnService())){
            getBtnServiceMousePressed();
        } else if (source.equals(view.getBtnProduct())){
            getBtnProductMousePressed();
        } else if (source.equals(view.getBtnCommunity())){
            getBtnCommunityMousePressed();
        } else if (source.equals(view.getTbBProject())){
            ArrayList<User> user = db.getListUser();
            int i = view.getSelectedProject();
            String title = view.getTbBProject().getModel().getValueAt(i, 0).toString();
            for (User o : user){
                for (int j = 0; j < o.getNumJual(); j++) {
                    if (o.getListJual(j) instanceof Project){
                        Project p = (Project) o.getListJual(j);
                        if (p.getTitle().equals(title)){
                            view.setTfTitleProject(p.getTitle());
                            view.setTfCategoryProject(p.getKategori());
                            view.setTaDescProject(p.getDeskripsi());
                            view.setTfBudProject(p.getPrice());
                            view.setTfDateProject(p.getTanggal());
                            view.setTfDeadlineProject(p.getDeadline());
                            view.setTfNameProject(o.getUsername());
                            db.setUserJual(o);
                        }
                    }
                }
            }
        }
    }
    
    public void mouseEntered(MouseEvent me) {
        Object source = me.getSource();
        if (source.equals(view.getBtnProject())){
            onHover(view.getBtnProject());
            onLeaveHover(view.getBtnCommunity());
            onLeaveHover(view.getBtnService());
            onLeaveHover(view.getBtnProduct());
        } else if (source.equals(view.getBtnService())){
            onHover(view.getBtnService());
            onLeaveHover(view.getBtnCommunity());
            onLeaveHover(view.getBtnProject());
            onLeaveHover(view.getBtnProduct());
        } else if (source.equals(view.getBtnProduct())){
            onHover(view.getBtnProduct());
            onLeaveHover(view.getBtnCommunity());
            onLeaveHover(view.getBtnProject());
            onLeaveHover(view.getBtnService());
        } else if (source.equals(view.getBtnCommunity())){
            onHover(view.getBtnCommunity());
            onLeaveHover(view.getBtnService());
            onLeaveHover(view.getBtnProject());
            onLeaveHover(view.getBtnProduct());
        }
    }
    
    public void mouseExited(MouseEvent me) {
        Object source = me.getSource();
        if (source.equals(view.getBtnProject())){
            onLeaveHover(view.getBtnProject());
        } else if (source.equals(view.getBtnService())){
            onLeaveHover(view.getBtnService());
        } else if (source.equals(view.getBtnProduct())){
            onLeaveHover(view.getBtnProduct());
        } else if (source.equals(view.getBtnCommunity())){
            onLeaveHover(view.getBtnCommunity());
        }
    }
    
    public void onHover(JPanel panel){
        panel.setBackground(new Color(204,204,204));
    }
    
    public void onLeaveHover(JPanel panel){
        panel.setBackground(new Color(38,38,38));
    }
    
    public void onClick(JPanel panel){
        panel.setBackground(new Color(204,204,204));
    }
    
    public void onleaveClick(JPanel panel){
        panel.setBackground(new Color(38,38,38));
    }
    
    public void getBtnProjectMousePressed(){
        view.getPanelMain().removeAll();
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();

        onClick(view.getBtnProject());
        onleaveClick(view.getBtnService());
        onleaveClick(view.getBtnProduct());
        onleaveClick(view.getBtnCommunity());

        view.getIndicatorProject().setVisible(true);
        view.getIndicatorService().setVisible(false);
        view.getIndicatorProduct().setVisible(false);
        view.getIndicatorCommunity().setVisible(false);

        // add panel
        view.getPanelMain().add(view.getProjectPanel());
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();
    }
    
    public void getBtnServiceMousePressed(){
        view.getPanelMain().removeAll();
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();

        onClick(view.getBtnService());
        onleaveClick(view.getBtnCommunity());
        onleaveClick(view.getBtnProduct());
        onleaveClick(view.getBtnProject());

        view.getIndicatorProject().setVisible(false);
        view.getIndicatorService().setVisible(true);
        view.getIndicatorProduct().setVisible(false);
        view.getIndicatorCommunity().setVisible(false);

        // add panel
        view.getPanelMain().add(view.getServicePanel());
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();
    }
    
    public void getBtnProductMousePressed(){
        view.getPanelMain().removeAll();
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();

        onClick(view.getBtnProduct());
        onleaveClick(view.getBtnService());
        onleaveClick(view.getBtnCommunity());
        onleaveClick(view.getBtnProject());

        view.getIndicatorProject().setVisible(false);
        view.getIndicatorService().setVisible(false);
        view.getIndicatorProduct().setVisible(true);
        view.getIndicatorCommunity().setVisible(false);

        // add panel
        view.getPanelMain().add(view.getProductPanel());
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();
    }
    
    public void getBtnCommunityMousePressed(){
        view.getPanelMain().removeAll();
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();

        onClick(view.getBtnCommunity());
        onleaveClick(view.getBtnService());
        onleaveClick(view.getBtnProduct());
        onleaveClick(view.getBtnProject());

        view.getIndicatorProject().setVisible(false);
        view.getIndicatorService().setVisible(false);
        view.getIndicatorProduct().setVisible(false);
        view.getIndicatorCommunity().setVisible(true);

        // add panel
        view.getPanelMain().add(view.getCommunityPanel());
        view.getPanelMain().repaint();
        view.getPanelMain().revalidate();
    }
    
    
}
