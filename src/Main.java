import java.util.Scanner;

public class Main {

        static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
        static int select = -1; //opción elegida del usuario
        public int i = 1;
        Spacecraf[] spacecrafts1 = new Spacecraf[i];
        Spacecraf[] spacecrafts2 = new Spacecraf[i];

    public static void main(String[] args) {

		//While the Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opción:\n" +
                        "1.- New Shuttle\n" 
                        "2.- New Unmanned Spaceship\n" +
						"3.- New Manned Spaceship\n" +
						"4.- New SpatialStation\n" +
						"0.- Exit");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1:
                    askInformation(); 
					spacecrafts1[i] = new Shuttle(scannerName,scannerDate);
                    spacecrafts2 = Arrays.copyOf(spacecrafts1, spacecrafts1.length+1);
                    spacecrafts1 = spacecrafts2;
                    i++;
					break;
				case 2:
                    askInformation(); 
					spacecrafts[i] = new Unmanned(scannerName,scannerDate);
                    spacecrafts2 = Arrays.copyOf(spacecrafts1, spacecrafts1.length+1);
                    spacecrafts1 = spacecrafts2;
                    i++;
					break;
				case 3:
                    askInformation();
					spacecrafts[i] = new Manned(scannerName,scannerDate);
                    spacecrafts2 = Arrays.copyOf(spacecrafts1, spacecrafts1.length+1);
                    spacecrafts1 = spacecrafts2;
                    i++;
					break;
				case 4: 
                    askInformation();
					spacecrafts[i] = new SpatialStation(scannerName,scannerDate);
                    spacecrafts2 = Arrays.copyOf(spacecrafts1, spacecrafts1.length+1);
                    spacecrafts1 = spacecrafts2;
                    i++;
					// System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				case 0: 
					System.out.println("to infinity and beyond!!!");
					break;
				default:
					System.out.println("That kind of spaceship is not supported");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
			}catch(Exception e){
				System.out.println("Uoop!, Houston, we have a problem!");
			}
		}
    }

    //Methods

    public Date isDate(){

    }

    //Método para recoger variables por consola
	public static void askInformation(){
		System.out.println("Introduce the name of the spaceship:");
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Launched Date: dd-mm-yyyy");
        String date1 = scanner.nextLine();
        Date scannerDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
	}


}