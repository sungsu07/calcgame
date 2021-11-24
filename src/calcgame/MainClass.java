package calcgame;

import clac.Calc;

public class MainClass {
	public static void main(String[] args) {
		
		
//		// 연산게임
		System.out.println("연산 게임 시작");
//		// 문제가 출력
//		System.out.print("1 + 1 = ");
//		// 사용자가 문제를 보고 입력
//		System.out.println("2"); // 사용자가 2를 입력
//		// 맞는지 틀린지 체크
//		System.out.println("맞다");
//		// 맞으면 맞다 틀리면 틀렸다
		
		
		Calc game = new Calc();
		do {
			game.print_Result();
		} while(game.isExit());
		System.out.println("게임 종료");
		
		
	}
}
