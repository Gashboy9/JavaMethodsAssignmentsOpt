package assigments;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Google Drive";
		
		System.out.println("Reversed word is "+reverse(word));
	
	}

	
	public static String reverse(String word) {
		if (word == "") {
			return word;
		}else {
			return reverse(word.substring(1)) + word.charAt(0);
		}
	}
}
