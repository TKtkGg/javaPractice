public class Slime extends Enemy{
	public Slime() {
		super("スライム", 50, 3);
	}

	public int attack() {
		int damage = super.attack();
		
		//50%で粘液を付与する
		if(Math.random() < 0.5) {
			System.out.println("粘液でヌルヌルになった！");
		}
		return damage;
	}
}
