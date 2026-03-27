package character;
public class Slime extends Enemy{
	public Slime() {
		super("スライム", 50, 3, 3, 3);
	}

	public void attack() {
		super.attack();
		
		//50%で粘液を付与する
		if(Math.random() < 0.5) {
			System.out.println("粘液でヌルヌルになった！");
		}
	}
}
