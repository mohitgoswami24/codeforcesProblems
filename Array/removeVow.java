package Array;

public class removeVow {
	public static String removeVowels(String str) {
		 // Write your code here.
		 String newStr = "";
		 char [] ch = {'a','e','i','o','u','A','E','I','O','U'};
		 for(int i=0; i<str.length(); i++){
			 for(int j=0; j<ch.length; j++){
				 if(str.charAt(i)==ch[j]){
					 break;
				 }
				 else { 
					 newStr += str.charAt(i);
					 i++;
				 }
			 }
		 }
		 return newStr;

		}
	public static void main(String[] argrs) {
		
		System.out.println(removeVowels("CodingNinjas"));
	}

}
