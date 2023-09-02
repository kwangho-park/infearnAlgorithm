package section2_array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 보이는 학생 (Array)
 *
 * 설명
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
 * (앞에 서 있는 '사람들' 보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 *
 * 입력
 * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 *
 * 출력
 * '선생님이 볼 수 있는 최대 학생수'를 출력한다.
 *
 *
 * 예시 입력 1
 * 8
 * 130 135 148 140 145 150 150 153
 *
 * 예시 출력 1
 * 5
 *
 * 로직
 * 1. 첫번째 줄에 학생 수를 int 형으로 입력받음
 * 2. 두번째 줄에 학생들의 키를 int 배열로 입력받음
 * 3. int 배열을 순차적으로 반복하면서 해당 학생의 키와 가장 키를 비교
 * 4. 학생의 키가 가장 큰키 보다 큰 경우 count 값을 증가 시킴
 * 5. count 값을 출력
 *
 *
 */
public class No2_2_SeeStudent {


	// 정답
	// 강의 풀이도 맥락이 비슷함
	public static void main_pkh(String[] args) {

		No2_2_SeeStudent seeStudent = new No2_2_SeeStudent();

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] arr = new int[n];

		for(int loop=0;loop<n;loop++) {
			arr[loop] = kb.nextInt();
		}

		System.out.print((seeStudent.solution_pkh(n, arr)));

	}

	public int solution_pkh(int n, int[]  arr) {

		int result = 0;
		int top=0;			// 가장 큰 사람

		for(int loop=0;loop<arr.length;loop++) {
			if(arr[loop] > top) {
				top = arr[loop];
				result++;
			}
		}

		return result;
	}

	// -------------------------------------------------------

	// 복습 (정답)
	public static void main(String[] args){

		No2_2_SeeStudent seeStudent = new No2_2_SeeStudent();
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] heightArr = new int[n];

		for(int loop=0;loop<n;loop++){
			heightArr[loop] = scan.nextInt();
		}

		System.out.println(seeStudent.solution(n, heightArr));
	}

	public int solution(int n , int[] heightArr){
		int answer = 0;		// (선생님이 볼 수 있는) 학생의 수
		int topHeight = 0;

		for(int loop=0;loop<heightArr.length;loop++){
			if(heightArr[loop]>topHeight){
				topHeight = heightArr[loop];		// 가장 큰 키 업데이트
				answer += 1;						// 학생의 수 증가
			}
		}

		return answer;
	}


}
