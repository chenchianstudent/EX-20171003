import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MianFrame extends JFrame {
    private Container cp;
    private JPanel jpnc = new JPanel(new GridLayout(6, 1));
    private JButton jb1 = new JButton("example");
    private JButton jb2 = new JButton("++");
    private JButton jb3 = new JButton("清除");
    private JButton jb4 = new JButton("exit");
    private JLabel lb1 = new JLabel("key");
    private JTextField jtfkey = new JFormattedTextField("3");
    private JTextArea jtaL = new JTextArea();
    private JTextArea jtaR = new JTextArea();
    private JScrollPane jspL = new JScrollPane(jtaL);
    private JScrollPane jspR = new JScrollPane(jtaR);

    public MianFrame() {
        init();
    }

    private void init() {
        this.setBounds(100, 100, 500, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        jtaL.setPreferredSize(new Dimension(200, 400));
        jtaR.setPreferredSize(new Dimension(200, 400));
        jtaR.setLineWrap(true);
        jtaL.setLineWrap(true);
        cp.add(jtaL, BorderLayout.WEST);
        cp.add(jtaR, BorderLayout.EAST);
        jpnc.add(jb1);
        jpnc.add(jb2);
        jpnc.add(lb1);
        jpnc.add(jtfkey);
        jpnc.add(jb3);
        jpnc.add(jb4);
        lb1.setHorizontalAlignment(JLabel.CENTER);
        cp.add(jpnc, BorderLayout.CENTER);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("poipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoipoi");
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[] = jtaL.getText().toCharArray();
                int len = data.length;
                for (int i = 0; i < len; i++) {
                    data[i] += Integer.parseInt(jtfkey.getText());
                }
                jtaR.setText(new String(data));
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaR.setText("");
                jtaL.setText("");
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
