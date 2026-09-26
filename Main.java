public class Main {

    public static void main(String[] args) {

        Cofrinho cofrinho = new Cofrinho("Viagem");

        cofrinho.depositar(500);
        cofrinho.depositar(200);
        cofrinho.retirar(150);

        cofrinho.retirar(1000);
        cofrinho.depositar(-50);

        cofrinho.mostrarResumo();
    }
}
