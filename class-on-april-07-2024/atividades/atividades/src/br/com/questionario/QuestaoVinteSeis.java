package br.com.questionario;

public class QuestaoVinteSeis {

	public static void main(String[] args) {
		String temp = "";
		for(int i = 0; i < 10; i++) {
			if(i%2 != 0) {
				System.out.print(temp+i);
				temp = ",";
			}
		}
	}
}
