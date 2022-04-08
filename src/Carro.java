

public class Carro extends Vehiculo{

    private boolean estaEnMarcha;

    public Carro(int ruedas){
        super(ruedas);
        this.puertas = 4;
        this.estaEnMarcha = false;

    }

//comportamiento
    public void prender(){
        estaEnMarcha = true;
    }

//Abstraction
    public void accelerar() {
        this.velocidad = this.velocidad +1;
    }

    @Override
    public void frenar() {
        velocidad = 0;
        this.estaEnMarcha = false;
    }
//estado encapsulado
    public boolean isEstaEnMarcha() {
        return estaEnMarcha;
    }
}
