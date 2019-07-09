//「ラジオ」の製作者を表すクラス
package FactoryMethod;

class RadioKoujyou extends Koujyou {
	public Seihin factoryMethod() {
		return new Radio();
	}
	public void touroku(Seihin s) {
		Radio r = (Radio) s;
		//productに施す処理
		r.numberring();
	}
}
