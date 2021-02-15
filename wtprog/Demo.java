package wtprog;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
	
	/* Global Variables */
	static Scanner sc = new Scanner(System.in);
	static int[] optellen = {1,2,3,4};
	static int[] sorteren = {2,6,4,1,7};
	static boolean[] onderdelen = {false, false, true, true}; // true is kapot
	static ArrayList<String> items = new ArrayList<String>();
	static String woord = "fiets";
	static char temp_l = 'a';	
	
	public static void main(String[] args) {		
		ex1("po", "ging", "en");
		ex2("regenen", 'e');			
		ex3(optellen);
		ex4(sorteren);
		ex5(onderdelen);
		ex6("penguin");
		ex7(woord);
		ex8();
		System.out.println("Opdracht 10: iets met een woordenslang");
		ex10();		
	}
	/* Methods */
	static void ex1(String s1, String s2, String s3) {
			String s = s1.concat(s2).concat(s3);
			System.out.println("opdracht 1: "+s);	
		}
	
	static void ex2(String word2, char letter) {
		int count = 0;		
		for(int i=0;i<word2.length();i++) {
			if(word2.charAt(i)==letter){
				count++;
			}
		}
		System.out.println("Opdracht 2: "+count);
	}
	
	static void ex3(int[] optellen) {
		int sum = 0;
		for(int i:optellen) {
			sum+=i;
		}
		System.out.println("Opdracht 3: "+sum);
	}
	
	static void ex4(int[] sorteren) {
		Arrays.sort(sorteren);
		System.out.println("Opdracht 4: "+Arrays.toString(sorteren));
	}
	
	static void ex5(boolean[] onderdelen) {
		Auto auto = new Auto(onderdelen);		
		Monteur Piet = new Monteur();
		Piet.repareren(auto);					
	}

	static void ex6(String s) {
		char[] a6 = s.replaceAll(" ","").toCharArray();
		Arrays.sort(a6);
		System.out.println("Opdracht 6: "+Arrays.toString(a6));
	}
	
	static void ex7(String s) {		
		String wrd = new String();
		for(int i=0;i<s.length();i++) {
			wrd += "_ ";
		}
		System.out.println("Opdracht 7: "+wrd);
		ex7_lingo(s);
	}
	
	static void ex7_lingo(String answer) {
		String input = sc.nextLine();
		String s = new String();
		for(int i=0;i<input.length();i++) {
			if(answer.charAt(i) == input.charAt(i)) {
				s+="2";
			} else {
				if(answer.contains(String.valueOf(input.charAt(i)))) {
					s+="1";
				} else {
					s+="0";
				}
			}
		}
		System.out.println(s);
	}
	
	static void ex8() {
		Speedboot A = new Speedboot();
		A.starten();
	}
	
	static void ex10() {
		String s = sc.nextLine();
		ex10_tandenborstel(s);
	}
	
	static void ex10_tandenborstel(String s) {
		if(items.isEmpty()) {
			items.add(s);
			temp_l = s.charAt(s.length()-1);
			System.out.println(items.toString());
		} else {
			if(s.charAt(0) == temp_l) {
				items.add(s);
				temp_l = s.charAt(s.length()-1);
				System.out.println(items.toString());
			} else {
				System.out.println("begin alsjeblieft met een "+ String.valueOf(temp_l));
			}
		}		
		ex10();
		// There's no end though.
	}
}
/* Optional: Objects */