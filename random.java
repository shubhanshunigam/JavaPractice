import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
class random{
    public static void main(String [] args){
        System.out.println(Math.random());
        int min=10,max=100;
        System.out.println(Math.random()*(max-min+1)+min);
        Random random = new Random();
        System.out.println(random.nextInt(50));
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());


    }
}