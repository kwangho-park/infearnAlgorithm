package section4_hash_set;


import java.util.HashMap;
import java.util.Scanner;

/**
 * [설명]
 * Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
 *
 *
 * [입력]
 * 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
 * 단어의 길이는 100을 넘지 않습니다.
 *
 *
 * [출력]
 * 두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
 *
 *
 * [예시 입력 1 ]
 * AbaAeCe
 * baeeACA
 *
 * [예시 출력 1]
 * YES
 *
 * [예시 입력 2 ]
 * abaCC
 * Caaab
 *
 * [예시 출력 2]
 * NO
 *
 * [로직]
 * 1. 입력된 각 문자열의 요소 (문자)와 갯수를 hashMap에 저장 (key : 문자, value : 문자의 수)
 * 2. 해당 hashMap 을 hashMpa 의 equals() 멤버함수로 비교하여 동일한경우 "YES" 반환하며, 아닌 경우 "NO" 를 반환
 *
 * [배운점]
 * - lib 사용 시 IDEA로 lib에 정의된 '함수들의 설명을 참고' 및 동작을 검증하면,
 * 구글링 또는 chartGPT를 사용하지않고도 '충분히 개발이 가능하고 구현 속도가 빠름' (조건 : 영문독해가 능숙한 경우)
 *  (HashMap class 의 함수설명을 보고 equals 멤버함수를 찾고 동작을 검증함 )
 *
 */
public class No4_2_Anagram {

    // [내 풀이] 정답 (로직 및 코딩 시간 약 15분 소요)
    public String solution(String str1, String str2){

        String answer = "TRUE";

        HashMap<Character, Integer> str1Map = new HashMap<>();
        HashMap<Character, Integer> str2Map = new HashMap<>();

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        for(char ch : str1Arr){
            str1Map.put(ch, str1Map.getOrDefault(ch,0)+1 );
        }
        for(char ch: str2Arr){
            str2Map.put(ch, str2Map.getOrDefault(ch,0)+1);
        }

        boolean bool = str1Map.equals(str2Map);
        if(bool){
            answer = "YES";
        }else{
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args){

        No4_2_Anagram anagram = new No4_2_Anagram();

        Scanner kb = new Scanner(System.in);
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();

        System.out.println(anagram.solution(str1,str2) );

    }
}
