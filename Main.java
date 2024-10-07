public class Main {
    public static void main(String[] args) {
        // Criando uma caderneta de poupança
        CadernetaPoupanca poupanca = new CadernetaPoupanca("Luis", 22, 125.00);

        // Atualizando o rendimento para os meses indicados
        poupanca.getAtualizarRendimento(0.61);  // Setembro
        poupanca.getAtualizarRendimento(0.61);  // Outubro
        poupanca.getAtualizarRendimento(0.58);  // Novembro
        poupanca.getAtualizarRendimento(0.57);  // Dezembro
        poupanca.getAtualizarRendimento(0.50);  // Janeiro
        poupanca.getAtualizarRendimento(0.50);  // Fevereiro

        // Exibindo o saldo atualizado e rendimento acumulado
        System.out.printf("Saldo atualizado: R$ %.2f%n", poupanca.getSaldo());
        System.out.printf("Rendimento acumulado: R$ %.2f%n", poupanca.getTaxaRendimentoAcumulada());
    }
}
