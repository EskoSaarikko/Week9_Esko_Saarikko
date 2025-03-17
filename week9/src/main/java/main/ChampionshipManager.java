package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {

    static ChampionshipManager instance;
    private static List<Driver> ourdriver;
        public List<RallyRaceResult> races;
        static int totalDrivers = 0;
        static int totalRaces = 0;
    
        //now let's make this into our singleton to do this we need a few arrays
        private ChampionshipManager(){
            ourdriver = new ArrayList<>();
            races = new ArrayList<>(); 
        }
    
        public static ChampionshipManager getInstance(){  // doing this just like it was shown in the example code
            if (instance == null) {
                instance = new ChampionshipManager();
            }
            return instance;
        }
    
        public void registerDriver(Driver driver){
            ourdriver.add(driver);
            totalDrivers++;
        }
        public void AddRaceResult(RallyRaceResult result){
            races.add(result);
            totalRaces++;
        }
        public static List<Driver> getDriverStanding(){
            ourdriver.sort((first,second) ->first.getPoints()-second.getPoints()); //this calculates where on the leader board our driver is
        return ourdriver;
    }
    public Driver getLeadingDriver(){
        return getDriverStanding().get(0);
    }
    public static int getTotalDrivers(){
        return totalDrivers;
    }
    public static int getTotalRaces(){
        return totalRaces;
    }


}
