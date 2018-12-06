
package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerPayment extends MouseAdapter implements ActionListener {
    
    private PaymentView view;
    private Database db;

    public ControllerPayment() {
        view = new PaymentView();
        db = new Database();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true);
        db.loadUser();
        db.loadTransaction();
        ShowDetail();
    }
    
    public ControllerPayment(String label) {
        view = new PaymentView();
        db = new Database();
        view.addActionListener(this);
        view.addMouseListener(this);
        view.setVisible(true);
        view.setLblPrice(label);
        ShowDetail();
    }
    
    public void ShowDetail(){
        int lastNum = Integer.parseInt(getLastTrxId());
        String trxid = "TRX" + Integer.toString(lastNum+1);
        view.setTfTransId(trxid);
        view.setTfTitleProduct(db.getProductBuy().getTitle());
        view.setTfPrice(db.getProductBuy().getPrice());
        view.reset();
    }
    
    public String getLastTrxId(){
        String LastTrx = db.getLastIdTrx();
        System.out.println(LastTrx);
        String s;
        if (LastTrx == null){
            s = "0";
        } else {
            char[] c = LastTrx.toCharArray();
            int i = 0;
            while (i < c.length && c[i] != 'X'){
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
        if (source.equals(view.getBtnFinish())){
                String idTrx = view.getTfTransId();
                int nom = Integer.parseInt(view.getTfPrice());
                String norek = view.getTfNoRek();
                String bank = view.getCbBank();
                Transaksi trx = new Transaksi(idTrx,nom,norek,bank);
                trx.addPembeli(db.getUserLogin());
                trx.addProduct(db.getProductBuy());
                trx.addPenjual(db.getUserJual());
                db.addTrx(trx);
                view.showMessage("Your payment have been confirmed", "Success", 1);
                view.setVisible(false);
        }
        if (source.equals(view.getBtnCancel())){
            view.setVisible(false);
        }
    }
    
    
    
    
}
