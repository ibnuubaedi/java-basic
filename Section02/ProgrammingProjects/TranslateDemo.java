package Section02.ProgrammingProjects;

import javax.swing.*;
import java.awt.*;

public class TranslateDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        Rectangle box = new Rectangle(0,0,500,300);
        frame.setBounds(box);

        JOptionPane.showMessageDialog(frame,"Click OK to Continue");
        box.translate(0,0);
        box.setSize(1400,700);
        frame.setBounds(box);

    }

}
