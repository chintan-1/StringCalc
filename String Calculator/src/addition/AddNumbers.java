package addition;

public class AddNumbers {
	
	public int Add(String expression) {
		int sum=0;
		String delimiterString=",|\n";
		String numbersArr[];
		if(expression.isBlank()) 
			return 0;
		else if(expression.startsWith("//")) {
			String DelimiterExpression=expression.substring(2,expression.indexOf("\n"));
			//System.out.println(DelimiterExpression);
			String NewExpression=expression.substring(expression.indexOf("\n")+1);
			//System.out.println(NewExpression);
			char SpecialChar[]= {'*','[',']','{','}','?','(',')'};
			while(!DelimiterExpression.isBlank()) {
				delimiterString+="|";
				int Start=1,End=DelimiterExpression.indexOf("]");
				for(int i=Start;i<End;i++) {
					char c=DelimiterExpression.charAt(i);
					boolean flag=false;
					for(char k:SpecialChar) {
						if(c==k) {
							flag=true;
							break;
						}
					}
					if(flag)
						delimiterString+="\\"+DelimiterExpression.charAt(i);
					else 
						delimiterString+=DelimiterExpression.charAt(i);
				}
				DelimiterExpression=DelimiterExpression.substring(End+1);
			}
			//System.out.println(delimiterString);
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
