
public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo;
        boolean isCarro = true;

        if(isCarro){
            vehiculo = new Carro(4);
        }else{
            vehiculo = new Moto(2);
        }

        vehiculo.accelerar();
        vehiculo.frenar();
        System.out.println(vehiculo.getRuedas());

//        Vehiculo mazda = new Carro(4);
//        Vehiculo ferrari = new Carro(4);
//        Vehiculo ducati = new Moto(2);
//
//        mazda.accelerar();
//        ferrari.accelerar();
//        ducati.accelerar();


    }
}
