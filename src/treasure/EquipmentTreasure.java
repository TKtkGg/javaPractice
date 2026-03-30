package treasure;
import equipment.Equipment;
import equipment.EquipmentList;

public class EquipmentTreasure extends Treasure {
	Equipment equipment;
	Equipment[] equipmentArray;
	public EquipmentTreasure(EquipmentList list) {
		super("装備宝箱");
		this.equipmentArray = list.useEquipmentList();
	}
	
	public void open() {
		int randomIndex = (int) (Math.random() * equipmentArray.length);
		
		Equipment receiveEquipment = equipmentArray[randomIndex];
		
		String eqName = receiveEquipment.getName();
		int eqAtk = receiveEquipment.getAtk();
		
		System.out.println(this.name + "を見つけた！");
		System.out.println(eqName + "(ATK:" + eqAtk + ")を手に入れた！");
	}
}
