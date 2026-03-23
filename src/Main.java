
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Equipment e = new Equipment("木の剣",2);
		Player p = new Player("TKG",e);
		Slime s = new Slime();

		System.out.println("プレイヤー("+ p.name +")を生成しました！");

		p.status();
		p.rest();
		
		System.out.println("スライムを生成しました！");
		
		s.status();
	}

}
