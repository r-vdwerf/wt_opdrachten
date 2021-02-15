package wtprog;

public class Monteur {
	public void repareren(Auto a) {
		int count = 0;		
		for(int i=0;i<a.onderdelen.length;i++) {
			if (a.onderdelen[i]==true) {
				count++;
				//System.out.println(count);
				a.onderdelen[i]=false;
			}
		}
		System.out.println("Opdracht 5: er zijn "+count+" onderdelen gerepareerd. de totale kosten: €"+25*count);
	}
}
