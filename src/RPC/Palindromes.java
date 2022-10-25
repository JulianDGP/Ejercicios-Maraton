package RPC;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palabra = in.nextLine();
        String palabraEnMorse = "";
        for(int i =0; i <palabra.length(); i++){
            switch (palabra.charAt(i)) {
                case 'a', 'A' -> palabraEnMorse += ".-";
                case 'b', 'B' -> palabraEnMorse += "-...";
                case 'c', 'C' -> palabraEnMorse += "-.-.";
                case 'd', 'D' -> palabraEnMorse += "-..";
                case 'e', 'E' -> palabraEnMorse += ".";
                case 'f', 'F' -> palabraEnMorse += "..-.";
                case 'g', 'G' -> palabraEnMorse += "--.";
                case 'h', 'H' -> palabraEnMorse += "....";
                case 'i', 'I' -> palabraEnMorse += "..";
                case 'j', 'J' -> palabraEnMorse += ".---";
                case 'k', 'K' -> palabraEnMorse += "-.-";
                case 'l', 'L' -> palabraEnMorse += ".-..";
                case 'm', 'M' -> palabraEnMorse += "--";
                case 'n', 'N' -> palabraEnMorse += "-.";
                case 'o', 'O' -> palabraEnMorse += "---";
                case 'p', 'P' -> palabraEnMorse += ".--.";
                case 'q', 'Q' -> palabraEnMorse += "--.-";
                case 'r', 'R' -> palabraEnMorse += ".-.";
                case 's', 'S' -> palabraEnMorse += "...";
                case 't', 'T' -> palabraEnMorse += "-";
                case 'u', 'U' -> palabraEnMorse += "..-";
                case 'v', 'V' -> palabraEnMorse += "...-";
                case 'w', 'W' -> palabraEnMorse += ".--";
                case 'x', 'X' -> palabraEnMorse += "-..-";
                case 'y', 'Y' -> palabraEnMorse += "-.--";
                case 'z', 'Z' -> palabraEnMorse += "--..";
                case '0' -> palabraEnMorse += "-----";
                case '1' -> palabraEnMorse += ".----";
                case '2' -> palabraEnMorse += "..---";
                case '3' -> palabraEnMorse += "...--";
                case '4' -> palabraEnMorse += "....-";
                case '5' -> palabraEnMorse += ".....";
                case '6' -> palabraEnMorse += "-....";
                case '7' -> palabraEnMorse += "--...";
                case '8' -> palabraEnMorse += "---..";
                case '9' -> palabraEnMorse += "----.";
                default -> palabraEnMorse += "";
            }

        }
        String morseInvertido= new StringBuilder(palabraEnMorse).reverse().toString();


        if ( (palabraEnMorse.equals(morseInvertido)) && !(palabraEnMorse.equals(""))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}