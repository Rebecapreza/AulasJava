public class Colaborador {
//    int edv;
//    String nome;
//    String cargo;
//
//    //contrutor padrão ou sem parametros
//    Colaborador(){
//        System.out.println("Construtor sem parametros foi executado");
//    }
//
//    //construtor com parametros
//    Colaborador(String nome1){
//        nome = nome1;
//        System.out.println("Construtor 1 com parametros foi chamado");
//    }
//    Colaborador(String nome2, int edv1){
//        nome = nome2;
//        edv = edv1;
//        System.out.println("Construtor 2 com parametros foi chamado");
//    }
//    Colaborador(String nome2, int edv2, String cargo1){
//        nome = nome2;
//        edv = edv2;
//        cargo = cargo1;
//        System.out.println("Construtor 3 com parametros foi chamado");
//    }


    int edv;
    String nome;
    String cargo;

    public Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
    }
}
