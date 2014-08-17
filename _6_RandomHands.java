import java.util.Scanner;


public class _6_RandomHands {
	static int rand(String[] args) {
		return (int) (Math.random()*13);
	}
	static int rands(String[] args){
		return (int) (Math.random()*4);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] deck = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits={"\u2660","\u2665","\u2666","\u2663"};
				
		for (int j = 0; j < n; j++) {
			System.out.println(deck[rand(deck)]+suits[rands(suits)]+
					deck[rand(deck)]+suits[rands(suits)]+
					deck[rand(deck)]+suits[rands(suits)]+
					deck[rand(deck)]+suits[rands(suits)]+
					deck[rand(deck)]+suits[rands(suits)]);
		}
			
	}

}
