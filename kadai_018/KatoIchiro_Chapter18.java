package kadai_018;

class KatoIchiro_Chapter18 extends Kato_Chapter18 { 
	// コンストラクタの追加
	public KatoIchiro_Chapter18() {
	    setGivenName("一郎"); // 名前
	}

	//Override
	public void eachIntroduce() {
	    System.out.println("好きな食べ物はリンゴです");
	}
}
