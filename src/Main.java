public class Main {
    public static void main(String[] args) {
        Produto hamburguer = new Hamburguer();
        Produto hamburguerComBacon = new BaconDecorator(hamburguer);
        Produto hamburguerCompleto = new BaconDecorator(
                new QueijoDecorator(hamburguer)
        );

        System.out.println(hamburguer.getNome() + " - R$ " + hamburguer.getPreco());
        System.out.println(hamburguerComBacon.getNome() + " - R$ " + hamburguerComBacon.getPreco());
        System.out.println(hamburguerCompleto.getNome() + " - R$ " + hamburguerCompleto.getPreco());
    }
}