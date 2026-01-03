package UserSide;


import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;




public class Usuario {

    private String nombre;
    private int edad;
    private String rol;                     // entrenador, patinador, estudiante
    private boolean activo;                 // ¿puede usar el sistema?
    private String correo;

    private List<String> deportesConsultados; // composicion(no es herencia) Una clase usa o contiene a otra para cumplir su función, sin heredar de ella.
    private List<String> fichasTecnicasCreadas;
    private List<LocalDateTime> fechasConsultas;
    


    public Usuario(String nombre, String rol) {
    this.nombre = nombre;
    this.rol = rol;
    this.activo = true;
    this.deportesConsultados = new ArrayList<>();
    this.fichasTecnicasCreadas = new ArrayList<>();
    this.fechasConsultas = new ArrayList<>();

    }

    public void consultarDeporte(String deporte) {
        if (!activo) {
            System.out.println("Usuario inactivo, acceso denegado");
            return;
        }

    deportesConsultados.add(deporte);
    fechasConsultas.add(LocalDateTime.now());
    System.out.println(nombre + " consultó " + deporte + " en " + LocalDateTime.now());
    }


    public void crearFichaTecnica(String deporte) {
        if (!activo) {
            System.out.println("No puede crear fichas técnicas");
            return;}
        
        fichasTecnicasCreadas.add(deporte);
        System.out.println("Ficha técnica creada para: " + deporte);    
    }



    public void desactivarUsuario() {
        activo = false;
        System.out.println("Usuario desactivado");
    }

    public void mostrarDeportesConsultados() {
        System.out.println("Deportes consultados:");
        for (String d : deportesConsultados) {
             System.out.println("- " + d);
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setCorreo(String correo) {
        if (correo.contains("@")) {
            this.correo = correo;
        }
    }

    public void mostrarHistorialConsultas() {
        for (int i = 0; i < deportesConsultados.size(); i++) {
            System.out.println(
            deportesConsultados.get(i) + 
            " - " + 
            fechasConsultas.get(i)
            );
        }
    }



}
