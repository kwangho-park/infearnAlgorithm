package section1_string;

import java.util.Scanner;

/**
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고 (알파벳의 출력 순서가 바뀌어야함 ),
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 
 * 입력 : 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 
 * 출력 : 첫줄에 알파벳만 뒤집힌 문자열을 출력합니다
 * 
 * 예시 입출력 : a#b!GE*T@S -> S#T!EG*b@a
 *  
 * [중요] 보완점 
 * 1. 문제를 대충읽지 말고 정확하게 파악하는 연습을 해야함 (알파벳의 순서가 바뀌어야하는걸 대소문자로 오인했음...) = 즉 너무 조급함
 * 2. 알파벳을 확인하는 character method 가 있으며 이를 활용하면 정규식으로 특수문자를 확인하지않아도됨 
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
	
	
	// 약 1시간 소요
	// 틀림 (핵심을 놓치고있기 떄문에 강의듣고 복습하여 보완이 필요함 ) 
	public static void main_pkh(String[] args) {
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
