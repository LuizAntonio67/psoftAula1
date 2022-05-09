public class Lote {
    Produto prod;
    String ID;
    Date fabricacao;
    Date validade;
    int qtd;

    public Lote(Produto prod, Date fabricacao, Date validade, int qtd) {
        this.prod = prod;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.qtd = qtd;
        this.ID = prod.getId();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lote{" +
                "prod=" + prod +
                ", ID='" + ID + '\'' +
                ", fabricacao=" + fabricacao +
                ", validade=" + validade +
                ", qtd=" + qtd +
                '}';
    }
}
