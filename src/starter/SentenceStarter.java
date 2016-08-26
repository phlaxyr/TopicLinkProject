package starter;

import java.util.concurrent.ThreadLocalRandom;

public class SentenceStarter {
	public String input;
	public String[] words;
	
	public SentenceStarter(String w) {
		input=w;
		words=input.split(" ");
		
	}
	
	private static String[] append(String[] first, String[] second, int finalLength) {
		String[] out=new String[finalLength];
		int i=0;
		for(;i<first.length && i<finalLength; i++) {
			out[i] = first[i];
		}
		System.out.println(i);
		for(int j=0;j<second.length && i<finalLength; i++) {
			System.out.println(i);
			out[i]=second[j];
			j++;
		}
		return out;
		
	}
	
	public static String[][] generate(String sentence, int wordNo, int number) {
		String[] words = sentence.split(" ");
		String[][] out = new String[number][wordNo];
		String word = "";
		for(int i=0; i<number; i++) {
			for(int j=0; j<wordNo; j++) {
//ThreadLocalRandom.current().nextInt(0, words.length)];
				
				out[i][j]=word;
			}
			out[i][0] = "I";
		}
		return out;
	}
	
	public static void main(String[] args) {
		p(generate("you are so awesome good", 6, 6));
		System.out.println();
		String[] stra = {"this","is","a"};
		String[] strb = {"test","please","ignore","this","message"};
		String[] strarr = append(stra, strb, stra.length+strb.length);
		p(strarr);
	}
 	
	
	private static void p(String[] o) {
			for(String s:o) {
				System.out.print(s + " ");
			}
			System.out.println();
		
	}
	private static void p(String[][] o) {
		for(String[] s:o) {
			for(String b:s) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
