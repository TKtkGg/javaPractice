package character;
import java.util.ArrayList;
import java.util.Scanner;

import equipment.Equipment;

public class Player extends Character {
	Scanner sc = new Scanner(System.in);
	Equipment equipment;
	private ArrayList<Equipment> ownEquipments = new ArrayList<>();

	public Player(String name, int level, int max_hp, int atk, int def, int spd, Equipment e) {
		super(name, level, max_hp, atk, def, spd);
		this.equipment = e;
		getEquipment(e);
	}
	
	public void status() {
		super.status();
		System.out.println("装備 : " + this.equipment.getName() + "(ATK:+" + this.equipment.getAtk() + ")");
		this.equip();
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
	
	public void getEquipment(Equipment e) {
		this.ownEquipments.add(e);
	}
	
	public ArrayList<Equipment> getOwnEquipment() {
		return this.ownEquipments;
	}
	
	public void equip() {
		System.out.println("装備を変更しますか？ (y/n)");
		String input = sc.next();
		if (input.equals("y")) {
			System.out.println("装備の番号を選択してください。");
			int num = 1;
			for(Equipment e : ownEquipments) {
				System.out.println(num + " : " + e.getName() + "(ATK:+" + e.getAtk() + ")");
				num++;
			}
			int choice = sc.nextInt();
			this.equipment = ownEquipments.get(choice - 1);
			return;
		} else {
			return;
		}
	}
}
