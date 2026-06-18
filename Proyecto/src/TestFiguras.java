public class TestFiguras {
    public static void main(String[] args) {
        //Se crea un arreglo de tipo abstracto y se almacenan en él instancias de clases concretas
        Figura[] figuras = new Figura[4];
        figuras[0]=new Circulo("Rueda", 10.20);
        figuras[1]=new Circulo("Moneda", 2.50);
        figuras[2]=new Rectangulo("Cuadro", 8.40, 6.20);
        figuras[3]=new Rectangulo("Pantalla", 12.00, 8.00);

        double areaTotal=0;
        for(Figura f:figuras){
            System.out.println(f.toString());
            System.out.printf("Área: %s", String.format("%.2f", f.calcularArea()));
            areaTotal+=f.calcularArea();
            
            //instaceof permite verificar en tiempo de ejecución si un objeto implementa una interfaz
            if (f instanceof Dibujable){
               ((Dibujable)f).dibujar();
            }
            if (f instanceof Coloreable){
                ((Coloreable)f).colorear("Verde");
            }
            System.out.printf("Área total: %s", String.format("%.2f", areaTotal)+"\n\n");
        }
        System.out.println("\n");
    }
}
