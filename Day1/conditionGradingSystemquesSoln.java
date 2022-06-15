import java.util.Scanner;
public class conditionGradingSystemquesSoln {

    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n1=scn.nextInt();
        if(n1>90){
            System.out.println("excellent");
        }
        else if(n1>80){
            System.out.println("good");
        }
        else if(n1>70){
            System.out.println("fair");
        }
        else if(n1>60){
            System.out.println("meets expectations");
        }
        else{
            System.out.println("below par");
        }
    }
} 