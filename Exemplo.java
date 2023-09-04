public class Exemplo {
    
    public static void main (String[] args) {
        Pessoa pes = new Pessoa();
        pes.setNome("Matheus");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Fulano");
        pf.setCpf("123456789");

        System.out.println("Olá Mundo");
        System.out.println(pes.getNome());
    }
}