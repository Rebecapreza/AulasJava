public class Circulo {

    /* Cor e raio, são variáveis dinâmicas, elas mudam de acordo com o objeto instanciado*/
    /*Já o PI é uma variável estática, ela pertence a classe, ou seja, a cada vez que uma instância se referir ao PI, ele sempre usará o memso espaço de memória que foi alocado*/

    String cor;
    double raio;
    static final double PI = Math.PI;

    public Circulo (String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea(){
        return PI * this.raio * this.raio;
    }
}


