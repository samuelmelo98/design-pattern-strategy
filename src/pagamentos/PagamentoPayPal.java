package pagamentos;

public class PagamentoPayPal implements Pagamento {
    private String email;

    public PagamentoPayPal(String email){
        this.email = email;
    }
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + "Realizado com Paypal pelo e-mail: " + email);
    }
}
