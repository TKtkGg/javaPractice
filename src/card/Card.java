package card;


public abstract class Card {	
	private String name;
	private String text;
	private boolean isGot;
	
	public Card(String name, String text) {
		this.name = name;
		this.text = text;
		this.isGot = false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getText() {
		return text;
	}
	
	public boolean getIsGot() {
		return isGot;
	}
	
	public void isChosen() {
		this.isGot = true;
	}
}
