
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Player p = new Player();
		Slime s = new Slime();
		
		p.name = "TKG";
		p.max_hp = 100;
		System.out.println("プレイヤー("+ p.name +")を生成しました！");
		
		p.status();
		p.rest();
		
		System.out.println("スライムを生成しました！");
		
		s.status();
	}

}
