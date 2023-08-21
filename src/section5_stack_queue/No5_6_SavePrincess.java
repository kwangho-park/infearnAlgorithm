package section5_stack_queue;

import java.util.*;

/**
 * 6. 공주 구하기 (queue)
 * 설명
 *
 * 정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.
 * 정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.
 * 정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.
 * 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
 * 그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
 * 그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.
 *
 * 한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
 * 그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.
 * 이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.
 *
 * ([주의] '3을 외친 왕자가 제외' == 순차적으로 탐색하면서 3번째 번호를 제외)
 *
 * Image1.jpg
 *
 * 예를 들어 총 8명의 왕자가 있고, 3을 외친 왕자가 제외된다고 하자. 처음에는 3번 왕자가 3을 외쳐 제외된다.
 * 이어 6, 1, 5, 2, 8, 4번 왕자가 차례대로 제외되고 마지막까지 남게 된 7번 왕자에게 공주를 구하러갑니다.
 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성하시오.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(5<=N<=1,000)과 K(2<=K<=9)가 주어진다.
 *
 * 출력
 * 첫 줄에 마지막 남은 왕자의 번호를 출력합니다.
 *
 *
 * 예시 입력 1
 * 8 3
 *
 * 예시 출력 1
 * 7
 *
 * [로직]
 *
 * [배운점]
 * 1. queue 기본 학습 (add, offer, peek, poll)
 * 2. 문제를 정확하게 파악하고 설계/코딩
 * ([주의] '3을 외친 왕자가 제외' == 순차적으로 탐색하면서 3번째 번호를 제외하고, 제외된 번호 이후부터 재 탐색)
 *
 */
public class No5_6_SavePrincess {



    // 내풀이 (20분) - 오답
    public int solution_pkh(int princeCount,int first){
        int answer = 0;
        int randomNum = first;
        int offerPrince = 0;                // queue 에서 꺼낸 왕자 번호

        Queue<Integer> queue = new LinkedList<>();      //

        for(int loop=0;loop<princeCount;loop++){
            queue.offer(loop);
        }

        while(queue.size()==1){
            if(queue.peek()==randomNum){
                queue.poll();                    // queue 에서 왕자번호 제거
            }else{
                offerPrince = queue.poll();      // queue 에서 왕자번호를 꺼내어 맨뒤에 추가
                queue.offer(offerPrince);
            }
            randomNum = generateRandomNumber(queue.size(), queue.poll());
        }
        answer = queue.poll();

        return answer;
    }

    // 강의풀이 (정답)
    public int solution(int n, int k){
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++) queue.offer(i);

        while (!queue.isEmpty()){
            for(int i=1;i<k;i++){           // k=3
                queue.offer(queue.poll());  // 1,2 를 꺼내어 queue 뒤에 offer (넣음)
            }
            queue.poll();   // 3번째를 꺼냄

            if(queue.size()==1){
                answer = queue.poll();
            }
        }

        return answer;
    }


    public static void main(String[] args){

        No5_6_SavePrincess savePrincess = new No5_6_SavePrincess();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();                      // 왕자 수
        int K = scanner.nextInt();                      // 첫번째 제외대상

        System.out.println(savePrincess.solution_pkh(N, K));
    }

    // 내풀이
    /**
     *
     * @param maxNum 랜덤 최대 수
     * @param excludeNum 제외 번호
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
