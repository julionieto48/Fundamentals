package Sport;

import java.util.ArrayList;

public class ArtesMarciales {

    private String disciplina;              // karate, judo, taekwondo
    private String grado;                   // cinturón
    private boolean competenciaOficial;
    private int numeroTecnicas;
    private ArrayList<String> armas;
    private boolean combate;

    // 🔹 Constructor vacío
    public ArtesMarciales() {
        this.disciplina = "No definida";
        this.grado = "Blanco";
        this.competenciaOficial = false;
        this.numeroTecnicas = 0;
        this.armas = new ArrayList<>();
        this.combate = false;
    }

    // 🔹 Constructor con disciplina
    public ArtesMarciales(String disciplina) {
        this();
        this.disciplina = disciplina;
    }

    // 🔹 Constructor completo (sobrecarga)
    public ArtesMarciales(String disciplina, String grado, boolean competenciaOficial) {
        this.disciplina = disciplina;
        this.grado = grado;
        this.competenciaOficial = competenciaOficial;
        this.numeroTecnicas = 0;
        this.armas = new ArrayList<>();
        this.combate = false;
    }

    // ______ Métodos ______

    public void aprenderTecnica() {
        numeroTecnicas++;
    }

    public void agregarArma(String arma) {
        armas.add(arma);
    }

    public String nivelPractica() {
        if (grado.equalsIgnoreCase("Negro")) {
            return "Avanzado";
        }
        return "En formación";
    }
}
