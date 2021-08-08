package addition;

public class AddNumbers {
	
	public static int Add(String expression) {
		int sum=0;
		if(expression.isBlank()) 
			return 0;
		String numbersArr[]=expression.split(",");
		for(String num:numbersArr)
			sum+=Integer.parseInt(num);
		return sum;
	}
}
