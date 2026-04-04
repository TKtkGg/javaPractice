package explore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import battle.Battle;
import character.Enemy;
import character.Player;
import treasure.StatusTreasure;

public class Move {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	Battle battle = new Battle();
	StatusTreasure st = new StatusTreasure();
	
	private int mass = 25;
	
	Map<String, Runnable> option = new HashMap<>();
	
	public Move(Player p, Enemy e) {
		option.put("BATTLE", () -> battle.battle(p, e));
		option.put("TREASURE", () -> st.open(p));
	}
	
	public void explore() {
		while(mass > 0) {
			List<String> optionName = new ArrayList<>();
			for (String key : option.keySet()) {
				optionName.add(key);
			}
			String upOption = optionName.get(rand.nextInt(optionName.size()));
			String rightOption = optionName.get(rand.nextInt(optionName.size()));
			String leftOption = optionName.get(rand.nextInt(optionName.size()));
			
			System.out.println("どこへいきますか？(残り" + mass + "マス)");
			System.out.println("上(w) : " + upOption);
			System.out.println("右(d) : " + rightOption);
			System.out.println("左(a) : " + leftOption);
			String direction = sc.next();
			
			switch(direction) {
				case "w":
					option.get(upOption).run();
					break;
				case "d":
					option.get(rightOption).run();
					break;
				case "a":
					option.get(leftOption).run();
					break;
				default:
					break;
			}
			
			mass--;
		}
	}
}

