# Depth First Search

+ [깊이 우선 탐색(DFS, Depth First Search)](http://blog.eairship.kr/268)
+ [적용 예시](#적용-예시)

## 적용 예시

### Vertex Visiting Order Problem 
#### Soluction under the premise that the starting value is 1, using static function
####
```java
import java.util.Scanner;

public class DFS {

    static int n;                               
    static int[] s;
    static int[] e;

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        s = new int[n];
        e = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
            e[i] = scanner.nextInt();
        }

        dfs(1);
    }

    static void dfs(int x) {                   
        System.out.println(x);
        for (int i = 0; i < n; i++) {
            if (x == s[i]) {
                dfs(e[i]);
            }
        }
    }
}
```
####
#### Solution under the premise that the starting value is 1, using object class
####
```java
import java.util.Scanner;

public class DFS {
    int n;
    Relation[] relations;

    DFS(){
        Scanner scanner = new Scanner(System.in);
       
        n = scanner.nextInt();

        relations = new Relation[n];
        
        for (int i = 0; i < n; i++) {
            relations[i] = new Relation(scanner.nextInt(), scanner.nextInt());
        }

        dfs(1);
    }

    public static void main(String[] args) {
        new DFS();
    }

    void dfs(int x) {
        System.out.println(x);
        for (int i = 0; i < n; i++) {
            if (x == relations[i].s) {
                dfs(relations[i].e);
            }
        }
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
####
#### Solution without the starting value determined and that spits error when the value is not unique 
####
```java
import java.util.Scanner;

public class DFS {

    static int n;                              
    static int[] s;
    static int[] e;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        
        int m = scanner.nextInt();                     

        s = new int[n];
        e = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
            e[i] = scanner.nextInt();
        }

        int x = 0, c = 0;                                //  시작점 value 찾기                                   
        boolean[] flag = new boolean[m + 1];

        for (int y : e) {
            flag[y] = true;
        }

        for (int i = 1; i <= m; i++) {
            if (!flag[i]) {
                x = i;
                c++;
            }
        }

        if (c != 1)                                     // 시작점 value가 0 이거나 2 이상일 때 에러 출력
            System.out.println("Error");
        else dfs(x);
    }

    static void dfs(int x) {                   
        System.out.println(x);
        for (int i = 0; i < n; i++) {
            if (x == s[i]) {
                dfs(e[i]);
            }
        }
    }
}

