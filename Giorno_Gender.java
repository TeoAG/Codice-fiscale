import java.util.Scanner;

public class Giorno_Gender extends Codice {
    public void GG(){  
        Scanner a =new Scanner(System.in); 
        int giorno=0;
        giorno=a.nextInt();
        Scanner g =new Scanner(System.in);
        String gender="";
        gender =g.nextLine();
        gender=gender.toUpperCase();
        if(gender=="Femmina"){
            giorno+=40;
            String gg= String.valueOf(giorno);
            codice+=gg;
        }else{
            if (giorno<10){
                String gg= String.valueOf(giorno);
                codice+='0'+gg;
            }else{
                String gg= String.valueOf(giorno);
                codice+=gg;
            }
        }
    }    

}
