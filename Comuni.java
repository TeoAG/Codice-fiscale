import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Comuni{
    public void ListaComuni() {
        try {
            File file = new File("Comuni.txt");
            FileReader fr = new FileReader(file);
            ScannerComuni sComuni = new ScannerComuni();
            String c = sComuni.Scrivicomune();
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (!line.startsWith(c)) {
                line = br.readLine();
            }
            System.out.println(line);
            String[] code = line.split("\t");
            System.out.println(code[1]);
            br.close();

        } catch (IOException f) {
            System.out.println("Errore di I/O" + f.getMessage());
        }

    }
}