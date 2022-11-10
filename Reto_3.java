package Retos;

import java.util.Random;
import java.util.Scanner;

public class Reto_3 {
    public static void main(String[] args) {
        int des,mon;
        Scanner sc = new Scanner(System.in);
        Random moneda = new Random();

        System.out.println("Juego de cara o sello \n Seleccione la opcion deseada \n 1. Para seleccionar cara 2. Para seleccionar sello");
        des=sc.nextInt();
        mon=moneda.nextInt(2);
        if (des==mon) 
        {
            System.out.println("Felicitaciones usted ha ganado");    
        } else {
            System.out.println("Lo siento perdite");
        }
        sc.close();
    }
    
    
    
}
