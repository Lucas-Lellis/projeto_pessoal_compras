package Java.model.servico;

public class Pix implements MeioDePagamento{

    public void pagar(double valor) {
        double valorPagamento = valor * desconto();
        System.out.println("Pagamento via pix");
        System.out.println("Valor parcial: R$" + String.format("%.2f", valor));
        System.out.println("Valor com desconto: R$" + String.format("%.2f", valorPagamento));
    }

    public double desconto() {
        return 0.95;
    }
}