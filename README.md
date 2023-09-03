# inflearnAlgorithm
인프런 강의 : 자바(Java) 알고리즘 문제풀이 입문 - 김태원 

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
StringBuffer : 스레드에 안전한 프로그램이 필요한 경우거나, thread에 안전한지 알수 없는 경우 사용   
StringBuilder는 스레드에 안전한지 여부가 전혀 관계 없는 경우 사용  

## 1.2 회문 문자열 (Palindrome)   
- 정의 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열   
- 구현방법 : String 객체의 charAt() 함수 또는 StringBuilder 객체의 reverse() 함수 활용  
  <img width="416" alt="회문 문자열" src="https://github.com/kwangho-park/inflearnAlgorithm/assets/44250982/6beb2c08-f62f-411c-9cba-48d5a2d01ee4">    
  - 참고 : 'StringBuilder' 는 문자열을 가변적으로 처리하기위한 클래스이며, 'StringBuffer' 과 다르게 thread-safe 되지않아 단일 thread 환경에서 사용해야함   


# [session 3 : two pointer]     

## 3.1 sliding window   
- 정의 : two pointer 알고리즘 방식을 활용하며, 배멸내부를 고정 사이즈의 윈도우 (=element 갯수) 가 이동하면서 윈도우내에 있는 데이터를 이용하는 알고리즘   
- 구현방법 :   
- 이미지 추가예정    
- 사용예시 : 연속된 N일 동안의 최대 매출액   
