package Observer;

class JyuurokushinHyouji implements Observer {
    public void update(Subject s) {
        print(((Suuchi)s).getValue());
    }

    private void print(int n) {
    	final String jyuurokushin = Integer.toHexString(n);
        System.out.println(n + "を 16 進数で表示します");
        System.out.println(jyuurokushin);
        //
        // ここに 16 進数表示処理を作成する
        //
    }
}