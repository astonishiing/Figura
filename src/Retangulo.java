public class Retangulo extends Figura{
    double lado1;
    double lado2;

    public Retangulo(){

    }
    public Retangulo(String cor, double lado1, double lado2){
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public void setLado1(double lado1){
        this.lado1= lado1;
    }
    public double getLado1(){
        return lado1;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    public double getLado2(double lado2){
        return lado2;
    }

    @Override
    public String toString(){
        return "Retangulo [lado1 = " + lado1 + ", [lado2 = " + lado2 + ", cor" + super.getCor();
    }

    @Override
    public double area(){
        return this.lado1 * this.lado2;
    }
}
