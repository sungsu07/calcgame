package dto;
/*
 * 수 데이터 클래스
 */
public class NumDto {
	private int num1;
	private int num2;
	private int result;
	
	// 메소드
	// 값을 셋팅
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	// 값을 가져오자
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}
