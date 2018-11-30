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
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogin())){
            btnLoginActionPerformed();
        } else if (source.equals(view.getBtnRegister())){
            btnRegisterActionPerformed();
        }
    }
    
    public void btnLoginActionPerformed(){
        if(db.cekUsername(view.getTfUsernameL()) && db.cekPassword(view.getPfPasswordL())){
            view.showMessage("Anda Berhasil Login", "Success", 1);
            new MenuView().setVisible(true);
            view.setVisible(false);
        } else {
            view.showMessage("Username yang anda masukkan salah/tidak ada", "Failed", 1);
        }
    }
    
    public void btnRegisterActionPerformed(){
        view.setVisible(false);
        new register().setVisible(true);
    }
    
}
