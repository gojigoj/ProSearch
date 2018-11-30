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

/**
 *
 * @author Goji
 */
public class ControllerLogin extends MouseAdapter implements ActionListener{

    private Login view;
    private Database db;

    public ControllerLogin() {
        view = new Login();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
        db.loadUser();
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
