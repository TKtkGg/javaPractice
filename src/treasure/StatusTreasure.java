package treasure;

import character.Player;

public class StatusTreasure extends Treasure {
	public StatusTreasure() {
		super("ステータス宝箱");
	}
	
	public void open(Player p) {
		String[] statusArray = {"HP", "ATK", "DEF", "SPD"};
		int content = 0;
		int randomIndex = (int) (Math.random() * statusArray.length);
		String targetName = statusArray[randomIndex];
		
		switch(targetName) {
			case "HP":
				p.increaseHp(10);
				content = 10;
				break;
			case "ATK":
				p.increaseAtk(1);
				content = 1;
				break;
			case "DEF":
				p.increaseDef(1);
				content = 1;
				break;
			case "SPD":
				p.increaseSpd(1);
				content = 1;
				break;
			default:
				break;
		}
		
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(p.getName() + "の" + targetName + "が" + content + "上昇した！");
	}

}
