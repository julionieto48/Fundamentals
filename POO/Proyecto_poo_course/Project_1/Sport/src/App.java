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
    
    }


  
}
