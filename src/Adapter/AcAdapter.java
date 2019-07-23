package Adapter;

class AcAdapter extends JapaneseConsent	implements Dengen { // Adapter
	public AcAdapter(int denatsu) {
		super(denatsu);
	}
	public void printdenatsu() {
		System.out.println(this.getdenatsu() + "V で給電されています");
	}
}