public class Player {
	String name = "Player";
	Equipment equipment;
	int level = 1;
	int max_hp = 100;
	int hp = max_hp;
	int attack = 3;
	
	public void status() {
		System.out.println("プレイヤー");
		System.out.println("LV : " + this.level);
		System.out.println("HP : " + this.hp + "/" + this.max_hp);
		System.out.println("ATK : " + this.attack);
		System.out.println("装備 : " + this.equipment.name);
	}
	
	public void rest() {
		this.hp += Math.min(this.max_hp - this.hp, 100);
		System.out.println("休んで回復した！");
	}
}
