package principal;

import pagamentos.CarrinhoDeCompras;
import pagamentos.PagamentoCartaoCredito;
import pagamentos.PagamentoPayPal;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        /**
         * Configura  a estratégia de pagamento com cartão de crédito.
         */
        carrinhoDeCompras.setEstrategiaDePagamento(new PagamentoCartaoCredito("1234-4321-1234-4321","Cliente teste"));
        carrinhoDeCompras.pagarConta(100.0);

        /**
         * Altera a estratégia de pagamento para PayPal
         */

        carrinhoDeCompras.setEstrategiaDePagamento(new PagamentoPayPal("teste@test.com"));
        carrinhoDeCompras.pagarConta(50.0);
    }
}
