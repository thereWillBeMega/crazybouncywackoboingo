import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
//panel.setBackground(Color.RED);
frame.setSize(1400,800);



        frame.add(panel);
frame.setVisible(true);



    }
}