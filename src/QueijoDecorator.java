public class QueijoDecorator extends ProdutoDecorator {
    public QueijoDecorator(Produto produto) {
        super(produto);
    }
    @Override
    public String getNome() {
        return produto.getNome() + " + queijo";
    }
    @Override
    public double getPreco() {
        return produto.getPreco() + 5.0;
    }
}