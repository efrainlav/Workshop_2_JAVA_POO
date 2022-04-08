

public class Moto extends Vehiculo {
    public Moto(int ruedas){
        super(2);
    }

    public void accelerar() {
        this.velocidad = this.velocidad + 1;
    }
}
