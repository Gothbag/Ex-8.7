/*
 * created by Gothbag <josemariacagigalso@gmail.com>
 * this represents a list of cars, sorted like a tree
 * 
 */

import java.util.ArrayList;
import java.util.TreeSet;

public class CarTreeSet {
	
	public static void main(String[] args) {
		//1
		//IGNORE THIS
		ArrayList<Car> cars = new ArrayList<Car>();

		//we add the cars
		cars.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		cars.add(new Car("Dacia", "Sandero", 1200, 4));
		cars.add(new Car("Ford", "Focus", 2000, 4));
		cars.add(new Car("Opel", "Insignia", 2200, 4));
		cars.add(new Car("Seat", "Ibiza", 1600, 4));
		Car hyundi = new Car("Hyundai", "Atos", 1500, 3);
		cars.add(hyundi);
		System.out.println("-------------------------");	
		
		//a
		TreeSet<Car> engineDisCars = new TreeSet<Car>(new CarEngineDisplacementComparator());
		engineDisCars.addAll(cars);
		TreeSet<Car> engineDisCars2 = new TreeSet<Car>(new CarEngineDisplacementComparator());
		engineDisCars2.addAll(cars);
		
		
		//b
		TreeSet<Car> fisHorseCars = new TreeSet<Car>(new CarFiscalHorsepowerComparator());
		fisHorseCars.addAll(cars);
		TreeSet<Car> fisHorseCars2 = new TreeSet<Car>(new CarFiscalHorsepowerComparator());
		fisHorseCars2.addAll(cars);
		
		//2
		//we will extract the elements from fisHorseCars on a LIFO basis
		while (!fisHorseCars.isEmpty() ) {
			System.out.println(fisHorseCars.pollLast());
		}
		
		//3
		//we will extract the elements from engineDisCars on a FIFO basis
		System.out.println(engineDisCars.size());
		while (!engineDisCars.isEmpty() ) {
			System.out.println(engineDisCars.pollFirst());
		}
		
	
	}

}
