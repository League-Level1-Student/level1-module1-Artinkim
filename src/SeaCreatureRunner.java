public class SeaCreatureRunner {
	public static void main(String[] args) {
		// 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
		// 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		SeaCreature Patrick = new SeaCreature("Patrick");
		SeaCreature Squidward = new SeaCreature("Squidward");
		Spongebob.eat();
		Spongebob.laugh();
		Patrick.eat();
		Patrick.laugh();
		Squidward.eat();
		Squidward.laugh();
	} 
}
