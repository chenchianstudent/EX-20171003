import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MianFrame extends JFrame {
    private Container cp;
    private JButton jb1 = new JButton("++");
    private JButton jb2 = new JButton("--");
    private JButton jb3 = new JButton("test");
    private JButton jb4 = new JButton("exit");
    private JLabel lb1 = new JLabel("0");
    private int count = 0;

    public MianFrame() {
        init();
    }

    private void init() {
        this.setBounds(100, 100, 500, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(5, 1, 3, 1));
        cp.add(jb1);
        cp.add(jb2);
        cp.add(lb1);
        cp.add(jb3);
        cp.add(jb4);
        lb1.setHorizontalAlignment(JLabel.CENTER);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                lb1.setText(Integer.toString(count));
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                lb1.setText(Integer.toString(count));
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
