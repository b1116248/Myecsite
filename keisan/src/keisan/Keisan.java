package keisan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keisan {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("--計算をします--");


		int end = 0;
		while(end == 0) {
			System.out.println("**メニュー**\n --1:計算を開始する　--0:計算を終了します");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();

			int n = 0;

			if(str.matches("^[0-1]+$")){
				n= Integer.parseInt(str);
			}else {
				System.out.println("\n --1:計算を開始する　--0:計算を終了します");
				continue;
			}

			if(n == 0) {
				System.out.println("終了します");
				break;
			}

			System.out.println("【ｘとｙに数字を入力してください】");


			double x,y;
			System.out.print("x=");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br1 = new BufferedReader(isr);
			try{
				String buf = br1.readLine();
				x= Integer.parseInt(buf);
				System.out.print("y=");

				buf = br1.readLine();

				y= Integer.parseInt(buf);
			} catch(Exception e){
				x =  0;
				y = 0;
			}
			/*System.out.println("x="+x);*/

			int ts;

				System.out.println("【以下の方法の中から、計算方法を入力して下さい】");
				System.out.println("(--1 : + --2 : -  --3 : ×  --4 : ÷)");

				System.out.print("計算方法：");

				BufferedReader br2= new BufferedReader(new InputStreamReader(System.in));

				String str2 = br2.readLine();

					/*String str2 = new Scanner(System.in).nextLine();*/

				ts= Integer.parseInt(str2);

				System.out.print("\n");
			/*	System.out.println("あなたの選択した番号は"+ts+"番です。");*/

				if(ts == 1){
					System.out.println("解答は"+(x+y)+"です。");
				}else if (ts == 2){
					System.out.println("解答は"+(x-y)+"です。");
				}else if(ts == 3){
					System.out.println("解答は"+(x*y)+"です。");
				}else if(ts ==4){
					System.out.println("解答は"+(x/y)+"です。");
				}



				/*System.out.println("x - y="+(x-y));
				System.out.println("x * y="+(x*y));
				System.out.println("x / y="+(x/y));
*/



		/*	//配列のサイズをセット
			int num[] = new int[10];

				for(int i = 1;  i<=10;i++){
					num[i]=i+1;
				}
				int i= 0;

				while (i<10){
					System.out.println(i);
					i++;*/
				}}




	}


