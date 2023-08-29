package section1_string;

import java.util.Scanner;

/**
 * Palindrome 회문문자열 (String)
 *
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열(Palindrome)이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * ex) gooG -> YES
 * ex) gog -> YES
 * ex) geoag -> NO
 *
 * [로직]
 * 1. 입력받은 문자열 input (String) 을 소문자로 변환
 * 2. input 길이의 절반만큼 반복
 * 3. input 문자열 요소의 문자를 앞과 뒤를 조회하여 비교하여, 일치하지않는 경우 'NO' 반환
 *
 *
 * @author kwang
 *
 */
public class No1_7_Palindrome {

	// 강의 풀이
	public static void main(String args[]) {

		No1_7_Palindrome Palindrome = new No1_7_Palindrome();
		Scanner in = new Scanner(System.in);
		String input=in.next();
		System.out.println(Palindrome.solution(input));

	}

	// 강의 풀이
	public String solution(String input) {
		String result="YES";

		input = input.toLowerCase();
		int length = input.length();

		for(int loop=0;loop<length/2;loop++) {		// length / 2 연산결과는 나머지를 버림 (ex 5/2 = 2 , 나머지값을 구하는 연산 5%2 = 1)
			if(input.charAt(loop) != input.charAt(length-1-loop)){		// 앞순서의 값과 뒷순서의 값을 비교
				return "NO";
			}
		}

		return result;
	}

	//////////////////////////////////////////////////////////////

	// 35분 소요
	// 정답
	public static void main_pkh(String args[]) {

		No1_7_Palindrome palindrom = new No1_7_Palindrome();

		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(palindrom.solution_pkh(str));

	}

	public String solution_pkh(String str) {

		String answer = "";
		String rotationStr="";

		String lowcaseStr = str.toLowerCase();

		for(int loop=lowcaseStr.length() - 1; loop >= 0 ; loop--) {

			rotationStr+= lowcaseStr.charAt(loop);

		}

		if(lowcaseStr.equals(rotationStr)) {
			answer = "YES";
		}else {
			answer = "NO";
		}


		return answer;
	}

}
