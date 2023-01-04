package sdf;

public class CarMain2 {
    
    public static void main(String[] args) {
        Porche p;

        Car c = new Porche("yellow","S12345"); // a Porche is a car
        System.out.printf(">>>Registration: %s, color: %s\n",c.getRegistration(),c.getColor());

        p=(Porche)c;
        p.accelerate();

        System.out.printf(">>>P.Registration:%s, %s \n",p.getRegistration(),p.getColor());


    }
}
