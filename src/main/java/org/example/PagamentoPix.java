package org.example;

public class PagamentoPix implements Pagamento{

    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento pix realizado de R$" + valor);
    }

    @Override
    public void cancelar(){
        System.out.println("Pix cancelado!");
    }
}
