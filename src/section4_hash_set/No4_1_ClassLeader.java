package section4_hash_set;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 4-1 학급회장 (hash)
 *
 * [설명]
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 *
 * [입력]
 * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
 *
 *
 * [출력]
 * 학급 회장으로 선택된 기호를 출력합니다.
 *
 * [예시 입력 1]
 * 15
 * BACBACCACCBDEDE
 *
 *
 * [예시 출력 1]
 * C
 *
 * [로직]
 * 1. 5개의 후보를 변수로 정의 (A,B,C,D,E) , 학급회장 변수 (String leader) 초기화, 선출된 투표 수 변수 (int topCount) 초기화
 * 2. 후보의 기호가 나열된 문자열의 왼쪽부터 오른쪽으로 문자를 탐색 (반복문)
 * 3. 존재하는 경우 문자열에서 해당 문자를 제거 ('') 하고, 투표수 변수(int count) 값을 증가 시킴
 * 4. 반복문이 종료되면 선출된 투표수 변수와 비교하여, 큰 경우 topCount 를 count 값으로 업데이트하고, leader 변수의 값도 해당 후보로 업데이트
 * => 각 후보 별 투표수를 'hash map 의 구조로 생성 및 비교하는것으로 개선해야함'
 *
 * [강의로직]
 *
 *
 * [배운점]
 * - map 자료구조 : key 와 value 로 이루어진 자료구조
 * - hash map 이란 :
 *
 */
public class No4_1_ClassLeader {


    // [강의풀이] 정답
    /// 다시 풀어볼예정
    public char solution(int n , String s){
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);        //  getOrDefault() : map 에서 key가 존재하면 해당 key의 value 반환, 존재하지 않으면 0 반환
        }
        // System.out.println(map.containsKey('A'));               // [참고] A라는 key 가 있는지 확인하는 method (boolean type 반환)
        // System.out.println(map.size());                         // [참고] map 안의 key 의 갯수 반환
        // System.out.println(map.remove('A'));                    // [참고] 특정 key 제거
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            // System.out.println(x + " " +map.get(x));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
    public static void main(String[] args){
        No4_1_ClassLeader classLeader = new No4_1_ClassLeader();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();

        System.out.println(classLeader.solution(n,str));

    }


}
