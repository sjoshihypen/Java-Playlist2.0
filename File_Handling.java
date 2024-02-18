import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class File_Handling {
    public static void main(String[] args) {
        // Read from file
        try {
            File file = new File("myfile.txt");
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write to file
        try {
            File file = new File("myfile.txt");
            FileWriter writer = new FileWriter(file, true);

            writer.write("This is a new line of text.\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
