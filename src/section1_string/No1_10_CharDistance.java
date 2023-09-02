package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각문자가 문자 t와 떨어진 거리를 순서대로 출력한다
 *
 * 예시
 * teachermode e -> 1 0 1 2 1 0 1 2 2 1 0   (문자 11개)
 *
 * @author kwang
 *
 */
public class No1_10_CharDistance {



	///////////////////////////////////////////////////////


	// 풀지못함
	// 1시간 30분이상 소요
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.next();
		String target = in.next();


		No1_10_CharDistance charDistance = new No1_10_CharDistance();

		System.out.println(charDistance.solution(input, target));
	}

	// 내풀이
	public String solution(String input, String target) {
		String result="";

		ArrayList<Integer> targetIndex = new ArrayList<Integer>();

		// target 문자열 갯수 탐색
		int findIndex = input.indexOf(target);
		targetIndex.add(0,findIndex);

		int loop=1;


		while(findIndex >= -1) {
			findIndex = input.indexOf(target, findIndex+1);
			if(findIndex==-1) break;						// target가 존재하지않으면 반복문 종료

			targetIndex.add(loop, findIndex);
			loop++;

		}

		for(int loop2=0;loop2<input.length();loop2++) {

			for(int loop3=0;loop3<targetIndex.size();loop3++) {
				// ....
			}
		}



		return result;
	}
}
