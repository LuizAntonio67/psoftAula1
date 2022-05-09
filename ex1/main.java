package ex1;

public class main {
    public static void main(String[] args) {
        Produto leite = new Produto("Leite Integral", "Betania");

        java.util.Date fabricacao1 = new java.util.Date();
        java.util.Date validade1 = new java.util.Date(2022, 8, 9);
        Lote lote1 = new Lote(leite, fabricacao1, validade1, 10);
    }
}
