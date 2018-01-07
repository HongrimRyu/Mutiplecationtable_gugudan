package multiplecationtable;

import java.util.*;


public class Mutiplecationmain {
	public static void main(String[] args){
		System.out.println("Input mode->");
		Scanner scanner = new Scanner(System.in);
		int modeVal = scanner.nextInt();
	
		if(modeVal == 1)
		{
			System.out.println("Number->");
			int n1 = scanner.nextInt();
			Multiplecationtable.calfunc(n1);
		}
		if(modeVal == 2)
		{
			System.out.println("Numbers(include ,)->");
			String numbers = scanner.next();
			String[] splitedValue = numbers.split(",");
			int first = Integer.parseInt(splitedValue[0]);
			int second = Integer.parseInt(splitedValue[1]);
			Multiplecationtable.calfunc(first,second);
		}
		
		scanner.close();
		
	}
}
