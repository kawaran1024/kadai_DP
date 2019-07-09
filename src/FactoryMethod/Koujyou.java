//製作者について抽象化した抽象クラス
package FactoryMethod;

abstract class Koujyou {
	//製品を取得するメソッド
	public final Seihin create() {
		//製品を返却値にする
		Seihin seihin = factoryMethod(); touroku(seihin);
		return seihin;
	}

	//抽象メソッド
	public abstract Seihin factoryMethod();

	public abstract void touroku(Seihin s);
}
