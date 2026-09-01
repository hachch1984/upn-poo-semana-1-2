import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculadora {

    private static int totalOperaciones = 0;

    private String nombre;
    private double ultimoResultado;
    private boolean resultadoDisponible;
    private final List<Operacion> historial;

    public Calculadora(String nombre) {
        setNombre(nombre);
        historial = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la calculadora es obligatorio.");
        }

        this.nombre = nombre.trim();
    }

    public double getUltimoResultado() {
        if (!resultadoDisponible) {
            throw new IllegalStateException("Todavia no se ha realizado ninguna operacion.");
        }

        return ultimoResultado;
    }

    public boolean isResultadoDisponible() {
        return resultadoDisponible;
    }

    public static int getTotalOperaciones() {
        return totalOperaciones;
    }

    public List<Operacion> getHistorial() {
        return Collections.unmodifiableList(historial);
    }

    public double sumar(double numero1, double numero2) {
        return guardarResultado("Suma", "+", numero1, numero2, numero1 + numero2);
    }

    public double restar(double numero1, double numero2) {
        return guardarResultado("Resta", "-", numero1, numero2, numero1 - numero2);
    }

    public double multiplicar(double numero1, double numero2) {
        return guardarResultado("Multiplicacion", "*", numero1, numero2, numero1 * numero2);
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        return guardarResultado("Division", "/", numero1, numero2, numero1 / numero2);
    }

    private double guardarResultado(
            String nombreOperacion,
            String simbolo,
            double numero1,
            double numero2,
            double resultado) {
        ultimoResultado = resultado;
        resultadoDisponible = true;
        historial.add(new Operacion(nombreOperacion, simbolo, numero1, numero2, resultado));
        totalOperaciones++;
        return resultado;
    }
}
