package section5_stack_queue;

import java.util.*;

/**
 * 6. ���� ���ϱ� (queue)
 * ����
 *
 * ���� �ձ��� �̿� ���� �ܵ��� ���ְ� ������ �������� ���������ϴ�.
 * ���� �ձ����� ���ڰ� N���� �ִµ� ���� ���ָ� ���Ϸ� ���ڴٰ� �մϴ�.
 * �����ձ��� ���� ������ ���� ������� ���ָ� ���Ϸ� �� ���ڸ� �����ϱ�� �߽��ϴ�.
 * ���� ���ڵ��� ���� ������ 1������ N������ ���ʷ� ��ȣ�� �ű��.
 * �׸��� 1�� ���ں��� N�� ���ڱ��� ������� �ð� �������� ���ư��� ���׶��� �ɰ� �Ѵ�.
 * �׸��� 1�� ���ں��� �ð�������� ���ư��� 1���� �����Ͽ� ��ȣ�� ��ġ�� �Ѵ�.
 *
 * �� ���ڰ� K(Ư������)�� ��ġ�� �� ���ڴ� ���ָ� ���Ϸ� ���µ��� ���ܵǰ� �� ������ ������ �ȴ�.
 * �׸��� ���� ���ں��� �ٽ� 1���� �����Ͽ� ��ȣ�� ��ģ��.
 * �̷��� �ؼ� ���������� ���� ���ڰ� ���ָ� ���Ϸ� �� �� �ִ�.
 *
 * ([����] '3�� ��ģ ���ڰ� ����' == ���������� Ž���ϸ鼭 3��° ��ȣ�� ����)
 *
 * Image1.jpg
 *
 * ���� ��� �� 8���� ���ڰ� �ְ�, 3�� ��ģ ���ڰ� ���ܵȴٰ� ����. ó������ 3�� ���ڰ� 3�� ���� ���ܵȴ�.
 * �̾� 6, 1, 5, 2, 8, 4�� ���ڰ� ���ʴ�� ���ܵǰ� ���������� ���� �� 7�� ���ڿ��� ���ָ� ���Ϸ����ϴ�.
 * N�� K�� �־��� �� ���ָ� ���Ϸ� �� ������ ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 *
 * �Է�
 * ù �ٿ� �ڿ��� N(5<=N<=1,000)�� K(2<=K<=9)�� �־�����.
 *
 * ���
 * ù �ٿ� ������ ���� ������ ��ȣ�� ����մϴ�.
 *
 *
 * ���� �Է� 1
 * 8 3
 *
 * ���� ��� 1
 * 7
 *
 * [����]
 *
 * [�����]
 * 1. queue �⺻ �н� (add, offer, peek, poll)
 * 2. ������ ��Ȯ�ϰ� �ľ��ϰ� ����/�ڵ�
 * ([����] '3�� ��ģ ���ڰ� ����' == ���������� Ž���ϸ鼭 3��° ��ȣ�� �����ϰ�, ���ܵ� ��ȣ ���ĺ��� �� Ž��)
 *
 */
public class No5_6_SavePrincess {



    // ��Ǯ�� (20��) - ����
    public int solution_pkh(int princeCount,int first){
        int answer = 0;
        int randomNum = first;
        int offerPrince = 0;                // queue ���� ���� ���� ��ȣ

        Queue<Integer> queue = new LinkedList<>();      //

        for(int loop=0;loop<princeCount;loop++){
            queue.offer(loop);
        }

        while(queue.size()==1){
            if(queue.peek()==randomNum){
               queue.poll();                    // queue ���� ���ڹ�ȣ ����
            }else{
               offerPrince = queue.poll();      // queue ���� ���ڹ�ȣ�� ������ �ǵڿ� �߰�
               queue.offer(offerPrince);
            }
            randomNum = generateRandomNumber(queue.size(), queue.poll());
        }
        answer = queue.poll();

        return answer;
    }

    // ����Ǯ�� (����)
    public int solution(int n, int k){
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++) queue.offer(i);

        while (!queue.isEmpty()){
            for(int i=1;i<k;i++){           // k=3
                queue.offer(queue.poll());  // 1,2 �� ������ queue �ڿ� offer (����)
            }
            queue.poll();   // 3��°�� ����

            if(queue.size()==1){
                answer = queue.poll();
            }
        }

        return answer;
    }


    public static void main(String[] args){

        No5_6_SavePrincess savePrincess = new No5_6_SavePrincess();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();                      // ���� ��
        int K = scanner.nextInt();                      // ù��° ���ܴ��

        System.out.println(savePrincess.solution_pkh(N, K));
    }

    // ��Ǯ��
    /**
     *
     * @param maxNum ���� �ִ� ��
     * @param excludeNum ���� ��ȣ
     * @return
     */
    public int generateRandomNumber(int maxNum, int excludeNum){
        int result = 0;
        Random random = new Random();

        do{
            result = random.nextInt(maxNum);
        }while(result == excludeNum);

        return result;
    }
}
