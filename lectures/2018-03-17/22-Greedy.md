# Greedy

+ [그리디 알고리즘](https://namu.wiki/w/%EA%B7%B8%EB%A6%AC%EB%94%94%20%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98)
+ [적용 예시](#적용-예시)

## 적용 예시

### Coin Change Problem
```java
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int coins[] = new int[N];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scanner.nextInt();
        }
        Arrays.sort(coins);

        while (true) {
            int R = scanner.nextInt();
            for (int i = coins.length - 1; i >= 0; i--) {
                int coin = coins[i];
                int count = R / coin;
                if (count > 0) {
                    System.out.println("$" + coin + ": " + count + "개");
                }
                R %= coin;
            }
        }
    }
}
```

### Activity Selection Problem
```java
import java.util.Arrays;
import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Event[] events = new Event[N];
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            events[i] = new Event(n, s, e);
        }
        Arrays.sort(events);

        int lastEnd = 0;
        int count = 0;
        for (Event event : events) {
            if (lastEnd <= event.start) {
                System.out.println(event.num);
                lastEnd = event.end;
                count++;
            }
        }
        System.out.println(count + "개");
    }
}

class Event implements Comparable {
    int num, start, end;

    Event(int num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Object o) {
        return this.end - ((Event) o).end;
    }
}
```
