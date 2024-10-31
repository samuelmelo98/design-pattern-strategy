package pagamentos;

/**
 * Interface para usar o padrão  estratgia. Padrão que pode alternar em tempo de execução qual objeto será chamado, para fazer algo commum
 * para as classes que implementam.
 */
public interface Pagamento {
    void pagar(double valor);
}
