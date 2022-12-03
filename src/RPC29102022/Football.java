package RPC29102022;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int puntos2=0;
        int puntos=0;

            int t = in.nextInt();
            int f = in.nextInt();
            int s = in.nextInt();
            int p = in.nextInt();
            int c = in.nextInt();

        int t2 = in.nextInt();
        int f2 = in.nextInt();
        int s2 = in.nextInt();
        int p2 = in.nextInt();
        int c2 = in.nextInt();

            puntos = (t*6)+ (f*3)+ (s*2)+ (p)+ (c*2);
        puntos2 = (t2*6)+ (f2*3)+ (s2*2)+ (p2)+ (c2*2);

        System.out.println( puntos + " "+puntos2 );
    }
}
