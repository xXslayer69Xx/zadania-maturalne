import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class zad4_2 {

    public static Boolean isDividedByTwo(String line) {

        if (line.charAt(line.length() - 1) == '0') {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isDividedByEight(String line) {

        if (line.charAt(line.length() - 1) == '0' && line.charAt(line.length() - 2) == '0'
                && line.charAt(line.length() - 3) == '0') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {

        // wczytywanie danych z pliku
        FileReader file = new FileReader("../dane/liczby.txt");
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();

        List<String> content = new ArrayList<String>();

        while (line != null) {
            content.add(line);
            line = reader.readLine();
        }
        file.close();

        int twos = 0, eights = 0;

        for (int i = 0; i < content.size(); i++) {

            if (isDividedByTwo(content.get(i))) {
                twos++;
            }

            if (isDividedByEight(content.get(i))) {
                eights++;
            }
        }
    }
}