package pl.sda;

public class Trojkat extends Shape   {
    private double bokA;
    private double wysokosc;
    private double color;

    public Trojkat(double bokA, double wysokosc, String color){
        super(color);
        this.bokA = bokA;
        this.wysokosc = wysokosc;

    }
    public double area(){
        return (bokA * wysokosc)/2;
    }
}
