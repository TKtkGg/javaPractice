package equipment;

public class Equipment {
	private String name;
	private int atk;
	
	public Equipment(String name, int atk) {
		this.name = name;
		this.atk = atk;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAtk() {
		return this.atk;
	}
}
