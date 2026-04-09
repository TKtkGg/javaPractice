package character.enemy;

import character.Character;

public class Enemy extends Character {
	public Enemy(String name, int level, int max_hp, int atk, int def, int spd, int exp) {
		super(name, level, max_hp, atk, def, spd, exp);
	}
	
	public void status() {
		super.status();
		System.out.println("EXP : " + this.getExp());
	}
	
	public void attack(Character target) {
		super.attack(target);
	}
	
	public void respawn() {
		this.setHp(this.getMaxHp());
	}
}
