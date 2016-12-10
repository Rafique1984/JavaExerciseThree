package day.one;

public class MethodPracticThree {
	public static void main(String []args){
		System.out.println( getNumberFromString("I am 20 years old"));
		
	}
	
		// Write a method that take this 'I am 20 years old' string input and return '20' as Integer
		
		
		public static int getNumberFromString(String text) {
			int integer = 0;
			String[] numArray = text.split(" ");
			for (int i = 0; i < numArray.length; i++) {
				if (numArray[i].matches("[0-9]+")) {
					integer = Integer.valueOf(numArray[i]);
				}

			}

			return integer;
		}

    }
