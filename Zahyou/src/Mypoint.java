
public class Mypoint {

	private int x;
	private int y;

	//　初期座標を0に設定（コンストラクタ）
	public Mypoint(){
		x = 0;
	    y = 0;
	}

	//初期座標を指定(コンストラクタ)
	public Mypoint(int px,int py){
		if(px >=0 && px <= 100)  x = px; else x=0;
		if(py>=0 && py <=100) y=py; else  y =0;
	}

	//X座標を設定する（メソッド）
	public void setX(int px)
	{
		if(px >=0 && px <=100)
			x = px;
	}

	//Y座標を設定する（メソッド）
	public void setY(int py)
	{
		if(py >= 0 && py <=100)
			y = py;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}



	public static void main(String[] args)
	{
	// TODO 自動生成されたメソッド・スタブ

		//Mypointクラスのp1オブジェクトを作成する
		Mypoint p1;

		//Mypointクラスのフィールドをp1にコピーしてp1オブジェクトを作成
		p1 = new Mypoint();

		// 　メソッド名setXの呼び出して設定
		p1.setX(10);

		//メソッド名setYの呼び出して設定
		p1.setY(5);

		int px1= p1.getX();
		int py1 = p1.getY();

		System.out.println("p1のX座標は" + px1 + "Y座標は" + py1 + "でした。" );


		Mypoint p2;
		p2 = new Mypoint(20,10);

		int px2 = p2.getX();
		int py2 = p2.getY();



		System.out.println("p1のX座標は"+ px2 + "Y座標は" + py2 + "でした。");

	}

}

