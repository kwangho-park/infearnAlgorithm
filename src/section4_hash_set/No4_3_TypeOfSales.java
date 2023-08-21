package section4_hash_set;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 3. 매출액의 종류 (hash, sliding window)
 * 설명
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 * 각 구간별로 구하라고 했습니다.
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 * 20 12 20 10 23 17 10
 *
 * 매출종류 : 연속된 K일 동안의 매출종류 (즉, 중복제거)
 *
 * 각 연속 4일간의 구간의 매출종류는
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 *
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 일자 구간 N(5<=N<=100,000)과 매출액 산정 기간 K(2<=K<=N)가 주어집니다.
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 *
 * 출력
 * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
 *
 *
 * 예시 입력 1
 * 7 4
 * 20 12 20 10 23 17 10
 *
 * 예시 출력 1
 * 3 4 4 3
 *
 * [로직]
 *
 */
public class No4_3_TypeOfSales {

    // 복습예정
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        // K일 동안의 매출액 초기값 설정
        // ex 7일간 매출기록(arr)에서 1~4일까지의 매출액 종류를 HashMap (HM)에 셋팅함
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;       // left pointer (two pointer algorithm)

        // sliding window
        for(int rt=k-1; rt<n; rt++){            // rt 증가 (right pointer)

            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1); // 매출액 종류를 카운팅하여 HM에 저장)
            answer.add(HM.size());              // 매출액 종류 저장

            HM.put(arr[lt], HM.get(arr[lt])-1);

            if(HM.get(arr[lt])==0) {            // 연속된 K일 동안 매출액(key)이 없는 경우(value = 0인) hashMap 에서 제거
                HM.remove(arr[lt]);
            }
            lt++;       // left pointer 증가
        }
        return answer;
    }

    public static void main(String[] args){
        No4_3_TypeOfSales T = new No4_3_TypeOfSales();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
    }

}
