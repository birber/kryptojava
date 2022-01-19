package com.project.kryptojava.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("RestServiceController should")
class RestServiceControllerTest {
	
	private final RestServiceController rsController = new RestServiceController();

	@Test
	@DisplayName("return 'Hello World!")
	void testGetHelloWorld() {
		assertEquals("Hello World!", rsController.get().getBody());
	}
	
	@Test
	@DisplayName("return 'Hepp'")
	void testGetHepp() {
		assertEquals("Hepp", rsController.getHepp().getBody());
	}

}
