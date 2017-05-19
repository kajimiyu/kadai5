package kadai5;

	import java.util.Scanner;

	public class IntToEng {

	    private static Scanner sc;

		// メインメソッド
	    public static void main(String[] args) {

	        sc = new Scanner(System.in);
	        int input = sc.nextInt();

	        System.out.println(translateEng(input));

	    }

	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	    	int num[] = new int[]{zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourtenn,fifteen,sixteen,seventeen,eighteen,nineteen};
	    	
	    	
	    	
	    	if(n < 20)
	    
	        return "a";
	    }
	}
