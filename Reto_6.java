package Retos;

import java.util.*;

public class Reto_6 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int lanzarn;
        int opcion = 0;
        double apuesta = 0;
        double dinero = 0;
        int veces = 0;
        Random r = new Random();
        boolean moneda = r.nextBoolean();
        do {
            System.out.println("Cuanto dinero desea apostar?");
            apuesta = s.nextDouble();
            System.out.println("Ingrese 1.Cara\n2.Sello");
            lanzarn = s.nextInt();
            System.out.println("Lanzando moneda... \n \n");
            if (moneda == true) {
                System.out.println("Cara");
            } else {
                System.out.println("Sello");
            }
            if(moneda == true && lanzarn == 1) {System.out.println("Ganaste!");
            apuesta = apuesta *2;
            dinero = apuesta + dinero;
            System.out.println("Su balance es de: " + dinero);
            }
            else {System.out.println("Perdiste"); dinero = dinero - apuesta;
            System.out.println("Tu balance actual es de: " + dinero);}
            veces ++;
        System.out.println("Volver a tirar la moneda 1.si\n2.no");
         opcion = s.nextInt();
        }while(opcion == 1);
        System.out.println("Su dinero final es de: "+ dinero + "La cantidad de veces jugadas es: " + veces);
        s.close();
    }
}
