package section1_string;

import java.util.Scanner;

/**
 * 회문 문자열 (Palindrome)
 *
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 *
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예시) found7, time: study; Yduts; emit, 7Dnuof -> YES
 *
 * @author kwang
 *
 * [중요] 보완점
 * 1. String 을 효과적으로 수정 할 수 있는 StringBuilder 활용 (팰린드롭)
 * 2. StringBuilder vs StringBuffer
 * 공통점 : 문자열을 가변적으로 처리하기위한 클래스 (=java.lang 패키지)
 * 차이점 : StringBuffer 는 thread-safe 가 적용되어 muti thread 환경에서 사용 할 수 있으나, StringBuilder 는 적용되어있지 않기 떄문에 단일 thread 환경에서 사용함
 * 연산 성능비교 : StringBuffer > StringBuffer > String
 *
 */
public class No1_8_Palindrome {


	// 강의 풀이
	public static void main(String[] args) {

		String result = "";

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String regex = "[^A-z]";

		String original = input.toUpperCase().replaceAll(regex, "");		// 알파벳이 아닌 문자 제거

		// 문자열 뒤집기 (StringBuilder 활용)
		StringBuilder stringBuilder = new StringBuilder(original);
		String tmp = stringBuilder.reverse().toString();

		if(original.equals(tmp)) {
			result = "YES";
		}else {
			result = "NO";
		}

		System.out.print(result);

	}

	///////////////////////////////////////////////////////////

	// 정답
	// 1시간 이상 소요
	// 풀이 확인예정
	public static void main_pkh(String[] args) {

		Scanner in = new Scanner(System.in);

		String input= in.nextLine();

		String result = "";

		No1_8_Palindrome palindrome = new No1_8_Palindrome();

		result = palindrome.solution_pkh(input);


		System.out.println(result);

	}


	public String solution_pkh(String input) {

		String result = "";
//		String regex = "[0-9~!@#$%^&*()-_=+.,\s]";		// error : 해당 정규식을 replaceAll에 첫번째 인자로 전달하면 대문자가 걸림

		String regex = "[^a-zA-Z]";		//regular expression

		String afterInput = "";

		String changeInput = "";


		afterInput = input.replaceAll(regex, "");

		afterInput = afterInput.toLowerCase();

		int size = afterInput.length();

		for(int loop=size-1 ; loop >= 0 ; loop--) {

			changeInput += afterInput.charAt(loop);
		}

		if(afterInput.equals(changeInput)) {
			result = "YES";
		}else {
			result= "NO";
		}

		return result;

	}



}
