import java.util.*;
public class matrixandnumber {
	public static void main(String[] args) {
		/* началь */
		System.out.println("обротное треугольник");
		int a[][] = {{1, 5, 3},{2, 1, 6},{6, 1, 2}};   /* можно изменить цифры или продлевать цифры в скобки */
		int b[][] = {{7, 1, 6},{2, 1, 6},{2, 7, 1}};   /* можно изменить цифры или продлевать цифры в скобки */
		int c[][] = new int[3][3];
		
		/* сейчас масивы создаль */
			for(int i = 0; i < 3; i++) {
				for (int j = 0; j < 3 - i; j++) {
					
					/* сейчас собрать + =*/
					c[i][j] = a[i][j] + b[i][j];
					
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
		}
			/* треугольник !*/
		System.out.println("Triangle : ");
	Scanner sc = new Scanner(System.in);
	int numRow = sc.nextInt();
		for (int i = 1; i < numRow; i++) { /* <----- вместо один  можно  и другой число*/
			for (int j = 1; j < numRow - i; j++) {  /* <------ здесь тоже можно другой число освен 1*/
				System.out.print(" ");
			}
			for (int k = +2; k < i + 3; k++) {  /* <------ вместо три можно  и другой число :-)*/
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("\n Поздравляю вы супер :-)"); /* <----- куманда код конец :-)*/
		System.out.println("\n Congrationlation your good :-)");
	}
}
