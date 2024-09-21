import java.util.Scanner;

public class Min{
    public static void main(String[] args) {
       
        /*String nome = "Carlos";
        int idade = 12;
        double peso = 57.30;
        double altura = 1.67;

        double imcAbaixo = 16.9;
        double imcNormal = 18.5;
        double imcObeso = 40.0;

        double imc = peso / (altura * altura);

        System.out.println("o IMC de " + nome + " que tem " + idade + " de idade. Tem seu IMC igual a: " + imc);
        System.out.println("IMC é normal quando está em " + imcNormal + " .");

        if(imc < imcAbaixo){
            System.out.println("Seu IMC diz que sua classificacao está abaixo do peso");
        } else if(imc > imcAbaixo && imc < imcObeso){
            System.out.println("Seu IMC diz que sua classificacao está normal");
        } else if(imc > imcObeso){
            System.out.println("Seu IMC diz que sua classificacao está como obeso");
        } else{
            System.out.println("Temos de refazer o teste");
        }*/

       /*int valor = (int)(Math.random()*3001);
        int contador = 0;
      while(valor != 3000)
      {
        valor = (int)(Math.random()*3001);
        System.out.println("Valor igual a  " + valor);
        contador++;
      }
      System.out.println(contador);
    }*/
      /*  Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu cpf - somente numeros");
        String cpf = scanner.nextLine();

        if(cpf.length() <= 10){
            System.out.println("Numero CPF incompleto!");
        } else{
            System.out.println("CPF Aceito");
        }
    scanner.close();*/

    /*String[] inventores = new String[6];
        inventores[0] = "Einstein";
        inventores[1] = "Tesla";
        inventores[2] = "Isaac Newton";

        String inventor = inventores[1];
        System.out.println(inventor);
*/
/*System.out.println("Quantos numeros você quer inserir? ");
    Scanner quantidade = new Scanner(System.in);
        int x = quantidade.nextInt();
            int[] numeros = new int[x];
                System.out.println("Digite " + x + " numeros inteiros:");
        
    Scanner teclado = new Scanner(System.in); //insere os numeros digitados
        //=================================================
            for(int i = 0; i < x; i++)
                numeros[i] = teclado.nextInt();
            for(int i=0; i < x ;i++)
                System.out.println(numeros[i]);

                    teclado.close();
                    quantidade.close();
*/
Scanner teclado = new Scanner(System.in);
    System.out.println("Você escolhe: 0 para par - 1 para impar");
        int palavra = teclado.nextInt();

    if (palavra == 0){
        System.out.println("O jogador escolheu par!");
    }   else{
            System.out.println("O jogador escolheu impar!");
            }

Scanner numeroInteiro = new Scanner(System.in);
    System.out.println("Agora escolha seu numero: ");
        int escolha = numeroInteiro.nextInt();

        if(escolha % 2 == 0 && palavra == 0){
            System.out.println("Ambos estão de acordo");
        } else {
            System.out.println("Diferentes");
        }

        System.out.println("Agora a vez da cpu jogar...");
        double cpu = Math.random()*3000;

        double jogada = Math.ceil(cpu);
        System.out.println("A Cpu jogou: " + jogada);

        if (jogada % 2 == 0){
            System.out.println("É um numero par.");
        } else {
            System.out.println("é um numero impar");
        }

        System.out.println(" CPU = " + jogada);
        System.out.println("Jogador = " + escolha);

        if (jogada % 2 == 0 && escolha % 2 == 0){
            System.out.println("Ambos escolheram par.. EMPATE");
        } else if (jogada % 2 == 1 && escolha % 2 == 1){
            System.out.println("Ambos escolheram impar.. JOGAR DE NOVO");
        }
            
        else {
            System.out.println("Nenhum dos dois ganharam");
        }


        System.out.println("........ Jogo finalizado.......");
numeroInteiro.close();
teclado.close();
}
}
