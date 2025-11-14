public class Licenca {
    String software;
    String departamento;

    static int licencasAtribuidas;

    public Licenca(String departamento, String software) {
        this.departamento = departamento;
        this.software = software;
        licencasAtribuidas ++;
    }

    static int retornaLicencasAtribuidas (){
        return licencasAtribuidas;
    }
}
