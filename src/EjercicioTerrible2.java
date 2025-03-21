import java.util.Scanner;

public class EjercicioTerrible2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];
        int[] edades = new int[5];
        double sumaEdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();
            
            System.out.println("Ingrese la edad de " + nombres[i] + ":");
            while (true) {
                try {
                    edades[i] = Integer.parseInt(scanner.nextLine());
                    if (edades[i] < 0) {
                        System.out.println("Por favor, ingrese una edad válida (mayor o igual a 0):");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero:");
                }
            }
            sumaEdades += edades[i];
        }

        double promedioEdad = sumaEdades / 5;
        System.out.println("Edad promedio de los estudiantes: " + promedioEdad);

        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + " es " + (esMayorDeEdad(edades[i]) ? "mayor" : "menor") + " de edad.");
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
