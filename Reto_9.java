package Retos;

import java.util.Scanner;

public class Reto_9 {
    public static void main(String[] args) {
        String [][] nombres= new String[4][4] ;
        float  [][] precio = new float[4][4];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < precio.length; j++) {
                System.out.println("Digite el nombre del producto en la posición "+(i)+" - "+(j));
                nombres[i][j]=sc.next();
                System.out.println("Digite el precio del producto de la posición "+(i)+" - "+(j));
                precio[i][j]=sc.nextFloat();
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            for (int j = 0; j < precio.length; j++) {
                System.out.print(i+""+j +"Nombre: "+nombres[i][j] + "Precio: "+ precio[i][j]+"           ");                
            }
            System.out.println("\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        }


        sc.close();
    }
    
    
}
