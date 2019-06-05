package Singleton;
public class SingletonTest {

	public static void main(String[] args) {
		Renban seizou1 = Renban.getNumber();
		seizou1.name("a");
		seizou1.cnt(1);
		seizou1.print();
		Renban seizou2 = Renban.getNumber();
		seizou2.name("b");
		seizou2.cnt(1);
		seizou2.print();
		Renban seizou3 = Renban.getNumber();
		seizou3.name("c");
		seizou3.cnt(1);
		seizou3.print();
		Renban seizou4 = Renban.getNumber();
		seizou4.name("d");
		seizou4.cnt(1);
		seizou4.print();
		Renban seizou5 = Renban.getNumber();
		seizou5.name("e");
		seizou5.cnt(1);
		seizou5.print();
	}

}

class Renban {
	private static Renban jittai = new Renban();
	private String namae;
	private int renban;
	public static Renban getNumber() {
		return jittai;
	}
	public void name(String butsu) {
		namae = butsu;
	}
	public void cnt(int ren) {
		renban += ren;
	}
	public void print() {
		if(9999 < renban) {
			System.out.println("これ以上製造できません");
		} else {
			System.out.println("製造物：" + namae + "　" + "製造番号：" + String.format("%04d", renban));
		}
	}
}