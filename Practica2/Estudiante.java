public class Estudiante{
    String nombre;
    String id;
    String materia;
    int calificacion;
    String estado;

    // contructor
    public Estudiante(String nombre, String id, String materia, int calificacion){
        setNombre(nombre);
        setID(id);
        setMateria(materia);
        setCalificacion(calificacion);
        setEstado(Estado(calificacion));
        
    }


    // Setter y getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setID(String id){
        this.id= id;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setCalificacion(int calificacion){
        this.calificacion= calificacion;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getID(){
        return id;
    }
    public String getMateria(){
        return materia;
    }
    public int getCalificacion(){
        return calificacion;
    }
    public String getEstado(){
        return estado;
    }
    public String Estado(int calificacion){
        if(calificacion>59){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }

}