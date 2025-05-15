public class Arvore {
    private No raiz;

    public Arvore(String conteudo) {
        this.raiz = new No(conteudo);

    }

    public void InserirFilho(String conteudo) {
        if (raiz.getEsquerdo() == null) {
            No novo = new No(conteudo);
            raiz.setEsquerdo(novo);
        } else if (raiz.getDireito() == null) {
            No novo = new No(conteudo);
            raiz.setDireito(novo);
        }

    }
}
