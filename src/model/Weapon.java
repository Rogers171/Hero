/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package model;

public class Weapon {
	//Properties
	private String name;
	private String description;
	private int power;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	//Constructors
	public Weapon() {}
	
	public Weapon(String name, String description, int power) {
		super();
		this.name = name;
		this.description = description;
		this.power = power;
	}
	
	
}
