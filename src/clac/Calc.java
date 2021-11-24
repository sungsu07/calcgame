package clac;

import java.util.Random;
import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;

public class Calc {
		// TODO Auto-generated method stub
		
		NumDto nDto = new NumDto();
		OpDto oDto = new OpDto();
		
			// 문제 출력 메소드
		
			// 무작위로 문제 출력 (두자리 수만 나오게)
		public void random_test(NumDto dto) {
			Random random = new Random();
//			int num1 = random.nextInt(99) + 1;
//			int num2 = random.nextInt(99) + 1;
			dto.setNum1(random.nextInt(99) + 1);
			dto.setNum2(random.nextInt(99) + 1);
			// 답까지 셋팅
			dto.setResult(dto.getNum1() + dto.getNum2());
			
		}	
		
			// 사용자의 입력 메소드
		public int user_scan() {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}	
			// 답 체크 메소드
		public boolean answer_check(int user, int com) {
			if (user == com) {
				return true;
			}
			return false;
		}
		// 나가기 메소드
		public boolean isExit() {
			System.out.println("다른 연산을 하시겠습니까?\n네(1), 아니요(2):");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == 1) {
				return true;
				}
			return false;
			}
		
		
			// 결과 출력 메소드
		public void print_Result() {
			NumDto nDto = new NumDto();
			random_test(nDto); //문제를 만들고
			System.out.print(nDto.getNum1() + " + " + nDto.getNum2() + " = ");
//			System.out.println(nDto.getResult()); // 답 임시
			// 입력받기
			int user = user_scan();
			// 답체크하기
			if (answer_check(user, nDto.getResult())) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
			}
		}
		
		}
	
