import java.util.*;

public class DecimalToAnyBase {

      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int b=scn.nextInt();
        int dn=getValueInBase(n,b);
        System.out.println(dn);
      }
      //n is a decimal number.
      //b base in which we have to convert
      public static int getValueInBase(int n,int b){
          // write code here
          int dn=0;
          int tp=1;//10^0

          while(n>0){
            int r =n%b;
            n=n/b;

            dn=dn+r*tp;
            tp=tp*10;
          }
          return dn;

      }
        
      }
    