package section2_array;

import java.util.Scanner;

/*
* �Ҽ� (�����佺�׳׽� ü ���) : 1�� �ڽż� �ܿ��� ������ ���� �� 
* 
* ����
* �ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
* ���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
* 
* 
* �Է�
* ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.
* 
* ���
* ù �ٿ� �Ҽ��� ������ ����մϴ�.
* 
* 
* ���� �Է� 1 
* 20
* 
* ���� ��� 1
* 8
* 
* [����Ʈ]
* �Ҽ� = N������ ���� 2~N ���� ���������� ��� �������� �����ؾ� �Ҽ���
* 
* ���� 
* 1. ���� N�� �Է¹��� 
* 2. 2���� N���� �ݺ�
* 3. ��� ���ڸ� �ڱ� �ڽż��ڱ��� �����⸦ ���� �� ��� �������� �����ϴ� ��� count �� ���� 
* 4. count �� ��� 
* 
* [������]
* �ٽ� ���� �ʿ�!
*/
public class No2_5_PrimeNumber {

	// ���� Ǯ�� 
	public static void main(String[] args) {
		No2_5_PrimeNumber PrimeNumber = new No2_5_PrimeNumber();
		Scanner kb= new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(PrimeNumber.solution(n));
	}
	
	public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1];
		
		for(int i=2;i<=n;i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i ; j<=n; j=j+i) {	// i�� ����� �Ҽ��� �ƴѰ����� üũ�� (�� 1) => ��. i�� ����� ������ ��  
					ch[j]=1;
				}
			}
		}
		
		return answer;
			
	}
	
	
	
	// Ʋ��
	// ������ �ƴϸ� ���� ���� �ݺ����� ����ϴ� ��� ����ð� ���� 1�ʾȿ� ���� ��������  
	public static void main_pkh(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =0;
		boolean flag = false;
		
		for(int num=2;num<=n;num++) {
			
			for(int division=2;division<=num;division++) {
				
				if(n%num==0) {		// �Ҽ��� �ƴѰ��  
					flag=false;
					break;
				}else {					// �Ҽ��� ��� 
					flag=true;
				}
			}
			
			if(flag) {
				count +=1;
			}
			
		}
		
		System.out.print(count);
	}

}
