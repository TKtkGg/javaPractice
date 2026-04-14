package character.enemy;

import character.Character;
import character.Player;

public class Enemy extends Character {
	public Enemy(String name, int level, int max_hp, int atk, int def, int spd, int exp, int gold) {
		super(name, level, max_hp, atk, def, spd, exp, gold);
	}
	
	public void status() {
		super.status();
		System.out.println("EXP : " + this.getExp());
	}
	
	public void attack(Character target, Player p) {
		super.attack(target);
	}
	
	public void respawn() {
		this.setHp(this.getMaxHp());
	}
}
