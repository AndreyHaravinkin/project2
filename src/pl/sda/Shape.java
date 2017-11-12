package pl.sda;

public abstract class Shape {
    protected String color;

    public String getColor() {
        return color;
    }
    public Shape(String color){
        this.color = color;
    }
    public abstract double area();
    public double obwod(){
        return 0;
    }
}
