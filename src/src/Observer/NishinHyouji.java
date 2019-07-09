package Observer;

class NishinHyouji implements Observer {
    public void update(Subject s) {
        print(((Suuchi)s).getValue());
    }

    private void print(int n) {
    	final String nishin = Integer.toBinaryString(n);
    	System.out.println(n + "を 2 進数で表示します");
        System.out.println(nishin);
        //
        // ここに2進数表示処理を作成する
        //
    }
}