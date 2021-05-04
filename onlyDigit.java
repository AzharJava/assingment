public class onlyDigit{
	//check if a string contains only digits
	public static boolean
	onlyDigit(String str, int n){
		//Traverse the string from
		for (int i=0;i<n ;i++ ) {
			//check the character is digit from 0 to 9
			//then return true.
			//else false
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "1234";	//here i used only digits so return is true. if i enter the only character then return false.
		int len=str.length();
		//calling the function
		System.out.println(onlyDigit(str, len));
	}
}

//OUTPUT-1 (if you input only digits which is belong to 0-9 then the output is bellow)
//true

//OUTPUT-2 (if you input only character then the output is bellow)
//false
