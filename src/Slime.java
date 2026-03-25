public class Slime extends Enemy{
	public Slime() {
		super("スライム", 50, 3);
	}

	public int attack() {
		int damage = super.attack();
		System.out.println("敵は粘液でヌルヌルになった！");
		
		return damage;
	}
}
