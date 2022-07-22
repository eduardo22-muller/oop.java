import java.util.Scanner;

class introducaojava {

    public static void main(String[] args) {
        System.out.println("ola mundo!");
    
        int inteiro = 10 ;
        float decimalMenor = 10.2f;
        double decimalMaior = 10.2;
        char caractere = 'a';
        String palavra = "boa noite";
        boolean booleano = true;

    

        String[] nomes = {"joâo", "Maria", "pedro"};
        // nomes[4] = "Carlinhos";
        
        int[] numeros = new int[10];
        numeros[5] = 6;
        numeros[9] = 11;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);;
        }

        for (int i : numeros) {
            System.out.println(i);
        }

        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i]);
            i++;
        }

        if (decimalMaior > 10) {
            System.out.println("É menor do que 10!");

        }   else if(decimalMaior  > 10) { 
            System.out.println("É maior do que 10!");
        }  else { 
            System.out.println("igual a 10!");
        }
    
    
        // Entrada de dados
        System.out.println("Digite um numero");
        Scanner input = new Scanner(System.in);
        inteiro = input.nextInt();
        System.out.println(inteiro);


        // %d é utilizado para valores inteiros 
        System.out.printf("O numero digitado foi: %d", inteiro);
        // %f é ultilizado para nmeros decimais 
        System.out.printf("o numero decimal foi: %.2f", decimalMaior);
        // %s é ultilizado para Strings
        System.out.printf("A palavra é %s", palavra);

    }
}