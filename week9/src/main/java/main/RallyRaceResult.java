package main;
import java.util.*;
public class RallyRaceResult {


    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    public RallyRaceResult(String raceName, String location){ //costructor for the rallyraceresults
        this.raceName = raceName;
        this.location = location;
        this.results = new LinkedHashMap<>();
    }

    public String getracename(){ // getter for the race name
        return raceName;
    }
    public String getLocation(){// getter for location
        return location;
    }
    public void recordResult(Driver driver, int position, int points){ //this records the drivers positions and adds points accordingly
        results.put(driver,position);
        driver.addPoints(+points);

    }
    public int getDriverPoints(Driver driver){ //outputs the drivers points
        return results.getOrDefault(driver,0);
    }   
    public List<Driver> getResults(){ // outputs results
        return new ArrayList<>(results.keySet());
    }

}