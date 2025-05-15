public class No {

    public No(String conteudo) {
        this.esquerdo = null;
        this.direito = null;
        this.conteudo = conteudo;
    }

    private No esquerdo;
    private No direito;
    private String conteudo;

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
