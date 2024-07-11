import java.util.Scanner;
public class Subtração {
    public static void main(String[] args) {
        int subtração, num1, num2;
        Scanner ler = new Scanner(System.in);
        escrever("Digite o primeiro número da subtração: ");
        num1 = ler.nextInt();
        escrever("Digite o segundo número da subtração: ");
        num2 = ler.nextInt();
        subtração = num1 - num2;
        escrever("A sua subtração é: " + subtração);
    }
    public static void escrever(Object msg){
        System.out.print(msg);
    }
}

