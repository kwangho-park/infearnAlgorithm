package section3_TwoPointer;

import java.util.Scanner;

/*
 *
 * 3_3. Max sales (sliding window 알고리즘)
 *
 * [설명]
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고
 * '연속된 K일 동안의 최대 매출액' 이 얼마인지 구하라고 했습니다.
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 * 12 15 11 20 25 10 20 19 13 15
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 *
 *
 * [입력]
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다. (=매출기간 N, 최대 매출액 기간 K)
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다. (=매출액 리스트)
 *
 *
 * [출력]
 * 첫 줄에 최대 매출액을 출력합니다.
 *
 * [예시 입력 1]
 * 10 3
 * 12 15 11 20 25 10 20 19 13 15
 *
 * [예시 출력 1]
 * 56
 *
 *
 * [로직]
 * 1. 최대 매출액 기간 K으로 sliding window 의 start pointer(0)와 end pointer(K)를 초기화함
 * 2. 입력받은 int[] 배열에서 (=매출액 리스트) start-and pointer 만큼의 요소를 꺼내어 int answer 변수에 저장함 (=결과값)
 * 3. 위의 내용으로 배열 전체 길이동안 반복함 (최대 매출액 기간 K값이 전체 매출기간 N과 같아질때 까지 반복함)
 * 4. int answer 변수에 데이터를 업데이트하는 경우 기존에 생성되어있는 값과 비교하여 큰 경우에만 업데이트를 진행함
 * 5. 최종 int answer 값을 출력함
 *
 *
 * [배운점]
 * sliding window : two pointer 알고리즘 방식을 활용하며, 배멸내부를 고정 사이즈의 윈도우 (=element 갯수) 가 이동하면서 윈도우내에 있는 데이터를 이용하는 알고리즘
 * 링크 : https://ji-musclecode.tistory.com/37
 *
 *
 * [강의 로직]
 * 1. 초기 최대 매출액을 구함
 * 2. window 왼쪽의 값을 빼고, 오른쪽의 값을 더해서 다음 값을 구함 (=슬라이딩 윈도우)
 * 3. 구해진값으로 기존의 최대 매출액과 비교
 *
 */
public class No3_3_MaxSales {

	// 소요시간 : 20분... 디버깅중
	// 정상값이 출력되지않고있음!
	public int solution_pkh(int n, int k, int[] sales) {
		int answer=0;
		int maxSales=0;
		int startPointer = 0;		// sliding window 의 시작점 초기화
		int endPointer = k;			// sliding window 의 종료점 초기화

		// [의문점] 그냥 이중포문인데?? == sliding window ??
		for(int loop1=0;loop1<sales.length-(k-1);loop1++) {
			for(int loop2=0;loop2<endPointer;loop2++) {		// 최대매출액 기준 기간(k)동안의 Max sales 를 구함

				maxSales += sales[loop1+loop2];
			}

			if(answer<maxSales) {
				answer = maxSales;
			}
			maxSales=0;
		}
		return answer;
	}

	//---------------------------------------------------------------------------

	// 강의 풀이 (정답)
	public int solution_inflearn(int n, int k, int[] arr) {
		int sum=0;
		int answer=0;

		// 기준이되는 첫번째 window 생성
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		answer=sum;

		for(int i=k;i<n;i++) {
			sum+=(arr[i]-arr[i-k]);			// 왼쪽 요소는 뺴고 오른쪽 요소는 추가함
			answer=Math.max(answer, sum);	// answer 과 sum 에서 큰값으로 answer에 저장함
		}

		return answer;
	}

	public static void main_inflearn(String[] args) {

		No3_3_MaxSales maxSales = new No3_3_MaxSales();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		// 전체 매출액 기간
		int k = in.nextInt();		// 최대 매출액 기간

		int[] sales = new int[n];	// 매출기록


		for(int loop=0;loop<n;loop++) {

			sales[loop] = in.nextInt();
		}

		System.out.print(maxSales.solution_inflearn(n, k, sales));


	}

	//---------------------------------------------------------------------------

	public static void main(String[] args){

		No3_3_MaxSales maxSales = new No3_3_MaxSales();

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();	// 전체 매출액 기간
		int k = scanner.nextInt();	// 최대 매출액 기간

		int[] arr = new int[n];

		for(int loop=0;loop<n;loop++){
			arr[loop] = scanner.nextInt();
		}

		System.out.println(maxSales.solution(n,k,arr));

	}

	/**
	 *
	 * @param n	 	전체 매출액 기간
	 * @param k		최대 매출액 기간
	 * @param arr	매출액 리스트
	 */
	public int solution(int n, int k, int[] arr){

		int answer = 0;

		return answer;
	}
}
