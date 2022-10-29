import java.util.*;

public class PrimeFinder {
  public static void main(String[] args) {
    System.out.println(primeFinder(13));
  }

  public static ArrayList primeFinder(int n) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    primes.add(2);

    for(int i = 2; i <= n; i++) {
      boolean prime = true;

      for(int j = 0; j < primes.size(); j++) {
        if(i % primes.get(j) == 0) {
          prime = false;
        }
      }

      if(prime) {
        primes.add(i);
      }
    }

    return primes;
  }
}
