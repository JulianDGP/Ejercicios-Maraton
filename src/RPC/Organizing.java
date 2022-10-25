package RPC;

import java.util.Scanner;

public class Organizing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

       testcase: while (t > 0){
           int n = in.nextInt();
           int [] problemas = new int[10];

            while (n >0){
            int b = in.nextInt();
            int d= in.nextInt();

            if(b > problemas[d-1] ){
                problemas[d-1]=b;
            }
            n--;
            }
            int belleza =0;

             for (int i= 0; i<problemas.length; i++){
               if ( problemas[i]==0){
                   t--;
                   System.out.println("MOREPROBLEMS");
                   continue testcase;
               }else {
                   belleza += problemas[i];
               }
            }
           System.out.println(belleza);
           t--;
        }
    }
}
