public class main {
    public static void main(String[] args) {
        Produto leite = new Produto("Leite Integral", "Betania");

        Date fabricacao1 = new Date();
        Date validade1 = new Date(2022, 08, 09);
        Lote lote1 = new Lote(leite, fabricacao1, validade1, 10);
    }
}
