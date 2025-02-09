package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// 各オブジェクトを作成
        KatoTaro_Chapter18 kato1 = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 kato2 = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 kato3 = new KatoHanako_Chapter18();
        
        kato1.setGivenName();
        kato2.setGivenName();
        kato3.setGivenName();
        
           // 各オブジェクトの紹介を実行
        kato1.execIntroduce();
        kato2.execIntroduce();
        kato3.execIntroduce();

	}

}
