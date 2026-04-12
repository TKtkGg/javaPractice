package card;

public class SlimeKiller extends Card {
	public SlimeKiller() {
		super("スライムキラー", "スライムに対して与えるダメージが1.5倍になる");
	}
	
	public int applyEffect(int damage, String enemy) {
		if(!getIsGot()) {
			return damage;
		}
		if(enemy.contains("スライム")) {
			return (int) (damage * 1.5);
		}
		return damage;
	}

}
