package CasaB;

public class Rebeca {
    CasaA.Thainara sogra = new CasaA.Thainara();

    void teste () {
        //System.out.println(sogra.segredo); // private
        //System.out.println(sogra.facoDentroDeCasa); // package
        //System.out.println(sogra.familiaSabe); // protected
        System.out.println(sogra.todoMundoSabe); // public
    }
}
