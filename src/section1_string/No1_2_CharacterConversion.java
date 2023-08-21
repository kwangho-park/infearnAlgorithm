package section1_string;

import java.util.Scanner;
import java.lang.Character;
/**
 *
 * 대소문자 변환 (String)
 *
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
 * 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * input : 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * output : 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다
 *
 * 예시 : StuDY -> sTUdy
 *
 * [로직]
 * 1. 입력받은 문자열(String) 을 char[] structure 로 변경
 * 2. 문자형 데이터를 요소로가진 배열을 반복하면서, 대소문자에 따라서 변환하도록 분기처리
 *
 * @author kwang
 *
 */
public class No1_2_CharacterConversion {

	// 강의 풀이
	public static void main_inflearn(String args[]) {


		Scanner in = new Scanner(System.in);

		String inputStr = in.next();

		char[] input = inputStr.toCharArray();

		String resultStr = "";

		for(int loop=0 ; loop < input.length;  loop ++) {


			if(Character.isUpperCase(input[loop])) {
				resultStr += Character.toLowerCase(input[loop]);

			}else {
				resultStr += Character.toUpperCase(input[loop]);

			}

		}

		System.out.println(resultStr);

		return ;

	}

	// 두번째 풀이 (정답)
	public static void main(String args[]){
		String answer = "";
		Scanner in = new Scanner(System.in);

		char[] inputArr = in.nextLine().toCharArray();

		for(char element:inputArr){
			if(Character.isUpperCase(element)){		// 대문자 분기
				answer += Character.toString(element).toLowerCase();
			}else{
				answer += Character.toString(element).toUpperCase();
			}
		}

		System.out.print(answer);

	}



	// 첫번쨰 풀이 (정답)
	public static void main_first(String args[]) {

		String result = "";

		Scanner in = new Scanner(System.in);

		String input = in.next();


		char[] charArr = input.toCharArray();

		for(int loop=0;loop<charArr.length;loop++) {
			if(Character.isUpperCase(charArr[loop])) {
				result += Character.toString(charArr[loop]).toLowerCase();
			}else {
				result += Character.toString(charArr[loop]).toUpperCase();
			}
		}

		System.out.print(result);


	}

}
