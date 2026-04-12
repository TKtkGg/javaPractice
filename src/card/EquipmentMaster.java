package card;

public class EquipmentMaster extends Card {
	public EquipmentMaster() {
		super("装備マスター", "装備のATKが1.5倍になる");
	}
	
	public int applyEffect(int atk) {
		if(!getIsGot()) {
			return atk;
		}
		return (int) (atk * 1.5);
	}
}
