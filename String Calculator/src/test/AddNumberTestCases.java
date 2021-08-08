package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import addition.AddNumbers;


public class AddNumberTestCases {
	@Test
	public void testAddition() {
	  //1. for two numbers only.
	  assertEquals(0, AddNumbers.Add("")); //empty string
	  assertEquals(1, AddNumbers.Add("1")); //single value
	  assertEquals(3, AddNumbers.Add("1,2")); //two value
	  assertEquals(10, AddNumbers.Add("1,2,3,4")); //multiple value
	}
}
