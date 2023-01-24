/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package model;

public class Hero {
	//properties
	private String name;
	private int attack;
	private boolean isWeaponEquipped;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public boolean getIsWeaponEquipped() {
		return isWeaponEquipped();
	}
	public void setWeaponEquipped(boolean isWeaponEquipped) {
		this.isWeaponEquipped = isWeaponEquipped;
	}
	
	//Constructors
	public Hero() {}
	
	public Hero(String name, int attack, boolean isWeaponEquipped) {
		super();
		this.name = name;
		this.attack = attack;
		this.setWeaponEquipped(isWeaponEquipped);
	}
	/**
	 * @return the isWeaponEquipped
	 */
	public boolean isWeaponEquipped() {
		return isWeaponEquipped;
	}
	
	
	
	
}
