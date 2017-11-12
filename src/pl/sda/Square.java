package pl.sda;

public class Square extends Shape {
    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public double area(){
        return side*side;
    }
    public double obwod(){return 4*side;}
}
