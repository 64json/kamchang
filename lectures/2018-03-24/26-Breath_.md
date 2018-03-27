# Breath-First Search (너비 우선 탐색)

+ [Definition 0.<](https://en.wikipedia.org/wiki/Breadth-first_search)
+ [예제1: Order of BFS](#예제-1)
+ [예제2: 길찾기_FindingDori](#예제-2)
##
###### 안녕 친구들? 토욜엔 BFS 배웠단다
## 
## 예제 1
```java
import java.util.Scanner;

public class Breath {

    Breath() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] que = new int[n + 1];
        Relation[] relations = new Relation[n];

        for (int i = 0; i < n; i++) {
            relations[i] = new Relation(scanner.nextInt(), scanner.nextInt());
        }

        int tail = 0;
        int head = 0;

        que[tail++] = 1;

        do {
            for (int i = 0; i < n; i++) {
                if (que[head] == relations[i].s) {
                    que[tail++] = relations[i].e;
                }
            }
        } while (++head < tail);

        for (int i = 0; i <= n; i++) {
            System.out.print(que[i] + " ");
        }

    }

    public static void main(String[] args) {
        new Breath();
    }
}

class Relation {
    int s;
    int e;

    Relation(int s, int e) {
        this.s = s;
        this.e = e;
    }
}

```
## 예제 2
```java
import java.util.Scanner;

public class FindingNemo {
    int n;
    int m;
    boolean[][] check;
    int[][] input;
    Point[] que;

    FindingNemo() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        input = new int[n][m];
        check = new boolean[n][m];
        que = new Point[100];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        int head = 0;
        int tail = 0;

        que[tail++] = new Point(0, 0, 0);        //초기값 넣기, que에 값 추가랑 형태가 같음
        check[0][0] = true;
        do {
            int x = que[head].x;
            int y = que[head].y;
            int count = que[head].count;


            int xx[] = {-1, 0, 1, 0};
            int yy[] = {0, 1, 0, -1};
            for (int i = 0; i < 4; i++) {
                int nx = x + xx[i];
                int ny = y + yy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && input[nx][ny] == 0 && !check[nx][ny]) {
                    if (nx == n - 1 && ny == m - 1) {
                        System.out.println(count + 1);
                        break;                                // or return;
                    }
                    que[tail++] = new Point(nx, ny, count + 1);
                    check[nx][ny] = true;
                }
            }
        } while (++head < tail);
    }

    public static void main(String[] args) {
        new FindingNemo();
    }
}

class Point {
    int x;
    int y;
    int count;

    Point(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
```



