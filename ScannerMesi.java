import java.util.*;

public class ScannerMesi {
    private String mesi;

    public String Scrivicomune(){
        Scanner m =new Scanner(System.in); 
        String mesi;
        mesi = m.nextLine();
        mesi=mesi.toUpperCase();
        return mesi;
    }


}