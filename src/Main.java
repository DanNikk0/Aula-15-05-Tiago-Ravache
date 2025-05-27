public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("Raiz");

        arvore.InserirFilho("Filho Esquerda");
        arvore.InserirFilho("Filho Direita");

        System.out.println("Contagem com recursao: " + arvore.contarNos(arvore.getRaiz()));
        arvore.contarNosSemRecursao();

        System.out.println("\nPre-Ordem (recursiva):");
        arvore.buscarPreOrdem(arvore.getRaiz());

        System.out.println("\nPre-Ordem (sem recursao):");
        arvore.buscarPreOrdemSemRecursao();

        System.out.println("\nEm Ordem (recursiva):");
        arvore.buscaEmOrdem(arvore.getRaiz());

        System.out.println("\nEm Ordem (sem recursao):");
        arvore.buscaEmOrdemSemRecursao();

        System.out.println("\nPos-Ordem (recursiva):");
        arvore.buscaPosOrdem(arvore.getRaiz());

        System.out.println("\nPos-Ordem (sem recursao):");
        arvore.buscaPosOrdemSemRecursao();
    }
}
