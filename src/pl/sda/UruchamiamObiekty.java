package pl.sda;

public class UruchamiamObiekty {
    public static void main(String[] args) {
       /* Square kwadrat = new Square("niebieski", 3);
        Circle kolo = new Circle(2);
        Trojkat trojkat new Trojkat(3, 2);*/


       Shape circle = new Circle(2, "czerwony");
       Shape kwadrat = new Square("niebieski",3);
       Shape trojkat=new Trojkat(3, 2, "czerwony");


        System.out.println(kwadrat.color + " Kwadrat o polu " + kwadrat.area() + " i obwode " + kwadrat.obwod());
        System.out.println("Pole kola wynosi " + circle.area() + circle.obwod());
        System.out.println("Pole trojkata wynosi " + trojkat.area());
    }
}
