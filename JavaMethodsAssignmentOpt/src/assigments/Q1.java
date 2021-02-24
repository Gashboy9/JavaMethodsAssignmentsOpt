package assigments;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiplicationTable15(12);

	}
	
	public static void multiplicationTable15(int num) {
		int count = 15;
		if (num == 0) {
			return;
		}else {
			multiplicationTable15(num-1);
			count *= num;
			System.out.println("15 * "+num + " = " + count);
			 
		}
	}

}
