package citiesgame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FillCities {

    static HashSet<String> cities = new HashSet<>();
    public static HashSet<String> fillCities() throws FileNotFoundException {
        String fileName = "files/cities.txt";
        try {
            FileReader file = new FileReader(fileName);
            BufferedReader br = new BufferedReader(file);
            Scanner s = new Scanner(br);

            String manyCities;

            while (s.hasNextLine()) {
                manyCities = s.nextLine();
                cities.add(manyCities.strip());
            }
            s.close();

        } catch (IOException e) {
            System.err.println("Помилка при читанні файлу: " + e.getMessage());
        }
        return cities;
    }
}

