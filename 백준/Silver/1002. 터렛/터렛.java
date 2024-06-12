import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for (int i = 0; i < t; i++) {
            double[] xyr = new double[6];
            for (int j = 0; j < xyr.length; j++) {
                xyr[j] = scn.nextDouble();
            }
            
            double near = Math.sqrt(Math.pow(xyr[0] - xyr[3], 2) + Math.pow(xyr[1] - xyr[4], 2));
        
            if (xyr[2] == xyr[5] && near == 0) {
                System.out.println("-1");
            } else if (near > xyr[2] + xyr[5] || near < Math.abs(xyr[2] - xyr[5])) {
                System.out.println("0");
            } else if (near == xyr[2] + xyr[5] || near == Math.abs(xyr[2] - xyr[5])) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
    }
}