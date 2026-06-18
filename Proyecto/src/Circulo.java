//extends permite desde una clase
// implements permite heredar desde varias intefaces
public class Circulo extends Figura implements Coloreable, Dibujable{
    private double radio;
    public Circulo(String nombre, double radio){
        //Se usa super para llamar al constructor de la clase Figura
        super(nombre);
        this.radio=radio;
    }
    //@Override indica que se está sobreescribiendo código de una superclase o una interfaz
    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    @Override
    public void dibujar(){
        System.out.println("\nDibujando círculo: "+nombre);
    }
    @Override
    public void colorear(String color){
        System.out.println("Coloreando círculo de color: "+color);
    }
    @Override
    public String toString(){
        return super.toString()+ ", radio= "+radio +", área= "+String.format("%.2f", calcularArea());
    }
}
