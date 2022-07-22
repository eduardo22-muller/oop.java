import javax.swing.plaf.synth.SynthSeparatorUI;

public class Conta {
    // Atributos
    public double saldo;
    public int agencia;
    public int conta;
    public Titular titular;

    // Metodos
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.saldo < valor) {
            return false;
        }

        this.saldo -= valor;
        contaDestino.saldo += valor;
        return true;
    }

    public static void main(String[] args) {
        // Instanciando um objeto da classe conta
        Conta conta1 = new Conta();
        conta1.saldo = 10000;
        conta1.agencia = 0001;
        conta1.conta = 10000;
                
        // Titular titular1 = new Titular();
        // titular1.nome = "eduardo";
        // titular1.cpf = "111.111.111-11";
        // conta1.titular = titular1;

        // System.out.println(conta1.saldo);
        // System.out.println(conta1.agencia);
        // System.out.println(conta1.conta);

        Conta conta2 = new Conta();
        conta1.saldo = 10000;
        conta1.agencia = 5000;
        conta1.conta = 20000;
        
        // Titular titular2 = new Titular();
        // titular2.nome = "jhonson";
        // titular2.cpf = "111.111.111-11";
        // conta2.titular = titular2;
       

        // System.out.printf(" Saldo na conta: %.2f | Saldo da conta2. %.2f\n",
        // conta1.saldo, conta2.saldo);
        // System.out.println(conta2.agencia);
        // System.out.println(conta2.conta);

        // Ultilizando métodos
        conta1.deposita(100);
        System.out.println(conta1.saldo);

        if (conta1.sacar(5000)) {
            System.out.println("saque bem sucedido");
        } else {
            System.out.println("falha ao sacar");
        }
        System.out.println("saldo:" + conta1.saldo);

        if (conta1.transferir(1000, conta2)) {
            System.out.println("Tranferencia bem-sucedida");
        } else {
            System.out.println("Saldo insufuciente");
        }

        System.out.println("titular da conta 1:" + conta1.titular. getCpf());
        System.out.println("saldo da conta 1:" + conta1.saldo);
        System.out.println("titular da conta 2:" + conta2.titular.getCpf());
        System.out.println("saldo da conta 2:" + conta2.saldo);

    }

}
