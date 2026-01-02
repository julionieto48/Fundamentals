package Sport;

public class Natacion {

    private String estilo;                 // libre, espalda, pecho
    private int distanciaMetros;
    private double tiempoSegundos;
    private boolean competenciaOficial;
    private boolean piscinaOlimpica;

    // 🔹 Constructor básico
    public Natacion(String estilo) {
        this.estilo = estilo;
        this.distanciaMetros = 50;
        this.tiempoSegundos = 0;
        this.competenciaOficial = false;
        this.piscinaOlimpica = false;
    }

    // 🔹 Constructor con sobrecarga
    public Natacion(String estilo, int distanciaMetros) {
        this(estilo);
        this.distanciaMetros = distanciaMetros;
    }

    // 🔹 Constructor completo
    public Natacion(String estilo, int distanciaMetros, boolean competenciaOficial) {
        this.estilo = estilo;
        this.distanciaMetros = distanciaMetros;
        this.competenciaOficial = competenciaOficial;
        this.tiempoSegundos = 0;
        this.piscinaOlimpica = competenciaOficial;
    }

    // ______ Métodos ______

    public double calcularVelocidad() {
        if (tiempoSegundos <= 0) return 0;
        return distanciaMetros / tiempoSegundos;
    }

    public String nivelExigencia() {
        if (distanciaMetros >= 200 && competenciaOficial) {
            return "Alta exigencia";
        }
        return "Exigencia media";
    }
}
