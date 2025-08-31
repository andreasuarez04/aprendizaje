import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        /* DECLARAR VARIABLE */
        double Sumar= 0;
        double Restar=0;
        double Multiplicar =0;
        double Dividir=0;   
        int opcion =0;
        Scanner digitar = new Scanner(System.in);
        boolean condition = true;
        double numero=0;
        double numero1 = 0;




        /* CREAR UN MENU CON LAS 5 OPCIONES SUMA RESTA MULTIPLICACION DIVISION Y SALIR */
        while (condition) {
            System.out.println("elegir opcion");
            System.out.println("opciones \n"
            + "1. Sumar \n"
            + "2. Restar \n"
            + "3. Multiplicar \n"
            + "4. Dividir \n"
            + "5. Salir");
            
            opcion = digitar.nextInt();
            
            if (opcion == 5) {
                System.out.println("Saliendo del programa");
                condition = false;
                
            }else if (opcion ==1) {
                System.out.println("digite el primer numero");
                numero = digitar.nextDouble();
                System.out.println("digite el segundo numero");
                numero1 = digitar.nextDouble();
                Sumar = numero + numero1;
                System.out.println("la suma es: " + Sumar);
            }else if (opcion ==2) {
                System.out.println("digite el primer numero");
                numero = digitar.nextDouble();
                System.out.println("digite el segundo numero");
                numero1 = digitar.nextDouble();
                Restar = numero - numero1;
                System.out.println("la resta es: " + Restar);
                
            }else if (opcion ==3) {
                System.out.println("digite el primer numero");
                numero = digitar.nextDouble();
                System.out.println("digite el segundo numero");
                numero1 = digitar.nextDouble();
                Multiplicar = numero * numero1;
                System.out.println("la multiplicacion es: " + Multiplicar);
            }else if (opcion ==4) {
                System.out.println("digite el primer numero");
                numero = digitar.nextDouble();
                System.out.println("digite el segundo numero");
                numero1 = digitar.nextDouble();
                Dividir = numero / numero1;
                System.out.println("la division es: " + Dividir);
            }
            else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
