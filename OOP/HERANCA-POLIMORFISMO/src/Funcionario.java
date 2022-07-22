// Classes abstratas nao podem ser instanciadas (crias um objeto) - servem como modeo para outras classes 
abstract public class Funcionario {
    //Atributos: nome, cpf e salario
    private String nome;
    private String cpf;
    private double salario;
   
    // private int cargo;

public double getSalario() {
        return salario;
    }

}
public Funcionario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
   
    // this.cargo = cargo;
}
    // Getters / Setters
    public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setSalario(double salario) {
    this.salario = salario;
}

{// public int getCargo() {
//     return cargo;
// }
// public void setCargo(int cargo) {
//     this.cargo = cargo;
}

// Metodos abstrato -> M
abstract public double getbeneficacao();
    


}






