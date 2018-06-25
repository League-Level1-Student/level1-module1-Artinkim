public class SmurfRunner { public static void main(String[] args) {
	 /* 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
		 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
		 * 3&4 see comments in code below
		 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
		 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
		 */
	Smurf h = new Smurf("Handy");
	Smurf p = new Smurf("Papa");
	Smurf s = new Smurf("Smurfette");
	h.eat();
	System.out.println(h.getName());
	
	System.out.println(p.getName());
	System.out.println(p.getHatColor());
	System.out.println(p.isGirlOrBoy());
	
	System.out.println(s.getName());
	System.out.println(s.getHatColor());
	System.out.println(s.isGirlOrBoy());
}
}
