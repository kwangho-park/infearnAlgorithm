package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * 
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 출력 : N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *  
 * 예시 input 
 * 3
 * good
 * Time
 * Big
 * 
 * 예시 output 
 * doog
 * emiT
 * giB
 * 
 * [중요] 배운점
 * 1. nextInt(), next 는 띄어쓰기와 줄바꿈 기준으로 입력을 구분함
 * = 1시간 소요 (nextInt() 의 사용방법을 정확하게 인지하지못해서 테스트 시간 딜레이가 발생함 )
 * 2. StringBuilder lib존재 및 사용법 확인 
 * 
 * 
 * 
 * 
 * @author kwang
 *
 */
public class ExchangeWord1_4 {

	// 강의 풀이 
	public static void main(String[] args) {
		
		ExchangeWord1_4 ExchangeWord = new ExchangeWord1_4();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String[] inputArr = new String[n];
		
		for(int loop=0;loop<inputArr.length;loop++) {
			inputArr[loop] = in.next();
		}
		
		for(String value:ExchangeWord.solution_2(n, inputArr)) {
			System.out.println(value);
		}
		
	}
	
	// 강의 풀이 1 (StringBuilder lib 활용)
	public ArrayList<String> solution_1(int n, String[] str){
		
		ArrayList<String> resultArr = new ArrayList<String>();
		
		
		for(String value:str) {
			StringBuilder stringBuilder = new StringBuilder(value);
			String tmp = stringBuilder.reverse().toString();
			resultArr.add(tmp);
		}
		
		return resultArr;
	}
	 
	
	
	// 문자 뒤집기 로직이 익숙하지않아서 다시한번 복습 필요할듯함 
	// 강의 풀이 2 (직접 뒤집기) 
	public ArrayList<String> solution_2(int n, String[] str){
		ArrayList<String> resultArr = new ArrayList<String>();
		
		for(String value:str) {
			char[] charArr = value.toCharArray();
			int left = 0;						// left 								
			int right = value.length()-1;		// right

			while(left<right) {
				char tmp = charArr[left];
				charArr[left] = charArr[right];
				charArr[right] = tmp;
				left++;
				right--;
			}
			String tmp=String.valueOf(charArr);
			resultArr.add(tmp);
		}
		
		
		return resultArr;		
	}
	
	
	////////////////////////////////////////////////////////////////////////
	
	// 정답 (직접뒤집기방식) 
	public static void main_pkh(String[] args) {
		
		
		ArrayList<String> inputArr = new ArrayList<String>();
		ArrayList<String> outputArr = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in) ;	
		
		// input data 
		String countStr = in.nextLine();
		int count = Integer.parseInt(countStr);
		
		for(int loop=0; loop<count; loop++) {
			inputArr.add(in.nextLine());
		}
		
		
		// 데이터 가공 
		int dataSize = 0;
		String data = "";
		String afterData = "";
		
		for(int loop=0;  inputArr.size()>loop; loop++) {
			
			data = inputArr.get(loop);
			dataSize = inputArr.get(loop).length();
			
			
			for(int loop2=dataSize-1; 0<=loop2; loop2--) {
				afterData += data.charAt(loop2);
			}
			outputArr.add(afterData);
			
			data ="";
			dataSize=0;
			afterData="";
			

		}

		// 데이터 출력 
		for(String str:outputArr) {
			System.out.println(str);
		}

	}

}
