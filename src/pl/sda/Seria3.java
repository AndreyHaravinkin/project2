package pl.sda;

public class Seria3 extends Sedan implements Characteristic {
    String name;
    String bodytype;
    int numberOfdoors;

    public Seria3(int power, int maxSpeed, String name, String bodytype, int numberOfdoors) {
        super(power,maxSpeed);
        this.name = name;
        this.bodytype = bodytype;
        this.numberOfdoors = numberOfdoors;
    }




    public String toString() {
        return (this.name + "" + this.bodytype + "" + this.numberOfdoors + "" + this.power + "" + this.maxSpeed);
    }

}
