package treasure;

import card.Lucky;
import character.Player;
import explore.TextEnter;

public class StatusTreasure extends Treasure {
	TextEnter text = new TextEnter();
	Lucky lucky = new Lucky();
	public StatusTreasure() {
		super("ステータス宝箱");
	}
	
	public void open(Player p) {
		String[] statusArray = {"HP", "ATK", "DEF", "SPD"};
		int point = 0;
		int randomIndex = (int) (Math.random() * statusArray.length);
		String targetName = statusArray[randomIndex];
		
		if(targetName.equals("HP")) {
			point = 10;
		} else {
			point = 1;
		}
		
		point = lucky.applyEffect(point, p);
		
		switch(targetName) {
			case "HP":
				p.increaseHp(point);
				break;
			case "ATK":
				p.increaseAtk(point);
				break;
			case "DEF":
				p.increaseDef(point);
				break;
			case "SPD":
				p.increaseSpd(point);
				break;
			default:
				break;
		}
		
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(p.getName() + "の" + targetName + "が" + point + "上昇した！");
		text.textEnter("");
		
	}

}
