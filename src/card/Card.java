package card;


public abstract class Card {	
	private String name;
	private String text;
	private int price;
	private boolean isGot;
	
	public Card(String name, String text, int price) {
		this.name = name;
		this.text = text;
		this.price = price;
		this.isGot = false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getText() {
		return this.text;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public boolean getIsGot() {
		return this.isGot;
	}
	
	public void isChosen() {
		this.isGot = true;
	}
}
