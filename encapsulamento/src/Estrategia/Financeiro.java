package Estrategia;

public class Financeiro {
    Diretoria diretoria = new Diretoria();

    void teste (){
        //System.out.println(diretoria.segredo); // private
        System.out.println(diretoria.memorandInterno); //package
        System.out.println(diretoria.orcamentoAnual); // protected long
        System.out.println(diretoria.missaoDaEmpresa); // public
    }
}
