public class Operacion {

    private final String nombre;
    private final String simbolo;
    private final double numero1;
    private final double numero2;
    private final double resultado;

    public Operacion(
            String nombre,
            String simbolo,
            double numero1,
            double numero2,
            double resultado) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return nombre + ": " + numero1 + " " + simbolo + " " + numero2 + " = " + resultado;
    }
}

