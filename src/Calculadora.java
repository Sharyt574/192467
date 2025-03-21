import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Ingresa el primer número (entero):");
            int num1 = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Ingresa el segundo número (entero):");
            int num2 = scanner.nextInt();
            scanner.nextLine(); 
            if (num1 > num2) {
                System.out.println(num1 + " es mayor que " + num2);
            } else if (num1 < num2) {
                System.out.println(num1 + " es menor que " + num2);
            } else {
                System.out.println(num1 + " y " + num2 + " son iguales.");
            }

            double resultadoDivision = (double) num1 / num2;
            int redondeado = (int) Math.round(resultadoDivision);
            System.out.println("Resultado de la división redondeado: " + redondeado);

            if (num1 % num2 == 0) {
                System.out.println(num1 + " es divisible por " + num2);
            } else {
                System.out.println(num1 + " no es divisible por " + num2);
            }

            System.out.println("¿Deseas realizar otra operación? (si/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("¡Gracias por usar la calculadora! ¡Hasta la próxima!");
                break; 
            }
        }

        scanner.close();
    }
}

