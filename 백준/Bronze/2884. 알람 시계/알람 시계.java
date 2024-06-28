import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        
        if(t2-45>=0){
            t2 -= 45;
        }else if(t2-45<0){
            if(t1==0){
                t1 = 23;
            }else{
                t1 -= 1;
            }
            t2 += 15;                                      
        }
        System.out.print(t1 + " " + t2);
    }
}