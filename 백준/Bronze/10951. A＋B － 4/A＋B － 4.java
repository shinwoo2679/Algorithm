import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextInt()){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a + b);
        }
    }
}