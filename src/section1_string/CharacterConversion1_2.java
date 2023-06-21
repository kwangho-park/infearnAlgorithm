package section1_string;

import java.util.Scanner;
import java.lang.Character;
/**
 * 
 * 문제 출처 : inflearn 자바 알고리즘 문제풀이 입문 
 * 
 * 대소문자 변환 <br> 
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 
 * input : 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.  
 * output : 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다
 * 
 * 예시 : StuDY -> sTUdy
 * 
 * @author kwang
 *
 */
public class CharacterConversion1_2 {

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
	
	// 복습 풀이 (정답) 
	// 2주만에보니까 낯섳다 너 ... 
	public static void main(String args[]) {
		
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
	
	
	
	
	// 오답처리된 이유가 의문임 
//	public static void main(String args[]) {
//		
//		
//		Scanner in = new Scanner(System.in);
//		
//		String inputStr = in.next();
//		
//		char[] input = inputStr.toCharArray();
//		
//		String resultStr = "";
//		char[] resultCh = new char[100];
//		
//		int loop2 = 0;
//		
//		for(int loop=0 ; loop < input.length;  loop ++) {
//			
// 
//			if(Character.isUpperCase(input[loop])) {
//				resultCh[loop2] = Character.toLowerCase(input[loop]);
//				loop2++;
//				
//				
//			}else {
//				resultCh[loop2] = Character.toUpperCase(input[loop]);
//				loop2++;
//			}
//		
//		}
//		
//		resultStr = new String(resultCh);
//		
//		System.out.println(resultStr);
//		
//		return ;
//		
//	}

}
