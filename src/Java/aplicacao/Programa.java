package Java.aplicacao;

import Java.model.entidade.CarrinhoDeCompras;
import Java.model.entidade.Pedido;
import Java.model.entidade.Produto;
import Java.model.servico.CartaoDeCredito;
import Java.model.servico.MeioDePagamento;
import Java.model.servico.Pix;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Produto produto;

        Scanner scan = new Scanner(System.in);

        System.out.print("qtd produtos: ");
        int n = scan.nextInt();

        System.out.println("--Produtos--");
        for (int i = 0; i < n; i++) {
            System.out.println("produto #" + (i+1));
            System.out.print("id: ");
            int id = scan.nextInt();
            System.out.print("nome: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("preço R$: ");
            double preco = scan.nextDouble();
            System.out.print("quantidade: ");
            int quantidade = scan.nextInt();

            produto = new Produto(id, nomeProduto, preco, quantidade);
            carrinhoDeCompras.adicionarItem(produto);
        }

        MeioDePagamento meioDePagamento;
        System.out.println();
        System.out.println("--Meio de Pagamento--");
        System.out.println("Valor R$" + String.format("%.2f", carrinhoDeCompras.calcularTotal()));
        System.out.print("Pix ou Cartão: ");
        scan.nextLine();
        String pagamento = scan.nextLine();
        if (pagamento.equalsIgnoreCase("pix")) {
            meioDePagamento = new Pix();
        } else {
            System.out.print("numero de parcelas: ");
            int parcelas = scan.nextInt();
            meioDePagamento = new CartaoDeCredito(parcelas);
        }

        Pedido pedido = new Pedido(carrinhoDeCompras, meioDePagamento);
        System.out.println();
        System.out.println("--Carrinho--");
        for (Produto pdto : carrinhoDeCompras.getProdutoList()) {
            System.out.println(pdto);
        }
        System.out.println();
        System.out.println("--Pedido--");
        pedido.finalizarPedido();
        scan.close();
    }
}