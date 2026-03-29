package treasure;
import equipment.Equipment;
import equipment.EquipmentList;

public class EquipmentTreasure extends Treasure {
	Equipment equipment;
	public EquipmentTreasure() {
		super("装備宝箱");
	}
	
	public void open() {
		Equipment[] equipmentArray = EquipmentList.useEquipmentList();
		
		int randomIndex = (int) (Math.random() * equipmentArray.length);
		
		Equipment receiveEquipment = equipmentArray[randomIndex];
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(receiveEquipment.name + "(ATK:" + receiveEquipment.atk + ")を手に入れた！");
	}
}
