import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class zad4_3 {
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

        // znajdowanie maksymalnej długości liczby
        int maxLength = 0;

        for (int i = 0; i < content.size(); i++) {
            if (content.get(i).length() > maxLength) {
                maxLength = content.get(i).length();
            }
        }

        // wyodrębnianie wszystkich najdłuższych liczb
        List<String> theLongests = new ArrayList<String>();

        for (int i = 0; i < content.size(); i++) {
            if (content.get(i).length() == maxLength) {
                theLongests.add(content.get(i));
            }
        }

        // System.out.println(theLongests.size());

        // znajdowanie najdłuższej serii jedynek z przodu
        int maxOnesInRow = 0, currentMaxOnesInRow = 0;

        for (int i = 0; i < theLongests.size(); i++) {
            for (int j = 0; j < theLongests.get(i).length(); j++) {
                if (theLongests.get(i).charAt(j) == '1') {
                    currentMaxOnesInRow++;
                } else {
                    break;
                }
            }

            if (currentMaxOnesInRow > maxOnesInRow) {
                maxOnesInRow = currentMaxOnesInRow;
            }

            currentMaxOnesInRow = 0;
        }

        // znajdowanie tych liczb, które spełniają warunek największej długości i
        // najdłuższej serii jedynek z przodu
        List<String> theLongestOnes = new ArrayList<String>();

        for (int i = 0; i < theLongests.size(); i++) {
            for (int j = 0; j < theLongests.get(i).length(); j++) {
                if (theLongests.get(i).charAt(j) == '1') {
                    currentMaxOnesInRow++;
                } else {
                    break;
                }
            }

            if (currentMaxOnesInRow == maxOnesInRow) {
                theLongestOnes.add(theLongests.get(i));
            }

            currentMaxOnesInRow = 0;
        }

        System.out.println(theLongestOnes.size());

        // okazało się, że istnieje tylko jedna taka liczba
        String theLongestOne = theLongestOnes.get(0);

        // znajdowanie numeru wiersza zawierającego największą liczbą
        int biggestNumber = 0;

        for (int i = 0; i < content.size(); i++) {
            if (content.get(i).equals(theLongestOne)) {
                biggestNumber = i + 1;
                break;
            }
        }

        // -------------------------------------------------------------------------------

        // znajdowanie minimalnej długości liczby
        int minLength = 10000;

        for (int i = 0; i < content.size(); i++) {
            if (content.get(i).length() < minLength) {
                minLength = content.get(i).length();
            }
        }

        // znajdowanie liczb o najmniejszej długości
        List<String> theSmallest = new ArrayList<String>();

        for (int i = 0; i < content.size(); i++) {
            if (content.get(i).length() == minLength) {
                theSmallest.add(content.get(i));
            }
        }

        // okazało się, że zostało 5 liczb, z których możemy wywnioskować, że liczba 100
        // jest najmniejsza

        // znajdowanie numeru wiersza zawierającego najmniejszą liczbę
        int smallestNumber = 0;

        for (int i = 0; i < content.size(); i++) {
            if (content.get(i).equals("100")) {
                smallestNumber = i + 1;
            }
        }

        System.out.println("4.3. Numer wiersza zawierajacy najwieksza liczbe: " + biggestNumber
                + "; Numer wiersza zawierajacy najwieksza liczbe: " + smallestNumber);
    }
}