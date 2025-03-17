package main;

import java.util.List;

public interface RaceResult {

    void recordResult(Driver driver, int Position, int points);
    int getDriverPoints(Driver driver);
    List<Driver> getResults();
    
} 

    

