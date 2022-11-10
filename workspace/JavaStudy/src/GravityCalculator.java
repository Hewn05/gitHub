import java.util.Scanner;

public class GravityCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gravity = -9.81;
		double initPos = 1000;
		double initV = 0;
		System.out.println("낙하시간 : ");
		double time = sc.nextDouble();
		double finPos = 0.5 * gravity * Math.pow(time, 2) + initV * time + initPos;
		System.out.printf("%.2f초 후, 물체의 고도는 %.2fm", time, finPos);
	}
}
