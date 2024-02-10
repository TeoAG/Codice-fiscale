import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Mese {
     public void ListaMesi() {
        try {
            File file = new File("mese.txt");
            FileReader fr = new FileReader(file);
            ScannerMesi sMesi = new ScannerMesi();
            String c = sMesi.Scrivicomune();
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (!line.startsWith(c)) {
                line = br.readLine();
            }
            System.out.println(line);
            String[] l = line.split(" ");
            System.out.println(l[1]);
            br.close();

        } catch (IOException f) {
            System.out.println("Errore di I/O" + f.getMessage());
        }

    }
}
