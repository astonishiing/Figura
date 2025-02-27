public abstract class Figura {
    //Atributos
    private String cor;

    //Métodos construtores
    public Figura(){

    }
    public Figura(String cor){
        super();
        this.cor = cor;
    }
    //Métodos getters e setters
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    @Override
    public String toString(){
        return "Figura [cor =" + cor + "]";
    }

    public abstract double area();
}
