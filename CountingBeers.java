import java.util.ArrayList;
import java.util.Scanner;


public class CountBeers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		ArrayList<String> input = new ArrayList<String>();
		while(!input.contains("end")){
			input.add(sc.nextLine().toLowerCase());
		}
		input.remove("end");
		int beers = 0;
		int stacks = 0 ;
		for (int i = 0; i < input.size(); i++) {
			String[] txt = input.get(i).split(" ");
			if (txt[1].equals("beers")) {
				beers += Integer.parseInt(txt[0]);
				
			}
			
			
			
			if (txt[1].equals("stacks")) {
				stacks += Integer.parseInt(txt[0]);
				
			}
			
		}
		if (beers>=20) {
			stacks+=(beers/20);
			beers= beers - ((beers/20)*20);
		}
		
		System.out.println(stacks+" stacks" + " + " +beers+ " beers");
		
	}

}
