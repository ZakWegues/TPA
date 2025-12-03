import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int n, x, dentro, fora;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
dentro = 0;
fora = 0;
for (int i = 0; i < n; i++) {
x = sc.nextInt();
if (x >= 10 && x <= 20) {
dentro++;
} else {
fora++;
}
}
System.out.println(dentro + " in");
System.out.println(fora + " out");
sc.close();
}
}
