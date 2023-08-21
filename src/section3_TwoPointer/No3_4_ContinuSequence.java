package section3_TwoPointer;

import java.util.Scanner;

/**
 * 3-4 연속 부분수열
 *
 * N개의 수로 이루어진 수열이 주어집니다.
 * 이 수열에서 연속부분 수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 *
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 * 1 2 1 3 1 1 1 2
 * 합이 6이 되는 연속부분수열은 (2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 *
 *
 * 1. 입력 설명
 * 첫째 줄에 N(1<=N<=100,000), M(1<=M<=100,000,000)이 주어진다.
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 *
 * 2. 출력 설명
 * 첫째 줄에 경우의 수를 출력한다.
 *
 * 입력 예시
 * 8 6
 * 1 2 1 3 1 1 1 2
 *
 * 출력 예시
 * 3
 *
 * [로직]
 * 1.M (합계=6) 값이 나올때까지 요소를 반복하면서 합계를 구함
 * 2.요소의 합계가 6인경우 answer 값을 1증가 시키고 반복문 종료
 * 3.요소의 합계가 6초과 인 경우 별도의 작업없이 반복문 종료
 *
 * [강의로직] = two pointer 알고리즘 활용
 *
 *
 *
 * [배운점]
 * o(n2)을 o(n)으로 해결하는 방법임 (two pointer, siding window 알고리즘 )
 *
 * @author dream
 *
 */
public class No3_4_ContinuSequence {


	// 소요시간 : 30분
	// 틀림!! (시간복잡도가 o(n2) 임으로 해당 풀이는 권고되지않음 , M값이 크게 주어진다면 해당 로직은 부하가 심해짐)
	public int solution_pkh(int n, int m, int[] arr) {
		int answer=0;
		int sum=0;

		for(int loop=0;loop<arr.length;loop++) {
			for(int loop2=loop;loop2<arr.length;loop2++) {
				sum += arr[loop2];
				if(sum==m) {		// 합계가 m인 경우
					answer++;
					sum=0;
					break;
				}else if(sum>m) {	// 합계가 m초과 인경우
					sum=0;
					break;
				}
			}
		}

		return answer;
	}

	// 강의풀이
	///// 강의 로직을보고 다시 풀어봐야함
	public int solution(int n, int m, int[] arr) {
		int answer=0;		// 카운트하는 변수
		int sum=0;
		int lt=0;			// left pointer

		// right pointer 증가
		for(int rt=0;rt<n;rt++) {
			sum+=arr[rt];
			if(sum==m) {
				answer++;
			}

			// left pointer 증가
			while(sum>=m) {		// while문 이유 : lt가 하나만뺐을때 6보다 큰경우가 있음 (ex 1,1,1,1,5)
				sum -=arr[lt++];
				if(sum==m) {
					answer++;
				}
			}
		}
		return answer;
	}



	public static void main(String[] args) {

		No3_4_ContinuSequence ContinuSequence = new No3_4_ContinuSequence();

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int[] arr = new int[n];

		for(int loop=0;loop<arr.length;loop++) {
			arr[loop] = in.nextInt();
		}

		System.out.print(ContinuSequence.solution(n, m, arr));


	}

}
