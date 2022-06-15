import java.util.*;

public class PrimeFactorisation{

public static void main(String[] args) {
  // write your code here  
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  int temp = n;
  for(int f=2;f*f<=temp;f++){
    while(n%f==0){
      System.out.print(f+" ");
      n=n/f;
    }
  }
}
}
