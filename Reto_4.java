package Retos;

import java.util.Scanner;

public class Reto_4 {
    public static void main(String args[])
	{
		System.out.println("Bienvenido a piedra papel tijera");
		Scanner sc = new Scanner(System.in);

		int seleccionMaquina = (int)(Math.random() * 3) + 1;		

		System.out.print("Seleccione 1 para Piedra 2 para Papel 3 para Tijera]: ");
		int seleccionUsuario = sc.nextInt();
		
		switch ( seleccionMaquina )
		{
			case 1:
				System.out.println("Piedra");
				switch ( seleccionUsuario )
				{
					case 1: 
                    System.out.println("Empatados"); 
                    break;
					case 2: 
                    System.out.println("Gano"); 
                    break;
					case 3: 
                    System.out.println("Perdio");
                    break;
				}
				break;
			case 2:
				System.out.println("Papel");
				switch ( seleccionUsuario )
				{
					case 1: 
                    System.out.println("Perdio"); 
                    break;
					case 2: 
                    System.out.println("Empatados"); 
                    break;
					case 3: 
                    System.out.println("Gano"); 
                    break;
				}
				break;
			case 3:
				System.out.println("Tijera");
				switch ( seleccionUsuario )
				{
					case 1: 
                    System.out.println("Gano"); 
                    break;
					case 2: 
                    System.out.println("Perdio"); 
                    break;
					case 3: 
                    System.out.println("Empatados"); 
                    break;
				}
				break;
		}
        sc.close();
	}

}
