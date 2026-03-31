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
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public int getSpd() {
		return this.spd;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int attack(int doAtk, int tagDef, int tagHp) {
		double min = 0.5;
		double max = 1.0;
		double randomValue = Math.random() * (max - min) + min;
		int damage = (int) ((doAtk - tagDef / 3) * 5 * randomValue); 
		if(damage < 0) {
			damage = 0;
		}
		tagHp -= damage;
		System.out.println(this.name + "の攻撃！");
		System.out.println(damage + "ダメージ！");
		
		return tagHp;
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
