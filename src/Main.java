import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora("Welcome to calculator UPN, Grupo 11");
        int opcion;

        System.out.println("================================");
        System.out.println("     " + calculadora.getNombre().toUpperCase());
        System.out.println("================================");

        do {
            mostrarMenu();
            opcion = leerEntero(entrada, "Digite un código de opcion válido: ");

            if (opcion == 0) {
                break;
            }

            if (opcion == 5) {
                mostrarHistorial(calculadora);
                continue;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Codigo de Opcion inválido. Intente nuevamente.\n");
                continue;
            }

            double numero1 = leerNumero(entrada, "Ingrese el primer numero: ");
            double numero2 = leerNumero(entrada, "Ingrese el segundo numero: ");

            try {
                double resultado = switch (opcion) {
                    case 1 -> calculadora.sumar(numero1, numero2);
                    case 2 -> calculadora.restar(numero1, numero2);
                    case 3 -> calculadora.multiplicar(numero1, numero2);
                    case 4 -> calculadora.dividir(numero1, numero2);
                    default -> throw new IllegalStateException("Código de Opcion no esperada.");
                };

                System.out.println("Resultado: " + resultado + "\n");
            } catch (ArithmeticException error) {
                System.out.println("Error: " + error.getMessage() + "\n");
            }
        } while (true);

        System.out.println("Operaciones realizadas: " + Calculadora.getTotalOperaciones());
        System.out.println("Gracias por utilizar la calculadora.");
        entrada.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Ver historial");
        System.out.println("0. Salir");
    }

    private static void mostrarHistorial(Calculadora calculadora) {
        if (calculadora.getHistorial().isEmpty()) {
            System.out.println("Todavia no hay operaciones en el historial.\n");
            return;
        }

        System.out.println("\n--- HISTORIAL DE OPERACIONES ---");
        for (int indice = 0; indice < calculadora.getHistorial().size(); indice++) {
            Operacion operacion = calculadora.getHistorial().get(indice);
            System.out.println((indice + 1) + ". " + operacion);
        }
        System.out.println();
    }

    private static int leerEntero(Scanner entrada, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String valor = entrada.nextLine().trim();

            try {
                return Integer.parseInt(valor);
            } catch (NumberFormatException error) {
                System.out.println("Debe ingresar un numero entero.");
            }
        }
    }

    private static double leerNumero(Scanner entrada, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String valor = entrada.nextLine().trim().replace(',', '.');

            try {
                return Double.parseDouble(valor);
            } catch (NumberFormatException error) {
                System.out.println("Debe ingresar un numero valido.");
            }
        }
    }
}
