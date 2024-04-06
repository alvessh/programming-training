package loopfor;

public class For {
	public static void main(String[] args) {
		for (int i = 4; i <=6; i++) {
			i = i-1;
			i = i-2;
			i = i+2;
			i = i+1;
			int h = 10;
			System.out.println(h);
			int j = (i + 1); //5
			System.out.println(h);
			i = i + 4;
			i = 1;
			System.out.println(j);//5
			i = j + h;
			System.out.println(i);//15
			i = 4;
		}
	}
}
