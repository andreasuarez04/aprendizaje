import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        double suma = 0;
        /* Declarar un objeto */
        Scanner digitar = new Scanner(System.in);
        double numero1, numero3;
        System.out.println("Escribe un numero: ");
        numero1 = digitar.nextDouble();
        System.out.println("Escribe el numero 2");
        numero3 = digitar.nextDouble();
        suma = numero1 + numero3;
        /* Declaración de variables */
        int numero = 0;
        int numero2 = 1;
        
        //suma= numero + numero2;

        /* Bucle for */
        for (int i = 0; i <= 5; i++) {
            System.out.println("El valor de i es: " + i);
        }
        
        /* bucle while */
        boolean condicion = true;
        while (condicion) {
            System.out.println("elegir opcion");
            System.out.println("opciones \n"
            + "1. Sumar \n"
            + "2. Restar \n"
            + "3. Multiplicar \n"
            + "4. Dividir \n"
            + "5. Salir");
            
            int opcion = digitar.nextInt();
            if (opcion == 5) {
                System.out.println("Saliendo del programa");
                condicion = false;
                
            }
        }
        
        System.out.println("El resultado de la suma es: " + suma);
    }
}
