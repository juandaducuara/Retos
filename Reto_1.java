package Retos;

import java.util.Scanner;

public class Reto_1 {
    public static void main(String[] args)
    {
        Scanner number = new Scanner (System.in);        
        float f;
        double c;
        System.out.println("Bienvenido al programa de conversión de grados");
        System.out.println("Ingrese la cantidad de grados Fahrenheit");
        f = number.nextFloat();
        c = ((f-32)/1.8);
        System.out.println(f+" ° Fahrenheit equivalen a:" +c+"° centígrado");
        System.out.println("Fin del programa \n");
        number.close();
    }


}
