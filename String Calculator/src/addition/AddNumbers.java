package addition;

public class AddNumbers {
	
	public static int Add(String expression) {
		int sum=0;
		String delimiterString=",|\n";
		String numbersArr[];
		if(expression.isBlank()) 
			return 0;
		else if(expression.startsWith("//")) {
			String ContainNewDelimiterAndNewExpression[]=expression.split("\n",2);
			delimiterString+="|";
			String newDelimiter=ContainNewDelimiterAndNewExpression[0];
			for(int i=newDelimiter.indexOf("[")+1;i<newDelimiter.indexOf("]");i++)
				delimiterString+="\\"+newDelimiter.charAt(i);
			numbersArr=ContainNewDelimiterAndNewExpression[1].split(delimiterString);
			for(String num:numbersArr) 
				sum+=Integer.parseInt(num);
		}
		else {
			numbersArr=expression.split(delimiterString);
			for(String num:numbersArr) 
				sum+=Integer.parseInt(num);
		}
		return sum;
	}
}
