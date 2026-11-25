import java.util.*;
import java.util.function.*;

// 자동 채점. 고치지 않는다. 실행: ./run drills/gcd-prime
public class DrillTest {
    public static void main(String[] args) {
        Check.eq("gcd(12,18)", Drill.gcd(12, 18), 6L);
        Check.eq("gcd(0,5)", Drill.gcd(0, 5), 5L);
        Check.eq("gcd(7,0)", Drill.gcd(7, 0), 7L);
        Check.eq("lcm(4,6)", Drill.lcm(4, 6), 12L);
        Check.eq("lcm 큰 수 (곱 먼저 하면 넘침)", Drill.lcm(2_000_000_000_000L, 3_000_000_000_000L), 6_000_000_000_000L);
        Check.eq("isPrime(0)", Drill.isPrime(0), false);
        Check.eq("isPrime(1)", Drill.isPrime(1), false);
        Check.eq("isPrime(2)", Drill.isPrime(2), true);
        Check.eq("isPrime(9)", Drill.isPrime(9), false);
        Check.eq("isPrime(2147483647) (i*i 넘침)", Drill.isPrime(Integer.MAX_VALUE), true);
        int c = 0; for (int i = 0; i <= 10_000; i++) if (Drill.isPrime(i)) c++;
        Check.eq("1만 이하 소수 개수", c, 1229);
        Check.done();
    }
}
