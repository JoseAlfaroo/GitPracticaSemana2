import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcion;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("0. Salir");
            System.out.print("¿Qué operación desea realizar?: ");

            opcion = scanner.nextInt();

            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción no válida. Intente nuevamente.");
                continue;
            }

            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora...");
                break;
            }

            System.out.print("Ingrese el número 1: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el número 2: ");
            double num2 = scanner.nextDouble();

            switch (opcion) {

                case 1:
                    calc.sumar(num1, num2);
                    break;

                case 2:
                    calc.restar(num1, num2);
                    break;

                case 3:
                    calc.dividir(num1, num2);
                    break;

                case 4:
                    calc.multiplicar(num1, num2);
                    break;
            }

        } while (true);

        scanner.close();
    }
}
