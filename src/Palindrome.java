import javax.swing.*;

public class Palindrome {

	public static void main( String args[] ) {

		String x = getInput();
		
		String removeCharacters  = removeCharacters(x);
		String backwards = reverse(removeCharacters);
		
		String output = "\n\nThe word or phrase  \"" + x;
		
		if( determineIfPalindrome(removeCharacters,backwards) )
			output += "\" is a palindrome.";
		else
			output += "\" is not a palindrome";

		output += "\n\n" + removeCharacters.toLowerCase() + " <==> " + backwards.toLowerCase();

		JOptionPane.showMessageDialog(null,output);
	}
	
	public static String getInput()
	{
		String input,prompt = 	"This program will check if a word or phrase is a \n" +
								"Palindrome which is a word that reads the same backwards and forewords. Please enter a word or phrase\n" +
								"40 characters or less";
		do {
			input = JOptionPane.showInputDialog(prompt);
		}while(input.length() > 40);
		return input;
	}

	public static boolean determineIfPalindrome( String original, String reversed ) {		
		if( original.equalsIgnoreCase(reversed) )
			return true;	
		else
			return false;
	}

	public static String reverse( String pal ) {
		String rev="";

		for( int x = pal.length(); x > 0;x--)
			rev+=pal.substring(x-1,x);

		return rev;
	}


	public static String removeCharacters( String palin ) {
		String no_char = "";
		for(int x = 0; x < palin.length(); x++) {
			String characterToCheck = palin.substring(x,x+1);
			if (	characterToCheck.equals("a") || characterToCheck.equals("A") ||
					characterToCheck.equals("b") || characterToCheck.equals("B") ||
					characterToCheck.equals("c") || characterToCheck.equals("C") ||
					characterToCheck.equals("d") || characterToCheck.equals("D") ||
					characterToCheck.equals("e") || characterToCheck.equals("E") ||
					characterToCheck.equals("f") || characterToCheck.equals("F") ||
					characterToCheck.equals("g") || characterToCheck.equals("G") ||
					characterToCheck.equals("h") || characterToCheck.equals("H") ||
					characterToCheck.equals("i") || characterToCheck.equals("I") ||
					characterToCheck.equals("j") || characterToCheck.equals("J") ||
					characterToCheck.equals("k") || characterToCheck.equals("K") ||
					characterToCheck.equals("l") || characterToCheck.equals("L") ||
					characterToCheck.equals("m") || characterToCheck.equals("M") ||
					characterToCheck.equals("n") || characterToCheck.equals("N") ||
					characterToCheck.equals("o") || characterToCheck.equals("O") ||
					characterToCheck.equals("p") || characterToCheck.equals("P") ||
					characterToCheck.equals("q") || characterToCheck.equals("Q") ||
					characterToCheck.equals("r") || characterToCheck.equals("R") ||
					characterToCheck.equals("s") || characterToCheck.equals("S") ||
					characterToCheck.equals("t") || characterToCheck.equals("T") ||
					characterToCheck.equals("u") || characterToCheck.equals("U") ||
					characterToCheck.equals("v") || characterToCheck.equals("V") ||
					characterToCheck.equals("w") || characterToCheck.equals("W") ||
					characterToCheck.equals("x") || characterToCheck.equals("X") ||
					characterToCheck.equals("y") || characterToCheck.equals("Y") ||
					characterToCheck.equals("z") || characterToCheck.equals("Z") )

				no_char += characterToCheck;
		}

		return no_char;
	}







}
