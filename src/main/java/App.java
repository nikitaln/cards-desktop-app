import service.ParseCSV;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

//        JFrame frame = new JFrame();
//        frame.setSize(500, 500);
//        frame.setTitle("Пропускная система");
//
//        frame.add(new MainForm().getMainPanel());
//
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);

        ParseCSV csv = new ParseCSV();
        csv.parseCsvFile();
    }
}
