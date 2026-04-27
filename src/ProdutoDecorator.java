public abstract class ProdutoDecorator implements Produto {
    protected Produto produto;
    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }
    @Override
    public String getNome() {
        return produto.getNome();
    }
    @Override
    public double getPreco() {
        return produto.getPreco();
    }
}