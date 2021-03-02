package com.entornos.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCociente.class,
	TestProducto.class,
	TestSuma.class,
	TestResta.class
	})

public class AllTests {
//Void	

}
