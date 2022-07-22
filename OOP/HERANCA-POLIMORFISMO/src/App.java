public class App {
    public static void main(String[] args) throws Exception {
        Titular titular1 = new Titular("Eduardo", "12345678", "12345674", "123456654", "12345");
        System.out.println(titular1.getNome());
        
        Diretor diretor = new Diretor("jhonson", "11234567", 5000, "12345");
        Gerente gerente = new Gerente("maria", "123456789",20000, "12345");
        Desenvolvedor desenvolvedor = new Desenvolvedor("pedro", "123465487", 1200,"java", "12345");
        

        System.out.println("Bonificaçao do diretor" + diretor.getbeneficacao());
        System.out.println("Bonificaçao do gerente" + gerente.getbeneficacao());
        System.out.printf("Bonificaçao do desenvolvedor: %.2f\n", desenvolvedor.getbeneficacao());
       
       // Ultilizando um metodo especifico da classe gerente 
        gerente.dizoi();

        if (diretor.autentica("765")) {
            System.out.println("diretor conseguiu logar no sistema.");
        } else {
            System.out.println("diretor nao conseguiu logar o sistema.");
        }
       
        if (titular1.autentica("765")) {
            System.out.println("Titular conseguiu logar no sistema.");
        } else {
            System.out.println("Titular nao conseguiu logar o sistema.");
        }
    }

}


