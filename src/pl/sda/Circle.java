package pl.sda;

public class Circle extends Shape  {
    private double promien;

    public Circle(double promien, String color){
        super(color);
        this.promien = promien;
    }
    public double area(){
        return Math.pow(promien, 2)* Math.PI;
    }


}
