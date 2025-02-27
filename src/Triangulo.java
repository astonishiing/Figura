public class Triangulo extends Figura {

    //Atributos
    double base;
    double altura;

    //Métodos construtores
    public Triangulo(){

    }
    public Triangulo (String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    //Métodos especiais
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }

    @Override
    public String toString(){
        return "Triangulo [base = " + base + ", altura" + altura + ", cor" + super.getCor();
    }

    @Override
    public double area(){
        return base * altura;
    }

}
