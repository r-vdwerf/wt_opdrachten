package wtprog;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Demo {
	
	/* Global Variables */
	static Scanner sc = new Scanner(System.in);
	static int[] optellen = {1,2,3,4};
	static int[] sorteren = {2,6,4,1,7};
	static boolean[] onderdelen = {false, true, true, true}; // true is kapot
	static ArrayList<String> items = new ArrayList<String>();
	static char temp_l = 'a';	
	
	public static void main(String[] args) {		
		//ex1("po", "ging", "en");
		//ex2("regenen", 'e');			
		//ex3();
		//ex4();
		//ex5();
		//ex6();
		//ex7();
		//ex8();		
		//ex10();		
	}
	/* Methods */
	private void ex1(String s1, String s2, String s3) {
			String s = s1.concat(s2).concat(s3);
			System.out.println("opdracht 1: "+s);	
		}
	
	private void ex2(String word2, char letter) {
		int count = 0;		
		for(int i=0;i<word2.length();i++) {
			if(word2.charAt(i)==letter){
				count++;
			}
		}
		System.out.println("Opdracht 2: "+count);
	}
	
	private void ex3() {
		int sum = 0;
		for(int i:optellen) {
			sum+=i;
		}
		System.out.println("Opdracht 3: "+sum);
	}
	
	static void ex4() {
		Arrays.sort(sorteren);
		System.out.println("Opdracht 4: "+Arrays.toString(sorteren));
	}
	
	static void ex5() {
		Auto auto = new Auto(onderdelen);		
		Monteur Piet = new Monteur();
		Piet.repareren(auto);					
	}

	static void ex6() {
		String s = sc.nextLine();
		char[] a6 = s.replaceAll(" ","").toCharArray();
		Arrays.sort(a6);
		System.out.println("Opdracht 6: "+Arrays.toString(a6));
	}
	
	static void ex7() {		
		String s = "fiets";
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
	
	static void vliegen(Vliegend v) {
		v.vlieg();
		System.out.println("ik ben aan het vliegen");
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
interface Vliegend{
	void vlieg();
}

class Vliegtuig implements Vliegend{
	public void vlieg() {
		System.out.println("ik vlieg maar ben geen dier");
	}
}

class Leeuw{
	
}

class Spreeuw implements Vliegend{
	public void vlieg() {
		System.out.println("ik vlieg en ben een dier");
	}
}

