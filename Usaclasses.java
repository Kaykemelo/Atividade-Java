import UsarClasses1.Pessoa;

public class Usaclasses {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Pessoa p ; 
        p = new Pessoa() ;
        Pessoa p1 = new Pessoa() ; 

        p.nome = "Fulano" ;
        p.idade  = 25 ; 
        p.renda = 1000 ; 
        p.altura = (float)  1.80;
        p.cep = 03662010 ; 
        p.cor = "branco " ; 
        p.endereço = "rua coqueta " ; 
        p.nascimento = "12/01/2007 ";

        
        System.out.println("Nome: " + p.nome) ;
        System.out.println("Idade : " + p.idade) ;
        System.out.println("Renda : " + p.renda) ;
        System.out.println("Altura : " + p.altura) ;
        System.out.println("cep : " + p.cep ) ;
        System.out.println("cor : " + p.cor ) ;
        System.out.println("Endereço  : " + p.endereço) ;
        System.out.println("Nascimento : " + p.nascimento) ;






        System.out.println("Nome : " + p1.nome) ; 
        System.out.println("Idade : " + p1.idade) ; 
        System.out.println("Renda : " + p1.renda) ;

    }
}
