import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.BoxLayout;
import java.awt.Container;
import java.net.URL;


public class cookie implements ActionListener{

    JFrame jf;
    JPanel jp;
    JButton b1;
    JLabel l1;
    JLabel l2;
    int count;

    cookie(){
        jf = new JFrame();
        jf.setSize(400,600);
        jp = new JPanel();
        jp.setLayout(new BoxLayout(jp,BoxLayout.PAGE_AXIS));
        l2 = new JLabel("cookie clicker");



        ImageIcon icon = new ImageIcon("C:\\java projects\\cookie clicker gui\\images\\images.jpeg");
        b1 = new JButton(icon);

        b1.addActionListener(this);
        l1 = new JLabel("counter: " + count);


        jp.setPreferredSize(new Dimension(200, 100));

        b1.setPreferredSize(new Dimension(275,183));
        b1.setMaximumSize(new Dimension(275,183));
        jp.add(l2);
        jp.add(Box.createRigidArea(new Dimension(0,150)));
        jp.add(b1);
        jp.add(Box.createRigidArea(new Dimension(0,150)));
        jp.add(l1);
        jf.getContentPane().add(jp);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        l1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        l2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jf.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        Object see = e.getSource();
        if (see == (b1)){
            System.out.println("hello world");
            count++;
            l1.setText("counter: " + count);
        }
    }

    static void main(String[] args) {
        cookie c = new cookie();
    }

}