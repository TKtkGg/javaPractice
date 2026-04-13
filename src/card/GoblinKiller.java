package card;

import character.Player;

public class GoblinKiller extends Card {
	public GoblinKiller() {
		super("ゴブリンキラー", "ゴブリンに対して与えるダメージが1.5倍になる");
	}
	
	public int applyEffect(int damage, String enemy, Player p) {
		if(!p.hasCard(this.getName())) {
			return damage;
		}
		System.out.println("ゴブリンキラーの効果が発動！");
		if(enemy.contains("ゴブリン")) {
			return (int) (damage * 1.5);
		}
		return damage;
	}

}
