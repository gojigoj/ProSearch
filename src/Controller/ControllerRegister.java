
package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;


public class ControllerRegister extends MouseAdapter implements ActionListener{

    private register view;
    private Database db;

    public ControllerRegister() {
        view = new register();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
        db.loadUser();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnRegister())){
            btnRegisterActionPerformed();
        }
    }
    
    public void btnRegisterActionPerformed(){
        String name = view.getTfNameRegister();
        String username = view.getTfUsernameRegister();
        String password = view.getPfPassRegister();
        String birthday = view.getDcBirthDay();
        String address = view.getTfAddressRegister();
        String noHp = view.getTfPhoneNumber();
        String email = view.getTfEmailRegister();
        String lastEduc = view.getCbLastEduc();
        String skill = view.getTfSkillRegister();
        if (name.isEmpty() || username.isEmpty() || password.isEmpty() || birthday.isEmpty() || address.isEmpty() || noHp.isEmpty() || email.isEmpty() || lastEduc.isEmpty() || skill.isEmpty()){
            view.showMessage("Data Belum terisi semua", "Error", 0);
        } else {
            if (db.cekUsername(username)){
                view.showMessage("Username yang anda masukkan sudah ada", "Failed", 1);
            } else {
                db.addUser(new User(name,username,password,birthday,address,noHp,email,lastEduc,skill));
                view.reset();
                view.showMessage("Register berhasil dilakukan", "Success", 1);
                view.setVisible(false);
                new ControllerLogin();
            }
        }
    }
    
}
