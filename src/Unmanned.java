

public class Unmanned extends Spacecraft{

    private boolean automaticPilote;

    public Unmanned(String name){
        super(name);
        this.type="Unmanned";
        this.fuelLevel="High";
        this.velocity = 100;      
    }

    //Abstraction
    public void accelerate() {
        this.velocity = this.velocity + 50;
    }

        //Abstraction
    public void fuelStatus() {
       if(this.velocity < 1000000){
           this.fuelLevel = "Full";
           }else{
           this.fuelLevel = "Low";
           }
    }

    /**Methods
    Method to activated the automatic pilote
     */
    public void automaticPilote(){
        automaticPilote = true;

    }

    //Encapsulate state
    // return the payload state
    public boolean isautomaticPilote() {
        return automaticPilote;
    }


}