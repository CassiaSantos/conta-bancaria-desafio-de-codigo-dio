public interface IConta {
    
    //métodos de funcionalidades:
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
