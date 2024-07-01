import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int[] n = new int[t];
        int max = -100000000;
        int min = 100000000;
        
        for(int i = 0; i < t; i++){
            n[i] = scn.nextInt();
            if(n[i]>max){
                max = n[i];
            }
            if(n[i]<min){
                min = n[i];
            }
        }

		System.out.println(min + " " + max);
    }
}