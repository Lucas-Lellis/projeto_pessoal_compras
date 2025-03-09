package Java.model.servico;

public class CartaoDeCredito implements MeioDePagamento{

    private Integer parcelas;

    public CartaoDeCredito(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public void pagar(double valor) {
        double valorPagamento = valor / parcelas;
        System.out.println("Pagamento por Cartão de Crédito");
        System.out.println("No valor de R$" + String.format("%.2f", valor));
        System.out.println("Em " + parcelas + "x no cartão, no valor de R$" + String.format("%.2f", valorPagamento));
    }
}