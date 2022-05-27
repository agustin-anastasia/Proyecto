import java.util.LinkedList;
import java.util.Queue;


public class Historial {
    
    // Mostrar por consola el flujo del programa

    private static final Historial logger = new Historial();
    private final Queue<String> lineas = new LinkedList<String>();
    
    public Historial() { }
    
    public void agregarLinea(String texto) {
    }

    public void guardarArchivo(){}
}
