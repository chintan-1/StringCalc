package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import addition.AddNumbers;


public class AddNumberTestCases {
	@Test
	public void EmptyExpression() {
	  assertEquals(0, AddNumbers.Add("")); //empty string
	}
	
	@Test
	public void oneNumber() {
		assertEquals(1, AddNumbers.Add("1")); //two value
	}
	
	@Test
	public void twoNumbers() {
		assertEquals(3, AddNumbers.Add("1,2")); //two value
	}
	
	@Test
	public void MultipleNumbersSeparatedByCommaAndNewLine() {
		  assertEquals(15, AddNumbers.Add("1,2\n3,4\n5"));
	}
 
	@Test
	public void ChangeDelimiterMultipleNumbersSeparatedByCommaAndNewLine() {
		String exString="//[***]\n1***2\n3***4\n5";  
		assertEquals(15, AddNumbers.Add(exString));
	}
}
