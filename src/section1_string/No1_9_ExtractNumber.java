package section1_string;

import java.util.Scanner;

/**
 * 설명
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 *
 * 예시 입력 g0en2T0s8eSoft -> 208
 * @author dream
 *
 * 로직
 * 1. 문자와 숫자가 섞인 문자열 입력
 * 2. String.replaceAll()과 정규식으로 숫자를 추출하여 출력 변수에 저장
 *
 * [중요] 배운점
 * 1. 문제 풀이를 많이 할 수록 익숙해져서 문제 풀이 소요시간이 줄어듬
 * 2. Character.isDigit() 는 문자타입의 데이터가 숫자인지 확인하는 메소드를 활용 할 수 있음
 *
 */
public class No1_9_ExtractNumber {


	// 강의 풀이
	public static void main(String[] args) {

		String result = "";
		int resultInt = 0;

		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		for(char ch:input.toCharArray()) {
			if(Character.isDigit(ch)) {
				result += ch;
			}
		}
		resultInt = Integer.parseInt(result);

		System.out.println(resultInt);

	}


	///////////////////////////////////////////////////////////


	// 소요시간 15분
	public static void main_pkh(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		No1_9_ExtractNumber extractNumber = new No1_9_ExtractNumber();

		System.out.println(extractNumber.solution_pkh(input));

	}

	public int solution_pkh(String input) {

		String result = "";
		int resultInt = 0;

		String regEx = "[^0-9]";

		result = input.replaceAll(regEx, "");
		resultInt = Integer.parseInt(result);

		return resultInt;

	}


}
