package section2_array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 큰 수 출력하기 (Array)
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력)
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 *
 *
 * 예시 입력 1
 * 6
 * 7 3 9 5 6 12
 *
 * 예시 출력 1
 * 7 9 6 12
 *
 * 예시 입력 2
 * 6
 * 1 3 5 4 6 3
 *
 * 예시 출력 2
 * 1 3 5 6
 *
 * [중요] 배운점
 * 1. 비교해야하는 값이 자연수이기 때문에 int type 으로 입력받으면 이후에 처리하기가 편함 (String type으로 변환하면 비효율적임)
 *
 * [로직]
 * 1. 정수의 갯수를 입력받아 int n 에 저장하고,  N개의 정수를 입력받아 ArrayList<Integer> inputArr 에 저장한다.
 * 2. inputArr 배열을 반복하면서 각요소의 값을 이전요소의 값과 비교하여 작은경우 배열에서 제거 (ArrayList 객체의 remove 함수 )
 *
 */
public class No2_1_PrintBigNum {


	// 강의 풀이
	public static void main_inflearn(String[] args) {

		No2_1_PrintBigNum printBigNum = new No2_1_PrintBigNum();

		Scanner kb = new Scanner(System.in);

		int n =kb.nextInt();		// [참고] 띄어쓰기 또는 줄바꿈 구분으로 정수를 스캔 Scanner 객체 nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}

		// arraylist 를 반복하면서 출력함
		for(int x : printBigNum.solution_inflearn(n, arr)) {
			System.out.print(x+" ");
		}

	}

	// 강의 풀이
	public ArrayList<Integer> solution_inflearn(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<Integer>();

		answer.add(arr[0]);
		for(int loop=1;loop<n;loop++) {
			if(arr[loop] > arr[loop-1]) {
				answer.add(arr[loop]);
			}
		}


		return answer;
	}


	//------------------------------------------------


	// 정답
	// 내 풀이
	public static void main_pkh(String[] args) {

		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();

		No2_1_PrintBigNum printBigNum = new No2_1_PrintBigNum();

		System.out.println(printBigNum.solution_pkh(input1, input2));

	}

	// 내 풀이
	public String solution_pkh(String input1, String input2 ) {
		String result="";
		String[] StringArr = input2.split(" ");

		int num1 = 0;
		int num2 = 0;

		int length = Integer.parseInt(input1);


		for(int loop=0;loop<StringArr.length;loop++) {

			// 첫번째 수 넣기
			if(loop==0) {
				result = StringArr[loop];

			}else {
				num1 = Integer.parseInt(StringArr[loop-1] +"");
				num2 = Integer.parseInt(StringArr[loop] +"");

				if(num1<num2) {
					result += (" "+num2);
				}
			}
		}


		return result;
	}


	// ------------------------------------------------------------------------

	// 복습 (ArrayList 의 remove() 함수를 활용한 응용)
	// 출력값은 정답, 채점 사이트에는 오답
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> inputArr = new ArrayList<Integer>();

		for(int loop=0;loop<n;loop++){
			inputArr.add(scanner.nextInt());
		}

		No2_1_PrintBigNum printBigNum = new No2_1_PrintBigNum();
		printBigNum.solution(n, inputArr);

		for(int value:inputArr){
			System.out.print(value+" ");
		}

	}

	public void solution(int n, ArrayList<Integer> inputArr){

		for(int loop=1;loop<inputArr.size();loop++){
			if(inputArr.get(loop-1) > inputArr.get(loop)) {		// 앞의 요소가 큰경우 제거
				inputArr.remove(loop);
			}
		}
	}


}
