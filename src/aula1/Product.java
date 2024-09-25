package src.aula1;

public class Product{


      
     public String name;
     public double price;
     public int quantity;

    public double totalValue (){
        return price * quantity;
    }
    public void addProducts (int quantity){
        this.quantity += quantity;
        //this especifica que quer acessar o atributo da classe
    }
    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Dados do produto: " + name + ", R$ " + String.format("%.2f", price) + " , Quantidade total: " + quantity + ", Total preço: R$ " + String.format("%.2f",totalValue());
    }
}
