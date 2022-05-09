public class Produto {
    String ID, nome, fabricante;
    int count;

    public Produto(String nome, String fabricante) {
        this.ID = count;
        this.nome = nome;
        this.fabricante = fabricante;
        count += 1;
    }

    public String getID() {
        return ID;
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
