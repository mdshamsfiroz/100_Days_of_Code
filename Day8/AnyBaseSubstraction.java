import java.util.*;
  
  public class AnyBaseSubstraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int res=0;
       int c=0;
       int tp=1;//10^0;
       while(n2>0){
           int t1=n1%10;
           int t2=n2%10;
           n1=n1/10;
           n2=n2/10;

           int d= t2-c-t1;
           if(d<0){
               c=1;
               d=d+b;
           }
           else{
               c=0;
           }
           res=res+d*tp;
           tp=tp*10;
           }
           return res;
       }
   }
  
  