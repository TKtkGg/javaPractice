package character;

public abstract class Character {
	public String name;
	public int max_hp;
	public int hp;
	public int atk;
	public int def;
	public int spd;
	
	public Character(String name, int max_hp, int atk, int def, int spd){
		this.name = name;
		this.max_hp = max_hp;
		this.hp = max_hp;
		this.atk = atk;
		this.def = def;
		this.spd = spd;
	}
	
	public void status() {
		System.out.println(this.name);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
		System.out.println("ATK : " + this.atk);
		System.out.println("DEF : " + this.def);
		System.out.println("SPD : " + this.spd);
	}
	
	public void attack() {
		System.out.println(this.name + "の攻撃！");
	}
}
