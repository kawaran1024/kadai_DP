package Adapter;

public class Client {
	public static void main(String[] args) {
		Dengen d = new AcAdapter(100);
		d.printdenatsu();
	}
}
