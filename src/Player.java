public class Player {
	String name;
	Equipment equipment;
	int level;
	int max_hp;
	int hp;
	int attack;
	
	public Player(String name, Equipment e) {
		this.name = name;
		this.level = 1;
		this.max_hp = 100;
		this.hp = this.max_hp;
		this.attack = 3;
		this.equipment = e;
	}
	
	public void status() {
		System.out.println(this.name);
		System.out.println("LV : " + this.level);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
		System.out.println("ATK : " + this.attack);
		System.out.println("装備 : " + this.equipment.name);
	}
	
	public void rest() {
		this.hp += Math.min(this.max_hp - this.hp, 100);
		System.out.println("休んで回復した！");
	}
	
	public int attack() {
		int damage = this.attack + this.equipment.attack;
		System.out.println(this.name + "の攻撃！");
		System.out.println(damage + "ダメージ！");
		
		return damage;
	}
}
