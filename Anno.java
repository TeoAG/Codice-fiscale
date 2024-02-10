import java.util.Scanner;


public class Anno {
    public void Anno(){
        Scanner a =new Scanner(System.in); 
        int num=0;
        num=a.nextInt();
        num=num%100;
        if(num<10){
            int anno=+0+num;
            System.out.println(anno);
        }else{
            int anno=num;
            System.out.println(anno);
        }
     

    }
}
