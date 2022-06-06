import java.text.DateFormat;
import java.util.concurrent.Semaphore;

public class Pedido extends Thread {

    private Integer prioridad;
    private DateFormat horaPedido;
    private Integer cliente;
    private Local local;

    public Semaphore semaforo;


    public Pedido(Integer prioridad, DateFormat horaPedido,  Integer cliente, Semaphore semaphore){
        this.prioridad = prioridad;
        this.horaPedido = horaPedido;
        this.cliente = cliente;
        this.semaforo = semaphore;
    }
    
    public void releaseSemaforo() {
        this.semaforo.release();
    }



    @Override
    public void run(){

    }


    
}
