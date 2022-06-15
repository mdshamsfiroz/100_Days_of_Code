import java.util.*;
  
  public class CountDigitsInANumber{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int count=0;
    while(n!=0){
      int quo=n/10;
      int rem=n%10;
      count++;
      n=quo;
    }
    System.out.println(count);
   }
  }