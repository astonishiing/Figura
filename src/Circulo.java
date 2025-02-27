public class Circulo extends Figura{

    double raio = 0;

    public Circulo(){

    }

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }

    @Override
    public String toString(){
        return "Circulo [raio = " + raio + ", cor" + super.getCor()+ "]";
    }

    @Override
    public double area(){
        return raio * 3.14 * 2;
    }

}
