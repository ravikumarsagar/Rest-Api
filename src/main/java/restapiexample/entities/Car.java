package restapiexample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	private int model;
	private String name;
	private String type;
	private int km;
	
	public Car(int model, String name, String type, int km) {
		super();
		this.model = model;
		this.name = name;
		this.type = type;
		this.km = km;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + ", type=" + type + ", km=" + km + "]";
	}
	
	 
	 
}
