package com.steffyfinalproject.springboot.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Controller;

@Controller
public class HomeControllerTest {

	HomeController homecontroller;

	@Before
	public void setup() {
		homecontroller = new HomeController();
	}

	@Test
	public void indexTest() {

		String expected = "/views/index.html";
		String actual = homecontroller.index();

		assertEquals(actual, expected);

	}

}
