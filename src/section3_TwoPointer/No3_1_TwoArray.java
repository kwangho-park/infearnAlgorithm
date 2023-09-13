package section3_TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 3-1 두 배열 합치기
 * 설명
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 *
 *
 * 예시 입력 1
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 *
 * 예시 출력
 * 1 2 3 3 5 6 7 9
 *
 * [내 로직 : 시간복잡도 높음]
 * 1. 두개의 int 배열을 입력받음
 * 2. 하나의 int 배열로 취합
 * 3. Arrays.sort() 함수로 오름차순 정렬
 *
 * [강의 로직 : 시간복잡도 낮음]
 * 1. 두개의 배열에 각각의 포인터를 생성
 * 2. 각 포인터가 가리키는 배열의 요소값을 비교하여, 작은 값을 결과 값 (answer배열) 에 저장함
 *
 * [배운점]
 * two pointer 알고리즘을 테스트하는 문제임 (시간복잡도를 줄이는 코딩)
 * ==> 정렬 시 o(n log n ) vs  o(n)
 *
 *
 * [기타]
 * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 함수
 * src : 원본 배열
 * srcPos : 원본 배열 포지션
 * dest : 목적지 배열
 * destPos : 목적지 배열 포지션
 * length : 복사할 배열 요소의 수
 *
 *
 *
 * @author pkh
 *
 */
public class No3_1_TwoArray {


	// 소요시간 약 30분
	// [정답] 그러나 문제의도와 차이가 있는 풀이임 ... two pointer
	public int[] solution_pkh(int[] n, int m, int[] twoArr, int twoCnt) {

		int totalCnt = m + twoCnt;

		int[] answer = new int[totalCnt];

		// add array (정상동작 확인) //
		System.arraycopy(n,0, answer, 0, m);
		System.arraycopy(twoArr,0, answer, m, twoCnt);


		// 오름 차순 정렬 //
		Arrays.sort(answer);

		return answer;

	}
	// -----------------------------------------------------
	public static void main_inflearn(String[] args) {

		Scanner kb = new Scanner(System.in);

		No3_1_TwoArray TwoArray = new No3_1_TwoArray();

		// 입력 받음 //
		int n = kb.nextInt();
		int[] a = new int[n];

		for(int loop=0;loop<n;loop++) {
			a[loop] = kb.nextInt();
		}

		int m = kb.nextInt();
		int[] b = new int[m];

		for(int loop2=0;loop2<m;loop2++) {
			b[loop2] = kb.nextInt();
		}

		// 결과 출력
		for(int x:TwoArray.solution_inflearn(n, m, a, b)) System.out.print(x+" ");


	}

	// [정답] 강의 풀이
	public ArrayList<Integer> solution_inflearn(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();

		int p1=0;		// 배열 a의 포인터
		int p2=0;		// 배열 b의 포인터

		while(p1<n && p2<m) {		// 둘 중 하나의 배열이 비교가 끝난경우 반복문을 종료함
			if(a[p1]<b[p2]) {
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}

		// 남은 배열 요소를 결과에 추가
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);


		return answer;
	}

	// ------------------------------------------------------

	// 복습 (정답)
	public static void main(String[] args){

		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		No3_1_TwoArray twoArray = new No3_1_TwoArray();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();					// 첫번째 배열의 크기

		for(int loop=0;loop<n;loop++){
			arr1.add(scan.nextInt());
		}

		int m = scan.nextInt();
		for(int loop=0;loop<m;loop++){
			arr2.add(scan.nextInt());
		}

		result = twoArray.solution(n,m,arr1,arr2);

		for(int p:result){
			System.out.print(p+" ");
		}
	}


	public ArrayList<Integer> solution(int n, int m, ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		ArrayList<Integer> answer = new ArrayList<>();

		int p1 = 0;
		int p2 = 0;

		while(p1<n && p2<m){
			if(arr1.get(p1)>arr2.get(p2)){
				answer.add(arr2.get(p2));
				p2++;
			}else{
				answer.add(arr1.get(p1));
				p1++;
			}
		}

		return answer;
	}

}
