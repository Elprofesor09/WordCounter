import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalWords = 0;

        try {
            File file = new File("TestExercice3.txt");
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                line = line.trim();

                if (!line.isEmpty()) {

                    String[] words = line.split("\\s+");
                    totalWords += words.length;
                }
            }

            fileReader.close();
            System.out.println("Nombre total de mots : " + totalWords);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable !");
            e.printStackTrace();
        }
    }
}
