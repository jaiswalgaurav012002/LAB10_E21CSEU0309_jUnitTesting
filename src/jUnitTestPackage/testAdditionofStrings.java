package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAdditionofStrings {

	@Test
	public void test() {
		jUnitFunctions g = new jUnitFunctions();
		assertEquals("asvdhgjhg", g.add_str("asvd","hgjhg"));
	}

}
