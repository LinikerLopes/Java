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

/* Scanner teclado = new Scanner(System.in);
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
teclado.close();*/

char[] rounds = new char[3];
int roundAtual = 0;

System.out.println("Começando o jogo do Par ou Impar vs CPU");
while (roundAtual < 3) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escola PAR ou IMPAR - Digite 0 para PAR ou 1 para IMPAR");
    int escolha = teclado.nextInt();

    if (escolha == 0) {
        System.out.println("O jogador escolheu PAR");        
    }  else{
        System.out.println("O jogador escolheu IMPAR");
    }
    
    System.out.println("Faça sua jogada - Escolha 1 ou 2.");
    int jogada1 = teclado.nextInt();

    System.out.println("Agora é a vez da CPU");

        double numero = Math.random();
        double jogada2 = Math.ceil(numero) + 1;
        System.out.println("CPU jogou" + jogada2);

        System.out.println("Calculando o vencedor");


        double soma = jogada1 + jogada2;
        boolean resultadoPar = soma % 2 == 0;

        if (resultadoPar == true && escolha == 0) {
            System.out.println("O jogador ganhou este round");
            rounds[roundAtual++] = 'J';
        } else if (resultadoPar == false && escolha == 1) {
            System.out.println("O jogador ganhou este round");
            rounds[roundAtual++] = 'J';
        } else {
            System.out.println("A CPU ganhou este round");
            rounds[roundAtual++] = 'C';
        }

    if (roundAtual == 2) {
        if (rounds[0] == 'J' && rounds[1] == 'J') {
            System.out.println("O jogador ganhou duas em sequencia!");
            break;
        }   else if (rounds[0]== 'C' && rounds[1] == 'C') {
            System.out.println("A CPU ganhou duas em sequencia");
            break;
        }   else if (roundAtual == 3) {
            if (rounds[2] == 'J') {
                System.out.println("O jogador ganhou a melhor de 3");
                break;
            } else if (rounds[2] == 'C') {
                System.out.println("A CPU ganhou a melhor de 3");
                break;
                
            }
        }
    }









}


}
}
