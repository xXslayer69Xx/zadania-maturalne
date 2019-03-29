import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class zad4_2 {

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