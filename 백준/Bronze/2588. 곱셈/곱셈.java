import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int a = n1 * n2;
        for(int i = 0; i < 3; i++){
            System.out.println(n1*(n2 % 10));
            n2 /= 10;
        }
        System.out.println(a);
    }
}