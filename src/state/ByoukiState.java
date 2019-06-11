package state;

class ByoukiState extends DogState {
	private static ByoukiState s = new ByoukiState();
	private ByoukiState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		// なにもない
	}
	public void tabeta(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}
	public String toString() {
		return "病気状態";
	}
}