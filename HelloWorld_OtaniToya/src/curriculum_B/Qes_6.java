package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {
	/***************************
	 * [概要]入力した商品の残り台数が出力されるシステム
	 * [詳細]入力した値をカンマ区切りで配列にして配列分回して、適当な出力
	 **************************/
	
    public static void main(String[] args) {
    	
    	// Scanner変数
        Scanner scanner = new Scanner(System.in);
        // Random変数
        Random rand = new Random();
        // 入力用変数
        String input = null;
        
        System.out.println("、(カンマ)区切りで入力してください");
        // 入力
        input = scanner.nextLine();
        // カンマ区切りにして配列に代入
        String[] Products = input.split("、");
        
        // テレビの乱数
        int tv = rand.nextInt(12);
        
        // 拡張for文でループ
        for (String product : Products) {
        	
            //判定
            switch (product) {
            
                // テレビ、ディスプレイの場合(ディスプレイと扱いが同じのためbreakしない)    
                case "テレビ", "ディスプレイ" :
                
                	// 文字列の内容が同じか確認するためにequals() メソッドを利用
                	int result = product.equals("テレビ") ? tv : (11 - tv);
                	System.out.println(product + "の残り台数は" + result + "台です" + "\n");	
                    break;
                    
                // パソコン、冷蔵庫、扇風機、洗濯機、加湿器の場合    
                case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器" :
                	System.out.println(product + "の残り台数は" + rand.nextInt(12) + "台です" + "\n");
                    break;
                    
                // 商品一覧以外の場合
                default:    
                    System.out.println("『" + product + "』は指定の商品ではありません" + "\n");
            }   
        }
        // Scannerを閉じる
        scanner.close();
    }
}