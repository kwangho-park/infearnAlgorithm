package section3_TwoPointer;

import java.util.Scanner;

/**
* 5. 연속된 자연수의 합
* 설명
* N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
* 만약 N=15이면
* 
* 7+8=15
* 4+5+6=15
* 1+2+3+4+5=15
* 
* 와 같이 총 3가지의 경우가 존재한다.
* 
* 
* 입력
* 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
* 
* 
* 출력
* 첫 줄에 총 경우수를 출력합니다.
* 
* 
* 예시 입력 1 
* 15
* 
* 예시 출력 1
* 3
* 
* [로직] - two pointer 알고리즘 3_4번 응용 문제 
* 1. 정수 n을 입력받음
* 2. lt, rt 초기화 
* 3. rt를 반복문으로 1씩 증가하면서 sum값에 누적
* 4. sum 값이 n과 크거나 같을 때까지 무한루프로 lt값을 sum 값에서 뻴셈연산 
* 5. sum 값이 n과 동일해지는 경우에는 answer 값을 증가시킴      
* 
* 
* [강의 로직]
* 1. 최대 자연수 : (n / 2) + 1 
* 2. 입력받은 n으로 수열을 만듬 
* 3. 나머지는 이전 문제와 동일함 
* 
 * @author kwang
 *
 */
public class ContinueSum3_5 {

	// 소요시간 : 30분 (로직/코딩) 
	// 정답 !
	public int solution_pkh(int n) {
		int answer = 0;
		int sum=0;
		int lt=1;
		
		for(int rt=1;rt<n;rt++) {
			sum+=rt;
			if(sum==n) {
				answer++;
			}
			
			while(sum>=n) {
				sum-=lt;
				lt++;
				if(sum==n ) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		ContinueSum3_5 ContinueSum = new ContinueSum3_5();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		System.out.print(ContinueSum.solution_pkh(n));
		
	}

}
