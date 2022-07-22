public class Diretor extends Funcionario  implements Autenticacao {
    //Composição
    private Autenticavel autenticavel1;

    public Diretor(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario, senha);
        this.autenticavel = new Autenticavel(senha);
        
    }

    @Override
    public double getbeneficacao() {
        return this.getSalario() * 1.5;
    }
    @Override
    public boolean autentica(String senha) {
        // TODO Auto-generated method stub
        return false;
    } 
    }
    

