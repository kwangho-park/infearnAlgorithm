package section4_hash_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 4. 모든 아나그램 찾기  (hash, sliding window)
 * 설명
 *
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 *
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 *
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 *
 *
 * 예시 입력 1
 * bacaAacba
 * abc
 *
 * 예시 출력 1
 * 3
 *
 * [로직]
 * 1. 문자열 S를  String type 으로 입력받고, 문자열을 요소로가지는 배열(String[]) 로 변환
 * 2. 문자열 T는 HashMap 에 단어별로 키로 저장
 * 3. 문자열 배열을 반복하면서 sliging window 구간안에서 hashMap 에 단어와 비교
 * 4. hashMap에 모든 문자가 존재하는 경우 answer 변수 증가
 *
 */
public class No4_4_TotalAnagram {

    public int solution(String s, String t){
        int answer = 0;
        HashMap<Character,Integer> HM = new HashMap<>();

        char[] sArr = s.toCharArray();


        // HM 초기값 생성
        for(int loop1=0 ; loop1<t.length() ; loop1++){

        }

        // T와 HM 에 단어를 비교함
        for(int loop2=0; loop2 <sArr.length; loop2++){

        }


        return answer;
    }
    public static void main(String[] args){
        No4_4_TotalAnagram T = new No4_4_TotalAnagram();
        Scanner kb = new Scanner(System.in);

        String s = kb.nextLine();
        String t = kb.nextLine();

        System.out.print(T.solution(s,t));
    }
}
