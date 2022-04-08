import java.util.Date;

public abstract class Spacecraft {
    //Attributes
    public String name;
    public Date launchedDate;
    public String country;
    protected String fuel;
    private int type;
    private int power;
    private int velocity;

    //Constructor
    /**
     *
     * @param type Kind of spacecraft 1- 2- 3-
     * @param name The name of teh spacecraft
     * @param launchedDate The date that teh spacecraft was launched
     */
    public Spacecraft(int type, String name, Date launchedDate ){
        this.type = type;
        this.name = name;
        this.launchedDate = launchedDate;
        this.velocity = 0;
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


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
