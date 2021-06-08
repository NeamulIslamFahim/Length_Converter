package unit.converter;

import javax.swing.JFrame;


public class Length_Converter {
    
    public static void main(String[] args) {
        
        Converter frame_work = new Converter();

        //Frame design
        frame_work.setVisible(true);
        frame_work.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_work.setBounds(500, 250, 450, 480);
        frame_work.setTitle("Length Converter");
    }
    
}
