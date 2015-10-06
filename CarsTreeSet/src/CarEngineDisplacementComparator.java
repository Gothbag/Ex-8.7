/*
 * created by Gothbag <josemariacagigalso@gmail.com
 * this is a plugin that compares cars by engine displacement
 * 
 */

import java.util.Comparator;


public class CarEngineDisplacementComparator implements Comparator<Car> {
	
	@Override
    public int compare(Car x, Car y) {
		if (x.getEngineDisplacement() < y.getEngineDisplacement())
        {
            return -1;
        }
        if (x.getEngineDisplacement() > y.getEngineDisplacement())
        {
            return 1;
        }
        return 0;
	}

}
