public class Preco {
    public static void main (String [] args ){
        double precoOriginal = 180.98;
        double percentualDesconto = 8.0;
        double valorDesconto = (percentualDesconto/ 100.0) * precoOriginal;
        double novoPreco =  precoOriginal -valorDesconto;

        String mensagem = String.format("""
                Preço do produto: $%.2f
                Porcentagem do desconto: %.0f%%
                O desconto ficou: $%.2f
                valor total já com o desconto: $%.2f""", precoOriginal, percentualDesconto, valorDesconto, novoPreco );
        System.out.println(mensagem);
    }
}
