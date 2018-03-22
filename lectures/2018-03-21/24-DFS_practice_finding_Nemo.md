# Depth First Search

+ [DFS 탐색 알고리즘](http://ktko.tistory.com/68)

## 적용 예시

### 길찾기 문제(feat. 니모를 찾아서)
```java
import java.util.Scanner;

public class FindingNemo {
    Scanner scanner = new Scanner(System.in);
    int n;
    int m;
    int[][] array;
    boolean[][] returning;
    int count = 0;
    int min = 1000000000;                          //  걍 암거나 졸크 숫자를 넣는다

    FindingNemo() {
        n = scanner.nextInt();
        m = scanner.nextInt();

        array = new int[n][m];
        returning = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
                returning[i][j] = false;
            }
        }

        dfs(0, 0);

        System.out.println(min);
    }

    void dfs(int x, int y) {

        if (x < 0 || y < 0 || x >= n || y >= m) {
            return;                                  // 우왕
        }
        if (returning[x][y]) {
            return;
        }
        if (array[x][y] == 1) {
            return;
        }
        if (x == n - 1 && y == m - 1) {
//            System.out.println(count);          모든 경로수 확인
            if (min > count) {
                min = count;
            }
            return;
        }

        count++;
        returning[x][y] = true;

        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);

        returning[x][y] = false;
        count--;
    }

    public static void main(String[] args) {
        new FindingNemo();
    }
}
```
#### 예제
##### 입력:                 
##### 6                     
##### 5
##### 0 1 0 0 0
##### 0 0 0 1 0
##### 1 0 1 1 0
##### 1 0 0 1 0
##### 1 0 1 1 0
##### 1 0 0 0 0
#####
##### 출력:
##### 9
