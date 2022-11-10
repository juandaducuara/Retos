package Retos;

import java.util.Scanner;

public class Reto_7 {
    public static void main(String[] args) {
        int cantidadNotas=0;
        double[] Notas ;
        double prom,totalNotas=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al programa de notas");
        System.out.println("Digite la cantidad de notas que va a ingresar");
        cantidadNotas=sc.nextInt();
        if (cantidadNotas>0&&cantidadNotas<=40) {
            Notas = new double[cantidadNotas];
            for (int i = 0; i < Notas.length; i++) {
            System.out.println("Nota #"+ (i+1) );            
            Notas[i]= sc.nextDouble(); 
            totalNotas = totalNotas + Notas[i];                     
            }
            prom = totalNotas / cantidadNotas;
            if(prom>4){
                System.out.println("El promedio es notas es : " + prom);
                System.out.println("Aprobaste con buenos resultados");
            }else if(prom<4 && prom>=3)
            {
                System.out.println("El promedio es notas es : " + prom);
                System.out.println("Pasaste raspando");
            }else if(prom>=0 && prom<3){
                System.out.println("El promedio es notas es : " + prom);
                System.out.println("Reporbaste");
            }else{
                System.out.println("Alguno de los valores no fue digitado correctamente");
            }
        
        } else {
            System.out.println("Cantidad no valida");
        }
        
        
        sc.close();
    }
    
}
