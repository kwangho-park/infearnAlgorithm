package section2_array;

import java.util.Scanner;

/**
 * [���츮 2-10]
 * ����
 * ���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
 * �� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. 
 * ���츮������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���. \
 * 
 * ������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
 * ���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.
 * 
 * �Է�
 * ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
 * �� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� �����ʴ´�.
 * 
 * 
 * ���
 * ���츮�� ������ ����ϼ���.
 * ���� �Է� 1 
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 * 
 * 
 * ���� ��� 1
 * 10
 * 
 * [����]
 * 1. ���ڿ� 2���� �迭�� �Է¹��� 
 * 2. 2���� �迭�� �ݺ�
 * 3. �ݺ��ϸ鼭 ���츮 �ֺ� ���� (the element on top, bottom, left, right) �� ���� (��ġ�� ������������ ��� 0���� ��)  
 * 4. the element value �� �ֺ� element ���� ���Ͽ�, ū��� count �� ����
 * 5. ���� ���츮 �� count �� ���
 * 
 * top : -1 ,0
 * bottom : +1 ,0
 * left : 0, -1
 * right : 0, +1 
 * @author dream
 *
 */
public class No2_10_Mountaintop {

	
	
	public static void main(String[] args) {
		No2_10_Mountaintop T = new No2_10_Mountaintop();
		
		Scanner kb = new Scanner(System.in);
		
		
	}
	
	// Ʋ�� : ���� �ٱ����� ó���ϴ� ������ ������ϰ�, �����¿� ��Ұ����� ���ѻ���  
	public static void main_pkh(String[] args) {
		
		No2_10_Mountaintop Mountaintop = new No2_10_Mountaintop();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr  = new int[n][n];
		
		for(int row=0; row<n; row++) {
			for(int column=0; column<n; column++) {
				arr[row][column] = in.nextInt();
			}	
		}
		
		System.out.print(Mountaintop.solution_pkh(n,arr));
		
		
	}
	
	// Ʋ�� : ���� �ٱ����� ó���ϴ� ������ ������ϰ�, �����¿� ��Ұ����� ���ѻ���  
	public int solution_pkh(int n, int[][] arr) {
		
		int count = 0;
		
		/// ���츮�� ã�� ���� 
		for(int row=0;row<n;row++){
		  for(int column=0;column<n;column++){
		    int top=arr[row-1][column];
		    int bottom=arr[row+1][column];
		    int left=arr[row][column-1];
		    int right=arr[row][column+1];
		    
		    // ����ó�� ���� (ArrayIndexOutOfBoundsException)
		    if(top==-1){top=0;}
		    if(bottom==-1){bottom=0;}
		    if(left==-1){left=0;}
		    if(right==-1){right=0;}
		   
		    int x=arr[row][column];
		    
		    if(x>top && x>bottom && x>left && x>right){
		      count++;
		    }
		   
		  }
		}
		return count;
	}

}
