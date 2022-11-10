package Retos;

import java.util.Scanner;

public class Reto_8 {
    public static void main(String[] args) {
        String[] nombres; 
        float[] tiempos;        
        int numeroCompetidores=0 , indiceDelGanador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cordial saludooo , esta es la competencia de nadadores");
        System.out.println("Digite la cantidad de nadadores que compiten");
        numeroCompetidores=sc.nextInt();
        tiempos = new float[numeroCompetidores];
        nombres = new String[numeroCompetidores];
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("Digite el nombre del #"+(i+1)+" competidor");
            nombres[i]=sc.next();
            System.out.println("Digite el tiempo del #"+(i+1)+" competidor");
            tiempos[i]=sc.nextFloat();  
            if(tiempos[i]<tiempos[indiceDelGanador]){
                indiceDelGanador = i;
            }          
        }
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("Competidor # " + (i+1) +"\nNombre : "+nombres[i]+ "\nTiempo : " +tiempos[i]);
        }               
        System.out.println("El ganador con un tiempo de : "+tiempos[indiceDelGanador]+" es: "+ nombres[indiceDelGanador]);
        sc.close();  
    }
    
}
