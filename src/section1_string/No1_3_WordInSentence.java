package section1_string;

import java.util.Scanner;

/**
 * 문장 속 단어  (String)
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * input :  첫 줄에 길이가 100을 넘지 않는 한개의문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어있습니다.
 * output : 첫줄에 가장 긴단어를 출력한다. 가장 길이가 긴단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
 *
 * 예시 : it is time to study -> study
 *
 * [로직]
 * 1. 문자열을 입력받음
 * 2. 문자열을 String 을 요소로 갖는 배열로 변환
 * 3. String [] 배열의 요소를 하나씩 조회하면서 길이가 가장 긴 요소를 탐색
 *
 * @author kwang
 *
 */
public class No1_3_WordInSentence {


	// 강의 풀이 1
	public static void main_1(String args[]) {

		String answer = "";

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();


		int m = Integer.MIN_VALUE;		// Integer 가 가진 최소값으로 초기화
		String[] s = str.split(" ");

		for(String x : s) {
			int len=x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}

		System.out.print(answer);

	}

	// 정답 : 35분소요 (로직설계,코딩,테스트)
	// 강의 수강 예정
	public static void main_pkh(String args[]) {

		Scanner in = new Scanner(System.in);

		String inputStr = in.nextLine();

		String[] inputArr = inputStr.split(" ");


		String result = inputArr[0];			// 첫번째 대상은 비교군으로 저장함

		for(String str : inputArr) {
			if(result.length() < str.length()) {
				result = str;
			}
		}


		System.out.println(result);

	}


	// [복습] 정답 : 10분소요
	public static void main(String args[]){

		String answer = "";
		int length = 0;

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] inputArr = input.split(" ");

		for(String str:inputArr){
			if(length<str.length()){
				answer = str;
				length = str.length();
			}
		}

		System.out.println(answer);
	}




}
