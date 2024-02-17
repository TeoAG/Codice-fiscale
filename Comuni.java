import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Comuni extends Codice{

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
            String[] code = line.split("\t");
            codice+=(code[1]);
            br.close();


        } catch (IOException f) {
            System.out.println("Errore di I/O" + f.getMessage());
        }

    }
}