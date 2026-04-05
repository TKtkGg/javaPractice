package character;
public class Enemy extends Character {
	public Enemy(String name, int max_hp, int atk, int def, int spd) {
		super(name, max_hp, atk, def, spd);
	}
	
	public void status() {
		super.status();
	}
	
	public void attack(Character target) {
		super.attack(target);
	}
	
	public void respawn() {
		this.setHp(this.getMaxHp());
	}
}
