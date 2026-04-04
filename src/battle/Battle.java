package battle;

import character.Enemy;
import character.Player;

public class Battle {
	public void battle(Player p, Enemy e) {
		System.out.println("戦闘開始");
		while(p.isAlive() && e.isAlive()) {
			p.attack(e);
			if(e.isAlive()) {
				e.attack(p);
			}
		}
		if(p.isAlive()) {
			System.out.println(p.getName() + "の勝利！");
			return;
		} else {
			System.out.println(e.getName() + "の勝利！");
			return;
		}
	}
	
}
