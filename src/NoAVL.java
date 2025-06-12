// Classe do nó AVL
public class NoAVL {
    public NoAVL esquerdo;
    public NoAVL direito;
    private int chave;
    private int altura;

    public NoAVL(int chave) {
        this.chave = chave;
        this.altura = 1; // altura inicial de um nó folha
        this.esquerdo = null;
        this.direito = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
