package section1_string;

import java.util.Scanner;

/**
 * 설명
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * 
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 
 * 
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 * 
 * 예시 입력 1 : KKHSSSSSSSE -> K2HS7E
 * 예시 입력 2 : KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2
 *
 * 로직 
 * 1. 입력받은 문자열을 순서대로 반복 (max 문자열 길이의 -1) 
 * 2. 붙어있는 2개 인덱스의 요소를 String.charAt 로 꺼내어 동일여부를 비교
 * 3. 동일한경우 counter 값을 증가 시키고, 동일하지 않는 경우 결과 문자열에 해당 문자를 추가
 * 
 * @author kwang
 *
 */
public class CompressionString1_11 {

	// 정답, 강의 확인 예정
	// 2시간 소요 (설계/코딩) 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		CompressionString1_11 CompressionString = new CompressionString1_11();
		
		System.out.println(CompressionString.solution(input));
	}

	
	public String solution(String input) {
		
		String result = "";
		char char1 = ' ';
		char char2 = ' ';
		int counter = 1;
		
		String regex = "[0-1]";
		
		for(int loop=0;loop<input.length();loop++) {
			
			char1 = input.charAt(loop);
			
			if(loop+1 == input.length()) {
				result += ""+input.charAt(loop)+counter;
				break;
			}else {
				char2 = input.charAt(loop+1);				
			}
			
			if(char1 == char2) {
				counter++;
			}else {
				result += ""+char1+counter ;
				counter = 1;
			}
			char1 = ' ';
			char2 = ' ';
			
		}
		
		String answer = result.replaceAll(regex, "");
		
		
		return answer;
	}
	
}
