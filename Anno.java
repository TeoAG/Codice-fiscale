import java.util.Scanner;


public class Anno extends Codice {
    public void Anno(){
        Scanner a =new Scanner(System.in); 
        int num=0;
        num=a.nextInt();
        num=num%100;
        if(num<10){
            String anno='0' + String.valueOf(num);
            codice+=anno;
        }else{
            String anno= String.valueOf(num);
            codice+=anno;
        }
     

    }
}
