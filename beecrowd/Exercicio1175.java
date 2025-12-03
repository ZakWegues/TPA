import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int[] n = new int[20];
int aux, i;
Scanner sc = new Scanner(System.in);
for (i = 0; i < 20; i++) {
n[i] = sc.nextInt();
}
for (i = 0; i < 10; i++) {
aux = n[i];
n[i] = n[19 - i];
n[19 - i] = aux;
}
for (i = 0; i < 20; i++) {
System.out.println("N[" + i + "] = " + n[i]);
}
sc.close();
}
}
