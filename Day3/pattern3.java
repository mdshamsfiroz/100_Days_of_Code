import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int nst=1;
        int nsp=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<nsp;j++){
                System.out.print("\t");
            }
            for(int k=0;k<nst;k++){
                System.out.print("*\t");

            }
            nst++;
            nsp--;
            System.out.println( );
        }

    }
}