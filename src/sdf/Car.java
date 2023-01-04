package sdf;

public class Car{
    
    //Members
    private String registration;
    protected String color;
    private int years;
    private boolean started;

    //Constructors
    public Car(){
        //defaut 
        this.color="white";

    }
    public Car(String color,String registration){
        this.color = color;
        this.registration=registration;
    }

    //Getter/Setter
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public String getRegistration() {
        return registration;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public boolean isStarted() {
        return started;
    }

    //Methods
    public void start(){
        this.started=true;
    }
    public void stop(){
        this.started=false;
    }
    public void getOutOfMyWay(){
        System.out.println("HONK..................");
    }
    



}