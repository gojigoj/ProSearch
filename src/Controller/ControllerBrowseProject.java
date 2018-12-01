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
        DefaultTableModel model = new DefaultTableModel(new String[]{"Title", "Category", "Budget", "Deadline"}, 0);
        ArrayList<Project> project = db.getListProject();
        for (Project p : project) {
            model.addRow(new Object[]{p.getTitle(), p.getKategori(), p.getPrice(), p.getDeadline()});
        }
        view.setTabBProject(model);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
    }
    
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getTabBProject())){
            int i = view.getSelectedProject();
            String title = view.getTabBProject().getModel().getValueAt(i, i).toString();
            String Category = view.getTabBProject().getModel().getValueAt(i, 1).toString();
            String budget = view.getTabBProject().getModel().getValueAt(i, 2).toString();
            String Deadline = view.getTabBProject().getModel().getValueAt(i, 4).toString();
            
            view.setTfTitleProject(title);
            view.setTfCategoryProject(Category);
            view.setTfBudProject(Integer.parseInt(budget));
            view.setTfDeadlineProject(Integer.parseInt(Deadline));
        }
    }
    
    
    
}
