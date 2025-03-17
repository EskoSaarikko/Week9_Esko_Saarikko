package main;

public class GravelCar extends RallyCar{ //this inherits traits from rallycar
    
    private double suspensionTravel;
        @SuppressWarnings("unused")    
        private String make;
        @SuppressWarnings("unused")
        private String model;
        @SuppressWarnings("unused")
        private int horsepower;

    
        GravelCar(String make, String model, int horsepower, double suspentionTravel){ //constructor
            super(make, model, horsepower);
            this.suspensionTravel = suspentionTravel;
            this.make = make;
            this.model = model;
            this.horsepower = 250;
            this.suspensionTravel = 30;
        }
        public double GetsuspensionTravel(){
            return suspensionTravel;
        }
        public double calculatePerformance(){
            return gethorsepower() * 2 + GetsuspensionTravel() *1.7; //the equation here is just so that we have an equation
        }

}
