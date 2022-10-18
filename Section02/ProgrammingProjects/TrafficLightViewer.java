package Section02.ProgrammingProjects;

import javax.swing.*;

public class TrafficLightViewer {

    public static void main(String[] args) {

        TrafficLigthComponent component = new TrafficLigthComponent();

        JFrame frame = new JFrame("TRAFFIC LIGHT");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(component);
        frame.setDefaultCloseOperation(3);
    }

}
