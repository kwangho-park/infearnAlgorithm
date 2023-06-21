package section1_string;

import java.util.Scanner;

/**
 * ����
 * �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
 * 
 * �Է�
 * ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * 
 * ���
 * ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
 * ���� ksekkset -> kset
 * 
 * [�߿�] ������  
 * 1. �˰��� ������ �ͼ����� ���� (10�� ���)
 * 2. JAVA API doc �б����� ���� �н��ʿ�
 * 
 * [�߿�] �����
 * String ��ü�� indexOf() method �� �ش繮�ڰ� ó���߰ߵ� index�� ��ȯ��   
 * 
 * @author kwang
 *
 */
public class RemoveString1_6 {


	public static void main(String[] args) {
		RemoveString1_6 removeStr = new RemoveString1_6();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(removeStr.solution(str));
	}
	
	
	public String solution(String str) {
		String answer="";
		
		for(int loop=0; loop<str.length(); loop++) {
			
//			System.out.println("------------------------------------");
//			System.out.println("���� : " +str.charAt(loop) );
//			System.out.println("index : "+loop);
//			System.out.println("�ش� ���ڰ� ó�� �߰ߵ� index : "+ str.indexOf(str.charAt(loop)));
//			System.out.println("------------------------------------");
			
			if(loop == str.indexOf(str.charAt(loop))) {
				answer += str.charAt(loop);
			}
			
		}
		
		return answer;
	}
	

}
