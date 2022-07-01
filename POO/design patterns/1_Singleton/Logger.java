public class Logger {

    private static  Logger log; // no variable sino estatica
    private int valor ;
    private String codigo_activacion;

    private Logger() {
    }

    public static synchronized Logger getLog() { // synchronized e susado en caso tal que se usen varios threads de ejecucion

        if(log == null){
            log = new Logger();
        }else{
            System.out.println("Already instanciated");
        }
        return log;  // se retorna una instancia unica alamacenada en la "variable" log 
    }

    public void log(String mensaje){
        System.out.println(mensaje);
    }

    public void setValor(int valor, String mensaje) {
        this.valor = valor;
        codigo_activacion = mensaje;
    }

    public int getValor() {
        return valor;
    }

    public String getCodigo_activacion() {
        return codigo_activacion;
    }
 
    

    
    
    
}
