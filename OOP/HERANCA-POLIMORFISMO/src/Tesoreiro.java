public class Tesoreiro extends Funcionario{

    public Tesoreiro(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getbeneficacao() {
        return this.getSalario() / 2;
    }

}
