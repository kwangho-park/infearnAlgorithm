package section1_string;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 * 설명
 * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
 * 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
 * 
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 * 
 * 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
 * 
 * 
 * 입력
 * 첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
 * 현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.
 * 
 * 출력
 * 영희가 해석한 문자열을 출력합니다.
 * 
 * 
 * 예시 입력
 * 4
 * #****###**#####**#####**##**
 * 
 * 예시 출력 
 * COOL 
 * 
 * 로직  
 * 1. 입력받은 문자열을 #은 1로 *은 0으로 변환 (decode?)  
 * 2. 입력받은 문자열을 7자리수로 나누어 arraylist<Integer> 에 저장
 * 3. arraylist를 꺼내어 아스키코드로 변환하여 결과값 문자열에 저장 (ascii : char ch = (char)num ) 
 * 
 * 보완점
 * bin 타입의 데이터를 문자 (ascii code)타입으로 변환하는 방법이 의문임 
 * 
 * @author kwang
 *
 */
public class Cipher1_12 {
	
	// 틀림 
	// 1시간 이상 소요 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();			
		
	
		Cipher1_12 cipher =  new Cipher1_12();
		
		System.out.println(cipher.solution(input1, input2));
	}
	
	
	public String solution(String input1, String input2) {
		String result = "";
		
		ArrayList<Integer> binArr = new ArrayList<Integer>();
		
		String binStr1 = input2.replaceAll("[#]", "1");
		String binStr2 = binStr1.replaceAll("[*]", "0");
		
		int interval = Integer.parseInt(input1) ;
		
		String element = ""; 
		
		// 글자별 bin 조립  
		for(int loop=0;loop<binStr2.length();loop++) {
			
			element += (""+binStr2.charAt(loop));
		
			// 0,1,2,3  / 4,5,6,7 / 8,9,10,11 ...  
			if((loop+1)%interval == 0 && loop != 0) {
				binArr.add(Integer.parseInt(element));
				element="";
			}
		}
		
		
		int element2 = 0;
		char char2 = ' ';
		
		// 글자별 ASCII code 변환 
		for(int loop2=0;loop2<binArr.size();loop2++) {
			element2 = binArr.get(loop2);
			char2 = (char)element2;
			result += (char2 +"");
		}
		
		return result;
	}
	
}
