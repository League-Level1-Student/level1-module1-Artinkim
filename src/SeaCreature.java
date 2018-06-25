/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */




import javax.swing.JApplet;
import java.applet.AudioClip;

public class SeaCreature {

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
		    AudioClip sound = JApplet.newAudioClip(getClass().getResource(this.name + ".wav"));
		    sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
