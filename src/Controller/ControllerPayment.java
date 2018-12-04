
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
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
    
    
}
