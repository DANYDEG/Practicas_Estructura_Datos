public class Triangulo implements FiguraGeometrica{

    private double area;
    private double base;
    private double altura;

    public Triangulo(){
        
    }

    
    public Triangulo(double b, double h){
        this.base =b;
        this.altura =h;


    }

    public double calcularArea(){
        this.area = this.base * this.altura /2;
        return area;

    }

    public double calcularPerimetro(){
        return 0;
    }




    // geters and setters

    public double getArea() {
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
}
