import java.util.*;
public class Rp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
	int left = 0;
	int right = str.length()-1;
	
	
	

	if(isPalindrome(str, left, right)){
		System.out.println(str+ " is a palindrome");
	}
	else{
		System.out.println(str+" is not a palindrome");
	}
	}
		public static boolean isPalindrome(String str, int left, int right){
			if(left>= right){
				return true;
			}
			if(str.charAt(left)!=str.charAt(right)){
				return false;
			}
			return isPalindrome(str, left+1, right-1);
		}
}
