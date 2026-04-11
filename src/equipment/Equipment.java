package equipment;

import java.util.Objects;

public class Equipment {
	private String name;
	private int atk;
	private int price;
	
	public Equipment(String name, int atk, int price) {
		this.name = name;
		this.atk = atk;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Equipment)) return false;
        Equipment other = (Equipment) obj;
        return this.atk == other.atk && Objects.equals(this.name, other.name);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(name, atk);
    }
}
