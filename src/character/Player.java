package character;
import java.util.ArrayList;
import java.util.Scanner;

import equipment.Equipment;
import explore.TextEnter;

public class Player extends Character {
	Scanner sc = new Scanner(System.in);
	TextEnter text = new TextEnter();
	private int nextLevelExp = 100;
	
	Equipment equipment;
	private ArrayList<Equipment> ownEquipments = new ArrayList<>();

	public Player(String name, int level, int max_hp, int atk, int def, int spd, int exp, Equipment e) {
		super(name, level, max_hp, atk, def, spd, exp);
		this.equipment = e;
		getEquipment(e);
	}
	
	public void status() {
		super.status();
		System.out.println("EXP : " + this.getExp() + "/" + this.nextLevelExp);
		System.out.println("装備 : " + this.equipment.getName() + "(ATK:+" + this.equipment.getAtk() + ")");
		text.textEnter("");
		this.equip();
	}
	
	public void attack(Character target) {
		super.attack(target);
	}
	
	@Override
	public int getAtk() {
		return super.getAtk() + this.equipment.getAtk();
	}
	
	public void calcExp(int gainExp) {
		System.out.println("EXP : " + this.getExp() + " -> " + (this.getExp() + gainExp));
		this.setExp(this.getExp() + gainExp);
		while(this.getExp() >= this.nextLevelExp) {
			this.levelUp();
			this.setExp(this.getExp() - this.nextLevelExp);
			this.nextLevelExp *= 1.2;
		}
	}
	
	public void levelUp() {
		System.out.println("レベルアップ！");
		System.out.println("LV : " + this.getLevel() + " -> " + (this.getLevel() + 1));
		this.setLevel(this.getLevel() + 1);
		this.setHp(this.getMaxHp());
		System.out.println("HP : " + this.getMaxHp() + "->" + (this.getMaxHp() + 10));
		this.increaseHp(10);
		System.out.println("ATK : " + this.getAtk() + " -> " + (this.getAtk() + 1));
		this.increaseAtk(1);
		System.out.println("DEF : " + this.getDef() + " -> " + (this.getDef() + 1));
		this.increaseDef(1);
		System.out.println("SPD : " + this.getSpd() + " -> " + (this.getSpd() + 1));
		this.increaseSpd(1);
		text.textEnter("");
	}

	public void rest() {
		this.Heal(100);
		System.out.println("休んで回復した！");
		text.textEnter("");
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
