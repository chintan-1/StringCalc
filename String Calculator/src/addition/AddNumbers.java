package addition;

public class AddNumbers {
	
	public static int Add(String expression) {
		int sum=0;
		if(expression.isBlank()) 
			return 0;
		else if(expression.startsWith("//")) {

		}
		else {
			String delimiterString=",|\n";
			String numbersArr[]=expression.split(delimiterString);
			for(String num:numbersArr) 
				sum+=Integer.parseInt(num);
		}
		return sum;
	}
}
