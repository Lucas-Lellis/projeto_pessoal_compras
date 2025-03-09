package Java.model.entidade;

import Java.model.servico.MeioDePagamento;

public class Pedido {

    private CarrinhoDeCompras carrinhoDeCompras;
    private MeioDePagamento meioDePagamento;

    public Pedido() {
    }

    public Pedido(CarrinhoDeCompras carrinhoDeCompras, MeioDePagamento meioDePagamento) {
        this.carrinhoDeCompras = carrinhoDeCompras;
        this.meioDePagamento = meioDePagamento;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public MeioDePagamento getMeioDePagamento() {
        return meioDePagamento;
    }

    public void finalizarPedido() {
        double valorTotal = carrinhoDeCompras.calcularTotal();
        meioDePagamento.pagar(valorTotal);
    }
}
