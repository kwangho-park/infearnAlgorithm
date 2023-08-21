package section2_array;

import java.util.Scanner;

/*
 * 소수 (에라토스테네스 체 사용) : 1과 자신수 외에는 나눌수 없는 수
 *
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 *
 *
 * 예시 입력 1
 * 20
 *
 * 예시 출력 1
 * 8
 *
 * [포인트]
 * 소수 = N까지의 수를 2~N 수로 나누었을떄 모두 나머지가 존재해야 소수임
 *
 * 로직
 * 1. 숫자 N를 입력받음
 * 2. 2부터 N까지 반복
 * 3. 대상 숫자를 자기 자신숫자까지 나누기를 했을 때 모두 나머지가 존재하는 경우 count 값 증가
 * 4. count 값 출력
 *
 * [보완점]
 * 다시 도전 필요!
 */
public class No2_5_PrimeNumber {

	// 강의 풀이
	public static void main(String[] args) {
		No2_5_PrimeNumber PrimeNumber = new No2_5_PrimeNumber();
		Scanner kb= new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(PrimeNumber.solution(n));
	}

	public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1];

		for(int i=2;i<=n;i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i ; j<=n; j=j+i) {	// i의 배수를 소수가 아닌것으로 체크함 (값 1) => 즉. i를 약수로 가지는 수
					ch[j]=1;
				}
			}
		}

		return answer;

	}



	// 틀림
	// 정답이 아니며 또한 이중 반복문을 사용하는 경우 실행시간 제한 1초안에 동작 하지못함
	public static void main_pkh(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;
		boolean flag = false;

		for(int num=2;num<=n;num++) {

			for(int division=2;division<=num;division++) {

				if(n%num==0) {		// 소수가 아닌경우
					flag=false;
					break;
				}else {					// 소수인 경우
					flag=true;
				}
			}

			if(flag) {
				count +=1;
			}

		}

		System.out.print(count);
	}

}
