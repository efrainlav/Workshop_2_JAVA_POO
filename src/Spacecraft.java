import java.util.Date;

public abstract class Spacecraft {
    //Attributes
    public String name;
    public Date launchedDate;
    public String country;
    public String type;
    protected String typeFuel;
    protected String fuelLevel;
    private int power;
    private int velocity;

    //Constructor
    /**
     *
     * @param type Kind of spacecraft 1- 2- 3-
     * @param name The name of the spacecraft
     * @param launchedDate The date that teh spacecraft was launched
     */
    public Spacecraft(String name, Date launchedDate ){
        this.name = name;
        this.launchedDate = launchedDate;
        this.velocity = 0;
        this.power=0;
    }

    //Methods

    //Abstraction

    /**
     * Accelerate will determinate the velocity of the spacecraft
     */
    public abstract void accelerate();

    /**
     * The state of the fuel tank will depend on  will determinate the velocity of the spacecraft
     */
    public abstract void fuelStatus();

    /**
    *Public method used to get the power of spacecraft
     */
    public int getPower() {
        return power;
    }
 
    /**
    *Public method used to set the power of spacecraft
     */

    public void setPower(int power) {
        this.power = power;
    }


    /**
    *Public method used to get the velocity of spacecraft
     */
    public int getVelocity() {
        return velocity;
    }

    /**
    *Public method used to set the velocity of spacecraft
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    
}
