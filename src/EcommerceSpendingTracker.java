import java.util.Scanner;
import java.util.Locale;

public class EcommerceSpendingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de compras:");
        scanner.useLocale(Locale.US);
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;
            
            System.out.println("Digite os valores das compras:");
            for (int i = 0; i < purchaseCount; i++) {
                double purchaseValue = scanner.nextDouble();
                totalSpent += purchaseValue;
            }

            // Calcular a média
            double average = totalSpent / purchaseCount;

            // Leia os valores das compras e calcule a média
            System.out.printf("Quantidade de compras: %d%n", purchaseCount);
            System.out.printf("Valor total das compras: %.2f%n", totalSpent);
            System.out.printf("Valor médio das compras: %.2f%n", average);
        }

        scanner.close();
    }
}
