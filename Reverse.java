import java.util.Scanner;

class Reverse{
    String reverseString(String s){
        String ans="";
        for(int i=s.length()-1; i>=0; i--){
            ans += s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args){
        Reverse obj = new Reverse();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.println("Input string : " + s);
        System.out.println("Reverse string : " + obj.reverseString(s));
    }
}