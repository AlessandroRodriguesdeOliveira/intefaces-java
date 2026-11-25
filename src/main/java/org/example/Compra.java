package org.example;

public class Compra {
    private final Pagamento pagamento;

    public Compra(Pagamento tipo){
        this.pagamento = tipo;
    }

    public void pagar(double valor){
        this.pagamento.realizarPagamento(valor);
    }

    public void cancelar(){
        this.pagamento.cancelar();
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
