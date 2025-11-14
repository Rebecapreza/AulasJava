package CasaB;

import CasaA.Thainara;

public class Matheus extends Thainara {
    void teste (){
        System.out.println(super.segredo); // private - só vê na mesma classe
        System.out.println(super.facoDentroDeCasa); // package - só vê o mesmo pacote
        System.out.println(super.familiaSabe); // protected - pode ver em pacotes diferentes, desde que exista a relação de herança
        System.out.println(super.todoMundoSabe); // public - todas as classes podem visualizar
    }

}
