import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class zad4_1 {

    // funkcja sprawdzająca czy string ma więcej niż jedynek
    public static Boolean isMoreZeros(String line) {

        int zeros = 0, ones = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        if (zeros > ones) {
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
    }
}