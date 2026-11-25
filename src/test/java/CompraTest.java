import org.example.Compra;
import org.example.PagamentoCartao;

public class CompraTest {
    public static void main(String[] args) {
        Compra compra = new Compra(new PagamentoCartao());
        compra.pagar(100.00, 4);


    }
}
