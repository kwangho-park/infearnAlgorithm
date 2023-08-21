package section2_array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4. 피보나치 수열
 *
 *
 * 설명
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 *
 * 예시 입력
 * 10
 *
 * 예시 출력
 * 1 1 2 3 5 8 13 21 34 55
 *
 * 로직
 * 1. ArrayList를 정의하고 , 0~1번째요소에 1을 저장
 * 2. 입력받은 정수-2만큼 반복문 실행
 * 3. 앞과 뒤를 합한 값을 arrayList 요소에 저장
 * 4. arraylist 에 저장된 요소를 출력
 *
 */
public class No2_4_Fibonacci {


	public int[] solution(int n) {
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2;i<n;i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}

	// 강의 풀이
	public static void main(String[] args) {

		No2_4_Fibonacci Fibonacci = new No2_4_Fibonacci();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x : Fibonacci.solution(n)) System.out.print(x+" ");

	}

	// 정답 (10~20분 소요)
	public static void main_pkh(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(1);


		for(int loop=0;loop<n-2;loop++) {
			int num = arr.get(loop) + arr.get(loop+1);
			arr.add(num);
		}

		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
