import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import

public class cookie implements ActionListener{

    JFrame jf;
    JPanel jp;
    JButton b1;
    JLabel l1;
    int count = 0;

    cookie(){
        jf = new JFrame();
        jf.setSize(400,800);
        jp = new JPanel();
        b1 = new JButton("click");
        b1.addActionListener(this);
        l1 = new JLabel("counter: " + count);

        jp.setSize(400,100);
        jf.setLayout(new BoxLayout());
        jp.add(b1);
        jp.add(l1);
        jf.getContentPane().add(jp);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){

    }

    static void main(String[] args) {
        cookie c = new cookie();
    }

}