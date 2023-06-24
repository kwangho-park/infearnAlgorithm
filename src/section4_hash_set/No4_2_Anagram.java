package section4_hash_set;


import java.util.HashMap;
import java.util.Scanner;

/**
 * [����]
 * Anagram�̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �մϴ�.
 * ���� ��� AbaAeCe �� baeeACA �� ���ĺ��� ���� ������ �ٸ����� �� ������ ���캸�� A(2), a(1), b(1), C(1), e(2)��
 * ���ĺ��� �� ������ ��� ��ġ�մϴ�. �� ��� �� �ܾ �� �迭�ϸ� ����� �ܾ �� �� �ִ� ���� �Ƴ��׷��̶� �մϴ�.
 * ���̰� ���� �� ���� �ܾ �־����� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���. �Ƴ��׷� �Ǻ��� ��ҹ��ڰ� ���е˴ϴ�.
 *
 *
 * [�Է�]
 * ù �ٿ� ù ��° �ܾ �Էµǰ�, �� ��° �ٿ� �� ��° �ܾ �Էµ˴ϴ�.
 * �ܾ��� ���̴� 100�� ���� �ʽ��ϴ�.
 *
 *
 * [���]
 * �� �ܾ �Ƴ��׷��̸� ��YES"�� ����ϰ�, �ƴϸ� ��NO"�� ����մϴ�.
 *
 *
 * [���� �Է� 1 ]
 * AbaAeCe
 * baeeACA
 *
 * [���� ��� 1]
 * YES
 *
 * [���� �Է� 2 ]
 * abaCC
 * Caaab
 *
 * [���� ��� 2]
 * NO
 *
 * [����]
 * 1. �Էµ� �� ���ڿ��� ��� (����)�� ������ hashMap�� ���� (key : ����, value : ������ ��)
 * 2. �ش� hashMap �� hashMpa �� equals() ����Լ��� ���Ͽ� �����Ѱ�� "YES" ��ȯ�ϸ�, �ƴ� ��� "NO" �� ��ȯ
 *
 * [�����]
 * - lib ��� �� IDEA�� lib�� ���ǵ� '�Լ����� ������ ����' �� ������ �����ϸ�,
 * ���۸� �Ǵ� chartGPT�� ��������ʰ� '����� ������ �����ϰ� ���� �ӵ��� ����' (���� : �������ذ� �ɼ��� ���)
 *  (HashMap class �� �Լ������� ���� equals ����Լ��� ã�� ������ ������ )
 *
 */
public class No4_2_Anagram {

    // [�� Ǯ��] ���� (���� �� �ڵ� �ð� �� 15�� �ҿ�)
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
