/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */




public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if(name.equals("Papa"))
		{
		return "red";	
		}
		else
		{
		return "white";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
			// 3. Fill in this method
			if(name.equals("Smurfette"))
			{
			return "female";	
			}
			else
			{
			return "male";
			}
	}

}



