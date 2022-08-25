public class Main {
    public static void main(String[] args) {
       Cliente reynan = new Cliente();
       reynan.setNome("Reynan");


        Conta cc = new ContaCorrente(reynan);
        cc.depositar(100);

        Conta poupanca = new ContaPoupança(reynan);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
    
}
