public class Main {
    public static void main(String[] args) {
//        Colaborador colaborador = new Colaborador("Rebeca");
//        Colaborador colaborador2 = new Colaborador("Thainara", 92906682);
//        Colaborador colaborador3 = new Colaborador("Antônio", 92906680, "aprendiz");
//        System.out.println(colaborador.nome);


//        Colaborador.nome = "Rebeca";
//        Colaborador.cargo = "Jovem Aprendiz";
//        Colaborador.edv = 92906684;
//
//        System.out.println(Colaborador);


//        Departamento departamento = new Departamento("ETS", 1520, 600);
//        departamento.atualizarNome("Bosch");
//        System.out.println(departamento.nome);
//
//        System.out.printf("O orçamento foi de: " + departamento.calcularAumentoDeOrcamento(0.2));
//        System.out.printf("\n O departamento %s tem %.2f funcionarios", departamento.nome, departamento.obterNumeroDeFuncionarios());

        Colaborador afonso = new Colaborador(92907555, "Afonso", "Técnico de qualidade");
        System.out.println(afonso.nome);

        Mensalista mensalista = new Mensalista(92897452, "Rebeca", "Técnica de Qualidade", 4000);
        System.out.println(mensalista);

    }
}