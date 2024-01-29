class forma {

    private String nombre;

    public forma(String nombre) {
        this.nombre=nombre;
    }

    public double area(){
        return 0;
    }

    @Override
    public String toString() {
        return "forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
class esfera extends forma{
    private double radio;
    private double area;

    @Override
    public double area() {
        return area=4*Math.PI*radio*radio;
    }

    public esfera (double radio){
        super("esfera");
        this.radio=radio;

    }

}
class rectangulo extends forma{
    private int altura;
    private int anchura;
    private double area;

    @Override
    public double area() {
        return area=anchura*altura;
    }

    public rectangulo(int altura,int anchura) {
        super("rectangulo");
        this.altura=altura;
        this.anchura=anchura;

    }


}
class cilindro extends forma{
    private int altura;
    private int radio;
    private double area;

    @Override
    public double area() {
        return area=Math.PI*radio*radio*altura;
    }


    public cilindro(int altura,int radio) {
        super("cilindro");
        this.altura=altura;
        this.radio=radio;

    }
}

class pintura{

    private double cobertura;

    public pintura(double cobertura){
        this.cobertura=cobertura;
    }

    public double calcularPintura(forma mascaparra){
        return mascaparra.area()/cobertura;
    }
}
class mainPintura{
    public static void main(String[] args) {
        pintura p=new pintura(250);
        rectangulo r= new rectangulo(20,35);
        esfera e= new esfera(15);
        cilindro c= new cilindro(30,10);

        System.out.println("esfera: "+ p.calcularPintura(e));
        System.out.println("rectangulo: "+ p.calcularPintura(r));
        System.out.println("cilindro: " + p.calcularPintura(c));
    }
}

