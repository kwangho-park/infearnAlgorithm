package section2_array;

import java.util.Scanner;

/**
 * [봉우리 2-10]
 * 설명
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 
 * 봉우리지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요. \
 * 
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 * 
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지않는다.
 * 
 * 
 * 출력
 * 봉우리의 개수를 출력하세요.
 * 예시 입력 1 
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 * 
 * 
 * 예시 출력 1
 * 10
 * 
 * [로직]
 * 1. 숫자와 2차원 배열을 입력받음 
 * 2. 2차원 배열을 반복
 * 3. 반복하면서 봉우리 주변 값들 (the element on top, bottom, left, right) 을 구함 (위치가 음수가나오는 경우 0으로 함)  
 * 4. the element value 와 주변 element 값을 비교하여, 큰경우 count 값 증가
 * 5. 최종 봉우리 수 count 를 출력
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
	
	// 틀림 : 가장 바깥쪽을 처리하는 로직을 설계못하고, 상하좌우 요소값만을 구한상태  
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
	
	// 틀림 : 가장 바깥쪽을 처리하는 로직을 설계못하고, 상하좌우 요소값만을 구한상태  
	public int solution_pkh(int n, int[][] arr) {
		
		int count = 0;
		
		/// 봉우리를 찾는 로직 
		for(int row=0;row<n;row++){
		  for(int column=0;column<n;column++){
		    int top=arr[row-1][column];
		    int bottom=arr[row+1][column];
		    int left=arr[row][column-1];
		    int right=arr[row][column+1];
		    
		    // 예외처리 오류 (ArrayIndexOutOfBoundsException)
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
