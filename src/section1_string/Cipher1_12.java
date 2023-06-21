package section1_string;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 
 * ����
 * ������ ���񿡰� ���ĺ� �빮�ڷ� ������ ��������� ���� ��ǻ�͸� �̿��� �����ϴ�.
 * ��������� ������ ���� ���� ����� ��ȣ�� �����Ǿ� �ֽ��ϴ�.
 * ��������� ���ĺ� �� ���ڸ��� # �Ǵ� *�� �ϰ� ���� �����Ǿ� �ֽ��ϴ�.
 * ���� ������ ��#*****#������ ������ ���ڸ� ���´ٸ� ����� ������ ����� ��Ģ��� ������ ���� �ؼ��մϴ�.
 * 
 * 1. ��#*****#���� �ϰ��ڸ��� �������� �ٲߴϴ�. #�� �������� 1��, *�������� 0���� ��ȯ�մϴ�. ����� ��1000001���� ��ȯ�˴ϴ�.
 * 2. �ٲ� 2������ 10����ȭ �մϴ�. ��1000001���� 10����ȭ �ϸ� 65�� �˴ϴ�.
 * 3. �ƽ�Ű ��ȣ�� 65���ڷ� ��ȯ�մϴ�. �� �ƽ�ũ��ȣ 65�� �빮�� 'A'�Դϴ�.
 * 
 * ����� �빮�ڵ��� �ƽ�Ű ��ȣ�� 'A'�� 65��, ��B'�� 66��, ��C'�� 67�� �� ���ʴ�� 1�� �����Ͽ� ��Z'�� 90���Դϴ�.
 * 
 * 
 * �Է�
 * ù �ٿ��� ���� ������ ����(10�� ���� �Ƚ��ϴ�)�� �Էµȴ�. ���� �ٿ��� ������ ������ �ϰ� �� ��ŭ�� #�Ǵ� * ��ȣ�� �Էµ˴ϴ�.
 * ������ �׻� �빮�ڷ� �ؼ��� �� �ִ� ��ȣ�� �����ٰ� �����մϴ�.
 * 
 * ���
 * ���� �ؼ��� ���ڿ��� ����մϴ�.
 * 
 * 
 * ���� �Է�
 * 4
 * #****###**#####**#####**##**
 * 
 * ���� ��� 
 * COOL 
 * 
 * ����  
 * 1. �Է¹��� ���ڿ��� #�� 1�� *�� 0���� ��ȯ (decode?)  
 * 2. �Է¹��� ���ڿ��� 7�ڸ����� ������ arraylist<Integer> �� ����
 * 3. arraylist�� ������ �ƽ�Ű�ڵ�� ��ȯ�Ͽ� ����� ���ڿ��� ���� (ascii : char ch = (char)num ) 
 * 
 * ������
 * bin Ÿ���� �����͸� ���� (ascii code)Ÿ������ ��ȯ�ϴ� ����� �ǹ��� 
 * 
 * @author kwang
 *
 */
public class Cipher1_12 {
	
	// Ʋ�� 
	// 1�ð� �̻� �ҿ� 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input1 = in.nextLine();
		String input2 = in.nextLine();			
		
	
		Cipher1_12 cipher =  new Cipher1_12();
		
		System.out.println(cipher.solution(input1, input2));
	}
	
	
	public String solution(String input1, String input2) {
		String result = "";
		
		ArrayList<Integer> binArr = new ArrayList<Integer>();
		
		String binStr1 = input2.replaceAll("[#]", "1");
		String binStr2 = binStr1.replaceAll("[*]", "0");
		
		int interval = Integer.parseInt(input1) ;
		
		String element = ""; 
		
		// ���ں� bin ����  
		for(int loop=0;loop<binStr2.length();loop++) {
			
			element += (""+binStr2.charAt(loop));
		
			// 0,1,2,3  / 4,5,6,7 / 8,9,10,11 ...  
			if((loop+1)%interval == 0 && loop != 0) {
				binArr.add(Integer.parseInt(element));
				element="";
			}
		}
		
		
		int element2 = 0;
		char char2 = ' ';
		
		// ���ں� ASCII code ��ȯ 
		for(int loop2=0;loop2<binArr.size();loop2++) {
			element2 = binArr.get(loop2);
			char2 = (char)element2;
			result += (char2 +"");
		}
		
		return result;
	}
	
}
