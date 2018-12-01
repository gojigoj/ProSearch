/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;

/**
 *
 * @author Goji
 */
public class ControllerBrowseProject extends MouseAdapter implements ActionListener{

    private MenuView view;
    private Database db;

    public ControllerBrowseProject() {
        view = new MenuView();
        db = new Database();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        loadTableProject();
    }
    
    public void loadTableProject(){
        db.loadProject();
        System.out.println("test1");
        String[] judul = {"Title", "Category", "Budget", "Deadline"};
        DefaultTableModel model = new DefaultTableModel(judul, 0);
        view.setTbBProject(model);
        System.out.println("test3");
        ArrayList<Project> project = db.getListProject();
        System.out.println("test2");
        for (Project p : project) {
            model.addRow(new Object[]{p.getTitle(), p.getKategori(), p.getPrice(), p.getDeadline()});
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
    }
    
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getTbBProject())){
            int i = view.getSelectedProject();
            String title = view.getTbBProject().getModel().getValueAt(i, i).toString();
            String Category = view.getTbBProject().getModel().getValueAt(i, 1).toString();
            String budget = view.getTbBProject().getModel().getValueAt(i, 2).toString();
            String Deadline = view.getTbBProject().getModel().getValueAt(i, 4).toString();
            
            view.setTfTitleProject(title);
            view.setTfCategoryProject(Category);
            view.setTfBudProject(Integer.parseInt(budget));
            view.setTfDeadlineProject(Integer.parseInt(Deadline));
        }
    }
    
    
    
}
