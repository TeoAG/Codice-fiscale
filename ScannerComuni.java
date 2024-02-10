import java.util.Scanner;

public class ScannerComuni {
    private String comune;

    public String Scrivicomune(){
        Scanner s =new Scanner(System.in); 
        String comune;
        comune = s.nextLine();
        comune=comune.toUpperCase();
        return comune;
    }


}
