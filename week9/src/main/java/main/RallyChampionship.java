package main;

import java.util.List;

public class RallyChampionship 
{
    public static void main( String[] args )
    {

        //let's start by making our two different cars
        GravelCar lancia = new GravelCar("Lancia", "Delta S4", 480, 250); //suspention travel is in millimeters
        AsphaltCar audi = new AsphaltCar("Audi", "Quattro S1 E2", 591, 1000); //downforce is in kilograms

        //next let's make our four drivers
        Driver Toivonen = new Driver("Henri Toivonen", "Finland", lancia);
        Driver Röhrl = new Driver("Walter Röhrl", "Germany", audi);
        Driver Vatanen = new Driver("Ari Vatanen", "Finland", lancia);
        Driver Mouton = new Driver("Michèle Mouton","France", audi);

        //now let's register our drivers in the manager
        ChampionshipManager championshipManager = ChampionshipManager.getInstance();
        championshipManager.registerDriver(Toivonen);
        championshipManager.registerDriver(Röhrl);
        championshipManager.registerDriver(Vatanen);
        championshipManager.registerDriver(Mouton);


        //next let's simulate our rally races
        //it was said in the discord to just set these. therefore They will be static

        RallyRaceResult race1 = new RallyRaceResult("Ouninpohja","Finland");
        race1.recordResult(Toivonen,3,15);
        race1.recordResult(Röhrl,2,20);
        race1.recordResult(Vatanen,1,25);
        race1.recordResult(Mouton,4,10);
        championshipManager.AddRaceResult(race1);
        
        //let's make another race for fun
        RallyRaceResult race2 = new RallyRaceResult("Circuito delle Madonie", "italy");
        race2.recordResult(Toivonen, 2, 20);
        race2.recordResult(Röhrl, 3, 20);
        race2.recordResult(Vatanen, 4, 10);
        race2.recordResult(Mouton, 1, 25);
        championshipManager.AddRaceResult(race2);


        //next let's make our display
        System.out.println("\n===== CHAMPIONSHIP standing ===== "); //our championships
        List<Driver> standing = ChampionshipManager.getDriverStanding();
        for (int i = 0; i<standing.size(); i++){ //going trough our list of drivers and printing them
            Driver driver = standing.get(i);
            String name = driver.GetName();
            String country = driver.getcountry();
            Integer point = driver.getPoints();
            System.out.println(name+"("+country+"):"+point+" points");
        }

        System.out.println("\n\n===== CHAMPIONSHIP LEADER ===== "); // Printing out our lead driver
        Driver Lead = championshipManager.getLeadingDriver();
        String winname = Lead.GetName();
        Integer Winpoint = Lead.getPoints();
        System.out.println(winname+"with the winning points being :"+Winpoint);

        //next our race results
        System.out.println("\n\n===== RACE RESULTS ====="); // printing out our race results
        for (RallyRaceResult race : championshipManager.races){
            String racename = race.getracename();
            String location = race.getLocation();
            System.out.println("\nRace: "+racename +" " + location);
            List<Driver> results = race.getResults();
            for (int i = 0; i<results.size(); i++){
                Driver driver = results.get(i);
                String name = driver.GetName();
                Integer points = driver.getPoints();
                System.out.println("Position "+i+": "+name+" "+points);
            }
        }
        
        //lastly we need to show the performance ratings of the cars (this number is completely made up)
        System.out.println("\n\n===== CAR PERFORMANCE RATINGS =====");
        Double gravelperformance = lancia.calculatePerformance();
        Double asphaltperformance = audi.calculatePerformance();
        System.out.println("Gravel Car Performance: "+gravelperformance);
        System.out.println("Asphalt Car Performance: "+asphaltperformance);
    
        
    }
}
