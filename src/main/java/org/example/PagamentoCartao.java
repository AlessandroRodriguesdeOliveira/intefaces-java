package org.example;

public class PagamentoCartao implements PagamentoParcelado{

    @Override
    public void realizarPagamento(double valor){
        System.out.println("Cartao ok! R$" + valor);
    }

    @Override
    public void realizarPagamento(double valor, int parcelas){
        System.out.println("R$" + valor + "em " + parcelas + " parcelas");
    }

    @Override
    public void cancelar(){
        System.out.println("Cartao estornado");
    }
}
