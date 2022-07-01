// import java.io.*;
// import java.util.*;

// public class Main {

// 	public static void solution(String str){
// 		//write your code here
// 		for(int i=0;i<str.length();i++){
// 			for(int j=i+1;j<=str.length();j++){
//              String sub=str.substring(i,j);
// 			 boolean IsPalindrome=IsPalindrome(sub);
// 			 if(IsPalindrome==true){
// 			 System.out.println(sub);
// 			 }
// 			}
// 		}
		
// 	}

// 	public static void main(String[] args) {
// 		Scanner scn = new Scanner(System.in);
// 		String str = scn.next();
// 		solution(str);
// 	}

// public static boolean IsPalindrome(String str){
// 		boolean flag=true;
// 		int left=0;
// 		int right=str.length()-1;
// 	while(left<right){
// 			char chleft=str.charAt(left);
// 			char chright=str.charAt(right);
// 			if(chleft!=chright){
// 				flag=false;
// 				break;
// 			}
// 			left++;
// 			right++;
// 		}
//       return flag;
// 	}
// }
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int i = 0 ; i < str.length(); i++){
			for(int j = i + 1; j <= str.length(); j++){
				// i -> starting point of substring, j-> ending point of substring
				if(isPalindrome(str.substring(i, j))){
					System.out.println(str.substring(i,j));
				}
			}
		}
	}

	public static boolean isPalindrome(String str){
		int i = 0, j = str.length() - 1;
		while(i < j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}