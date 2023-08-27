package section1_string;

import java.util.Scanner;

/**
 * 특정문자 뒤집기 (String)
 * 
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고 (알파벳의 출력 순서가 바뀌어야함 ),
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력 : 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * [문제에 누락된 보충 설명]
 * - 입력 문자의 갯수는 홀수/짝수에 관계없이 문자를 뒤집을 수 있어야함
 * - 입력 문자는 알파벳과 특수문자가 대칭으로 제공됨 (추정)
 *
 * 출력 : 첫줄에 알파벳만 뒤집힌 문자열을 출력합니다
 *
 * 입출력 예시 1       : a#b!GE*T@S -> S#T!EG*b@a
 * [추가] 입출력 예시 2 : a#b!G*T@S -> S#T!G*b@a   (문자열길이 홀수 가능)
 * [추가] 입출력 예시 3 : ab!GT@S -> ST!Gb@a       (잘못된 입력으로 추정)
 *
 * [중요] 배운점
 * 1. 알파벳을 확인하는 Character lib 를 활용하면 정규식으로 특수문자를 확인하지않아도됨
 * 2. 뒤집힌 문자열을 새로 정의하는것보다, 기존 문자열을 수정하는게 로직을 구현하기에 수훨함
 *
 * [로직]
 * 0. 문자열을 입력받아 input 변수 (String) 에 저장하고 타입을 변환 inputArr char[]
 * 1. 문자 '뒤집기 위치'를 관리하는 left / right pointer (int) 을 정의함
 * (left : 0, right : input string 사이즈)
 * 2. 입력받은 input 변수를 문자 배열 구조 inputArr(char[] )로 변경
 * 3. Character lib 로 배열을 반복하면서 알파벳 식별
 * - inputArr left 위치가 알파벳인 경우 left 를 1 증가
 * - inputArr right 위치가 알파벳인경우 right 르 1 감소
 * - 위를 모두 만족하지 않는경우 문자열 뒤집기
 *
 * 4. 결과값 inputArr를 문자열 구조 (String) 로 변환하여 반환
 *
 * @author kwang
 *
 */
public class No1_5_ExchangeWord {

	// 강의 풀이
	public static void main(String[] args) {

		No1_5_ExchangeWord ExchangeWord = new No1_5_ExchangeWord();

		Scanner in = new Scanner(System.in);

		String input=in.next();

		System.out.println(ExchangeWord.solution(input));

	}

	// 강의 풀이
	public String solution(String input) {
		String result = "";

		char[] charArr = input.toCharArray();
		int left=0;
		int right=charArr.length-1;

		while(left<right) {
			if(!Character.isAlphabetic(charArr[left])) {
				left++;
			}else if(!Character.isAlphabetic(charArr[right])) {
				right--;
			}else {
				char tmp=charArr[left];
				charArr[left] = charArr[right];
				charArr[right] = tmp;
				left++;
				right--;
			}
		}

		result= String.valueOf(charArr);
		return result;
	}

	////////////////////////////////////////////////////////////////////


	// 로직설계 및 코딩 약 1시간 소요
	public static void main_pkh_1(String[] args) {
		Scanner in = new Scanner(System.in);

		String input= in.nextLine();
		String output ="";

		char[] beforeArray = input.toCharArray();
		char[] afterArray = new char[100];

		int loop = 0;
		int length = beforeArray.length - 1;
		String specialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

		for(char ch :beforeArray) {

			// 특수문자가 아닌경우
			if(!specialChar.contains(Character.toString(ch))) {
				afterArray[length-loop] = ch;
				// 특수문자인 경우
			}else {
				afterArray[loop] = ch;
			}
			loop++;

		}

		output = new String(afterArray);

		System.out.println(output);

	}


}
