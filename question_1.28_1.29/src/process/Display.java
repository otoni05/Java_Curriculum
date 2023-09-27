package process;

public class Display {
	
	/**
	 * ソートされた都道府県データを出力
	 * 
	 * @param sortedPrefectures ソートされた都道府県データの配列
	 */
	public static void displayPrefectures(String[] sortedPrefectures) {
        for (String prefecture : sortedPrefectures) {
        	
            String[] info = prefecture.split(":");
            
            String prefectureName = info[0];
            String city = info[1];
            int area = Integer.parseInt(info[2]);

            System.out.println("都道府県名：" + prefectureName);
            System.out.println("県庁所在地：" + city);
            System.out.println("面積：" + area + "km2" +"\n");
        }
    }
}