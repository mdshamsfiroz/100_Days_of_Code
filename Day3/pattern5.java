// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         // write ur code here
//         int n=scn.nextInt();
//         int nst=1;
//         int nsp=n/2;
//         for(int i=1;i<=n;i++){
//         System.out.println(nsp+"spaces"+nst+"stars");
//         if(i<=n/2){
//             nst=nst+2;
//             nsp=nsp-1;
//         }
//         else{
//             nst=nst-2;
//             nsp=nsp+1;
//         }
//         }
//     }
// }
import java.util.*;

public class pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int nst=1;
        int nsp=n/2;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=nsp;j++){
        System.out.print("\t");
        }
        for(int j=1;j<=nst;j++){
            System.out.print("*\t");
        }
        System.out.println();
        if(i<=n/2){
            nst=nst+2;
            nsp=nsp-1;
        }
        else{
            nst=nst-2;
            nsp=nsp+1;
        }
        }
    }
}