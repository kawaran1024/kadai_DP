package Adapter;

class JapaneseConsent { // Adaptee
	private int denatsu;

	public JapaneseConsent(int denatsu) {
		this.denatsu = denatsu;
	}
	public int getdenatsu() {
		return (int)(this.denatsu * 0.16);
	}
}
