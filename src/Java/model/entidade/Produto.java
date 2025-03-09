package Java.model.entidade;

public class Produto {

    private Integer id;
    private String nome;
    private Double valor;
    private Integer quantidade;

    public Produto() {
    }

    public Produto(Integer id, String nome, Double valor, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTotal() {
        return valor * quantidade;
    }

    @Override
    public String toString() {
        return "id " +
                getId() +
                ", produto " +
                getNome() +
                ", R$" +
                String.format("%.2f", getValor()) +
                ", quantidade " +
                getQuantidade() +
                ", subtotal R$" +
                String.format("%.2f", getTotal());
    }
}