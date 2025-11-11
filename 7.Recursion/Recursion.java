public class Recursion{
  //método que devuelve la suma de los elementos desde n hasta 1
  //ejemplo: n = 4 -> 4+3+2+1=10
  static int sum(int n){
      //caso base
      if(n==1)
          return 1;
      else
          return n+sum(n-1);
  }

  static int sumIt(int n) {
    int total = 0;
    for (int i = 1; i <= n; i++) {
        total += i;
    }
    return total;
}

  static boolean palinIt(String frase) {
    frase = frase.toLowerCase();
    int izquierda = 0;
    int derecha = frase.length() - 1;

    while (izquierda < derecha) {
        if (frase.charAt(izquierda) != frase.charAt(derecha)) {
            return false;
        }
        izquierda++;
        derecha--;
    }

    return true;
}

  public static void main(String[] args) {
    System.out.println(sum(10));
    System.out.println(sumIt(10));
  }

}
