# Breath-First Search
#### 0 or 1을 이차원배열에 입력받아 서로 인접한(상하좌우) 1로 이루어진 그룹의 갯수와 한 그룹당 1의 갯수를 출력하는 프로그램
```java
import java.util.Scanner;

public class Bfs {
   int N, M;
   int map[][];
   boolean check[][];
   int groups[];
   int cnt = 0;

   public static void main(String[] args) {
       new Bfs();
   }

   Bfs() {
       Scanner scanner = new Scanner(System.in);
       N = scanner.nextInt();
       M = scanner.nextInt();
       map = new int[N][M];
       check = new boolean[N][M];
       groups = new int[N * M];
       for (int i = 0; i < N; i++) {
           for (int j = 0; j < M; j++) {
               map[i][j] = scanner.nextInt();
           }
       }
       for (int i = 0; i < N; i++) {
           for (int j = 0; j < M; j++) {
               if (map[i][j] == 1 && !check[i][j]) {
                   groups[cnt++] = bfs(i, j);
               }
           }
       }
       System.out.println(cnt);
       for (int i = 0; i < cnt; i++) {
           System.out.println(groups[i] + ” “);
       }
   }

   int bfs(int sx, int sy) {
       Coord Q[] = new Coord[N * M];
       int head = 0;
       int tail = 0;
       Q[tail++] = new Coord(sx, sy);
       check[sx][sy] = true;
       do {
           int x = Q[head].x;
           int y = Q[head].y;
           int xx[] = {-1, 0, 1, 0};
           int yy[] = {0, 1, 0, -1};
           for (int i = 0; i < 4; i++) {
               int nx = x + xx[i];
               int ny = y + yy[i];
               if (nx >= 0 && nx < N && ny >= 0 && ny < M && !check[nx][ny] && map[nx][ny] == 1) {
                   Q[tail++] = new Coord(nx, ny);
                   check[nx][ny] = true;
               }
           }
       } while (++head < tail);
       return tail;
   }
}

class Coord {
   int x, y;

   Coord(int x, int y) {
       this.x = x;
       this.y = y;
   }
}
```
