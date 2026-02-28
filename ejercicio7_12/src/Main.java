import java.util.Scanner;

/*
Implementa una clase que permita resolver ecuacuiones de segundo grado. Los coeficientes
pueden indicarse en el constuctor y modificarse a posteriori. Es fundamental que la clase disponga de
un metodo que devuelva las distintas soluciones y de un metodo que nos informe si el discrimiente es
positivo.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el coeficiente c: ");
        double c = sc.nextDouble();

        Calculadora nuevoCalculo = new Calculadora(a,b,c);

        System.out.println("\n--- Resultados ---");
        System.out.println("¿El discriminante es positivo? " + (nuevoCalculo.isDiscrimantePositivo() ? "Sí" : "No"));
        System.out.println("Valor del discriminante: " + nuevoCalculo.getDiscriminante());

        double[] soluciones = nuevoCalculo.solucion();

        if (soluciones.length == 0) {
            System.out.println("No existen soluciones en el conjunto de los números reales.");
        } else if (soluciones.length == 1) {
            System.out.println("La solución única es: " + soluciones[0]);
        } else {
            System.out.println("Solución 1 (x1): " + soluciones[0]);
            System.out.println("Solución 2 (x2): " + soluciones[1]);
        }

    }
}