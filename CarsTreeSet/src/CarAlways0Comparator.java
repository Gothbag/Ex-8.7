/*
 * created by Gothbag <josemariacagigalso@gmail.com
 * this is a plugin that doesn't compare a thing
 * 
 */

import java.util.Comparator;


public class CarAlways0Comparator implements Comparator<Car> {
	
	@Override
    public int compare(Car x, Car y) {
		return 0;
	}

}