package compositionExample.home;

public class Main {

	public static void main(String[] args) {
		
		Mutfak mutfak = new Mutfak(36,"Bulasık Makinesi", "Bosh");
		
		Ev ev = new Ev(mutfak);
		
		ev.getMutfak().BilgileriGoster();
		

	}

}
