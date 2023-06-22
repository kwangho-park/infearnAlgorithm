package section1_string;

import java.util.Scanner;

/**
 * ����
 * ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������ (���ĺ��� ��� ������ �ٲ����� ),
 * Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է� : ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
 * 
 * ��� : ù�ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�
 * 
 * ���� ����� : a#b!GE*T@S -> S#T!EG*b@a
 *  
 * [�߿�] ������ 
 * 1. ������ �������� ���� ��Ȯ�ϰ� �ľ��ϴ� ������ �ؾ��� (���ĺ��� ������ �ٲ����ϴ°� ��ҹ��ڷ� ��������...) = �� �ʹ� ������
 * 2. ���ĺ��� Ȯ���ϴ� character method �� ������ �̸� Ȱ���ϸ� ���Խ����� Ư�����ڸ� Ȯ�������ʾƵ��� 
 *  
 * @author kwang
 *
 */
public class No1_5_ExchangeWord {

	// ���� Ǯ�� 
	public static void main(String[] args) {
		
		No1_5_ExchangeWord ExchangeWord = new No1_5_ExchangeWord();
		
		Scanner in = new Scanner(System.in);
		
		String input=in.next();
		
		System.out.println(ExchangeWord.solution(input));
		
	}
	
	// ���� Ǯ�� 
	public String solution(String input) {
		String result = "";
		
		char[] charArr = input.toCharArray();
		int left=0;
		int right=charArr.length-1;
		
		while(left<right) {
			if(!Character.isAlphabetic(charArr[left])) {
				left++;
			}else if(!Character.isAlphabetic(charArr[right])) {
				right--;
			}else {
				char tmp=charArr[left];
				charArr[left] = charArr[right];
				charArr[right] = tmp;
				left++;
				right--;
			}		
		}
		
		result= String.valueOf(charArr);
		return result;
	}
	
	////////////////////////////////////////////////////////////////////
	
	
	// �� 1�ð� �ҿ�
	// Ʋ�� (�ٽ��� ��ġ���ֱ� ������ ���ǵ�� �����Ͽ� ������ �ʿ��� ) 
	public static void main_pkh(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input= in.nextLine();
		String output ="";
		
		char[] beforeArray = input.toCharArray();
		char[] afterArray = new char[100];
	
		int loop = 0;
		int length = beforeArray.length - 1;
		String specialChar = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		
		for(char ch :beforeArray) {	
			
			// Ư�����ڰ� �ƴѰ��  
			if(!specialChar.contains(Character.toString(ch))) {
				afterArray[length-loop] = ch;
			// Ư�������� ��� 
			}else {
				afterArray[loop] = ch;
			}
			loop++;
			
		}
		
		output = new String(afterArray);
		
		System.out.println(output);
			
	}

}
