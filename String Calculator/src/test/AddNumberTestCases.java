package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import addition.AddNumbers;


public class AddNumberTestCases {
	AddNumbers a = new AddNumbers();
	@Test
	public void EmptyExpression() {
	  assertEquals(0, a.Add("")); //empty string
	}
	
	@Test
	public void oneNumber() {
		assertEquals(1, a.Add("1")); //two value
	}
	
	@Test
	public void twoNumbers() {
		assertEquals(3, a.Add("1,2")); //two value
	}
	
	@Test
	public void MultipleNumbersSeparatedByCommaAndNewLine() {
		  assertEquals(15, a.Add("1,2\n3,4\n5"));
	}
 
	@Test
	public void ChangeDelimiterMultipleNumbersSeparatedByCommaAndNewLine() {
		String exString="//[***]\n1***2\n3***4\n5";  
		assertEquals(15, a.Add(exString));
	}
	
	@Test
	public void  NumbersBiggerThan1000ShouldBeIgnored() {
		String exString="//[***]\n1***2000\n3***4\n1000";  
		assertEquals(1008, a.Add(exString));
	}
	
	@Test
	public void  MulitpleDelimiters() {
		String exString="//[***][%%%]\n1***2%%%3";  
		assertEquals(6, a.Add(exString));
	}
	
//	@SuppressWarnings("deprecation")
//	@Rule
//	public ExpectedException expectedException=ExpectedException.none();
//	
//	@Test
//	public void NegativeNumbers() {
//		expectedException.expect(IllegalArgumentException.class);
//		expectedException.expectMessage("Negatives not allowed:-1 -2 -4 -5");
//		a.Add("-1,-2\n3,-4\n-5");
//	}
}
