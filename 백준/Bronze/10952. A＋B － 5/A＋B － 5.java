import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while(true){
            int a = scn.nextInt();
            int b = scn.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a + b);
        }
    }
}