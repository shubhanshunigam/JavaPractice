import java.util.Scanner;
class palindrom{
      String isPalindrome(String s){
        int j=s.length()-1;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(j)){
                return "not Palindrome";
            }
            j--;
        }
		    
		return "Palindrome";
    }



      public static void main(String[] args){
        palindrom obj = new palindrom();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.println("Input string : " + s);
        System.out.println("string is " + obj.isPalindrome(s));
    }

}