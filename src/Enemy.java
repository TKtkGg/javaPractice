public class Enemy {
	String name;
	int level = 1;
	int max_hp;
	int hp;
	
	public Enemy(String name, int max_hp) {
		this.name = name;
		this.max_hp = max_hp;
		this.hp = this.max_hp;
	}
	
	public void status() {
		System.out.println(this.name);
		System.out.println("LV : " + this.level);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
	}
}
