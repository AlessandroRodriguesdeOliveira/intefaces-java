import org.example.*;

public class PagamentosTest {
    public static void main(String[] args) {
        Pagamento pix = new PagamentoPix();
        pix.realizarPagamento(120.00);
        pix.cancelar();

        Pagamento boleto = new PagamentoBoleto();
        boleto.realizarPagamento(100.00);
        boleto.cancelar();

        Pagamento cartao = new PagamentoCartao();
        cartao.realizarPagamento(100.00);
        cartao.cancelar();

        PagamentoParcelado parcelado = new PagamentoCartao();
        parcelado.realizarPagamento(100.00, 4);
        parcelado.cancelar();
    }
}
