package Kazuategame;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Kazuategame {

	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1~100までの数字を入力してください");
		String t=br.readLine();
		System.out.println(t);*/

//キーボードに入力できるようにする
	  Scanner stdIn = new Scanner(System.in);

	  //Randomをrandに代入
	    Random  rand  = new Random();

	    //100までの数字をnoに代入
	    int no = rand.nextInt(100);

	    System.out.println("数当てゲーム開始！！0～100の数を当てて！");

	    int i;

	    //０～１０回までループする
	    for(i=0;i<10;i++){

	    	//キーボードに入力した数字をxに代入
	      int x = stdIn.nextInt();

	      //ｘがnoと等しければ
	if(x==no){
        System.out.println("おめでとう！！正解ですo(^-^)o");
        break;
      }
      else if(x>no)
        System.out.println("もっと小さな数だよ。");
      else
        System.out.println("もっと大きな数だよ。");
    }

    if(i==10)
      System.out.println("終了です。\n正解は"+no+"でした＞＜");
	}

}
