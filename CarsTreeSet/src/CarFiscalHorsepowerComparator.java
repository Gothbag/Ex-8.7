/*
 * created by Gothbag <josemariacagigalso@gmail.com
 * this is a plugin that compares cars by fiscal horsepower
 *  
 */

import java.util.Comparator;


public class CarFiscalHorsepowerComparator implements Comparator<Car> {
	
	@Override
    public int compare(Car x, Car y) {
		x.setFiscalHorsepower(0);
		y.setFiscalHorsepower(0);
		
		if (x.getFiscalHorsepower() < y.getFiscalHorsepower())
        {
            return -1;
        }
        if (x.getFiscalHorsepower() > y.getFiscalHorsepower())
        {
            return 1;
        }
        return 0;
	}

}