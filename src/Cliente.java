public class Cliente {

    String nombre;
    String direccion;
    Integer id;
    

    public Cliente(String nombre, String direccion, Integer id){
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    







    
}
