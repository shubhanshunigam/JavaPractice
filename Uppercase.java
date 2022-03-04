import java.util.Scanner;
class Uppercase{
      String uppercaseString(String s){
        String ans = "";
        ans += (char)(s.charAt(0) - 'a' + 'A');
        for(int i=1; i<s.length(); i++){
		    if(s.charAt(i) == ' '){
		        ans += s.charAt(i);
		        i++;
		        if(s.charAt(i) >= 97){
    		        ans += (char)(s.charAt(i) - 'a' + 'A');
    		    }else{
    		        ans += s.charAt(i);
    		    }
		    }else if(s.charAt(i) < 97){
		        ans += (char)(s.charAt(i) - 'A' + 'a');
		    }else{
		        ans += s.charAt(i);
		    }
		}
		return ans;
    }



      public static void main(String[] args){
        Uppercase obj = new Uppercase();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.println("Input string : " + s);
        System.out.println("Answer : " + obj.uppercaseString(s));
    }

}