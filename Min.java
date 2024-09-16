public class Min{
    public static void main(String[] args) {
       
        String nome = "Carlos";
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
        }

    }
}
