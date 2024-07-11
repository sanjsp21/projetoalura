public class Produto {
    public static void main(String [] args){
        double precoProduto = 40.56;
        int quantidade = 25;
        double total = precoProduto * quantidade;

        String mensagem = String.format("O preço do produto é %f e a quantidade é %d", precoProduto, quantidade);
        System.out.println(mensagem);
        System.out.println("O valor dos produtos em quantidade é: "+ total);
    }
}
