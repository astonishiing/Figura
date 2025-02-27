public class Quadrado extends Retangulo{
    //Não há adicao de atributos

    //Construtores
    public Quadrado(){

    }
    public Quadrado(String cor, double lado1, double lado2){
        super(cor, lado1, lado2);
    }
    public Quadrado(String cor, double lado){
        lado = super.getLado1();
    }

    @Override
    public double area(){
        return this.getLado1() * this.getLado1();
    }

    @Override
    public String toString(){
        return "Quadrado [area()" + area() + ", cor" + super.getCor();
    }

}
