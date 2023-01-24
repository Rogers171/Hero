/**
 * @author Adell - amrogers5
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BusinessLogic;
import model.Hero;
import model.Weapon;

public class TestHero {
	BusinessLogic busiLog = new BusinessLogic();
	Hero erdrick = new Hero("Erdrick", 5, true);
	Weapon blizzardBlade = new Weapon("Blizzard Blade", "An icy sword", 6);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDamageCalculation() {
		assertEquals(11, busiLog.CalculateDamage(blizzardBlade, erdrick));
	}
	
	@Test
	public void testUnequipWeapon( ) {
		busiLog.UnequipWeapon(erdrick);
		assertFalse(erdrick.isWeaponEquipped());
	}

}
