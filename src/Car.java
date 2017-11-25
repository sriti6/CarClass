public class Car {

String color;
int horsePower;
double engineSize;
String make;

/**
 * initialize value of Car's instance variable
 *
 */

public Car(){
    color ="Blue";
    horsePower =650;
    engineSize = 6.5;
    make ="Ferrari";
}

public Car (String color,String horsePower,String engineSize,String make){

    this.color=color;
    this.horsePower = 650;
    this.engineSize = 6.5;
    this.make = make;
}

public void setColor (String color){
    this.color = color;
}

public void setHorsePower (String horsePower){
    this.horsePower = 650;
}


public void setEngineSize (String engineSize){
    this.engineSize= 6.5;
}

public void setMake (String make){
    this.make = make;
}


public String getColor (){
    return color;
}


public int getHorsePower () {
    return horsePower;
}

public double getEngineSize () {
    return engineSize;
}

public String getMake () {
    return make;
}

public String toString () {
    return "Color" + color + "Horse Power" + horsePower + "Engine Size " + engineSize + "Make" + make;
}

}

