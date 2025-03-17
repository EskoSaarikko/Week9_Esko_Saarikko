package main;

public class Driver { //this defines our drivers traits
private String name;
private String country;
private int points;
private Object RallyCar;

Driver(String name, String country, RallyCar car){ // constructor for our driver
    this.name = name;
    this.country = country;
    this.RallyCar = car;
}
public String GetName(){
    return name;
}
public String getcountry(){
    return country;
}
public int getPoints(){
    return points;
}
public Object getRallyCar(){
    return RallyCar;
}
public void setCar(RallyCar car){
    this.RallyCar = car;
}
public void addPoints(int points){
    this.points += points;
}
}
