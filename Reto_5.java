package Retos;

import java.util.Scanner;

public class Reto_5 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        double precio = 0;
        int cantidad;
        double preciofinal = 0;
        System.out.println("Cuantos productos desea agregar? ");
        cantidad = s.nextInt();
        for(int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el valor del producto: " + i);
            precio = s.nextDouble();
               preciofinal = preciofinal + precio;}
        System.out.println("El total de los productos es: " + preciofinal);
        s.close();
}
    
}
