# inflearnAlgorithm
인프런 강의 : 자바(Java) 알고리즘 문제풀이 입문 

# [개요]  
- 학습한 알고리즘을 요약하기위한 문서    
- 정확한 문제파악 방안 : 문제에 대한 설명이 부족한 경우가 종종있기 때문에, 제공된 '예시 입출력을 참고' 하여 문제와 비교해보거나 '강의소스를 참고'하여 다양한 입력으로 정확한 문제를 파악해야 시간을 효율적으로 활용 할 수 있음


# [session 1 : String ]      
## 1.1 문자열 클래스   
1.1.1 비교표  
(공통점 : 문자열을 처리하기위한 클래스) 
|클래스명|메모리 할당|연산 성능|muti-thread|
|------|---|---|---|
|String|정적|느림|가능|
|StringBuffer|동적|중간|가능|
|StringBuiler|동적|빠름|불가능|

* StringBuiler java doc : https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html   

1.1.2 사용   
String : 짧은 문자열인 경우 사용     
StringBuffer : thread-safe 가 보장되기 때문에 멀티 스레드 환경에서 사용     
StringBuilder : thread-safe 가 보장되지않기 때문에 단일 스레드 환경에서 빠른 연산이 필요한 경우에 사용   

* thread-safe : 동시접근 시 정합성 보장되는 상태   

## 1.2 회문 문자열 (Palindrome)   
- 정의 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열   
- 구현방법 : String 객체의 charAt() 함수 또는 StringBuilder 객체의 reverse() 함수 활용  
  <img width="416" alt="회문 문자열" src="https://github.com/kwangho-park/inflearnAlgorithm/assets/44250982/6beb2c08-f62f-411c-9cba-48d5a2d01ee4"> 

# [session 3 : two pointer]     
## 3.1 two pointer   
- 정의 : 배열에서 서로다른 원소를 가리키는 포인터(start, end) 를 조작하여 값을 얻는 알고리즘     
- 구현방법 : 구간의 넓이가 유동적임  
- [도식화]
<img width="266" alt="투포인터" src="https://github.com/kwangho-park/inflearnAlgorithm/assets/44250982/6b055b1c-f511-4690-9013-b93c6cd9ea0d">   

## 3.2 sliding window   
- 정의 : two pointer 알고리즘 방식을 활용하며, 배멸내부를 고정 사이즈의 윈도우 (=element 갯수) 가 이동하면서 윈도우내에 있는 데이터를 이용하는 알고리즘   
- 구현방법 : 교집합의 정보를 공유하고, 차이가 나는 양쪽 끝의 원소만 갱신하는 방법  (구간의 넓이가 고정되어있음)     
- 사용: 배열,리스트의 일정범위의 값을 비교하는 경우 사용  
- 사용예시 : 연속된 N일 동안의 최대 매출액
- [도식화]
<img width="276" alt="슬라이딩 윈도우" src="https://github.com/kwangho-park/inflearnAlgorithm/assets/44250982/c5ae8aad-ebd4-4e68-a2c8-c5f7ec33a3e4">    


