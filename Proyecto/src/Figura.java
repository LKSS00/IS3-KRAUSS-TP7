//Esta clase no se puede instanciar, solo es una plantilla para las subclases que la implementen
public abstract class Figura {
    //Solo las subclases pueden acceder a este atributo
    protected String nombre;

    public Figura(String nombre){
        this.nombre=nombre;
    }
    
    //Cada subclase tiene que implementar este método, dado a que es abstracto
    public abstract double calcularArea();

    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString(){
        return "Figura [nombre="+nombre+"]";
    }
}