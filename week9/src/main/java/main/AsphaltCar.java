package main;

public class AsphaltCar extends RallyCar { //this also inherits traits from Rallycar
    private double downforce;
    @SuppressWarnings("unused")
        private String make;
        @SuppressWarnings("unused")
        private String model;
        @SuppressWarnings("unused")
        private int horsepower;
        
    
        AsphaltCar(String make, String model, int horsepower, double downforce){ //costructor for our car
            super(make, model, horsepower);
            this.downforce = horsepower;
            this.make = make;
            this.model = model;
            this.horsepower = horsepower;
        }
        public double Getdownforce(){
            return downforce;
        }
        public double calculatePerformance(){
            return gethorsepower() * 2 + Getdownforce() *1.7; //the equation here is just so that we have an equation
        }

}