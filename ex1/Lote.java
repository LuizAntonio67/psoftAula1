package ex1;

public class Lote {
    Produto prod;
    String ID;
    java.util.Date fabricacao;
    java.util.Date validade;
    int qtd;

    public Lote(Produto prod, java.util.Date fabricacao, java.util.Date validade, int qtd) {
        this.prod = prod;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.qtd = qtd;
        this.ID = prod.ID;
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
