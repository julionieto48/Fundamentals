package Sport;


import java.util.ArrayList;

public class Patinaje {
private String modalidad;              // artístico, velocidad, hockey
private double velocidadPromedio;       // km/h
private boolean competenciaOficial;     // ¿es federada?
private boolean usoCasco;                // seguridad
private ArrayList<String> implementos;   // patines, protecciones
private int cantidadParticipantes;    // número de competidores
private double promediocostoimplementos; // costo promedio de implementos
private ArrayList<String> paisesmaspopulares; // países con más patinadores

public enum EstadoCompetencia {
    NO_INICIADA,
    EN_CURSO,
    FINALIZADA,
    SUSPENDIDA
}

private EstadoCompetencia estado;

    public Patinaje(String modalidad, boolean competenciaOficial) {
        this.modalidad = modalidad;
        this.competenciaOficial = competenciaOficial;
        this.usoCasco = true;
        this.velocidadPromedio = 0;
        this.cantidadParticipantes = 0;
        this.promediocostoimplementos = 0;
        this.estado = EstadoCompetencia.NO_INICIADA;

        this.implementos = new ArrayList<>();
        this.paisesmaspopulares = new ArrayList<>();
    }

    //_______ Métodos _______

    public void iniciarCompetencia() {
        if (!usoCasco && competenciaOficial) {
            System.out.println("No se puede iniciar: casco obligatorio");
            return;
        }
        estado = EstadoCompetencia.EN_CURSO;
        System.out.println("Competencia de patinaje iniciada");

    }

    public void suspenderCompetencia(String motivo) {
        estado = EstadoCompetencia.SUSPENDIDA;
        System.out.println("Competencia suspendida: " + motivo);
    }

    public void finalizarCompetencia() {
        estado = EstadoCompetencia.FINALIZADA;
        System.out.println("Competencia finalizada");
    }

    public void agregarImplemento(String implemento) {
        implementos.add(implemento);
    }
    
    public void agregarPaisPopular(String pais) {
        paisesmaspopulares.add(pais);
    }


    public void registrarParticipantes(int cantidad) {
        if (cantidad > 0) {
            this.cantidadParticipantes = cantidad;
        }
    }

    public double calcularCostoTotalImplementos() {
        return promediocostoimplementos * cantidadParticipantes;
    }


    public String nivelExigencia() {

        if (velocidadPromedio > 40 && competenciaOficial) {
            return "Alta exigencia";
        } else if (velocidadPromedio > 25) {
            return "Exigencia media";
        }
        return "Exigencia baja";
    }

        public void setUsoCasco(boolean usoCasco) {
        this.usoCasco = usoCasco;

    if (!usoCasco && competenciaOficial) {
            suspenderCompetencia("Falta de elementos de seguridad");
        }
    }


}

