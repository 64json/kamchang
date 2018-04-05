# Dynamic Programming (동적 프로그래밍 또는 동적 계획법)
+ [Definition](http://janghw.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Dynamic-Programming-%EB%8F%99%EC%A0%81-%EA%B3%84%ED%9A%8D%EB%B2%95)
+ [백준 예제](https://www.acmicpc.net/blog/view/31)
#### below are Jason's 가르침 for the day
# 옛다_김수진
## 1) Fibonacci Numbers
#### 피보나치 수 구하기 ((피보나치 뭔지 모르면 자살각~~+흠좀무~~
```java
import java.util.scanner;

public class Fibonacci {
    public static void main(Stirng[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();          // n번째 피보나치수를 구하라(는 카라)
        int[] f = new int[n];
        
        f[0] = 1;
        f[1] = 1;
        for(int i = 0; i < n; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        
        System.out.println(f[n - 1]);
    }
}
```     
## Block covering cases (idk what's up with my grammar here)
#### N을 입력하면 N * 2인 블럭을 1 * 2 블럭과 2 * 1 블럭으로 남김없이 채우는 가짓 수 구하기
```java
import java.util.scanner;

public class Blocks {
    public static void main(Stirng[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] n = new int[N + 1];
        
        n[0] = 1;                                   // 노가다 하다보면 피보나치 빼박이라 거의 같음
        n[1] = 1;
        for(int i = 0; i <= n; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        
        System.out.println(f[n]);
    }
}
```
## 보석을 쳐훔처 볼까
#### mass = 14kg 만큼의 보석을 훔치고 싶음. 근데 보석 종류가(예를들어) 4개임--2kg, $40/ 3kg, $50/ 5kg, $110/ 10kg, $200--얘네들을 적절히 나누어 훔쳐 해당 total mass의 최대이익을 구하셈. in this case the maximum profit is $300 
```java
import java.util.Scanner;

public class Hobbits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mass = scanner.nextInt();         // 원하는 total mass of jewels
        int n = scanner.nextInt();            // 보석 종류 meaning the mass and the price 
        
        Jewel[] jewels = new Jewel[n];        // wacky jewel array with their masses and prices
        
        for (int i = 0; i < n; i++) {
            jewels[i] = new Jewel(scanner.nextInt(), scanner.nextInt());
        }

        int[] prices = new int[mass + 1];
        prices[0] = 0;
        for (int i = 1; i <= mass; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                int k = i - jewels[j].mass;   // 제이슨왈 존나 긴데 반복해서 써야하는 변수는 간단하게 
                                              // 변수 만들어서 넣으라고 아니면 개헷갈림
                 if (k >= 0) {
                    max = Math.max(prices[k] + jewels[j].price, max);   // 비교 then 최댓값 골라주는 
                                                                        // 함수써서 max에 더 큰값 넣어줌
                 }
            }
            prices[i] = max;
        }

        System.out.println(prices[mass]);
    }
}

class Jewel{                    //  원래2d array에 넣었는데 제이슨왈 뭔지 헷갈리니까 class로 만들라고
    int mass;
    int price;

    Jewel(int mass, int price){
        this.mass = mass;
        this.price = price;
    }
```
