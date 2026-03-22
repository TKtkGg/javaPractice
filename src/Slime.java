
public class Slime {
	String name = "スライム";
	int level = 1;
	int max_hp = 50;
	int hp = max_hp;
	
	public void status() {
		System.out.println("スライム");
		System.out.println("LV : " + this.level);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
	}
}
