import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Carro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da gasolina: ");
        double precoGasolina = sc.nextDouble();

        System.out.print("Digite o valor da etanol: ");
        double precoEtanol = sc.nextDouble();

        // Verifique se o etanol é mais vantajoso
        if (precoEtanol <= precoGasolina * 0.7) {
            System.out.println("Compensa abastecer com etanol.");
            ImageIcon imagemIcon = new ImageIcon("/Consumo/image/etanol.jpeg");
            JLabel imagemLabel = new JLabel(imagemIcon);
        } else {
            System.out.println("Compensa abastecer com gasolina.");
            ImageIcon imagemIcon = new ImageIcon("/Consumo/image/gasolina.jpeg");
            JLabel imagemLabel = new JLabel(imagemIcon);
        }
    }
}
