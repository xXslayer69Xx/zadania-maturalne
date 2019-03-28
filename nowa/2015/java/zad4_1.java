
import java.io.BufferedReader;
import java.io.FileReader;

public class zad4_1 {
    public static void main(String[]args) throws Exception {
        
        //wczytywanie danych z pliku
        FileReader file = new FileReader("../dane/liczby.txt");
        BufferedReader reader = new BufferedReader(file);
        
        String line = reader.readLine();

        while(line != null) {
            System.out.println(line);
        }
        file.close();
    }
}