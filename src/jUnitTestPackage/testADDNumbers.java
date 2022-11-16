package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testADDNumbers {

	@Test
	public void test() {
		
		jUnitFunctions z = new jUnitFunctions();
	assertEquals(13, z.add_num(5,8) );
	}

}
