package treasure;
import java.util.HashMap;

import character.Player;

public class StatusTreasure extends Treasure {
	public StatusTreasure() {
		super("ステータス宝箱");
	}
	
	public int open(Player p) {
		HashMap<String, Integer> statusDict = new HashMap<String, Integer>();
		String[] statusArray = {"HP", "ATK", "DEF", "SPD"};
		
		statusDict.put("HP", p.max_hp);
		statusDict.put("ATK", p.atk);
		statusDict.put("DEF", p.def);
		statusDict.put("SPD", p.spd);
		
		int randomIndex = (int) (Math.random() * statusDict.size());
		String targetName = statusArray[randomIndex];
		int targetMath = statusDict.get(targetName);
		
		int content = (int) (Math.ceil((double)targetMath / 10));
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(p.name + "の" + targetName + "が" + content + "上昇した！");
		
		targetMath += content;
		
		return targetMath;
	}

}
