package battle;

import character.Player;
import character.enemy.Enemy;

public class Battle {
	public void battle(Player p, Enemy e) {
		System.out.println("戦闘開始");
		System.out.println(p.getName() + " vs " + e.getName());
		
		if(!e.isAlive()) {
			e.respawn();
		}
		
		while(p.isAlive() && e.isAlive()) {
			if(p.getSpd() >= e.getSpd()) {
				p.attack(e);
				if(e.isAlive()) {
					e.attack(p);
				}
			} else {
				e.attack(p);
				if(p.isAlive()) {
					p.attack(e);
				}
			}
		}
		if(p.isAlive()) {
			System.out.println(p.getName() + "の勝利！");
			p.calcExp(e.getExp());
			return;
		} else {
			System.out.println(e.getName() + "の勝利！");
			return;
		}
	}
	
}
