/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package model;

public class BusinessLogic {
	
	//Constructor
	public BusinessLogic() {}
	
	//Calculates damage by adding the weapon's power with the hero's attack stat
	public int CalculateDamage(Weapon w, Hero h) {
		int damageDealt = w.getPower() + h.getAttack();
		return damageDealt;
	}
	
	//Unequip Weapon
	public void UnequipWeapon(Hero h) {
		if (h.isWeaponEquipped() == true) {
			h.setWeaponEquipped(false);
			System.out.println("You unequipped a weapon");
		} else {
			System.out.println("You don't have an item equipped");
		}
	}
	
	//Check Weapon information
	public String CheckWeapon(Weapon w) {
		return "Weapon name: " + w.getName() + "\n " + w.getDescription() + "\n Power: " + w.getPower();
	}
}
