package kadai_018;

class KatoHanako_Chapter18 extends Kato_Chapter18 {  
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}
    //Override
	public void eachIntroduce() {
	    System.out.println("趣味は読書です");
	}
}
