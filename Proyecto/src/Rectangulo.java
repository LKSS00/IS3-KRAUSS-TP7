//En este caso solo se pide usar la interfaz Dibujable
public class Rectangulo extends Figura implements Dibujable{
    private double base;
    private double altura;
    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calcularArea(){
        return base*altura;
    }
    @Override
    public void dibujar(){
        System.out.println("Dibujando rectángulo: "+nombre);
    }
    @Override
    public String toString(){
        return super.toString()+", base= "+base+", altura= "+altura+", área= "+String.format("%.2f", calcularArea());
    }
}
