import java.util.*;

public class pattern16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int nst=1;
        int nsp=n/2;
        int oval=1;
        for (int i=1;i<=n;i++){
            int ival=oval;
            for(int j=1;j<=nsp;j++){
            System.out.print("	");
            }
            for(int j=1;j<=nst;j++){
            if(j<=nst/2){
                System.out.print(ival+"	");
                ival++;
            }else{
                System.out.print(ival+"	");
                ival--;
            }
            }
            if(i<=n/2){
                nst+=2;
                nsp--;
                oval++;
            }
            else{
               nst-=2;
               nsp++;
               oval--;
            }
            
           
        System.out.println();    
        }

    }
}