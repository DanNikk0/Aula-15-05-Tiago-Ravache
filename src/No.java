public class No {

    private No esquerda;
    private No direita;
    private String conteudo;


    public No(String conteudo) {
        this.esquerda = null;
        this.direita = null;
        this.conteudo = conteudo;
    }


    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerdo) {
        this.esquerda = esquerdo;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direito) {
        this.direita = direito;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    private int balanceamentoNo;

    public int getBalanceamentoNo() {
        return balanceamentoNo;
    }

    public void setBalanceamentoNo(int balanceamentoNo) {
        this.balanceamentoNo = balanceamentoNo;
    }
}
