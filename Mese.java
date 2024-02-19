import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Mese extends Codice{
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
            String[] l = line.split("\t");
            codice+=(l[1]);
            br.close();

        } catch (IOException f) {
            System.out.println("Errore di I/O" + f.getMessage());
        }

    }
}
