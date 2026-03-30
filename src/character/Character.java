package character;

public abstract class Character {
	private String name;
	private int max_hp;
	private int hp;
	private int atk;
	private int def;
	private int spd;
	
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
	
	public String getName() {
		return this.name;
	}
	
	public void attack() {
		System.out.println(this.name + "の攻撃！");
	}
	
	public int Heal(int heal) {
		this.hp += heal;
		if(this.hp > this.max_hp) {
			this.hp = this.max_hp;
		}
		return hp;
	}
	
	public void increaseHp(int increase) {
		this.max_hp += increase;
		this.hp += increase;
	}
	
	public void increaseAtk(int increase) {
		this.atk += increase;
	}
	
	public void increaseDef(int increase) {
		this.def += increase;
	}
	
	public void increaseSpd(int increase) {
		this.spd += increase;
	}
}
