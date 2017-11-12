package pl.sda;

public class Seria7 extends Sedan implements Characteristic {
    String name;
    String bodytype;
    int numberOfdoors;

    public Seria7(int power, int maxSpeed, String name, String bodytype, int numberOfdoors) {
        super(power,maxSpeed);
        this.name = name;
        this.bodytype = bodytype;
        this.numberOfdoors = numberOfdoors;
    }

    public Seria7(String s, String sedan, int i, int i1, int numberOfdoors) {
        super();
    }


    public String toString() {
        return (this.name + "" + this.bodytype + "" + this.numberOfdoors + "" + this.power + "" + this.maxSpeed);
    }


}
