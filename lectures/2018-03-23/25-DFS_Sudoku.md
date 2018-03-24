# (still) Depth-First Search
## 스도쿠 solving code using DFS
```java
import java.util.Scanner;

public class Sudoku {
    int[][] sudoku;
    Spot[] spots;
    int cnt = 0;
    boolean stop;

    Sudoku() {
        Scanner scanner = new Scanner(System.in);
        sudoku = new int[9][9];
        spots = new Spot[81];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = scanner.nextInt();
                if (sudoku[i][j] == 0) {
                    spots[cnt++] = new Spot(i, j);
                }
            }
        }

        dfs(0);
    }

    void dfs(int a) {
        if(stop) return;
        if (a >= cnt) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
            stop = true;
            return;
        }

        int x = spots[a].x;
        int y = spots[a].y;

        boolean[] check = new boolean[10];

        for (int i = 0; i < 9; i++) {
            check[sudoku[x][i]] = true;
        }

        for (int i = 0; i < 9; i++) {
            check[sudoku[i][y]] = true;
        }

        int dx = x / 3;                                    // 정사각형 지역들로 나누는 짓
        int dy = y / 3;
        int sx = dx * 3;
        int sy = dy * 3;
        int ex = dx + 3;
        int ey = dy + 3;
        for (int i = sx; i < ex; i++) {
            for (int j = sy; j < ey; j++) {
                check[sudoku[i][j]] = true;
            }
        }

        for (int i = 1; i < 10; i++) {
            if (!check[i]) {
                sudoku[x][y] = i;
                dfs(a + 1);
            }
        }
        sudoku[x][y] = 0;
    }

    public static void main(String[] args) {
        new Sudoku();
    }
}

class Spot {
    int x;
    int y;

    Spot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

# 긑
