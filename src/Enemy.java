public class Enemy {
	String name;
	int level = 1;
	int max_hp;
	int hp;
	int attack;
	
	public Enemy(String name, int max_hp, int attack) {
		this.name = name;
		this.max_hp = max_hp;
		this.hp = this.max_hp;
		this.attack = attack;
	}
	
	public void status() {
		System.out.println(this.name);
		System.out.println("LV : " + this.level);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
	}
	
	public int attack() {
		int damage = this.attack;
		System.out.println(this.name + "の攻撃！");
		System.out.println(damage + "ダメージ！");
		
		return damage;
	}
}
