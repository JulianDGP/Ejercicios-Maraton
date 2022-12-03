
import java.util.Scanner;

public class Letterle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palabra = in.nextLine();
        int intentos =7;
        boolean win = false;
        boolean lose = false;

        bucles: while (intentos>0){

            String palabraEntra = in.nextLine();
            StringBuilder pista = new StringBuilder("YYYYY");

                if (!win && !false){
                    for (int i=0; i< palabraEntra.length();i++) {
                    if( palabra.charAt(i) == palabraEntra.charAt(i) ){
                        pista.setCharAt(i, 'G');
                    } else if (!(palabra.contains(String.valueOf(palabraEntra.charAt(i))))) {
                        pista.setCharAt(i, 'X');
                    }
                }
                    if (pista.toString().equals("GGGGG")){
                        System.out.println("WINNER");
                        win=true;
                    }
                }
            intentos--;
            if (intentos==0 && !win){
                System.out.println("LOSER");
            }else if(!win) {
                System.out.println(pista);
            }
            }
        }

    }

