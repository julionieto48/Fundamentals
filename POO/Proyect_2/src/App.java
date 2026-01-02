import Sport.ArtesMarciales;
import Sport.Natacion;
import Sport.Patinaje;
import UserSide.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
         Patinaje patinaje = new Patinaje("Velocidad", true);

    patinaje.agregarImplemento("Patines");
    patinaje.agregarImplemento("Casco");

    patinaje.agregarPaisPopular("Colombia");
    patinaje.agregarPaisPopular("Italia");

    patinaje.registrarParticipantes(12);
    patinaje.iniciarCompetencia();

    System.out.println(patinaje.nivelExigencia());

      Usuario usuario = new Usuario("Julian", "Entrenador");

    usuario.consultarDeporte("Patinaje");
    usuario.crearFichaTecnica("Patinaje artistico");
    usuario.mostrarDeportesConsultados();

    //_____
    Natacion n1 = new Natacion("Libre");
    Natacion n2 = new Natacion("Espalda", 100);
    Natacion n3 = new Natacion("Mariposa", 200, true);

    ArtesMarciales a1 = new ArtesMarciales();
    ArtesMarciales a2 = new ArtesMarciales("Karate");
    ArtesMarciales a3 = new ArtesMarciales("Judo", "Negro", true);

    }


  
}
