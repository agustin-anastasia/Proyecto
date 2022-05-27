public class Repartidor extends Thread{
    Integer indentificador;
    Pedido pedidoAsignado;
    Boolean disponible; //TRUE: disponible, FALSE: haciendo entrega
    Integer ubicacion;


    public Repartidor(Integer id, Boolean estado){
        this.indentificador = id;
        this.disponible = estado;
    }

    public Integer getIdentificador() {
        return this.indentificador;
    }

    public void setId(Integer id) {
        this.indentificador = id;
    }

    public Integer getUbicacion(){
        return this.ubicacion;
    }

    public void setUbicacion(Integer direccion){
        this.ubicacion = direccion;
    }

    public Pedido getPedido(){
        return this.pedidoAsignado;
    }
    public void setPedido(Pedido pedidoAsignado){
        this.pedidoAsignado=pedidoAsignado;
    }

    
    @Override
    public void run() {
        
    }
    

    
}
