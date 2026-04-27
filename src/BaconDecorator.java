public class BaconDecorator extends ProdutoDecorator {
    public BaconDecorator(Produto produto) {
        super(produto);
    }
    @Override
    public String getNome() {
        return produto.getNome() + " + bacon";
    }
    @Override
    public double getPreco() {
        return produto.getPreco() + 7.0;
    }
}