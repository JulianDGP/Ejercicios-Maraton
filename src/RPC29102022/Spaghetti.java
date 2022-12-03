package RPC29102022;

import java.util.Scanner;

public class Spaghetti{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B= entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();
        String solucion ="";

        double carga = C+D;
        int nTrucks = (int) Math.ceil(carga/A);
        double nuevaCarga = nTrucks*A;
        nuevaCarga = nuevaCarga-D;


        if (A> (C+D)){
            System.out.println("No solution.");
        } else if( nuevaCarga%B==0 ){
            int nBotes = (int) nuevaCarga/B;
            if(nTrucks>1){
                solucion+= "We need "+ nTrucks +" trucks" ;
            }else {
                solucion+= "We need "+ nTrucks +" truck" ;
            }

            if(nBotes>1){
                solucion += " and "+ nBotes +" boats.";
            }else{
                solucion +=" and "+ nBotes +" boat.";
            }

            System.out.println(solucion);
        }  else if( (((Math.floor(nuevaCarga/B))*B ) > C)){
            int nBotes = (int) (Math.floor(nuevaCarga/B));
            if(nTrucks>1){
                solucion+= "We need "+ nTrucks +" trucks" ;
            }else {
                solucion+= "We need "+ nTrucks +" truck" ;
            }
            if(nBotes>1){
                solucion += " and "+ nBotes +" boats.";
            }else{
                solucion +=" and "+ nBotes +" boat.";
            }
            System.out.println(solucion);
        } else {
            System.out.println("No solution.");
        }

    }
        }
