public class Calculadora {

    private String nombre;
    private double ultimoResultado;
    private boolean resultadoDisponible;

    public Calculadora(String nombre) {
        setNombre(nombre);
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

    public double sumar(double numero1, double numero2) {
        return guardarResultado(numero1 + numero2);
    }

    public double restar(double numero1, double numero2) {
        return guardarResultado(numero1 - numero2);
    }

    public double multiplicar(double numero1, double numero2) {
        return guardarResultado(numero1 * numero2);
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        return guardarResultado(numero1 / numero2);
    }

    private double guardarResultado(double resultado) {
        ultimoResultado = resultado;
        resultadoDisponible = true;
        return resultado;
    }
}
