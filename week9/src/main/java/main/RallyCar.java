package main;



public abstract class RallyCar {
private String make;
private String model;
private int horsepower;

RallyCar(String make, String model, int horsepower){ //costructor for rallycar
    this.make = make;
    this.model = model;
    this.horsepower = horsepower;
}
public String getmake(){
    return make;
}
public String getmodel(){
    return model;
}
public int gethorsepower(){
    return horsepower;
}
public abstract double calculatePerformance();

}
