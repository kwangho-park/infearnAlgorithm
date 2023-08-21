package section2_array;

import java.util.Scanner;

/*
 * 설명
 * A, B 두 사람이 가위바위보 게임을 합니다.
 * 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 *
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 *
 *
 * 예시 출력 1
 * A
 * B
 * A
 * B
 * D
 *
 * 내 로직
 * 요약 : 가위바위보를 정수에 대응시켜서 비교하고, 예외에 해당하는 부분은 조건문으로 처리함 (1,3)
 *
 * 1. 3가지의 값을 입력받음 (n)은 int type, A 와 B의 정보는 int[] 로 저장함
 * 2. 경기횟수(n)만큼 a와 b의 정보를 반복하면서 A와 B의 값을 비교
 * 3. A와 B의 값을 비교하는 건 별도의 함수로 구현 (승패 종류 : 1<2, 1>3, 2<3, 비김)
 *
 * 강의 로직
 * 요약 : A를 기준으로 이기는조건을 결정함
 *
 * 1. A와 B가 값이 같은 경우 비김
 * 2. A가 이기는 경우 조건으로 분기
 * 3. 그 이외의 경우는 B가 이기는경우임
 *
 * [중요] 배운점
 * - Scanner.nextInt() 함수는 띄어쓰기 또는 줄바꿈 기준으로 int type의 숫자를 입력받음
 * - 예외조건없는게 로직을 이해하기에 수훨함 (=직관적임)
 *
 */
public class No2_3_RockPaperScissors {

	// 강의 풀이 
	public static void main(String[] args) {

		No2_3_RockPaperScissors RockPaperScissors = new No2_3_RockPaperScissors();

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];

		for(int loop=0;loop<n;loop++) {
			A[loop] = kb.nextInt();
		}
		for(int loop=0;loop<n;loop++) {
			B[loop] = kb.nextInt();
		}

		for(char x : RockPaperScissors.solution(n, A, B).toCharArray()) {
			System.out.println(x);
		}


	}

	// 강의 풀이 
	public String solution(int n, int[] a, int[] b) {
		String answer="";

		for(int loop=0;loop<n;loop++) {
			if(a[loop]==b[loop]) {
				answer+="D";
			}else if(a[loop]==1 && b[loop]==3) {
				answer+="A";
			}else if(a[loop]==2 && b[loop]==1) {
				answer+="A";
			}else if(a[loop]==3 && b[loop]==2) {
				answer+="A";
			}else {
				answer+="B";
			}
		}

		return answer;
	}

	// 정답
	// 의외로 금방끝났지만 강의로직보다 복잡합  (로직설계 및 코딩 1시간 소요)
	public static void main_pkh(String[] args) {
		No2_3_RockPaperScissors RockPaperScissors = new No2_3_RockPaperScissors();

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];

		for(int loop=0;loop<n;loop++) {
			A[loop] = kb.nextInt();
		}
		for(int loop=0;loop<n;loop++) {
			B[loop] = kb.nextInt();
		}

		for(int loop=0;loop<n;loop++) {
			System.out.println(RockPaperScissors.solution_pkh(A[loop], B[loop]));
		}

	}


	/**
	 *
	 * @param A : a의 가위바위보 정보 (1,2,3)
	 * @param B : b의 가위바위보 정보 (1,2,3)
	 * @return
	 */
	public String solution_pkh(int A, int B) {
		String result = ""; 		// game 결과 (A : a가 이김, B : b 가 이김, D: 비김 ) 


		// A,B의 값이 1(가위) 또는 3(바위)인 경우 정수크기비교와 반대로 출력됨  
		if((A==1&&B==3) || (A==3&&B==1)) {
			if(A>B ) {
				result = "B";
			}else if(A<B) {
				result = "A";
			}else {
				result = "D";
			}
		}else {
			if(A>B ) {
				result = "A";
			}else if(A<B) {
				result = "B";
			}else {
				result = "D";
			}
		}

		return result;

	}// game END 


}
