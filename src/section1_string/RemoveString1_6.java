package section1_string;

import java.util.Scanner;

/**
 * 설명
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * 
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * 예시 ksekkset -> kset
 * 
 * [중요] 보완점  
 * 1. 알고리즘 문제에 익숙하지 않음 (10분 고민)
 * 2. JAVA API doc 읽기위한 영어 학습필요
 * 
 * [중요] 배운점
 * String 객체의 indexOf() method 는 해당문자가 처음발견된 index를 반환함   
 * 
 * @author kwang
 *
 */
public class RemoveString1_6 {


	public static void main(String[] args) {
		RemoveString1_6 removeStr = new RemoveString1_6();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(removeStr.solution(str));
	}
	
	
	public String solution(String str) {
		String answer="";
		
		for(int loop=0; loop<str.length(); loop++) {
			
//			System.out.println("------------------------------------");
//			System.out.println("문자 : " +str.charAt(loop) );
//			System.out.println("index : "+loop);
//			System.out.println("해당 문자가 처음 발견된 index : "+ str.indexOf(str.charAt(loop)));
//			System.out.println("------------------------------------");
			
			if(loop == str.indexOf(str.charAt(loop))) {
				answer += str.charAt(loop);
			}
			
		}
		
		return answer;
	}
	

}
