package src.aula2;

public class Rectangle {
    public double Width;
    public double Height;


    public double area(){
        return Width * Height;
    }
    public double perimeter(){
        return 2 * (Width + Height);
    }
    public double diagonal(){
        return Math.sqrt((Width * Width) + (Height * Height));
    }

    /*public String toString(){
        return "W: " + Width + " H: " + Height;
    }*/
}