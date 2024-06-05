public abstract class Conta implements IConta {

    private  static final int AGENCIA_PADRAO = 001;
    private static int NUM_CONTA_SEQUENCIAL = 1;
    
    protected  int numeroAgenciaConta;
    protected int numeroConta;
    protected double saldoConta;

    //método construtor:
    public Conta(int numeroAgenciaConta, int numeroConta) {
        this.numeroAgenciaConta = Conta.AGENCIA_PADRAO;
        this.numeroConta = NUM_CONTA_SEQUENCIAL++;
    }
    
    //método de funcionalidades:
    @Override
    public void sacar(double valor) {
        this.saldoConta -= valor;
    }

    @Override
    public void depositar(double valor){
        this.saldoConta += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agencia: %d", this.numeroAgenciaConta));
        System.out.println(String.format("Numero da conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldoConta));

    }

    //métodos acessores:
    public int getNumeroAgenciaConta() {
        return numeroAgenciaConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

}