package character;
import equipment.Equipment;

public class Player extends Character {
	Equipment equipment;

	public Player(String name, int max_hp, int atk, int def, int spd, Equipment e) {
		super(name, max_hp, atk, def, spd);
		this.equipment = e;
	}
	
	public void status() {
		super.status();
		System.out.println("装備 : " + this.equipment.getName() + "(ATK:" + this.equipment.getAtk() + ")");
	}
	
	public void attack(Character target) {
		super.attack(target);
	}
	
	@Override
	public int getAtk() {
		return super.getAtk() + this.equipment.getAtk();
	}

	
	public void rest() {
		this.Heal(100);
		System.out.println("休んで回復した！");
	}
}
