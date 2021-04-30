class onlyDigit{
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
		String str = "1234";
		int len=str.length();
		//calling the function
		System.out.println(onlyDigit(str, len));
	}
}