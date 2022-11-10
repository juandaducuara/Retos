package Retos;

import java.util.Scanner;

public class Reto_2 {
    public static void main(String[] args) 
    {
        double peso;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al centro de salud Famisalud\n");
     System.out.println("Módulo para calcular la dosis de vacuna para bebe.");
        System.out.println("Ingrese el peso del bebe en kilogramos: " );
        peso = sc.nextDouble();
        System.out.println("Ingrese los meses de edad del bebe: " );
        edad = sc.nextInt();
        double dosis = (peso + 10) / (edad * 10) * 8;
        System.out.println("La dosis apropiada para aplicar al bebe es de " + dosis +" mililitros.");
        System.out.println("Gracias por utilizar");
        sc.close();
    }

}
