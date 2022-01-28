package com.monocept.basic;

public class PassByValueTest {
	public static void main (String[] args) {
			int score = 90;
			UpdateScoreToZero(score);
			System.out.println(score);
			int[] scores = {80, 90, 100};
			updateAllScoresToZero(scores);
			for(int temp : scores) {
				System.out.println(temp);
			}
		}
		public static void UpdateScoreToZero(int pscore) {
			pscore = 0;
			
		}
		

	public static void updateAllScoresToZero(int[] pscores) {
		for (int i = 0;i<pscores.length;i++) {
		pscores[i]=0;	
	}
		int[] foo = {80,90,100};
		System.out.println(foo.hashCode());
	}
}
