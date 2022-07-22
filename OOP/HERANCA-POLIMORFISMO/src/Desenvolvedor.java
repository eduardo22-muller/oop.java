//Herança: Desenvolvedor é funcionario 
public class Desenvolvedor extends Funcionario {
    private String linguagem;
    // Contrutor
    public Desenvolvedor(String nome, String cpf, double salario, String linguagem, String senha ) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }
      // Polimorfismo - sobrescrever métodos que a classe mae/pai
    
      @Override
    public double getbeneficacao() {
       return this.getSalario() * 1.15;
    }
    
}
