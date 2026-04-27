public class Hamburguer implements Produto {
    @Override
    public String getNome() {
        return "Hambúrguer simples";
    }
    @Override
    public double getPreco() {
        return 15.0;
    }
}