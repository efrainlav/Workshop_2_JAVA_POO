"# " 
# Workshop_2_JAVA_POO

Project exercises with the creation of 1 super class SPACECRAFT and 4 Inheritance classes with their attribute, constructors and methods.

## Installation

Just copy-paste the file repository on your NETBEANS project directory.
The local directory used was: 
```bash
C:\Users\XXXXX\Documents\NetBeansProjects\Workshop_2_JAVA_POO
```

## Classes
```mermaid
classDiagram
      Spacecraft <|-- Shuttle
      Spacecraft <|-- Unmanned
      Spacecraft <|-- Manned
      Manned <|-- SpatialStation	
	  
      class Spacecraft{          
          + accelerate()
          + fuelStatus()
		  + getPower()
		  + setPower()
		  + getVelocity()
		  + setVelocity()
          + name: String;
          + type: String;
		  + launchedDate: Date;
          + country: String;
          # typeFuel: String;
          # fuelLevel: String;
          - power: int; 
		  - velocity: int; 
      }

      class Shuttle{
          - payload()
          - isPayload()
      }
	  
	  class Unmanned{
          - automaticPilote()
          - isautomaticPilote()
      }
	  
	  class Manned{
          - payload()
          - isPayload()
      }
	  
	  class SpatialStation{
          - payload()
          - isPayload()
      }
```


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
