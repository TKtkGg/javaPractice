package treasure;
import equipment.Equipment;

public class EquipmentTreasure extends Treasure {
	Equipment equipment;
	public EquipmentTreasure() {
		super("装備宝箱");
	}
	
	public void open() {
		String[] equipmentArray = {"木の剣", "石の剣", "鉄の剣"};
		
		int randomIndex = (int) (Math.random() * equipmentArray.length);
		
		String receiveEquipment = equipmentArray[randomIndex];
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(receiveEquipment + "を手に入れた！");
	}
}
