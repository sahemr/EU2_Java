package assignment5_ifAndSwitchStatements;

public class q4_numberOddEven {

	public static void main(String[] args) {
		
		int num=3;
		System.out.println("number = " + num);
		
		if(num>0 && num%2!=0) {
			System.out.println(num + " is odd");
		}else if(num>0 && num%2==0){
			System.out.println(num + " is even");
		}else {
			System.out.println("please enter a positive number");
		}

	}

}
