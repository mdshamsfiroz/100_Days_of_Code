import java.util.Scanner;
  
  public class ReverseANumber{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    for(int i=0;n>0;i++){
        int rem=n%10;
        System.out.println(rem);
        n=n/10;
    }
}
  }