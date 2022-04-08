

public abstract class Vehiculo {
    public int ruedas;
    public int velocidad;
    public int puertas;

    public Vehiculo(int ruedas){
        this.ruedas = ruedas;
        this.velocidad = 0;
        this.puertas = 0;
    }

    public abstract void accelerar();

    public void frenar(){
        this.velocidad = 0;
    }

    public int getRuedas() {
        return ruedas;
    }



}
