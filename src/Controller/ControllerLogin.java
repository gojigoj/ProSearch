/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.Database.*;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.*;

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
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogin())){
            btnLoginActionPerformed();
        } else if (source.equals(view.getBtnRegister())){
            btnRegisterActionPerformed();
        }
    }
    
    public void btnLoginActionPerformed(){
        if (db.cekUsername(view.getTfUsernameL())) {
            if (db.cekPassword(view.getPfPasswordL())){
                view.showMessage("Anda Berhasil Login", "Success", 1);
                ArrayList<User> user = db.getListUser();
                for (User o : user){
                    if (o.getUsername().equals(view.getTfUsernameL())){
                        db.setUserLogin(o);
                    }
                }
                view.setVisible(false);
                new ControllerViewMenu();
            } else {
                view.showMessage("Password yang anda masukkan salah", "Failed", 0);
            }
        } else {
            view.showMessage("Username yang anda masukkan salah/tidak ada", "Failed", 0);
        }
    }
    
    public void btnRegisterActionPerformed(){
        view.setVisible(false);
        new ControllerRegister();
    }
    
}
