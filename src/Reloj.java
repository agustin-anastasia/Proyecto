import java.util.concurrent.Semaphore;

public class Reloj extends Thread {

    public Semaphore momentos = new Semaphore(App.totalPedidos);
    public int contador = 1;

    public Reloj(){

    }


    

    
}
