# Depth-First Search 

#### 저번에 했던 1 grouping 문제 dfs로 풀었ㅇㅇ

```java
import java.util.Scanner;

public class DFS {
    Scanner scanner = new Scanner(System.in);
    int n, m;
    int[][] input;
    boolean[][] check;
    int groups = 0;
    int count;

    DFS() {
        n = scanner.nextInt();
        m = scanner.nextInt();

        input = new int[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] == 1 && !check[i][j]) {
                    dfs(i, j);
                    System.out.println(count);
                    groups++;
                    count = 0;
                }
            }
        }

        System.out.println("groups: "+groups);                   // u don't necessarily need the string part 0.<
    }

    public static void main(String[] args) {
        new DFS();
    }

    void dfs(int x, int y) {

        if (x < 0 || y < 0 || x >= n || y >= m) {
            return;
        }
        if (check[x][y]) {
            return;
        }
        if (input[x][y] == 0) {
            return;
        }

        count++;
        check[x][y] = true;

        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);
    }
}
```
