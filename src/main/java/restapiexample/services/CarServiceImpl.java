package restapiexample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import restapiexample.entities.Car;

@Service
public class CarServiceImpl implements CarService{

	List<Car> list;
	
	public CarServiceImpl() {
		list=new ArrayList<>();
		list.add(new Car(2010,"BMW", "Sport", 1900));
		list.add(new Car(2011,"BMW-X1", "Sport", 190));
		list.add(new Car(2012,"BMW-X8", "Normal", 178));
		list.add(new Car(2013,"BMW-X9", "Sport", 1908));
		list.add(new Car(2020,"Audi-A6", "Sport", 1200));
		list.add(new Car(2022,"Audi-X8", "Sport", 12100));
	}
	
	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		return list;
	}

}
