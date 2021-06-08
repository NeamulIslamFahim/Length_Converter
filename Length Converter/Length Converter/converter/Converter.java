package unit.converter;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Converter extends JFrame {

    private Container c;
    private JTextField jf;
    private Font f, f1;
    private JLabel label;
    private JComboBox cb;
    private String[] unit = {"Mile", "Yard", "Foot"};
    private JButton btn;
    private JTextArea ta;
    private ImageIcon logo;

    public Converter() {
        components();
    }

    public void components() {
        //creating container
        c = this.getContentPane();
        c.setLayout(null);
        //setting image icon
        logo = new ImageIcon(getClass().getResource("logo.PNG"));
        this.setIconImage(logo.getImage());
        f = new Font("Times New Roman", Font.BOLD, 16);
        f1 = new Font("Arial", Font.BOLD, 18);

        //creating Text field
        jf = new JTextField();
        jf.setBounds(30, 50, 150, 30);
        jf.setFont(f);
        c.add(jf);

        //creating label
        label = new JLabel("Kilometer");
        label.setBounds(200, 50, 100, 30);
        label.setFont(f1);
        c.add(label);

        //creating text area
        ta = new JTextArea();
        ta.setBounds(30, 150, 150, 30);
        ta.setFont(f);
        c.add(ta);

        //creating combo box
        cb = new JComboBox(unit);
        cb.setBounds(200, 150, 100, 30);
        cb.setFont(f);
        c.add(cb);

        //Creating Convert Button
        btn = new JButton("Convert");
        btn.setBounds(30, 250, 100, 50);
        c.add(btn);

        //Creating converter
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                ta.setText("");
                String km = jf.getText() + cb.getSelectedItem().toString();
                if (km.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter any number for conversion");
                } else if (cb.getSelectedItem().toString().equals("Mile")) {

                    double num = Double.parseDouble(jf.getText());
                    double mile = num * 0.621371;

                    String m = String.valueOf(num);
                    String n = String.format("%6.4e Mile", mile);

                    ta.append(n);
                } else if (cb.getSelectedItem().toString().equals("Yard")) {
                    double num1 = Double.parseDouble(jf.getText());
                    double yard = num1 * 1093.61;

                    String o = String.valueOf(num1);
                    String p = String.format("%6.4e Yard", yard);
                    //String p = String.format("%.2f", yard);

                    ta.append(p);
                } else if (cb.getSelectedItem().toString().equals("Foot")) {
                    double num2 = Double.parseDouble(jf.getText());
                    double foot = num2 * 3280.84;

                    String q = String.valueOf(num2);
                    String r = String.format("%6.4e Foot", foot);

                    ta.append(r);

                }

            }

        });

    }

    public static void main(String[] args) {
        Converter frame_work = new Converter();

        //Frame design
        frame_work.setVisible(true);
        frame_work.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_work.setBounds(500, 250, 450, 480);
        frame_work.setTitle("Length Converter");
    }

}
