import java.util.Scanner;

public class Cognome_Nome extends Codice {
    public void cognome(){
        Scanner s =new Scanner(System.in); 
        String cognome;
        String save="";
        cognome = s.nextLine();
        cognome=cognome.toUpperCase();
        cognome=cognome.replace(" ","");
        
        for (int i=0; i<cognome.length(); i++){
            if(cognome.charAt(i)!='A' && cognome.charAt(i)!='E' && cognome.charAt(i)!='I' && cognome.charAt(i)!='O' && cognome.charAt(i)!='U' && cognome.charAt(i)!='Y'){
                save+=cognome.charAt(i);
            }
            if(save.length()==3){
                codice+=save;
                i=cognome.length();
                return;
            }
        }
        for (int i=0; i<cognome.length(); i++){
            if(cognome.charAt(i)=='A' || cognome.charAt(i)=='E' || cognome.charAt(i)=='I' || cognome.charAt(i)=='O' || cognome.charAt(i)=='U' || cognome.charAt(i)=='Y'){
                save+=cognome.charAt(i);
            }
            if(save.length()==3){
                codice+=save;
                i=cognome.length();
                return;
            }
        }
        if(save.length()==2){
            save+="x";
            codice+=save;
        }else{
            if(save.length()==1){
                save+="xx";
                codice+=save;
            }
        }
    }

    public void nome(){
        Scanner c =new Scanner(System.in); 
        String nome;
        String save1="";
        nome = c.nextLine();
        nome=nome.toUpperCase();
        nome.replace(" ","");
        
        for (int i=0; i<nome.length(); i++){
            if(nome.charAt(i)!='A' && nome.charAt(i)!='E' && nome.charAt(i)!='I' && nome.charAt(i)!='O' && nome.charAt(i)!='U' && nome.charAt(i)!='Y'){
                save1+=nome.charAt(i);
            }
            if(save1.length()>=4){
                codice+=save1.charAt(0);
                codice+=save1.charAt(2);
                codice+=save1.charAt(3);
                i=nome.length();
                return;
            }
           
        }
        if(save1.length()<4){
            codice+=save1.charAt(0);
            codice+=save1.charAt(1);
            codice+=save1.charAt(2);
            return;
        }
        for (int i=0; i<nome.length(); i++){
            if(nome.charAt(i)=='A' || nome.charAt(i)=='E' || nome.charAt(i)=='I' || nome.charAt(i)=='O' || nome.charAt(i)=='U' || nome.charAt(i)=='Y'){
                save1+=nome.charAt(i);
            }
            if(save1.length()==3){
                codice+=save1;
                i=nome.length();
                return;
            }
        }
        if(save1.length()==2){
            save1+="x";
            codice+=save1;
        }else{
            if(save1.length()==1){
                save1+="xx";
                codice+=save1;
            }
        }
        
    }
   
}
