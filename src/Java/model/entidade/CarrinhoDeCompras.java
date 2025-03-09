package Java.model.entidade;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtoList = new ArrayList<>();

    public CarrinhoDeCompras() {
    }

    public CarrinhoDeCompras(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void adicionarItem(Produto produto) {
        produtoList.add(produto);
    }

    public void removerItem(Produto produto) {
        produtoList.remove(produto);
    }

    public Double calcularTotal() {
        double somaTotal = 0.f;
        for (Produto pdto : produtoList) {
            somaTotal += pdto.getTotal();
        }
        return somaTotal;
    }
}