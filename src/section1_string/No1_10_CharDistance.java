package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * ����
 * �� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է�
 * ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
 * ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * 
 * ���
 * ù ��° �ٿ� �� ���ڿ� s�� �����ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ� 
 * 
 * ���� 
 * teachermode e -> 1 0 1 2 1 0 1 2 2 1 0   (���� 11��)
 * 
 * @author kwang
 *
 */
public class No1_10_CharDistance {

	
	
	///////////////////////////////////////////////////////
	
	
	// Ǯ������
	// 1�ð� 30���̻� �ҿ�
	// ���Ǹ� ������� �� �õ� �غ���...
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.next();
		String target = in.next();
		
		
		No1_10_CharDistance charDistance = new No1_10_CharDistance();
		
		System.out.println(charDistance.solution(input, target));
	}
	
	// ��Ǯ�� 
	public String solution(String input, String target) {
		String result="";
 
		ArrayList<Integer> targetIndex = new ArrayList<Integer>();
		
		// target ���ڿ� ���� Ž�� 
		int findIndex = input.indexOf(target);
		targetIndex.add(0,findIndex);
		
		int loop=1;

		
		while(findIndex >= -1) {
			findIndex = input.indexOf(target, findIndex+1);
			if(findIndex==-1) break;						// target�� �������������� �ݺ��� ���� 
			
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
