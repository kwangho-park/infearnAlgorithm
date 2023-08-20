package section1_string;

import java.util.Scanner;
import java.lang.Character;
/**
 *
 * ��ҹ��� ��ȯ (String)
 *
 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ�
 * �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * input : ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.  
 * output : ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�
 * 
 * ���� : StuDY -> sTUdy
 *
 * [����]
 * 1. �Է¹��� ���ڿ�(String) �� char[] structure �� ����
 * 2. ������ �����͸� ��ҷΰ��� �迭�� �ݺ��ϸ鼭, ��ҹ��ڿ� ���� ��ȯ�ϵ��� �б�ó��
 *
 * @author kwang
 *
 */
public class No1_2_CharacterConversion {

	// ���� Ǯ�� 
	public static void main_inflearn(String args[]) { 
		
		
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.next();
		
		char[] input = inputStr.toCharArray();
		
		String resultStr = "";
		
		for(int loop=0 ; loop < input.length;  loop ++) {
			
 
			if(Character.isUpperCase(input[loop])) {
				resultStr += Character.toLowerCase(input[loop]);
				
			}else {
				resultStr += Character.toUpperCase(input[loop]);

			}
		
		}
		
		System.out.println(resultStr);
		
		return ;
		
	}

	// �ι�° Ǯ�� (����)
	public static void main(String args[]){
		String answer = "";
		Scanner in = new Scanner(System.in);

		char[] inputArr = in.nextLine().toCharArray();

		for(char element:inputArr){
			if(Character.isUpperCase(element)){		// �빮�� �б�
				answer += Character.toString(element).toLowerCase();
			}else{
				answer += Character.toString(element).toUpperCase();
			}
		}

		System.out.print(answer);

	}



	// ù���� Ǯ�� (����)
	public static void main_first(String args[]) {

		String result = "";

		Scanner in = new Scanner(System.in);

		String input = in.next();


		char[] charArr = input.toCharArray();

		for(int loop=0;loop<charArr.length;loop++) {
			if(Character.isUpperCase(charArr[loop])) {
				result += Character.toString(charArr[loop]).toLowerCase();
			}else {
				result += Character.toString(charArr[loop]).toUpperCase();
			}
		}

		System.out.print(result);


	}

}
