package pagamentos;

public class CarrinhoDeCompras {
    private Pagamento estrategiaDePagamento;

    public void setEstrategiaDePagamento(Pagamento estrategiaDePagamento){
        this.estrategiaDePagamento = estrategiaDePagamento;
    }

    public void pagarConta(double valor){
        if(estrategiaDePagamento == null){
            throw new IllegalStateException("Estratégia de pagamento não definida!");
        }
        estrategiaDePagamento.pagar(valor);
    }
}
