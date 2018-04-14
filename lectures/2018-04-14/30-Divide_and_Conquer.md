# Divide and Conquer
#### @ for문 촤라락 돌리는 노가다 탐색이 아닌 기준점을 중심으로 구간나눠서 if문으로 부분적으로 탐색함
#### @ 모두들 복습자료 늦게올려서 죄송띠ㅜㅜ
```java
import java.util.Scanner;

public class SorryForLateUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();

        int head = 0;
        int tail = N - 1;

        int a;

        do {
            a = (head + tail) / 2;
            if (array[a] > M) {
                tail = a - 1;
            } else if (array[a] < M) {
                head = a + 1;
            } else if (array[a] == M) {
                System.out.println(a);
                return;
            }
        } while (head <= tail);
        System.out.println(-1);
    }
}
```
