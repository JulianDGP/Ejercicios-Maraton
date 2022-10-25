import java.util.Scanner;

public class Boundary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t>0){
            int w = in.nextInt();
            int l = in.nextInt();

            int magic = ( 2*w) + (2*(l-2));
            int contador=0;

            StringBuilder numeros = new StringBuilder("");
            long startTime = System.currentTimeMillis();

            int menor = w<l? w:l;
            System.out.println(menor);
                for (int i =1; i<=w; i++){

                    if (magic%i ==0 && (((w%i==0) && ( (l-1) %i ==0) ) || ( (w%i ==0) && ( (l-2)%i==0) ) || ((w%i ==1)&&(l%i==1)))){
                        contador++;
                        if(i ==w){
                            numeros.append(i);
                        }else {
                            numeros.append(i +" ");
                        }
                    }
                }

            System.out.println("Tiempo for 1:  " + (System.currentTimeMillis() - startTime) + "ms");
            System.out.print( contador +" ");
            for(int i=0; i< numeros.toString().split(" ").length; i++ ){
                if((i+1)== numeros.toString().split(" ").length ){
                    System.out.println(numeros.toString().split(" ")[i] );
                }else {
                    System.out.print(numeros.toString().split(" ")[i] + " ");
                }
            }
            System.out.println("Tiempo total del algoritmo: " + (System.currentTimeMillis() - startTime) + "ms");
            t--;
        }
    }
}
