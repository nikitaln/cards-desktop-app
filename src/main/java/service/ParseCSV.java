package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class ParseCSV {


    public void parseCsvFile()  {


        System.out.println("Проверка");

        Path filePath = Paths.get("files/cards.csv");

        try {

            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                String[] fragments = line.split(";");

                if (fragments.length == 5) {
                    System.out.println(fragments[0] + " " + fragments[1] + " " + fragments[2] + " " + fragments[3] + " " + fragments[4]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
