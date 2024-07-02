import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int a, b;
        for(int i = 0; i < t; i++){
            a = scn.nextInt();
            b = scn.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + (a + b));
        }
    }
}