package section3_TwoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

/*
 * 3_2 CommonElement (two pointers 알고리즘, 교집합 문제)
 *
 * A, B 두 개의 집합이 주어지면 ‘두 집합의 공통 원소를 추출하여 오름차순’ 으로 출력하는 프로 그램을 작성하세요.
 *
 * [입력설명]
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 *
 * [출력설명]
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 *
 * [예시 입력 1 ]
 * 5
 * 1 3 9 5 2
 * 5
 * 3 2 5 7 8
 *
 * [예시 출력 1]
 * 2 3 5
 *
 * [로직]
 * 1. 2개의 int[] 배열을 입력받음
 * 2. 첫번째 배열을 기준으로, 두번째 배열을 0번 index 부터 max index까지 반복하면서 동일한 element 을 찾음
 * 3. 발견된 element는 int[] answer에 저장함
 * 4. (??) answer 배열은 Arrays.sort() 함수로 오름차순 정렬하고 출력함
 *
 *
 * [배운점]
 * two pointer 알고리즘
 *
 *
 * [강의 로직]
 * 1. 집합 A,B 를 오름차순 정렬
 * 집합 A : 1 2 3 5 9
 * 집합 B : 2 3 5 7 8
 *
 * 2. pointer 1은 집합 A에 첫번쨰 요소를 가리키고, pointer 2는 집합 B에 첫번째 요소를 가리킴
 * 3. pointer 1,2 값을 비교하여 작은 쪽의 pointer 증가시킴
 * 4. pointer 1,2 값을 비교하여 값이 같은 경우 공통원소로 저장함
 *
 */
public class No3_2_CommonElement {

	public static void main_pkh(String[] args) {

		No3_2_CommonElement commonElement = new No3_2_CommonElement();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int [] oneArr = new int[n];

		for(int loop=0;loop<n;loop++) {
			oneArr[loop] = scan.nextInt();
		}

		int m = scan.nextInt();
		int [] twoArr = new int[m];

		for(int loop2=0;loop2<m;loop2++) {
			twoArr[loop2] = scan.nextInt();
		}

		for(int x :commonElement.solution_pkh(n, oneArr, m, twoArr)) {
			System.out.print(x+" ");
		}

	}

	// 20분소요
	// 오답
	public ArrayList<Integer> solution_pkh(int n, int[] oneArr, int m, int[] twoArr ) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		for(int oneElement:oneArr) {
			for(int loop=0; loop<m; loop++) {
				if(oneElement==twoArr[loop]) {
					answer.add(twoArr[loop]);
				}
			}
		}

		Collections.sort(answer);


		return answer;
	}


	//---------------------------------------



	// 강의 풀이 (정답)
	public ArrayList<Integer> solution_inflearn(int n, int[] oneArr, int m, int[] twoArr ) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		Arrays.sort(oneArr);
		Arrays.sort(twoArr);

		int p1=0;
		int p2=0;

		while(p1<n && p2<m) {

			if(oneArr[p1] ==twoArr[p2] ) { // 교집합
				answer.add(oneArr[p1]);
				p1++;
				p2++;
			}else if(oneArr[p1] < twoArr[p2]) {
				p1++;
			}else{
				p2++;
			}
		}

		return answer;
	}

	//---------------------------------------
	// 복습
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		No3_2_CommonElement commonElement = new No3_2_CommonElement();
		ArrayList<Integer> answer = new ArrayList<>();

		int n = scan.nextInt();		// a 배열의 수
		int[] arrA = new int[n];

		for(int loop=0;loop<n;loop++){
			arrA[loop] = scan.nextInt();
		}

		int m = scan.nextInt();		// b 배열의 수
		int[] arrB = new int[m];

		for(int loop=0;loop<m;loop++){
			arrB[loop] = scan.nextInt();
		}

		answer = commonElement.solution(n, arrA, m, arrB);

		for(int a:answer){
			System.out.print(a+" ");
		}


	}

	// 복습
	public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB){

		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0;		// A 배열의 포인터
		int p2=0;		// B 배열의 포인터

		// 공통 요소 탐색 (two pointer)
		for(int loop=0;loop<n;loop++){
			if(arrA[p1] == arrB[p2]){
				answer.add(arrA[p1]);
				p1++;
				p2++;
			}else{
				p2++;
			}
		}

		// anwser 오름차순 정렬
		Collections.sort(answer);


		return answer;
	}


}
