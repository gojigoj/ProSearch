/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.Admin;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fikri
 */
public class ControllerAdmin extends MouseAdapter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//    private Admin view;
//    private Database db;
//
//    public ControllerAdmin() {
//        view = new Admin();
//        db = new Database();
//        view.addActionListener(this);
//        view.addMouseAdapter(this);
//        view.setVisible(true);
//        db.loadUser();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        Object source = ae.getSource();
//        if (source.equals(view.getbtnDeleteUser())){
//            btnHapusActionPerformed();
//            db.loadUser();
//        }else if (source.equals(view.getbtnResetUser())){
//            view.reset();
//            db.loadUser();
//        }else if (source.equals(view.getbtnSearchUser())){
//            btnCariActionPerformed();
//        }
//    }
//    
//    @Override
//    public void mousePressed(MouseEvent me){
//        Object source = me.getSource();
//        if (source.equals(view.getTbMahasiswa())){
//            int i = view.getSelectedMahasiswa();
//            String nim = view.getTbMahasiswa().getModel().getValueAt(i, 0).toString();
//            String nama = view.getTbMahasiswa().getModel().getValueAt(i, 1).toString();
//            String jurusan = view.getTbMahasiswa().getModel().getValueAt(i, 2).toString();
//            char jk = view.getTbMahasiswa().getModel().getValueAt(i, 3).toString().charAt(0);
//            
//            view.setNIM(nim);
//            view.setNama(nama);
//            view.setJurusan(jurusan);
//            view.setJK(jk);
//        }
//    }
//    
//    public void btnHapusActionPerformed(){
//        String nim = view.getNIM();
//        db.delMahasiswa(nim);
//        view.reset();
//        view.showMessage("Data Berhasil Dihapus", "Success", 1);
//    }
//    
//    public void btnCariActionPerformed(){
//        String cari = view.getbtnSearchUser();
//        DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Username", "Password", "Email","Date of Birth", "Address", "Last Education", "No. HP", "Skill"}, 0);
//        ArrayList<Mahasiswa> mahasiswa = db.getMahasiswa();
//        for (Mahasiswa m : mahasiswa) {
//            if (m.getNim().contains(cari) || m.getNama().contains(cari) || m.getJurusan().contains(cari)){
//                model.addRow(new Object[]{m.getNim(), m.getNama(), m.getJurusan(), m.getJk()});
//            }
//        }
//        view.setTbMahasiswa(model);
//    }
//    
}
