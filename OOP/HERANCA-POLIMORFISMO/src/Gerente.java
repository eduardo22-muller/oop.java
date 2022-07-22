    public class Gerente extends Funcionario {
        private Autenticavel autenticavel;


        public Gerente(String nome, String cpf, double salario, String senha) {
            super(nome, cpf, salario);

        }

        @Override
        public double getbeneficacao() {
            return this.getSalario() * 1.25;
        }

        public void dizoi(){
            System.out.println("oi do gerente");
        }

    
}
