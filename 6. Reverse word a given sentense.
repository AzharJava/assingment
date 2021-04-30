//import scanner for take input from user as a string
import java.util.Scanner;
class reverseSentense{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Original String: ");
		String originalStr=scanner.nextLine();
		scanner.close();
		String words[]=originalStr.split("\\s");

		String reversedString=" ";

		//Reverse each word's position
		for(int i=0; i<words.length; i++){
			if(i==words.length-1)
				reversedString =words[i]+reversedString;
			else
				reversedString=" "+words[i]+reversedString;
		}

		//Display the string after reverse
		System.out.print("Reversed String: "+reversedString);
		

	}
}

//OUTPUT
//Original String: I am a Student
//Reversed String: Student a am I
