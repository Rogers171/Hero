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
import model.Weapon;

public class TestWeapon {
	Weapon kusanagi = new Weapon("Kusanagi", "A legendary blade that a storm god received from defeating a multiheaded serpent", 10);
	BusinessLogic busiLog = new BusinessLogic();
	String message = "Weapon name: Kusanagi\n A legendary blade that a storm god received from defeating a multiheaded serpent\n Power: 10";
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void  testWeaponCheck(){
		assertTrue(message.equals(busiLog.CheckWeapon(kusanagi)));
	}

}
