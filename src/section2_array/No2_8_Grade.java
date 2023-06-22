package section2_array;

import java.util.Scanner;

/**
 * 등수구하기
 * 
 * 설명
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * 
 * 
 * 입력
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * 
 * 
 * 출력
 * 입력된 순서대로 등수를 출력한다.
 * 
 * 
 * 예시 입력 1 
 * 5
 * 87 89 92 100 76
 * 
 * 예시 출력 1
 * 4 3 2 1 5
 * 
 * [배운점]
 * -머리로 고민 할 때 원활하게 풀리지않을때는 그림을 그리면 실마리가 보임 
 * -이중for문으로 요소를 하나씩 비교하여 등수를 부여하는것은 설계하였으나, 
 * 같은 등수가 나올때에 대한 처리가 해결이 안됬었음 
 * 
 * @author kwang
 *
 */
public class No2_8_Grade {
	
	// 로직이 감이 안잡힌 문제 (10분고민)  
	// 강의 풀이 
	// 재도전 예정
	public static void main(String[] args) {

		No2_8_Grade Grade = new No2_8_Grade();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int loop=0;loop<n;loop++) {
			arr[loop] = scan.nextInt();
		}
		
		for(int x:Grade.solution(n, arr)) {
			System.out.print(x+" ");
		}
		

	}
	
	
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i=0;i<n;i++) {
			int cnt=1;				// 등수 초기화 
			
			for(int j=0;j<n;j++) {	// 모든요소값을 비교 
				if(arr[j]>arr[i]) cnt++;		// 등수증가
			}
			answer[i] = cnt;
		}
		return answer;
	}

}
