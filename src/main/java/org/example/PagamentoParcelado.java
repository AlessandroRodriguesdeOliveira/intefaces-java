package org.example;

public interface PagamentoParcelado extends Pagamento{

    public void realizarPagamento(double valor, int parcelas);
}
