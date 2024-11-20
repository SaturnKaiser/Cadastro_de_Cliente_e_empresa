package CDProjektBlack;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "9999-9999", "123.456.789-10");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Av. B, 456", "8888-8888", "12.345.678/0001-99", "Empresa X LTDA");

        pf.imprimirDados();
        System.out.println();
        pj.imprimirDados();
    }
}

