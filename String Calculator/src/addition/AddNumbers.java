package addition;

import java.util.ArrayList;

public class AddNumbers {
	
	public int Add(String expression) {
		int sum=0;
		String delimiterString=",|\n";
		String numbersArr[];
		if(expression.isBlank()) 
			return 0;
		else if(expression.startsWith("//")) {
			String NewExpression=expression.substring(expression.indexOf("]")+1);
			delimiterString+="|";
			for(int i=expression.indexOf("[")+1;i<expression.indexOf("]");i++)
				delimiterString+="\\"+expression.charAt(i);
			numbersArr=NewExpression.split(delimiterString);
			sum=Sum(numbersArr);
		}
		else {
			numbersArr=expression.split(delimiterString);
			sum=Sum(numbersArr);
		}
		return sum;
	}
	
	int Sum(String []numbersArr) {
		int sum=0;
		String negativeNumberList="";
		for(String num:numbersArr) { 
			if(num.isBlank())
				continue;
			int n=Integer.parseInt(num);
			if(n>1000) {
				System.out.println(n);
				continue;
			}
			if(n<0)
				negativeNumberList+=n+" ";
			sum+=n;
		}
		negatives(negativeNumberList);
		return sum;
	}
	
	 void negatives(String negativeNumberList) {
		if(!negativeNumberList.isEmpty()){
			System.out.println(negativeNumberList);
			throw new IllegalArgumentException("Negatives not allowed:" + negativeNumberList);
		}
	}
}
