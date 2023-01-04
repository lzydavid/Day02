package sdf;

public class Porche extends Car{
    
    //Members
    private String turbo ="off";
    private int accelerate=0;

    public Porche (){
        super.setColor("red"); //Call parent methods
    }
    public Porche(String color,String registration){
        setColor(color);
        setRegistration(registration);
    }
    public String getTurbo() {
        return turbo;
    }

    @Override //good practice to show what parent override
    public void setColor(String c){}; //nolonger able to change coor of car

    public void accelerate(){
        this.accelerate++;
        if (this.accelerate>4){
            this.turbo="on";
        }
    }

    public void deccelerate(){
        this.accelerate--;
        if(this.accelerate<4){
            this.turbo="off";
        }
    }
    
}
