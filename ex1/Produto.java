package ex1;

public class Produto {
    String ID, nome, fabricante;

    public Produto(String nome, String fabricante) {
        this.ID = nome + fabricante;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Produto{" +
                "ID='" + ID + '\'' +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
