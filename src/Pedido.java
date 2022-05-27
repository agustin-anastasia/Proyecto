import java.text.DateFormat;
import java.util.concurrent.Semaphore;

public class Pedido extends Thread {

    Integer prioridad;
    DateFormat horaPedido;
    Cliente cliente;
    public Semaphore semaphore;


    public Pedido(Integer prioridad, DateFormat horaPedido,  Cliente cliente, Semaphore semaphore){
        this.prioridad = prioridad;
        this.horaPedido = horaPedido;
        this.cliente = cliente;
        this.semaphore = semaphore;
    }
    
    public void signalSemaphore() {
        this.semaphore.release();
    }

    @Override
    public void run(){

    }


    
}
