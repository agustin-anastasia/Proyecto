public class Local {

    String nombre;
    Integer id;
    Integer direccion;
    Integer tipoLocal;
    Integer prioridad;

    public Local (String nombre, Integer id, Integer direccion, Integer tipoLocal, Integer prioridad){
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.tipoLocal = tipoLocal;
        this.prioridad = prioridad;
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

    public Integer getDireccion(){
        return this.direccion;
    }

    public void setDireccion(Integer direccion){
        this.direccion = direccion;
    }

    
}
