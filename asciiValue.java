import java.util.Scanner;
class asciiValue{
    static int getAscii(char ch){
        int a=ch;
        return a;
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter character : ");
        char ch=input.next().charAt(0);
        System.out.print("Ascii Value of "+ch+" is ");
        int ans;
        ans = getAscii(ch);
        System.out.println(ans);
    }
}