import java.util.*;

public class pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        
        // write ur code here
        int n=scn.nextInt();
        int nsp=0;
        int nst=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<nsp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<nst;j++){
                System.out.print("*\t");
            }
        nst--;
        nsp++;
        System.out.println();
        }
        

    }
}