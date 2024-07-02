package UsarClasses1;

public class UsarClassesPessoaConstrutor {
    public static void main(String[] args) {
        PessoaConstrutorPreenchido p = new PessoaConstrutorPreenchido("gabigol", 27, 100000000) ;
        System.out.println("nome: " + p.nome);
        System.out.println("idade: " + p.idade);
        System.out.println("renda: " + p.renda);

        Arcondicionado a = new Arcondicionado("consul", 1200, "branco ");
        System.out.println("modelo: " + a.modelo);
        System.out.println("preço: " + a.preço);
        System.out.println("cor: " + a.cor);

        Celular c = new Celular("samsung", 631, "s20");
        System.out.println("modelo: " + c.modelo);
        System.out.println("preço: " + c.preço);
        System.out.println("marca: " + c.marca);


    }
}
