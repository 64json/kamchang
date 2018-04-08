# Dynamic Programming
#### 민나상 강녕?
## 코인
```java
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = scanner.nextInt();
        }

        for (; ; ) {

            int M = scanner.nextInt();
            int[] count = new int[M + 1];

            count[0] = 0;                      // dynamic 은 항상 초기값이 들어와야함

            for (int i = 1; i <= M; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < N; j++) {
                    int index = i - coin[j];
                    if (index >= 0) {
                        min = Math.min(min, count[i - coin[j]] + 1);
                    }
                }
                count[i] = min;
            }
            System.out.println(count[M]);
        }
    }
}
```
## 합이 최소인 루트 찾기
```java
import java.util.Scanner;

public class Demo {

    Demo() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] hangyul = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                hangyul[i][j] = scanner.nextInt();
            }
        }

        int[][] count = new int[N][M];
        count[0][0] = hangyul[0][0];

        int down = 0;
        int right = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i > 0 && j > 0) {
                    down = count[i][j - 1] + hangyul[i][j];
                    right = count[i - 1][j] + hangyul[i][j];
                    count[i][j] = Math.min(down, right);
                } else if (i == 0 && j > 0) {
                    count[i][j] = count[i][j - 1] + hangyul[i][j];
                } else if (i > 0 && j == 0) {
                    count[i][j] = count[i - 1][j] + hangyul[i][j];
                }
            }
        }
        System.out.println(count[N - 1][M - 1]);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
```
