package sdf;

public class CarMain {
    
    //entry point
    public static void main(String[] args){
        //instantiate of car
        Car c = new Car();
        c.setColor("Grey");
        c.setRegistration("sdf1234B");
        c.start();
        System.out.printf("Is the Car started? %b",c.isStarted());

        c.getOutOfMyWay();

        Car d= new Car();
        System.out.printf("Color of my Car %s\n",d.getColor());

        Car e = new Car("black","S1234c");
        System.out.printf("Color of my Car %s\n",e.getColor());
        System.out.printf("Registration of my Car %s\n",e.getRegistration());
       
        Porche p = new Porche();
        System.out.printf("Color of my Car %s\n",p.getColor());
    }
}
