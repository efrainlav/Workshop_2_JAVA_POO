

public class Manned extends Spacecraft{

    private boolean payload;

    public Shuttle(String name){
        super(name);
        this.type="Manned";
        this.fuelLevel="High";
        this.velocity = 0;
        this.payload = false;
    }

    //Abstraction
    public void accelerate() {
        this.velocity = this.velocity + 500;
    }

    //Abstraction
    public void fuelStatus() {
       if(this.velocity < 1000){
           this.fuelLevel = "Full";
           }else{
           this.fuelLevel = "Low";
           }
    }

    /**Methods
    Method to activated the payLoad state
     */
    public void payload(){
        payload = true;

    }

    //Encapsulate state
    // return the payload state
    public boolean isPayload() {
        return payload;
    }




}