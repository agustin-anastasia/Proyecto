import java.util.LinkedList;
import java.util.HashMap;

public class Planificador extends Thread {
        
    LinkedList<HashMap> tiposLocal; //lista que contendra nuestros tipos de locales (ej, restaurant,farmacia,etc)
    private LinkedList <Repartidor> colaRepartidores;
    private LinkedList <Pedido> colaPorRestaurantes;
    private LinkedList <Pedido> colaPorFarmacias;
    private LinkedList <Pedido> colaPorInsumosMascotas;
    private LinkedList <Pedido> colaPorSupermercados;
    private Historial historial = new Historial();


	public Planificador(){

        

    }

    @Override
    public void run(){
        for (Repartidor repartidor : colaRepartidores) {
            repartidor.start();
        }
        for (Pedido pedido : colaPorFarmacias) {
            pedido.start();
        }
        for (Pedido pedido : colaPorRestaurantes) {
            pedido.start();
        }
        for (Pedido pedido : colaPorSupermercados) {
            pedido.start();
        }
        for (Pedido pedido : colaPorInsumosMascotas) {
            pedido.start();
        }
    }

    
    
}
