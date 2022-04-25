package restapiexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import restapiexample.entities.Car;
import restapiexample.services.CarService;

@RestController
public class CarController {

	@Autowired
	private CarService carService;
	
	
	@GetMapping("/home")
	public String display() {
		return "I am here to display to something";
	}
	
	@GetMapping("/cars")
	public List<Car> getAllCar(){
		return this.carService.getAllCar();
	}
	
	@PostMapping("/cars")
	public List<Car> postAllCar(){
		return this.carService.getAllCar();
	}
	
}
