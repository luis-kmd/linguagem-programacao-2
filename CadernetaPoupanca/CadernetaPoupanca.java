public class CadernetaPoupanca{
    // Atributos
    private String titular;
    private int diaAniversario;
    private double depositoInicial;
    private double rendimentoAcumulado;

    public CadernetaPoupanca(String titular, int diaAniversario, double depositoInicial){
        this.titular = titular;
        this.diaAniversario = diaAniversario;
        this.depositoInicial = depositoInicial;
        this.rendimentoAcumulado = 0.0; // inicia sem rendimento acumulado
    }

    // Metodo para obter o saldo atual (deposito inicial + rendimento acumulado)
    public double getSaldo(){
        return depositoInicial + rendimentoAcumulado;
    }

    // Metodo para atualizar o rendimento com base na taxa
    public void atualizarRendimento(double prTaxa){
        double saldoAtual = getSaldo();
        rendimentoAcumulado += saldoAtual * (prTaxa / 100);
    }

    // Metodo para obter a taxa de rendimento acumulada
    public double getTaxaRendimentoAcumulada(){
        return rendimentoAcumulado;
    }

    // Getters e Setters para acessar os atributos, se necessario
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public int getDiaAniversario(){
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario){
        this.diaAniversario = diaAniversario;
    }

    public double getDepositoInicial(){
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial){
        this.depositoInicial = depositoInicial;
    }

    public double getRendimentoAcumulado(){
        return rendimentoAcumulado;
    }

    public void setRendimentoAcumulado(double rendimentoAcumulado){
        this.rendimentoAcumulado = rendimentoAcumulado;
    }
}