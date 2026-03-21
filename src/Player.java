
public class Player {
	String name = "Player1";
	int level = 1;
	int max_hp = 100;
	int hp = max_hp;
	
	public void status() {
		System.out.println("LV : " + this.level);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
	}
	
	public void rest() {
		this.hp += 100;
		if (this.hp > this.max_hp) {
			this.hp = this.max_hp;
		}
		System.out.println("休んで回復した！");
	}
}
