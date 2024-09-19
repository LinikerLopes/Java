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
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu cpf - somente numeros");
        String cpf = scanner.nextLine();

        if(cpf.length() <= 10){
            System.out.println("Numero CPF incompleto!");
        } else{
            System.out.println("CPF Aceito");
        }
    scanner.close();
}
}
