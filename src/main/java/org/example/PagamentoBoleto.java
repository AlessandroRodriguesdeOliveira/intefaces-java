package org.example;

public class PagamentoBoleto implements Pagamento{

    @Override
    public void realizarPagamento(double valor){
        System.out.println("Boleto pago! R$" + valor);
    }

    @Override
    public void cancelar(){
        System.out.println("Boleto cancelado!");
    }
}
