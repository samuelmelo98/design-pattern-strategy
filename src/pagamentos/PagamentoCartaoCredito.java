package pagamentos;

public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;
    private String titular;
    public PagamentoCartaoCredito(String numeroCartao, String titular){
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }
    @Override
    public void pagar(double valor) {
        System.out.println("Pagemento de R$" + valor + "Realizado com cartão de crédito pelo titular: " + titular);
    }
}
